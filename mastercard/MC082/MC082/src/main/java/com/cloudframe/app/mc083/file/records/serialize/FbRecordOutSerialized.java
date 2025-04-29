package com.cloudframe.app.mc083.file.records.serialize;

/**
*  The class FbRecordOutSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:14. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FbRecordOutSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FbRecordOutSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FB_RECORD_OUT_LENGTH = 80;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFbRecordOutString;
	
	/**
	* Constructor for FbRecordOutSerialized
	**/
    public FbRecordOutSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in FbRecordOutSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FB_RECORD_OUT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFbRecordOutString = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFbRecordOutStringCounter = -1;
     public boolean isFbRecordOutStringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFbRecordOutStringCounter != sharedCounter;
         localFbRecordOutStringCounter = sharedCounter; return hasModified;
     }
	protected static final int FB_RECORD_OUT_STRING_LEN = 80;
	/**
	 * 	serialize this FbRecordOutString
	 */
   protected void serializeFbRecordOutString(char[] fbRecordOutString) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fbRecordOutString,0,getStringValue(),beginFbRecordOutString,FB_RECORD_OUT_STRING_LEN);
       localFbRecordOutStringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFbRecordOutStringConstraints(char[] value) {
   			return super.checkConstraints(value , 80 ,false, false);
   }
    /**
	 *	refreshFbRecordOutString is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFbRecordOutString() {	 
   		return (substring(getStringValue(),beginFbRecordOutString,beginFbRecordOutString + FB_RECORD_OUT_STRING_LEN));
   	}




}
  
