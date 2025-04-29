package com.optum.uhg.app.controller;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.rest.Metadata;
import com.cloudframe.app.utility.CFUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.optum.uhg.app.dto.o529351u.O529351uCtx;
import com.optum.uhg.app.exception.BusinessException;
import com.optum.uhg.app.exception.DatabaseException;
import com.optum.uhg.app.rest.o529351u.Dfhcommarea;
import com.optum.uhg.app.rest.request.o529351u.O529351uRequest;
import com.optum.uhg.app.rest.response.o529351u.O529351uResponse;
import com.optum.uhg.app.service.O529351u;
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
  @Qualifier("o529351u")
  O529351u o529351u;

  @PostMapping(value = "/o529351u")
  public ResponseEntity<O529351uResponse> postCommarea(@RequestBody O529351uRequest o529351uRequest)
      throws Exception {
    O529351uCtx o529351uCtx = null;
    try {
      o529351uCtx = handleRequest(o529351uRequest);
      o529351u.process(o529351uCtx);
      return new ResponseEntity<>(
          sendBackResponse(o529351uCtx, o529351uRequest.getMetadata()), HttpStatus.OK);
    } catch (CFException ex) {
      if (ex.isTerminated()) {
        return new ResponseEntity<>(
            sendBackResponse(o529351uCtx, o529351uRequest.getMetadata()), HttpStatus.OK);
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

  private O529351uCtx handleRequest(O529351uRequest o529351uRequest)
      throws InstantiationException, IllegalAccessException, CFException {
    logObj("Request", o529351uRequest);
    O529351uCtx programCtx = new GlobalExecutorCtx().getContext(O529351uCtx.class);
    Metadata reqMetadata = o529351uRequest.getMetadata();
    if (reqMetadata.isBlobRequest()) {
      programCtx
          .getDfhcommarea()
          .setCharArray(CFUtil.toCharArr(o529351uRequest.getRequestCommareaAsBlob()));
    } else {
      o529351uRequest.getRequestCommarea().setDfhcommarea(programCtx.getDfhcommarea());
    }
    return programCtx;
  }

  private O529351uResponse sendBackResponse(O529351uCtx o529351uCtx, Metadata metadata)
      throws CFException {
    O529351uResponse responseObj = new O529351uResponse();
    responseObj.setMetadata(metadata);
    if (responseObj.getMetadata().isBlobResponse()) {
      responseObj.setResponseCommareaAsBlob(
          CFUtil.toString(o529351uCtx.getDfhcommarea().toCharArray()));
    } else {
      responseObj.setResponseCommarea(new Dfhcommarea());
      responseObj.getResponseCommarea().populateFrom(o529351uCtx.getDfhcommarea());
    }
    logObj("Response", responseObj);
    return responseObj;
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
}
