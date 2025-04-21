package com.cloudframe.app.ip699930.dto.serialize;

/**
*  The class ProcessAgrmntNotFndMsg600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:05. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ProcessAgrmntNotFndMsg600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ProcessAgrmntNotFndMsg600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PROCESS_AGRMNT_NOT_FND_MSG_600_LENGTH = 67;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginProcessAgrmntNotFndPa600;
	
	/**
	* Constructor for ProcessAgrmntNotFndMsg600Serialized
	**/
    public ProcessAgrmntNotFndMsg600Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ProcessAgrmntNotFndMsg600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PROCESS_AGRMNT_NOT_FND_MSG_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginProcessAgrmntNotFndPa600 = getStartOffset() + 56;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localProcessAgrmntNotFndPa600Counter = -1;
     public boolean isProcessAgrmntNotFndPa600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localProcessAgrmntNotFndPa600Counter != sharedCounter;
         localProcessAgrmntNotFndPa600Counter = sharedCounter; return hasModified;
     }
	protected static final int PROCESS_AGRMNT_NOT_FND_PA_600_LEN = 11;
	/**
	 * 	serialize this ProcessAgrmntNotFndPa600
	 */
   protected void serializeProcessAgrmntNotFndPa600(char[] processAgrmntNotFndPa600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(processAgrmntNotFndPa600,0,getStringValue(),beginProcessAgrmntNotFndPa600,PROCESS_AGRMNT_NOT_FND_PA_600_LEN);
       localProcessAgrmntNotFndPa600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkProcessAgrmntNotFndPa600Constraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshProcessAgrmntNotFndPa600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshProcessAgrmntNotFndPa600() {	 
   		return (substring(getStringValue(),beginProcessAgrmntNotFndPa600,beginProcessAgrmntNotFndPa600 + PROCESS_AGRMNT_NOT_FND_PA_600_LEN));
   	}




}
  
