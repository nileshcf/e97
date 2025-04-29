package com.cloudframe.app.ar640010.dto;

/**
*  The class LogTable570 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;


@Data
public class LogTable570 extends LogTable570Serialized {
   
			@Getter @Setter private List<LogEntry570> logEntry570 = new ArrayList<>();
    	
	
	/**
	* Constructor for LogTable570
	**/
    public LogTable570() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < LOG_ENTRY_570_SIZE;arrayIndex++) {
						getLogEntry570().add(new LogEntry570(this, beginLogEntry570 + 
						arrayIndex * LogEntry570.getLogEntry570FieldLength()));
				}
	   	/*  end of offset */
			for (int arrayIndex = 0; arrayIndex < LOG_ENTRY_570_SIZE;arrayIndex++) {
					getLogEntry570().add(new LogEntry570(this, beginLogEntry570 + 
						arrayIndex * LogEntry570.getLogEntry570FieldLength()));
			}
    }





}
  
