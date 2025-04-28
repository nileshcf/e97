  package com.cloudframe.app.process;
  
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import org.springframework.stereotype.Component;
  import com.cloudframe.app.exception.CFException;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.dto.ProgramContext;
  
  @Component("called3")
  public class Called3 extends BaseProcess {
  	Logger logger = LoggerFactory.getLogger(Called3.class);
   	private boolean isFirstCall = true;
   	
  	@Override
    	public int process() throws CFException {
    	     if(isFirstCall) {
    	     	logger.info("Class Called3 not converted to Java, using default" ); 
    	     	isFirstCall = false;
    	     } 
    	     return getRc();
    	}
    	
    	@Override
    	public int call(Object[] parameters) throws CFException {
    	     if(isFirstCall) {
    	     	logger.info("Class Called3 not converted to Java, using default" ); 
    	     	isFirstCall = false;
    	     }
    	     return getRc();
    	}
    	
    	@Override
    	public int call(Field...parameters) throws CFException {
      	if(isFirstCall) {
    	     	logger.info("Class Called3 not converted to Java, using default" ); 
    	     	isFirstCall = false;
    	     }
    	     return getRc();
      }
  }
