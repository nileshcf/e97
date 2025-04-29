package com.optum.uhg.app.controller;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.rest.ContainerMetadata;
import com.cloudframe.app.rest.Metadata;
import com.cloudframe.app.utility.CFUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.optum.uhg.app.dto.d5427dt1.D5427dt1Ctx;
import com.optum.uhg.app.exception.BusinessException;
import com.optum.uhg.app.exception.DatabaseException;
import com.optum.uhg.app.rest.request.d5427dt1.D5427dt1Request;
import com.optum.uhg.app.rest.response.d5427dt1.D5427dt1Response;
import com.optum.uhg.app.service.D5427dt1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * This class has controller methods for every cics program
 *
 * @author CloudFrame Inc.
 */
@RestController
public class ApiController {
  private Logger logger = LoggerFactory.getLogger(ApiController.class);
  private ObjectMapper om = new ObjectMapper();

  @Autowired
  @Qualifier("d5427dt1")
  D5427dt1 d5427dt1;

  @PostMapping(value = "/d5427dt1", consumes = "application/json", produces = "application/json")
  public ResponseEntity<D5427dt1Response> d5427dt1RestService(
      @RequestBody D5427dt1Request requestObj) throws Exception {
    D5427dt1Ctx d5427dt1Ctx = null;
    try {
      logObj("Request", requestObj);
      d5427dt1Ctx = handleRequest(requestObj);
      d5427dt1.process(d5427dt1Ctx);
      return new ResponseEntity<>(
          sendBackResponse(d5427dt1Ctx, requestObj.getMetadata()), HttpStatus.OK);
    } catch (CFException ex) {
      if (ex.isTerminated()) {
        return new ResponseEntity<>(
            sendBackResponse(d5427dt1Ctx, requestObj.getMetadata()), HttpStatus.OK);
      } else if (ex.isDb2Related()) {
        DatabaseException dbe = DatabaseException.getException(ex.getMessage(), ex);
        dbe.setRc(ex.getCode());
        throw dbe;
      } else {
        BusinessException be = BusinessException.getException(ex.getMessage(), ex);
        be.setRc(ex.getCode());
        throw be;
      }
    } catch (Exception ex) {
      com.optum.uhg.app.exception.RuntimeException rt =
          com.optum.uhg.app.exception.RuntimeException.getException(ex.getMessage(), ex);
      rt.setRc(12);
      throw rt;
    }
  }

  private void logObj(String type, Object obj) {
    if (logger.isDebugEnabled())
      try {
        String sanitizedJson = sanitize(om.writeValueAsString(obj));
        logger.debug("{} : {}", type, sanitizedJson);
      } catch (JsonProcessingException e) {
        logger.debug("Unable to parse {} . Error message : {} ", type, e.getMessage());
      }
  }

  private String sanitize(String input) {
    return input.replaceAll("[\\r\\n]", "_");
  }

  private D5427dt1Ctx handleRequest(D5427dt1Request requestObj)
      throws InstantiationException, IllegalAccessException, CFException {
    D5427dt1Ctx d5427dt1Ctx = new GlobalExecutorCtx().getContext(D5427dt1Ctx.class);
    receiveDt1ReqContainer(requestObj, d5427dt1Ctx);
    return d5427dt1Ctx;
  }

  private void receiveDt1ReqContainer(D5427dt1Request requestObj, D5427dt1Ctx d5427dt1Ctx)
      throws CFException {
    char[] data;
    if (requestObj.getMetadata().isBlobRequest()) {
      data = CFUtil.toCharArr(requestObj.getDt1ReqContainerAsBlob());
    } else {
      com.optum.uhg.app.dto.d5427dt1.Dt1ReqContainer dt1ReqContainer =
          new com.optum.uhg.app.dto.d5427dt1.Dt1ReqContainer();
      requestObj.getDt1ReqContainer().populateToDto(dt1ReqContainer);
      data = dt1ReqContainer.toCharArray();
    }
    if (!CFUtil.trim(data).isEmpty()) d5427dt1Ctx.getGlobalCtx().addContainer("D5427DT1-REQ", data);
  }

  private D5427dt1Response sendBackResponse(D5427dt1Ctx d5427dt1Ctx, Metadata metadata)
      throws CFException {
    D5427dt1Response responseObj = new D5427dt1Response();
    responseObj.setMetadata(metadata);
    metadata.getContainerMetadata().clear(); // cleared the container info about response
    sendDt1SrtContainer(responseObj, d5427dt1Ctx);
    sendDt1ClmContainer(responseObj, d5427dt1Ctx);
    sendDt1RspContainer(responseObj, d5427dt1Ctx);
    sendStsContainer(responseObj, d5427dt1Ctx);

    logObj("Response", responseObj);
    return responseObj;
  }

