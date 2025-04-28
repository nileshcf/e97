package com.cloudframe.app.tmsmmcpy.file.records.serialize;

/**
*  The class SmmRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:54. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SmmRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SmmRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SMM_RECORD_LENGTH = 3996;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSmmRecordString;
	
	/**
	* Constructor for SmmRecordSerialized
	**/
    public SmmRecordSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in SmmRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SMM_RECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSmmRecordString = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSmmRecordStringCounter = -1;
     public boolean isSmmRecordStringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSmmRecordStringCounter != sharedCounter;
         localSmmRecordStringCounter = sharedCounter; return hasModified;
     }
	protected static final int SMM_RECORD_STRING_LEN = 3996;
	/**
	 * 	serialize this SmmRecordString
	 */
   protected void serializeSmmRecordString(char[] smmRecordString) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(smmRecordString,0,getStringValue(),beginSmmRecordString,SMM_RECORD_STRING_LEN);
       localSmmRecordStringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSmmRecordStringConstraints(char[] value) {
   			return super.checkConstraints(value , 3996 ,false, false);
   }
    /**
	 *	refreshSmmRecordString is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSmmRecordString() {	 
   		return (substring(getStringValue(),beginSmmRecordString,beginSmmRecordString + SMM_RECORD_STRING_LEN));
   	}




}
  
