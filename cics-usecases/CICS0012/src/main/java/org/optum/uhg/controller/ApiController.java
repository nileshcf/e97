package org.optum.uhg.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.optum.uhg.service.Cics0012;
import org.optum.uhg.rest.request.cics0012.Cics0012Request;
import org.optum.uhg.rest.response.cics0012.Cics0012Response;
import com.cloudframe.app.exception.CFException;
import org.optum.uhg.exception.DatabaseException;
import org.optum.uhg.exception.BusinessException;
import org.optum.uhg.dto.cics0012.Cics0012Ctx;
import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.rest.Metadata;
import com.cloudframe.app.utility.CFUtil;
import org.optum.uhg.rest.cics0012.Dfhcommarea;

/**
 * This class has controller methods for every cics program
 *
 * @author CloudFrame Inc.
 *
 */

@RestController
public class ApiController {
	private Logger logger = LoggerFactory.getLogger(ApiController.class);
	private ObjectMapper om = new ObjectMapper();
	

	@Autowired
  	@Qualifier("cics0012")
	Cics0012 cics0012;
	@PostMapping(value = "/cics0012")
    public ResponseEntity<Cics0012Response> postCommarea(
        @RequestBody Cics0012Request cics0012Request) throws Exception {
            Cics0012Ctx cics0012Ctx = null;
    		try {
    			cics0012Ctx = handleRequest(cics0012Request);
                cics0012.process(cics0012Ctx);
                return new ResponseEntity<>(sendBackResponse(cics0012Ctx , cics0012Request.getMetadata()), HttpStatus.OK);
    		} catch (CFException ex) {
    			if (ex.isTerminated()) {
                    return new ResponseEntity<>(sendBackResponse(cics0012Ctx , cics0012Request.getMetadata()), HttpStatus.OK);
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
org.optum.uhg.exception.RuntimeException rt = org.optum.uhg.exception.RuntimeException
    					.getException(ex.getMessage(), ex);
    			rt.setRc(12);
    			throw rt;
    		}
    }

      private Cics0012Ctx handleRequest(Cics0012Request cics0012Request) throws InstantiationException, IllegalAccessException, CFException {
         logObj("Request", cics0012Request);
         Cics0012Ctx programCtx = new GlobalExecutorCtx().getContext(Cics0012Ctx.class);
         Metadata reqMetadata = cics0012Request.getMetadata();
         if(reqMetadata.isBlobRequest()) {
           programCtx.getDfhcommarea().setCharArray(CFUtil.toCharArr(cics0012Request.getRequestCommareaAsBlob()));
         } else {
          cics0012Request.getRequestCommarea().setDfhcommarea(programCtx.getDfhcommarea());
         }
         return programCtx;
     }

     private Cics0012Response sendBackResponse(Cics0012Ctx cics0012Ctx, Metadata metadata) throws CFException {
        Cics0012Response responseObj = new Cics0012Response();
        responseObj.setMetadata(metadata);
        if (responseObj.getMetadata().isBlobResponse()) {
          responseObj.setResponseCommareaAsBlob(CFUtil.toString(cics0012Ctx.getDfhcommarea().toCharArray()));
        } else {
          responseObj.setResponseCommarea(new Dfhcommarea());
          responseObj.getResponseCommarea().populateFrom(cics0012Ctx.getDfhcommarea());
        }
        logObj("Response", responseObj);
        return responseObj;
     }



	private void logObj(String type, Object obj) {
		if (logger.isDebugEnabled())
			try { logger.debug("{}  : {}", type, om.writeValueAsString(obj)); } 
			catch (JsonProcessingException e) {
              logger.debug("Unable to parse {} . Error message : {} " ,  type , e.getMessage());
			}
	}



}