  private void sendDt1SrtContainer(D5427dt1Response responseObj, D5427dt1Ctx d5427dt1Ctx)
      throws CFException {
    String containerName = "D5427DT1-SRT";
    ContainerMetadata containerMetadata = new ContainerMetadata();
    containerMetadata.setContainerName(containerName);
    responseObj.getMetadata().getContainerMetadata().add(containerMetadata);
    com.optum.uhg.app.dto.d5427dt1.Dt1SrtContainer dt1SrtContainer =
        new com.optum.uhg.app.dto.d5427dt1.Dt1SrtContainer();
    if (d5427dt1Ctx.getGlobalCtx().containerExists(containerName)) {
      char[] containerData = d5427dt1Ctx.getGlobalCtx().fetchContainer(containerName);
      if (!CFUtil.checkLowValue(containerData)) {
        if (responseObj.getMetadata().isBlobResponse()) {
          containerMetadata.setObjectName("dt1SrtContainerAsBlob");
          containerMetadata.setType("blob-response");
          responseObj.setDt1SrtContainerAsBlob(CFUtil.toString(containerData));
        } else {
          containerMetadata.setObjectName("dt1SrtContainer");
          containerMetadata.setType("json-response");
          dt1SrtContainer.setString(containerData);
          responseObj.setDt1SrtContainer(
              new com.optum.uhg.app.rest.response.d5427dt1.Dt1SrtContainer(containerData.length));
          responseObj.getDt1SrtContainer().populateFromDto(dt1SrtContainer);
        }
      } else logger.trace("{} is available but no data present", containerName);
    } else logger.trace("{} not available", containerName);
  }

  private void sendDt1ClmContainer(D5427dt1Response responseObj, D5427dt1Ctx d5427dt1Ctx)
      throws CFException {
    String containerName = "D5427DT1-CLM";
    ContainerMetadata containerMetadata = new ContainerMetadata();
    containerMetadata.setContainerName(containerName);
    responseObj.getMetadata().getContainerMetadata().add(containerMetadata);
    com.optum.uhg.app.dto.d5427dt1.Dt1ClmContainer dt1ClmContainer =
        new com.optum.uhg.app.dto.d5427dt1.Dt1ClmContainer();
    if (d5427dt1Ctx.getGlobalCtx().containerExists(containerName)) {
      char[] containerData = d5427dt1Ctx.getGlobalCtx().fetchContainer(containerName);
      if (!CFUtil.checkLowValue(containerData)) {
        if (responseObj.getMetadata().isBlobResponse()) {
          containerMetadata.setObjectName("dt1ClmContainerAsBlob");
          containerMetadata.setType("blob-response");
          responseObj.setDt1ClmContainerAsBlob(CFUtil.toString(containerData));
        } else {
          containerMetadata.setObjectName("dt1ClmContainer");
          containerMetadata.setType("json-response");
          dt1ClmContainer.setString(containerData);
          responseObj.setDt1ClmContainer(
              new com.optum.uhg.app.rest.response.d5427dt1.Dt1ClmContainer(containerData.length));
          responseObj.getDt1ClmContainer().populateFromDto(dt1ClmContainer);
        }
      } else logger.trace("{} is available but no data present", containerName);
    } else logger.trace("{} not available", containerName);
  }

  private void sendDt1RspContainer(D5427dt1Response responseObj, D5427dt1Ctx d5427dt1Ctx)
      throws CFException {
    String containerName = "D5427DT1-RSP";
    ContainerMetadata containerMetadata = new ContainerMetadata();
    containerMetadata.setContainerName(containerName);
    responseObj.getMetadata().getContainerMetadata().add(containerMetadata);
    com.optum.uhg.app.dto.d5427dt1.Dt1RspContainer dt1RspContainer =
        new com.optum.uhg.app.dto.d5427dt1.Dt1RspContainer();
    if (d5427dt1Ctx.getGlobalCtx().containerExists(containerName)) {
      char[] containerData = d5427dt1Ctx.getGlobalCtx().fetchContainer(containerName);
      if (!CFUtil.checkLowValue(containerData)) {
        if (responseObj.getMetadata().isBlobResponse()) {
          containerMetadata.setObjectName("dt1RspContainerAsBlob");
          containerMetadata.setType("blob-response");
          responseObj.setDt1RspContainerAsBlob(CFUtil.toString(containerData));
        } else {
          containerMetadata.setObjectName("dt1RspContainer");
          containerMetadata.setType("json-response");
          dt1RspContainer.setString(containerData);
          responseObj.setDt1RspContainer(
              new com.optum.uhg.app.rest.response.d5427dt1.Dt1RspContainer(containerData.length));
          responseObj.getDt1RspContainer().populateFromDto(dt1RspContainer);
        }
      } else logger.trace("{} is available but no data present", containerName);
    } else logger.trace("{} not available", containerName);
  }

  private void sendStsContainer(D5427dt1Response responseObj, D5427dt1Ctx d5427dt1Ctx)
      throws CFException {
    String containerName = "D5427DT1-STS";
    ContainerMetadata containerMetadata = new ContainerMetadata();
    containerMetadata.setContainerName(containerName);
    responseObj.getMetadata().getContainerMetadata().add(containerMetadata);
    com.optum.uhg.app.dto.d5427dt1.StsContainer stsContainer =
        new com.optum.uhg.app.dto.d5427dt1.StsContainer();
    if (d5427dt1Ctx.getGlobalCtx().containerExists(containerName)) {
      char[] containerData = d5427dt1Ctx.getGlobalCtx().fetchContainer(containerName);
      if (!CFUtil.checkLowValue(containerData)) {
        if (responseObj.getMetadata().isBlobResponse()) {
          containerMetadata.setObjectName("stsContainerAsBlob");
          containerMetadata.setType("blob-response");
          responseObj.setStsContainerAsBlob(CFUtil.toString(containerData));
        } else {
          containerMetadata.setObjectName("stsContainer");
          containerMetadata.setType("json-response");
          stsContainer.setString(containerData);
          responseObj.setStsContainer(
              new com.optum.uhg.app.rest.response.d5427dt1.StsContainer(containerData.length));
          responseObj.getStsContainer().populateFromDto(stsContainer);
        }
      } else logger.trace("{} is available but no data present", containerName);
    } else logger.trace("{} not available", containerName);
  }
}
