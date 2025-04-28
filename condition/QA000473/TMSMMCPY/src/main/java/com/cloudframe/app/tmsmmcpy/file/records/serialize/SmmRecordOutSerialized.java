package com.cloudframe.app.tmsmmcpy.file.records.serialize;

/**
*  The class SmmRecordOutSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:54. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SmmRecordOutSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SmmRecordOutSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SMM_RECORD_OUT_LENGTH = 822;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSmmRecordOutString;
	
	/**
	* Constructor for SmmRecordOutSerialized
	**/
    public SmmRecordOutSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in SmmRecordOutSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SMM_RECORD_OUT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSmmRecordOutString = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSmmRecordOutStringCounter = -1;
     public boolean isSmmRecordOutStringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSmmRecordOutStringCounter != sharedCounter;
         localSmmRecordOutStringCounter = sharedCounter; return hasModified;
     }
	protected static final int SMM_RECORD_OUT_STRING_LEN = 822;
	/**
	 * 	serialize this SmmRecordOutString
	 */
   protected void serializeSmmRecordOutString(char[] smmRecordOutString) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(smmRecordOutString,0,getStringValue(),beginSmmRecordOutString,SMM_RECORD_OUT_STRING_LEN);
       localSmmRecordOutStringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSmmRecordOutStringConstraints(char[] value) {
   			return super.checkConstraints(value , 822 ,false, false);
   }
    /**
	 *	refreshSmmRecordOutString is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSmmRecordOutString() {	 
   		return (substring(getStringValue(),beginSmmRecordOutString,beginSmmRecordOutString + SMM_RECORD_OUT_STRING_LEN));
   	}




}
  
