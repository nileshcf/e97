package com.cloudframe.app.tstcdpag.file.records.serialize;

/**
*  The class InputRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:00. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class InputRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(InputRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int INPUT_REC_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginInputByte;
	
	/**
	* Constructor for InputRecSerialized
	**/
    public InputRecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in InputRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(INPUT_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginInputByte = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localInputByteCounter = -1;
     public boolean isInputByteModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localInputByteCounter != sharedCounter;
         localInputByteCounter = sharedCounter; return hasModified;
     }
	protected static final int INPUT_BYTE_LEN = 1;
	/**
	 * 	serialize this InputByte
	 */
   protected void serializeInputByte(char[] inputByte) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(inputByte,0,getStringValue(),beginInputByte,INPUT_BYTE_LEN);
       localInputByteCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkInputByteConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshInputByte is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshInputByte() {	 
   		return (substring(getStringValue(),beginInputByte,beginInputByte + INPUT_BYTE_LEN));
   	}




}
  
