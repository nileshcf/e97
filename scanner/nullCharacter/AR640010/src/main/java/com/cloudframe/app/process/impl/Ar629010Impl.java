  package com.cloudframe.app.process.impl;
  
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import org.springframework.stereotype.Component;
  import com.cloudframe.app.exception.CFException;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.dto.ProgramContext;
  import com.cloudframe.app.process.*;

  
  @Component("ar629010")
  public class Ar629010Impl extends BaseProcess implements Ar629010 {
  	Logger logger = LoggerFactory.getLogger(Ar629010Impl.class);
   	private boolean isFirstCall = true;
   	
  	
    	public int process(ProgramContext programCtx) throws CFException {
    	     if(isFirstCall) {
    	     	logger.info("Class Ar629010impl not converted to Java, using default" ); 
    	     	isFirstCall = false;
    	     } 
    	     return getRc();
    	}
    	
    	
    	public int call(ProgramContext programCtx,Object[] parameters) throws CFException {
    	     if(isFirstCall) {
    	     	logger.info("Class Ar629010impl not converted to Java, using default" ); 
    	     	isFirstCall = false;
    	     }
    	     return getRc();
    	}
    	
    	
    	public int call(ProgramContext programCtx,Field...parameters) throws CFException {
      	if(isFirstCall) {
    	     	logger.info("Class Ar629010impl not converted to Java, using default" ); 
    	     	isFirstCall = false;
    	     }
    	     return getRc();
      }
  }
