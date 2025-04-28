  package com.cloudframe.app.process;
  
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import org.springframework.stereotype.Component;
  import com.cloudframe.app.exception.CFException;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.dto.ProgramContext;
  
  @Component("ip281010")
  public class Ip281010 extends BaseProcess {
  	Logger logger = LoggerFactory.getLogger(Ip281010.class);
   	private boolean isFirstCall = true;
   	
  	@Override
    	public int process() throws CFException {
    	     if(isFirstCall) {
    	     	logger.info("Class Ip281010 not converted to Java, using default" ); 
    	     	isFirstCall = false;
    	     } 
    	     return getRc();
    	}
    	
    	@Override
    	public int call(Object[] parameters) throws CFException {
    	     if(isFirstCall) {
    	     	logger.info("Class Ip281010 not converted to Java, using default" ); 
    	     	isFirstCall = false;
    	     }
    	     return getRc();
    	}
    	
    	@Override
    	public int call(Field...parameters) throws CFException {
      	if(isFirstCall) {
    	     	logger.info("Class Ip281010 not converted to Java, using default" ); 
    	     	isFirstCall = false;
    	     }
    	     return getRc();
      }
  }
