package com.cloudframe.app.ar640010.dto;

/**
*  The class LogTable570 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;


public class LogTable570 extends LogTable570Serialized {
   
			private List<LogEntry570> logEntry570 = new ArrayList<>();
    	
	
	/**
	* Constructor for LogTable570
	**/
    public LogTable570() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < LOG_ENTRY_570_SIZE;arrayIndex++) {
						logEntry570.add(new LogEntry570(this, beginLogEntry570 + 
						arrayIndex * LogEntry570.getLogEntry570FieldLength()));
				}
	   	/*  end of offset */
			for (int arrayIndex = 0; arrayIndex < LOG_ENTRY_570_SIZE;arrayIndex++) {
					logEntry570.add(new LogEntry570(this, beginLogEntry570 + 
						arrayIndex * LogEntry570.getLogEntry570FieldLength()));
			}
    }


 

	/**
	 *	Returns the  value of logEntry570
	 *  Corresponding COBOL Variable is 570-LOG-ENTRY
	 *	@return logEntry570
	 */
   public List<LogEntry570> getLogEntry570() {
       return logEntry570;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return logEntry570
	 */
	public LogEntry570 getLogEntry570(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getLogEntry570(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= LOG_ENTRY_570_SIZE) {
             	index = LOG_ENTRY_570_SIZE -1; // can't exceed max array size
             	logger.trace("logEntry570 - Array index exceeded max Size {}, resetting it to max allowed",LOG_ENTRY_570_SIZE); 
	    }
		if (index >= logEntry570.size()) {
       		for (int fillIndex =  logEntry570.size() -1; fillIndex < index;fillIndex++) {
		       logEntry570.add(null);
		    }
			logEntry570.set(index,
			   	   	new LogEntry570(this,beginLogEntry570 + index * LogEntry570.getLogEntry570FieldLength()) 
				                        ); 	
		} 
   	   LogEntry570 value = logEntry570.get(index);
   	   if (value == null) {
   	      logEntry570.set(index,
			   	   	new LogEntry570(this,beginLogEntry570 + index * LogEntry570.getLogEntry570FieldLength()) 
				                        ); 
		  value = logEntry570.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update LogEntry570 at index with the passed value
	 *  Corresponding COBOL Variable is 570-LOG-ENTRY
	 *  @param index
	 *	@param value
	 */
  public void setLogEntry570(int index,char[] value) {
   	getLogEntry570(index).setString(value);
   }
   
	

	
	
	

		public static int getLogTable570FieldLength() {
			return LOG_TABLE_570_LENGTH;
		}

}
  
