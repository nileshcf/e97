package com.cloudframe.app.mc071.file.records.serialize;

/**
*  The class OutputRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:53. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class OutputRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(OutputRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int OUTPUT_RECORD_LENGTH = 80;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginOutputRecordString;
	
	/**
	* Constructor for OutputRecordSerialized
	**/
    public OutputRecordSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in OutputRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(OUTPUT_RECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginOutputRecordString = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localOutputRecordStringCounter = -1;
     public boolean isOutputRecordStringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOutputRecordStringCounter != sharedCounter;
         localOutputRecordStringCounter = sharedCounter; return hasModified;
     }
	protected static final int OUTPUT_RECORD_STRING_LEN = 80;
	/**
	 * 	serialize this OutputRecordString
	 */
   protected void serializeOutputRecordString(char[] outputRecordString) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(outputRecordString,0,getStringValue(),beginOutputRecordString,OUTPUT_RECORD_STRING_LEN);
       localOutputRecordStringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkOutputRecordStringConstraints(char[] value) {
   			return super.checkConstraints(value , 80 ,false, false);
   }
    /**
	 *	refreshOutputRecordString is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshOutputRecordString() {	 
   		return (substring(getStringValue(),beginOutputRecordString,beginOutputRecordString + OUTPUT_RECORD_STRING_LEN));
   	}




}
  
