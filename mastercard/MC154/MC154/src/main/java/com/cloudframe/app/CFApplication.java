package com.cloudframe.app;

import com.cloudframe.app.exception.Terminate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.beans.BeansException;
import org.springframework.boot.WebApplicationType;
import org.springframework.util.StringUtils;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.process.Mc154;
import com.cloudframe.app.utility.SpringContextHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.mc154.Mc154Ctx;

/**
 * The Mc154 application can be started in three different ways
 * 1. Via mainframe JCL
 * 2. Via rest invocation
 * 3. Via console command , inputValue(if any) to be filled in application.properties 
 *  
 * @author CloudFrame Inc. Code Generator
 *
 */
@SpringBootApplication
public class CFApplication {
	private static Logger logger = LoggerFactory.getLogger(CFApplication.class);
	public static void main(String[] args) {
			//logger.info("Running on Java version: " + System.getProperty("java.version"));
	        int exitCode = 0;
		ConfigurableApplicationContext context = SpringApplication.run(CFApplication.class);	
		String appType = context.getEnvironment().getProperty("spring.main.web-application-type");
		if (StringUtils.hasText(appType) && WebApplicationType.NONE.equals(WebApplicationType.valueOf(appType.trim().toUpperCase())))
		 	try {
            GlobalExecutorCtx.load(CFApplication.class, context);
		 		context.registerShutdownHook();
		 		Mc154 mc154 = (Mc154) context.getBean("mc154");
        	    mc154.process(new GlobalExecutorCtx().getContext(Mc154Ctx.class)); /*  Mc154 requires no input parameters  */
			} catch (BeansException | CFException exception) {
				if (exception instanceof BeansException || !((CFException) exception).isTerminated()) {
                    logger.error("Error Info : ", exception);
                    exitCode = 5;
                }
		   	} catch(Exception e) {
		   	    logger.error("Unknown application error Info : ", e.getMessage());
		   	    exitCode = 5;
		   	} finally {
		   	    System.exit(exitCode);
		   		SpringContextHandler.close();
		   		context.close();
		   	}	
	}
}
