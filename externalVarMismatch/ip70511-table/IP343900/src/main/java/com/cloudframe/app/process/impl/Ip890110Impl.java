  package com.cloudframe.app.process.impl;
  
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import org.springframework.stereotype.Component;
  import com.cloudframe.app.exception.CFException;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.dto.ProgramContext;
  import com.cloudframe.app.process.*;

  
  @Component("ip890110")
  public class Ip890110Impl extends BaseProcess implements Ip890110 {
  	Logger logger = LoggerFactory.getLogger(Ip890110Impl.class);
   	private boolean isFirstCall = true;
   	
  	
    	public int process(ProgramContext programCtx) throws CFException {
    	     if(isFirstCall) {
    	     	logger.info("Class Ip890110impl not converted to Java, using default" ); 
    	     	isFirstCall = false;
    	     } 
    	     return getRc();
    	}
    	
    	
    	public int call(ProgramContext programCtx,Object[] parameters) throws CFException {
    	     if(isFirstCall) {
    	     	logger.info("Class Ip890110impl not converted to Java, using default" ); 
    	     	isFirstCall = false;
    	     }
    	     return getRc();
    	}
    	
    	
    	public int call(ProgramContext programCtx,Field...parameters) throws CFException {
      	if(isFirstCall) {
    	     	logger.info("Class Ip890110impl not converted to Java, using default" ); 
    	     	isFirstCall = false;
    	     }
    	     return getRc();
      }
  }
