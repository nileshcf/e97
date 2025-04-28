  package com.cloudframe.app.process;
  
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import org.springframework.stereotype.Component;
  import com.cloudframe.app.exception.CFException;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.dto.ProgramContext;
  
  @Component("ar642010")
  public class Ar642010 extends BaseProcess {
  	Logger logger = LoggerFactory.getLogger(Ar642010.class);
   	private boolean isFirstCall = true;
   	
  	@Override
    	public int process() throws CFException {
    	     if(isFirstCall) {
    	     	logger.info("Class Ar642010 not converted to Java, using default" ); 
    	     	isFirstCall = false;
    	     } 
    	     return getRc();
    	}
    	
    	@Override
    	public int call(Object[] parameters) throws CFException {
    	     if(isFirstCall) {
    	     	logger.info("Class Ar642010 not converted to Java, using default" ); 
    	     	isFirstCall = false;
    	     }
    	     return getRc();
    	}
    	
    	@Override
    	public int call(Field...parameters) throws CFException {
      	if(isFirstCall) {
    	     	logger.info("Class Ar642010 not converted to Java, using default" ); 
    	     	isFirstCall = false;
    	     }
    	     return getRc();
      }
  }
