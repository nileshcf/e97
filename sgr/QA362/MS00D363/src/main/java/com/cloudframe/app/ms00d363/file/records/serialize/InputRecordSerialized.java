package com.cloudframe.app.ms00d363.file.records.serialize;

/**
*  The class InputRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:35. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class InputRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(InputRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int INPUT_RECORD_LENGTH = 1400;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginInputRecordString;
	
	/**
	* Constructor for InputRecordSerialized
	**/
    public InputRecordSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in InputRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(INPUT_RECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginInputRecordString = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localInputRecordStringCounter = -1;
     public boolean isInputRecordStringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localInputRecordStringCounter != sharedCounter;
         localInputRecordStringCounter = sharedCounter; return hasModified;
     }
	protected static final int INPUT_RECORD_STRING_LEN = 1400;
	/**
	 * 	serialize this InputRecordString
	 */
   protected void serializeInputRecordString(char[] inputRecordString) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(inputRecordString,0,getStringValue(),beginInputRecordString,INPUT_RECORD_STRING_LEN);
       localInputRecordStringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkInputRecordStringConstraints(char[] value) {
   			return super.checkConstraints(value , 1400 ,false, false);
   }
    /**
	 *	refreshInputRecordString is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshInputRecordString() {	 
   		return (substring(getStringValue(),beginInputRecordString,beginInputRecordString + INPUT_RECORD_STRING_LEN));
   	}




}
  
