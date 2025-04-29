package com.optum.uhg.app;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * The application can be started Via rest invocation
 *
 * @author CloudFrame Inc. Code Generator
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.cloudframe.app", "com.optum.uhg.app"})
public class CFApplication {
  public static void main(String[] args) {
    // logger.info("Running on Java version: " + System.getProperty("java.version"));
    int exitCode = 0;
    ConfigurableApplicationContext context = SpringApplication.run(CFApplication.class);
    GlobalExecutorCtx.load(CFApplication.class, context);
  }
}
