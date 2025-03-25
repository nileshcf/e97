package org.optum.uhg;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.cloudframe.app.dto.GlobalExecutorCtx;
import org.optum.uhg.dto.cics0012.Cics0012Ctx;

/**
* The application can be started  Via rest invocation
*
* @author CloudFrame Inc. Code Generator
*
*/
@SpringBootApplication
@ComponentScan(basePackages =  {"com.cloudframe.app","org.optum.uhg"} )
public class Application {
public static void main(String[] args) {
//logger.info("Running on Java version: " + System.getProperty("java.version"));
int exitCode = 0;
ConfigurableApplicationContext context = SpringApplication.run(Application.class);
GlobalExecutorCtx.load(Application.class, context);

}
}
