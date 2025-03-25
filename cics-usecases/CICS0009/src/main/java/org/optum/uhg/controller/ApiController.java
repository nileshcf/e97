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
import org.optum.uhg.service.Cics0009;
import org.optum.uhg.service.Cics0010;
import org.optum.uhg.rest.response.cics0009.Cics0009Response;
import org.optum.uhg.rest.request.cics0009.Cics0009Request;
import org.optum.uhg.dto.cics0009.Cics0009Ctx;
import com.cloudframe.app.exception.CFException;
import org.optum.uhg.exception.DatabaseException;
import org.optum.uhg.exception.BusinessException;
import org.optum.uhg.rest.response.cics0010.Cics0010Response;
import org.optum.uhg.rest.request.cics0010.Cics0010Request;
import org.optum.uhg.dto.cics0010.Cics0010Ctx;
import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.rest.Metadata;
import com.cloudframe.app.rest.ContainerMetadata;
import java.util.Arrays;

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
  	@Qualifier("cics0009")
	Cics0009 cics0009;

	@PostMapping(value = "/cics0009", consumes = "application/json", produces = "application/json")
	public ResponseEntity<Cics0009Response> cics0009RestService(@RequestBody Cics0009Request requestObj)
			throws Exception {
		Cics0009Ctx cics0009Ctx = null;
		try {
			logObj("Request", requestObj);
			cics0009Ctx = handleRequest(requestObj);
			cics0009.process(cics0009Ctx);
			return new ResponseEntity<>(sendBackResponse(cics0009Ctx, requestObj.getMetadata()), HttpStatus.OK);
		} catch (CFException ex) {
			if (ex.isTerminated()) {
				return new ResponseEntity<>(sendBackResponse(cics0009Ctx , requestObj.getMetadata()), HttpStatus.OK);
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
	


	@Autowired
  	@Qualifier("cics0010")
	Cics0010 cics0010;

	@PostMapping(value = "/cics0010", consumes = "application/json", produces = "application/json")
	public ResponseEntity<Cics0010Response> cics0010RestService(@RequestBody Cics0010Request requestObj)
			throws Exception {
		Cics0010Ctx cics0010Ctx = null;
		try {
			logObj("Request", requestObj);
			cics0010Ctx = handleRequest(requestObj);
			cics0010.process(cics0010Ctx);
			return new ResponseEntity<>(sendBackResponse(cics0010Ctx, requestObj.getMetadata()), HttpStatus.OK);
		} catch (CFException ex) {
			if (ex.isTerminated()) {
				return new ResponseEntity<>(sendBackResponse(cics0010Ctx , requestObj.getMetadata()), HttpStatus.OK);
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
	


	private void logObj(String type, Object obj) {
		if (logger.isDebugEnabled())
			try { logger.debug("{}  : {}", type, om.writeValueAsString(obj)); } 
			catch (JsonProcessingException e) {
              logger.debug("Unable to parse {} . Error message : {} " ,  type , e.getMessage());
			}
	}



	private Cics0009Ctx handleRequest(Cics0009Request requestObj)
    			throws InstantiationException, IllegalAccessException, CFException {
        Cics0009Ctx cics0009Ctx = new GlobalExecutorCtx().getContext(Cics0009Ctx.class);
        receiveLsDfhcommarea(requestObj, cics0009Ctx);
    	return cics0009Ctx;
    }

	private void receiveLsDfhcommarea(Cics0009Request requestObj, Cics0009Ctx cics0009Ctx) throws CFException
			 {
		char[] data;
        if (requestObj.getMetadata().isBlobRequest()) {
        	data = CFUtil.toCharArr(requestObj.getLsDfhcommareaAsBlob());
        } else {
org.optum.uhg.dto.cics0009.LsDfhcommarea lsDfhcommarea = new org.optum.uhg.dto.cics0009.LsDfhcommarea();
        requestObj.getLsDfhcommarea().populateToDto(lsDfhcommarea);
        data = lsDfhcommarea.toCharArray();
        }
        if (!CFUtil.trim(data).isEmpty())
            cics0009Ctx.getGlobalCtx().addContainer(CFUtil.padString( 16,"CICS0009-COMAREA", " " , CFUtil.RIGHT_PAD).trim(), data);
	}

	private Cics0009Response sendBackResponse(Cics0009Ctx cics0009Ctx, Metadata metadata) throws CFException {
           Cics0009Response responseObj = new Cics0009Response();
           responseObj.setMetadata(metadata);
           metadata.getContainerMetadata().clear(); //cleared the container info about response
           sendLsDfhcommarea(responseObj, cics0009Ctx);
           sendLsRequestData(responseObj, cics0009Ctx);
           sendRequestData002(responseObj, cics0009Ctx);
           sendLs003RequestData(responseObj, cics0009Ctx);

           logObj("Response" , responseObj);
           return responseObj;
    }

	private void sendLsDfhcommarea(Cics0009Response responseObj, Cics0009Ctx cics0009Ctx) throws CFException {
		String containerName = CFUtil.padString( 16, "CICS0009-COMAREA", " ", CFUtil.RIGHT_PAD);
		ContainerMetadata containerMetadata = new ContainerMetadata();
        containerMetadata.setContainerName(containerName);
        responseObj.getMetadata().getContainerMetadata().add(containerMetadata);
org.optum.uhg.dto.cics0009.LsDfhcommarea lsDfhcommarea = new org.optum.uhg.dto.cics0009.LsDfhcommarea();
		if (cics0009Ctx.getGlobalCtx().containerExists(containerName.trim())) {
			char[] containerData = cics0009Ctx.getGlobalCtx().fetchContainer(containerName.trim());
			if (!CFUtil.checkLowValue(containerData)) {
                if(responseObj.getMetadata().isBlobResponse()) {
                  containerMetadata.setObjectName("lsDfhcommareaAsBlob");
                  containerMetadata.setType("blob-response");
                  responseObj.setLsDfhcommareaAsBlob(CFUtil.toString(containerData));
                } else {
                  containerMetadata.setObjectName("lsDfhcommarea");
                  containerMetadata.setType("json-response");
				  lsDfhcommarea.setString(containerData);
responseObj.setLsDfhcommarea(new org.optum.uhg.rest.response.cics0009.LsDfhcommarea(containerData.length));
				  responseObj.getLsDfhcommarea().populateFromDto(lsDfhcommarea);
				}
			} else
				logger.trace("{} is available but no data present", containerName);
		} else
			logger.trace("{} not available", containerName);
	}
	private void sendLsRequestData(Cics0009Response responseObj, Cics0009Ctx cics0009Ctx) throws CFException {
		String containerName = CFUtil.padString( 16, "CLFR-CONTAINER", " ", CFUtil.RIGHT_PAD);
		ContainerMetadata containerMetadata = new ContainerMetadata();
        containerMetadata.setContainerName(containerName);
        responseObj.getMetadata().getContainerMetadata().add(containerMetadata);
		String lsRequestData ;
		if (cics0009Ctx.getGlobalCtx().containerExists(containerName.trim())) {
			char[] containerData = cics0009Ctx.getGlobalCtx().fetchContainer(containerName.trim());
			if (!CFUtil.checkLowValue(containerData)) {
                if(responseObj.getMetadata().isBlobResponse()) {
                   containerMetadata.setObjectName("lsRequestDataAsBlob");
                   containerMetadata.setType("blob-response");
				   responseObj.setLsRequestData(CFUtil.toString(containerData));
				} else {
				   containerMetadata.setObjectName("lsRequestData");
                   containerMetadata.setType("json-response");
				   responseObj.setLsRequestData(String.valueOf(containerData));
				}
			} else
				logger.trace("{} is available but no data present", containerName);
		} else
			logger.trace("{} not available", containerName);
	}
	private void sendRequestData002(Cics0009Response responseObj, Cics0009Ctx cics0009Ctx) throws CFException {
		String containerName = CFUtil.padString( 16, "CLFR-CONTAINER", " ", CFUtil.RIGHT_PAD);
		ContainerMetadata containerMetadata = new ContainerMetadata();
        containerMetadata.setContainerName(containerName);
        responseObj.getMetadata().getContainerMetadata().add(containerMetadata);
		String requestData002 ;
		if (cics0009Ctx.getGlobalCtx().containerExists(containerName.trim())) {
			char[] containerData = cics0009Ctx.getGlobalCtx().fetchContainer(containerName.trim());
			if (!CFUtil.checkLowValue(containerData)) {
                if(responseObj.getMetadata().isBlobResponse()) {
                   containerMetadata.setObjectName("requestData002AsBlob");
                   containerMetadata.setType("blob-response");
				   responseObj.setRequestData002(CFUtil.toString(containerData));
				} else {
				   containerMetadata.setObjectName("requestData002");
                   containerMetadata.setType("json-response");
				   responseObj.setRequestData002(String.valueOf(containerData));
				}
			} else
				logger.trace("{} is available but no data present", containerName);
		} else
			logger.trace("{} not available", containerName);
	}
	private void sendLs003RequestData(Cics0009Response responseObj, Cics0009Ctx cics0009Ctx) throws CFException {
		String containerName = CFUtil.padString( 16, "CLFR-CONTAINER", " ", CFUtil.RIGHT_PAD);
		ContainerMetadata containerMetadata = new ContainerMetadata();
        containerMetadata.setContainerName(containerName);
        responseObj.getMetadata().getContainerMetadata().add(containerMetadata);
		String ls003RequestData ;
		if (cics0009Ctx.getGlobalCtx().containerExists(containerName.trim())) {
			char[] containerData = cics0009Ctx.getGlobalCtx().fetchContainer(containerName.trim());
			if (!CFUtil.checkLowValue(containerData)) {
                if(responseObj.getMetadata().isBlobResponse()) {
                   containerMetadata.setObjectName("ls003RequestDataAsBlob");
                   containerMetadata.setType("blob-response");
				   responseObj.setLs003RequestData(CFUtil.toString(containerData));
				} else {
				   containerMetadata.setObjectName("ls003RequestData");
                   containerMetadata.setType("json-response");
				   responseObj.setLs003RequestData(String.valueOf(containerData));
				}
			} else
				logger.trace("{} is available but no data present", containerName);
		} else
			logger.trace("{} not available", containerName);
	}


	private Cics0010Ctx handleRequest(Cics0010Request requestObj)
    			throws InstantiationException, IllegalAccessException, CFException {
        Cics0010Ctx cics0010Ctx = new GlobalExecutorCtx().getContext(Cics0010Ctx.class);
        receiveLsDfhcommarea(requestObj, cics0010Ctx);
        receiveLsRequestData(requestObj, cics0010Ctx);
        receiveRequestData002(requestObj, cics0010Ctx);
        receiveLs003RequestData(requestObj, cics0010Ctx);
    	return cics0010Ctx;
    }

	private void receiveLsDfhcommarea(Cics0010Request requestObj, Cics0010Ctx cics0010Ctx) throws CFException
			 {
		char[] data;
        if (requestObj.getMetadata().isBlobRequest()) {
        	data = CFUtil.toCharArr(requestObj.getLsDfhcommareaAsBlob());
        } else {
org.optum.uhg.dto.cics0010.LsDfhcommarea lsDfhcommarea = new org.optum.uhg.dto.cics0010.LsDfhcommarea();
        requestObj.getLsDfhcommarea().populateToDto(lsDfhcommarea);
        data = lsDfhcommarea.toCharArray();
        }
        if (!CFUtil.trim(data).isEmpty())
            cics0010Ctx.getGlobalCtx().addContainer(CFUtil.padString( 16,"CICS0010-COMAREA", " " , CFUtil.RIGHT_PAD).trim(), data);
	}
	private void receiveLsRequestData(Cics0010Request requestObj, Cics0010Ctx cics0010Ctx) throws CFException
			 {
		char[] data;
org.optum.uhg.dto.cics0010.LsDfhcommarea lsDfhcommarea = new org.optum.uhg.dto.cics0010.LsDfhcommarea();
        if (requestObj.getMetadata().isBlobRequest()) {
            data = CFUtil.toCharArr(Arrays.toString(lsDfhcommarea.getLsRequestData()));
        } else {
            requestObj.getLsDfhcommarea().populateToDto(lsDfhcommarea);
            data = lsDfhcommarea.getLsRequestData();
        }
        if (!CFUtil.trim(data).isEmpty())
            cics0010Ctx.getGlobalCtx().addContainer(CFUtil.padString( 16,"CLFR-CONTAINER", " " , CFUtil.RIGHT_PAD).trim(), data);
	}
	private void receiveRequestData002(Cics0010Request requestObj, Cics0010Ctx cics0010Ctx) throws CFException
			 {
		char[] data;
        if (requestObj.getMetadata().isBlobRequest()) {
	        if(requestObj.getRequestData002() != null && !requestObj.getRequestData002().isEmpty())
		      cics0010Ctx.getGlobalCtx().addContainer(CFUtil.padString( 16,"CLFR-CONTAINER", " " , CFUtil.RIGHT_PAD).trim(), requestObj.getRequestData002().toCharArray());
		} else {
		    if(requestObj.getRequestData002AsBlob() != null && !requestObj.getRequestData002AsBlob().isEmpty())
              cics0010Ctx.getGlobalCtx().addContainer(CFUtil.padString( 16,"CLFR-CONTAINER", " " , CFUtil.RIGHT_PAD).trim(), CFUtil.toCharArr(requestObj.getRequestData002()));
		}
	}
	private void receiveLs003RequestData(Cics0010Request requestObj, Cics0010Ctx cics0010Ctx) throws CFException
			 {
		char[] data;
        if (requestObj.getMetadata().isBlobRequest()) {
	        if(requestObj.getLs003RequestData() != null && !requestObj.getLs003RequestData().isEmpty())
		      cics0010Ctx.getGlobalCtx().addContainer(CFUtil.padString( 16,"CLFR-CONTAINER", " " , CFUtil.RIGHT_PAD).trim(), requestObj.getLs003RequestData().toCharArray());
		} else {
		    if(requestObj.getLs003RequestDataAsBlob() != null && !requestObj.getLs003RequestDataAsBlob().isEmpty())
              cics0010Ctx.getGlobalCtx().addContainer(CFUtil.padString( 16,"CLFR-CONTAINER", " " , CFUtil.RIGHT_PAD).trim(), CFUtil.toCharArr(requestObj.getLs003RequestData()));
		}
	}

	private Cics0010Response sendBackResponse(Cics0010Ctx cics0010Ctx, Metadata metadata) throws CFException {
           Cics0010Response responseObj = new Cics0010Response();
           responseObj.setMetadata(metadata);
           metadata.getContainerMetadata().clear(); //cleared the container info about response
           sendLsDfhcommarea(responseObj, cics0010Ctx);

           logObj("Response" , responseObj);
           return responseObj;
    }

	private void sendLsDfhcommarea(Cics0010Response responseObj, Cics0010Ctx cics0010Ctx) throws CFException {
		String containerName = CFUtil.padString( 16, "CICS0010-COMAREA", " ", CFUtil.RIGHT_PAD);
		ContainerMetadata containerMetadata = new ContainerMetadata();
        containerMetadata.setContainerName(containerName);
        responseObj.getMetadata().getContainerMetadata().add(containerMetadata);
org.optum.uhg.dto.cics0010.LsDfhcommarea lsDfhcommarea = new org.optum.uhg.dto.cics0010.LsDfhcommarea();
		if (cics0010Ctx.getGlobalCtx().containerExists(containerName.trim())) {
			char[] containerData = cics0010Ctx.getGlobalCtx().fetchContainer(containerName.trim());
			if (!CFUtil.checkLowValue(containerData)) {
                if(responseObj.getMetadata().isBlobResponse()) {
                  containerMetadata.setObjectName("lsDfhcommareaAsBlob");
                  containerMetadata.setType("blob-response");
                  responseObj.setLsDfhcommareaAsBlob(CFUtil.toString(containerData));
                } else {
                  containerMetadata.setObjectName("lsDfhcommarea");
                  containerMetadata.setType("json-response");
				  lsDfhcommarea.setString(containerData);
responseObj.setLsDfhcommarea(new org.optum.uhg.rest.response.cics0010.LsDfhcommarea(containerData.length));
				  responseObj.getLsDfhcommarea().populateFromDto(lsDfhcommarea);
				}
			} else
				logger.trace("{} is available but no data present", containerName);
		} else
			logger.trace("{} not available", containerName);
	}

}

