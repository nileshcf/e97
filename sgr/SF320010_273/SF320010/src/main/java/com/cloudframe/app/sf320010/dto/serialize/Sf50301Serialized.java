package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class Sf50301Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sf50301Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sf50301Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SF_50301_LENGTH = 32752;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSf503LogRecord;
	
	/**
	* Constructor for Sf50301Serialized
	**/
    public Sf50301Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Sf50301Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SF_50301_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginSf503LogRecord = getStartOffset() + 15;	// set offset for serialization
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
	   /*  end of offset */
	}
     int localSf503LogRecordCounter = -1;
     public boolean isSf503LogRecordModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf503LogRecordCounter != sharedCounter;
         localSf503LogRecordCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_503_LOG_RECORD_LEN = 32737;
	/**
	 * 	serialize this Sf503LogRecord
	 */
   protected void serializeSf503LogRecord(char[] sf503LogRecord) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf503LogRecord,0,getStringValue(),beginSf503LogRecord,SF_503_LOG_RECORD_LEN);
       localSf503LogRecordCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf503LogRecordConstraints(char[] value) {
   			return super.checkConstraints(value , 32737 ,false, false);
   }
    /**
	 *	refreshSf503LogRecord is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf503LogRecord() {	 
   		return (substring(getStringValue(),beginSf503LogRecord,beginSf503LogRecord + SF_503_LOG_RECORD_LEN));
   	}




}
  
