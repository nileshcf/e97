package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class LogTable570Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class LogTable570Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(LogTable570Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int LOG_TABLE_570_LENGTH = 575;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginLogEntry570;
           protected static final int LOG_ENTRY_570_SIZE = 5;
	
	/**
	* Constructor for LogTable570Serialized
	**/
    public LogTable570Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in LogTable570Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(LOG_TABLE_570_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginLogEntry570 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int logEntry570Size() {
			return LOG_ENTRY_570_SIZE;
		}



}
  
