package com.cloudframe.app.sf328010.dto.serialize;

/**
*  The class Sf528ExtractZLogRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:58. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sf528ExtractZLogRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sf528ExtractZLogRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SF_528_EXTRACT_ZLOG_REC_LENGTH = 75;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSf528ServiceId;
            protected  int beginSf528ServiceStatus;
            protected  int beginSf528ElapsedTime;
            protected  int beginSf528ServiceDateTime;
	
	/**
	* Constructor for Sf528ExtractZLogRecSerialized
	**/
    public Sf528ExtractZLogRecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Sf528ExtractZLogRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SF_528_EXTRACT_ZLOG_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSf528ServiceId = getStartOffset() + 5;	// set offset for serialization
  
             beginSf528ServiceStatus = getStartOffset() + 9;	// set offset for serialization
  
             beginSf528ElapsedTime = getStartOffset() + 10;	// set offset for serialization
  
             beginSf528ServiceDateTime = getStartOffset() + 23;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSf528ServiceIdCounter = -1;
     public boolean isSf528ServiceIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf528ServiceIdCounter != sharedCounter;
         localSf528ServiceIdCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_528_SERVICE_ID_LEN = 4;
	/**
	 * 	serialize this Sf528ServiceId
	 */
   protected void serializeSf528ServiceId(char[] sf528ServiceId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf528ServiceId,0,getStringValue(),beginSf528ServiceId,SF_528_SERVICE_ID_LEN);
       localSf528ServiceIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf528ServiceIdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshSf528ServiceId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf528ServiceId() {	 
   		return (substring(getStringValue(),beginSf528ServiceId,beginSf528ServiceId + SF_528_SERVICE_ID_LEN));
   	}
     int localSf528ServiceStatusCounter = -1;
     public boolean isSf528ServiceStatusModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf528ServiceStatusCounter != sharedCounter;
         localSf528ServiceStatusCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_528_SERVICE_STATUS_LEN = 1;
	/**
	 * 	serialize this Sf528ServiceStatus
	 */
   protected void serializeSf528ServiceStatus(char[] sf528ServiceStatus) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf528ServiceStatus,0,getStringValue(),beginSf528ServiceStatus,SF_528_SERVICE_STATUS_LEN);
       localSf528ServiceStatusCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf528ServiceStatusConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSf528ServiceStatus is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf528ServiceStatus() {	 
   		return (substring(getStringValue(),beginSf528ServiceStatus,beginSf528ServiceStatus + SF_528_SERVICE_STATUS_LEN));
   	}
         int localSf528ElapsedTimeCounter = -1;
         public boolean isSf528ElapsedTimeModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSf528ElapsedTimeCounter != sharedCounter;
            localSf528ElapsedTimeCounter = sharedCounter; return hasModified; 
         }
   protected static final int SF_528_ELAPSED_TIME_LEN = 4;
  	/**
	 * serializeSf528ElapsedTime
	 */
	protected void serializeSf528ElapsedTime(int sf528ElapsedTime) {
           replaceValue( //  save the value as string
                   getBinaryString( sf528ElapsedTime,SF_528_ELAPSED_TIME_LEN)
                  ,beginSf528ElapsedTime
                  ,SF_528_ELAPSED_TIME_LEN
                 );
            localSf528ElapsedTimeCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSf528ElapsedTimeMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshSf528ElapsedTime is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSf528ElapsedTime() {	 
			return (getInt(beginSf528ElapsedTime));
   	}
     int localSf528ServiceDateTimeCounter = -1;
     public boolean isSf528ServiceDateTimeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf528ServiceDateTimeCounter != sharedCounter;
         localSf528ServiceDateTimeCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_528_SERVICE_DATE_TIME_LEN = 14;
	/**
	 * 	serialize this Sf528ServiceDateTime
	 */
   protected void serializeSf528ServiceDateTime(char[] sf528ServiceDateTime) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf528ServiceDateTime,0,getStringValue(),beginSf528ServiceDateTime,SF_528_SERVICE_DATE_TIME_LEN);
       localSf528ServiceDateTimeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf528ServiceDateTimeConstraints(char[] value) {
   			return super.checkConstraints(value , 14 ,false, false);
   }
    /**
	 *	refreshSf528ServiceDateTime is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf528ServiceDateTime() {	 
   		return (substring(getStringValue(),beginSf528ServiceDateTime,beginSf528ServiceDateTime + SF_528_SERVICE_DATE_TIME_LEN));
   	}




}
  
