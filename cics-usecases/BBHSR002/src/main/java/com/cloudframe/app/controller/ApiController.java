package com.cloudframe.app.controller;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.bbhsr002.Bbhsr002Ctx;
import com.cloudframe.app.exception.BusinessException;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.exception.DatabaseException;
import com.cloudframe.app.rest.ContainerMetadata;
import com.cloudframe.app.rest.Metadata;
import com.cloudframe.app.rest.request.bbhsr002.Bbhsr002Request;
import com.cloudframe.app.rest.response.bbhsr002.Bbhsr002Response;
import com.cloudframe.app.service.Bbhsr002;
import com.cloudframe.app.utility.CFUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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
  @Qualifier("bbhsr002")
  Bbhsr002 bbhsr002;

  @PostMapping(value = "/bbhsr002", consumes = "application/json", produces = "application/json")
  public ResponseEntity<Bbhsr002Response> bbhsr002RestService(
      @RequestBody Bbhsr002Request requestObj) throws Exception {
    Bbhsr002Ctx bbhsr002Ctx = null;
    try {
      logObj("Request", requestObj);
      bbhsr002Ctx = handleRequest(requestObj);
      bbhsr002.process(bbhsr002Ctx);
      return new ResponseEntity<>(
          sendBackResponse(bbhsr002Ctx, requestObj.getMetadata()), HttpStatus.OK);
    } catch (CFException ex) {
      if (ex.isTerminated()) {
        return new ResponseEntity<>(
            sendBackResponse(bbhsr002Ctx, requestObj.getMetadata()), HttpStatus.OK);
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
      com.cloudframe.app.exception.RuntimeException rt =
          com.cloudframe.app.exception.RuntimeException.getException(ex.getMessage(), ex);
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

  private Bbhsr002Ctx handleRequest(Bbhsr002Request requestObj)
      throws InstantiationException, IllegalAccessException, CFException {
    Bbhsr002Ctx bbhsr002Ctx = new GlobalExecutorCtx().getContext(Bbhsr002Ctx.class);
    receiveF5957reqInput(requestObj, bbhsr002Ctx);
    receiveHsrRequestArea(requestObj, bbhsr002Ctx);
    receiveReqHsrHipaaList(requestObj, bbhsr002Ctx);
    return bbhsr002Ctx;
  }

  private void receiveF5957reqInput(Bbhsr002Request requestObj, Bbhsr002Ctx bbhsr002Ctx)
      throws CFException {
    char[] data;
    if (requestObj.getMetadata().isBlobRequest()) {
      data = CFUtil.toCharArr(requestObj.getF5957reqInputAsBlob());
    } else {
      com.cloudframe.app.dto.bbhsr002.F5957reqInput f5957reqInput =
          new com.cloudframe.app.dto.bbhsr002.F5957reqInput();
      requestObj.getF5957reqInput().populateToDto(f5957reqInput);
      data = f5957reqInput.toCharArray();
    }
    if (!CFUtil.trim(data).isEmpty()) bbhsr002Ctx.getGlobalCtx().addContainer("F5957REQ", data);
  }

  private void receiveHsrRequestArea(Bbhsr002Request requestObj, Bbhsr002Ctx bbhsr002Ctx)
      throws CFException {
    char[] data;
    if (requestObj.getMetadata().isBlobRequest()) {
      data = CFUtil.toCharArr(requestObj.getHsrRequestAreaAsBlob());
    } else {
      com.cloudframe.app.dto.bbhsr002.HsrRequestArea hsrRequestArea =
          new com.cloudframe.app.dto.bbhsr002.HsrRequestArea();
      requestObj.getHsrRequestArea().populateToDto(hsrRequestArea);
      data = hsrRequestArea.toCharArray();
    }
    if (!CFUtil.trim(data).isEmpty())
      bbhsr002Ctx.getGlobalCtx().addContainer("HSR-REQUEST-BLOCK", data);
  }

  private void receiveReqHsrHipaaList(Bbhsr002Request requestObj, Bbhsr002Ctx bbhsr002Ctx)
      throws CFException {
    char[] data;
    if (requestObj.getMetadata().isBlobRequest()) {
      data = CFUtil.toCharArr(requestObj.getReqHsrHipaaListAsBlob());
    } else {
      com.cloudframe.app.dto.bbhsr002.ReqHsrHipaaList reqHsrHipaaList =
          new com.cloudframe.app.dto.bbhsr002.ReqHsrHipaaList();
      requestObj.getReqHsrHipaaList().populateToDto(reqHsrHipaaList);
      data = reqHsrHipaaList.toCharArray();
    }
    if (!CFUtil.trim(data).isEmpty())
      bbhsr002Ctx.getGlobalCtx().addContainer("BN7-REQ-HIPAA-CD-LIST", data);
  }

  private Bbhsr002Response sendBackResponse(Bbhsr002Ctx bbhsr002Ctx, Metadata metadata)
      throws CFException {
    Bbhsr002Response responseObj = new Bbhsr002Response();
    responseObj.setMetadata(metadata);
    metadata.getContainerMetadata().clear(); // cleared the container info about response
    sendHsrReturnArea(responseObj, bbhsr002Ctx);
    sendFoundnMsgCallerArea(responseObj, bbhsr002Ctx);
    sendF5957reqInput(responseObj, bbhsr002Ctx);

    logObj("Response", responseObj);
    return responseObj;
  }

  private void sendHsrReturnArea(Bbhsr002Response responseObj, Bbhsr002Ctx bbhsr002Ctx)
      throws CFException {
    String containerName = "HSR-RETURN-AREA";
    ContainerMetadata containerMetadata = new ContainerMetadata();
    containerMetadata.setContainerName(containerName);
    responseObj.getMetadata().getContainerMetadata().add(containerMetadata);
    com.cloudframe.app.dto.bbhsr002.HsrReturnArea hsrReturnArea =
        new com.cloudframe.app.dto.bbhsr002.HsrReturnArea();
    if (bbhsr002Ctx.getGlobalCtx().containerExists(containerName)) {
      char[] containerData = bbhsr002Ctx.getGlobalCtx().fetchContainer(containerName);
      if (!CFUtil.checkLowValue(containerData)) {
        if (responseObj.getMetadata().isBlobResponse()) {
          containerMetadata.setObjectName("hsrReturnAreaAsBlob");
          containerMetadata.setType("blob-response");
          responseObj.setHsrReturnAreaAsBlob(CFUtil.toString(containerData));
        } else {
          containerMetadata.setObjectName("hsrReturnArea");
          containerMetadata.setType("json-response");
          hsrReturnArea.setString(containerData);
          responseObj.setHsrReturnArea(
              new com.cloudframe.app.rest.response.bbhsr002.HsrReturnArea(containerData.length));
          responseObj.getHsrReturnArea().populateFromDto(hsrReturnArea);
        }
      } else logger.trace("{} is available but no data present", containerName);
    } else logger.trace("{} not available", containerName);
  }

  private void sendFoundnMsgCallerArea(Bbhsr002Response responseObj, Bbhsr002Ctx bbhsr002Ctx)
      throws CFException {
    String containerName = "FMA-OF-CALLEE";
    ContainerMetadata containerMetadata = new ContainerMetadata();
    containerMetadata.setContainerName(containerName);
    responseObj.getMetadata().getContainerMetadata().add(containerMetadata);
    com.cloudframe.app.dto.bbhsr002.FoundnMsgCallerArea foundnMsgCallerArea =
        new com.cloudframe.app.dto.bbhsr002.FoundnMsgCallerArea();
    if (bbhsr002Ctx.getGlobalCtx().containerExists(containerName)) {
      char[] containerData = bbhsr002Ctx.getGlobalCtx().fetchContainer(containerName);
      if (!CFUtil.checkLowValue(containerData)) {
        if (responseObj.getMetadata().isBlobResponse()) {
          containerMetadata.setObjectName("foundnMsgCallerAreaAsBlob");
          containerMetadata.setType("blob-response");
          responseObj.setFoundnMsgCallerAreaAsBlob(CFUtil.toString(containerData));
        } else {
          containerMetadata.setObjectName("foundnMsgCallerArea");
          containerMetadata.setType("json-response");
          foundnMsgCallerArea.setString(containerData);
          responseObj.setFoundnMsgCallerArea(
              new com.cloudframe.app.rest.response.bbhsr002.FoundnMsgCallerArea(
                  containerData.length));
          responseObj.getFoundnMsgCallerArea().populateFromDto(foundnMsgCallerArea);
        }
      } else logger.trace("{} is available but no data present", containerName);
    } else logger.trace("{} not available", containerName);
  }

  private void sendF5957reqInput(Bbhsr002Response responseObj, Bbhsr002Ctx bbhsr002Ctx)
      throws CFException {
    String containerName = "F5957REQ";
    ContainerMetadata containerMetadata = new ContainerMetadata();
    containerMetadata.setContainerName(containerName);
    responseObj.getMetadata().getContainerMetadata().add(containerMetadata);
    com.cloudframe.app.dto.bbhsr002.F5957reqInput f5957reqInput =
        new com.cloudframe.app.dto.bbhsr002.F5957reqInput();
    if (bbhsr002Ctx.getGlobalCtx().containerExists(containerName)) {
      char[] containerData = bbhsr002Ctx.getGlobalCtx().fetchContainer(containerName);
      if (!CFUtil.checkLowValue(containerData)) {
        if (responseObj.getMetadata().isBlobResponse()) {
          containerMetadata.setObjectName("f5957reqInputAsBlob");
          containerMetadata.setType("blob-response");
          responseObj.setF5957reqInputAsBlob(CFUtil.toString(containerData));
        } else {
          containerMetadata.setObjectName("f5957reqInput");
          containerMetadata.setType("json-response");
          f5957reqInput.setString(containerData);
          responseObj.setF5957reqInput(
              new com.cloudframe.app.rest.response.bbhsr002.F5957reqInput(containerData.length));
          responseObj.getF5957reqInput().populateFromDto(f5957reqInput);
        }
      } else logger.trace("{} is available but no data present", containerName);
    } else logger.trace("{} not available", containerName);
  }
}
