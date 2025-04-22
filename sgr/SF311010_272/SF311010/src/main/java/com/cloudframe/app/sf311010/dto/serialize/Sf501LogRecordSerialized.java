package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class Sf501LogRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:14. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sf501LogRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sf501LogRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SF_501_LOG_RECORD_LENGTH = 8000;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSf501Record;
            protected  int beginSf501RRecord;
	
	/**
	* Constructor for Sf501LogRecordSerialized
	**/
    public Sf501LogRecordSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Sf501LogRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SF_501_LOG_RECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSf501Record = getStartOffset() + 0;	// set offset for serialization
  
  
  
             beginSf501RRecord = getStartOffset() + 0;	// set offset for serialization
  
  
  
  
	   /*  end of offset */
	}
     int localSf501RecordCounter = -1;
     public boolean isSf501RecordModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf501RecordCounter != sharedCounter;
         localSf501RecordCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_501_RECORD_LEN = 8000;
	/**
	 * 	serialize this Sf501Record
	 */
   protected void serializeSf501Record(char[] sf501Record) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf501Record,0,getStringValue(),beginSf501Record,SF_501_RECORD_LEN);
       localSf501RecordCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf501RecordConstraints(char[] value) {
   			return super.checkConstraints(value , 8000 ,false, false);
   }
    /**
	 *	refreshSf501Record is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf501Record() {	 
   		return (substring(getStringValue(),beginSf501Record,beginSf501Record + SF_501_RECORD_LEN));
   	}
     int localSf501RRecordCounter = -1;
     public boolean isSf501RRecordModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf501RRecordCounter != sharedCounter;
         localSf501RRecordCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_501_RRECORD_LEN = 8000;
	/**
	 * 	serialize this Sf501RRecord
	 */
   protected void serializeSf501RRecord(char[] sf501RRecord) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf501RRecord,0,getStringValue(),beginSf501RRecord,SF_501_RRECORD_LEN);
       localSf501RRecordCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf501RRecordConstraints(char[] value) {
   			return super.checkConstraints(value , 8000 ,false, false);
   }
    /**
	 *	refreshSf501RRecord is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf501RRecord() {	 
   		return (substring(getStringValue(),beginSf501RRecord,beginSf501RRecord + SF_501_RRECORD_LEN));
   	}




}
  
