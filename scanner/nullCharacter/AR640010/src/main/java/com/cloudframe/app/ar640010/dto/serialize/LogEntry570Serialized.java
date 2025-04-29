package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class LogEntry570Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class LogEntry570Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(LogEntry570Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int LOG_ENTRY_570_LENGTH = 115;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginLogMessage570;
	
	/**
	* Constructor for LogEntry570Serialized
	**/
    public LogEntry570Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for LogEntry570Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public LogEntry570Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this LogEntry570Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this LogEntry570Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in LogEntry570Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(LOG_ENTRY_570_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginLogMessage570 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localLogMessage570Counter = -1;
     public boolean isLogMessage570Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLogMessage570Counter != sharedCounter;
         localLogMessage570Counter = sharedCounter; return hasModified;
     }
	protected static final int LOG_MESSAGE_570_LEN = 115;
	/**
	 * 	serialize this LogMessage570
	 */
   protected void serializeLogMessage570(char[] logMessage570) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(logMessage570,0,getStringValue(),beginLogMessage570,LOG_MESSAGE_570_LEN);
       localLogMessage570Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLogMessage570Constraints(char[] value) {
   			return super.checkConstraints(value , 115 ,false, false);
   }
    /**
	 *	refreshLogMessage570 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLogMessage570() {	 
   		return (substring(getStringValue(),beginLogMessage570,beginLogMessage570 + LOG_MESSAGE_570_LEN));
   	}




}
  
