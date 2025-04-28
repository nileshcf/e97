package com.cloudframe.app.sf326010.dto.serialize;

/**
*  The class Sf528ExtractZLogRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
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
            protected  int beginSf528ServerId;
            protected  int beginSf528LogClass;
            protected  int beginSf528LogType;
            protected  int beginSf528ServiceId;
            protected  int beginSf528ServiceStatus;
            protected  int beginSf528ElapsedTime;
            protected  int beginSf528MipLogRefNum;
	
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
             beginSf528ServerId = getStartOffset() + 0;	// set offset for serialization
  
             beginSf528LogClass = getStartOffset() + 3;	// set offset for serialization
  
             beginSf528LogType = getStartOffset() + 4;	// set offset for serialization
  
             beginSf528ServiceId = getStartOffset() + 5;	// set offset for serialization
  
             beginSf528ServiceStatus = getStartOffset() + 9;	// set offset for serialization
  
             beginSf528ElapsedTime = getStartOffset() + 10;	// set offset for serialization
  
             beginSf528MipLogRefNum = getStartOffset() + 17;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localSf528ServerIdCounter = -1;
     public boolean isSf528ServerIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf528ServerIdCounter != sharedCounter;
         localSf528ServerIdCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_528_SERVER_ID_LEN = 3;
	/**
	 * 	serialize this Sf528ServerId
	 */
   protected void serializeSf528ServerId(char[] sf528ServerId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf528ServerId,0,getStringValue(),beginSf528ServerId,SF_528_SERVER_ID_LEN);
       localSf528ServerIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf528ServerIdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshSf528ServerId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf528ServerId() {	 
   		return (substring(getStringValue(),beginSf528ServerId,beginSf528ServerId + SF_528_SERVER_ID_LEN));
   	}
     int localSf528LogClassCounter = -1;
     public boolean isSf528LogClassModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf528LogClassCounter != sharedCounter;
         localSf528LogClassCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_528_LOG_CLASS_LEN = 1;
	/**
	 * 	serialize this Sf528LogClass
	 */
   protected void serializeSf528LogClass(char[] sf528LogClass) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf528LogClass,0,getStringValue(),beginSf528LogClass,SF_528_LOG_CLASS_LEN);
       localSf528LogClassCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf528LogClassConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSf528LogClass is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf528LogClass() {	 
   		return (substring(getStringValue(),beginSf528LogClass,beginSf528LogClass + SF_528_LOG_CLASS_LEN));
   	}
     int localSf528LogTypeCounter = -1;
     public boolean isSf528LogTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf528LogTypeCounter != sharedCounter;
         localSf528LogTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_528_LOG_TYPE_LEN = 1;
	/**
	 * 	serialize this Sf528LogType
	 */
   protected void serializeSf528LogType(char[] sf528LogType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf528LogType,0,getStringValue(),beginSf528LogType,SF_528_LOG_TYPE_LEN);
       localSf528LogTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf528LogTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSf528LogType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf528LogType() {	 
   		return (substring(getStringValue(),beginSf528LogType,beginSf528LogType + SF_528_LOG_TYPE_LEN));
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
     int localSf528MipLogRefNumCounter = -1;
     public boolean isSf528MipLogRefNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf528MipLogRefNumCounter != sharedCounter;
         localSf528MipLogRefNumCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_528_MIP_LOG_REF_NUM_LEN = 6;
	/**
	 * 	serialize this Sf528MipLogRefNum
	 */
   protected void serializeSf528MipLogRefNum(char[] sf528MipLogRefNum) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf528MipLogRefNum,0,getStringValue(),beginSf528MipLogRefNum,SF_528_MIP_LOG_REF_NUM_LEN);
       localSf528MipLogRefNumCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf528MipLogRefNumConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshSf528MipLogRefNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf528MipLogRefNum() {	 
   		return (substring(getStringValue(),beginSf528MipLogRefNum,beginSf528MipLogRefNum + SF_528_MIP_LOG_REF_NUM_LEN));
   	}




}
  
