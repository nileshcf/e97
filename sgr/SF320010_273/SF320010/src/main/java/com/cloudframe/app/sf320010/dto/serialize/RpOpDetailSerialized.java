package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class RpOpDetailSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:45. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RpOpDetailSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RpOpDetailSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RP_OP_DETAIL_LENGTH = 133;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRpOpCc;
            protected  int beginRpOpRecordType;
            protected  int beginRpOpMipId;
            protected  int beginRpOpLogDate;
            protected  int beginRpOpLogTime;
            protected  int beginRpOpHeader;
            protected  int beginRpOpDelimiter;
            protected  int beginRpOpOperatorMessage;
	
	/**
	* Constructor for RpOpDetailSerialized
	**/
    public RpOpDetailSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in RpOpDetailSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RP_OP_DETAIL_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRpOpCc = getStartOffset() + 0;	// set offset for serialization
  
  
             beginRpOpRecordType = getStartOffset() + 5;	// set offset for serialization
  
  
             beginRpOpMipId = getStartOffset() + 13;	// set offset for serialization
  
  
             beginRpOpLogDate = getStartOffset() + 20;	// set offset for serialization
  
  
             beginRpOpLogTime = getStartOffset() + 30;	// set offset for serialization
  
  
             beginRpOpHeader = getStartOffset() + 39;	// set offset for serialization
  
             beginRpOpDelimiter = getStartOffset() + 47;	// set offset for serialization
  
             beginRpOpOperatorMessage = getStartOffset() + 48;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRpOpCcCounter = -1;
     public boolean isRpOpCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpOpCcCounter != sharedCounter;
         localRpOpCcCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_OP_CC_LEN = 1;
	/**
	 * 	serialize this RpOpCc
	 */
   protected void serializeRpOpCc(char[] rpOpCc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpOpCc,0,getStringValue(),beginRpOpCc,RP_OP_CC_LEN);
       localRpOpCcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpOpCcConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRpOpCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpOpCc() {	 
   		return (substring(getStringValue(),beginRpOpCc,beginRpOpCc + RP_OP_CC_LEN));
   	}
     int localRpOpRecordTypeCounter = -1;
     public boolean isRpOpRecordTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpOpRecordTypeCounter != sharedCounter;
         localRpOpRecordTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_OP_RECORD_TYPE_LEN = 1;
	/**
	 * 	serialize this RpOpRecordType
	 */
   protected void serializeRpOpRecordType(char[] rpOpRecordType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpOpRecordType,0,getStringValue(),beginRpOpRecordType,RP_OP_RECORD_TYPE_LEN);
       localRpOpRecordTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpOpRecordTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRpOpRecordType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpOpRecordType() {	 
   		return (substring(getStringValue(),beginRpOpRecordType,beginRpOpRecordType + RP_OP_RECORD_TYPE_LEN));
   	}
     int localRpOpMipIdCounter = -1;
     public boolean isRpOpMipIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpOpMipIdCounter != sharedCounter;
         localRpOpMipIdCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_OP_MIP_ID_LEN = 3;
	/**
	 * 	serialize this RpOpMipId
	 */
   protected void serializeRpOpMipId(char[] rpOpMipId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpOpMipId,0,getStringValue(),beginRpOpMipId,RP_OP_MIP_ID_LEN);
       localRpOpMipIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpOpMipIdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshRpOpMipId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpOpMipId() {	 
   		return (substring(getStringValue(),beginRpOpMipId,beginRpOpMipId + RP_OP_MIP_ID_LEN));
   	}
     int localRpOpLogDateCounter = -1;
     public boolean isRpOpLogDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpOpLogDateCounter != sharedCounter;
         localRpOpLogDateCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_OP_LOG_DATE_LEN = 6;
	/**
	 * 	serialize this RpOpLogDate
	 */
   protected void serializeRpOpLogDate(char[] rpOpLogDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpOpLogDate,0,getStringValue(),beginRpOpLogDate,RP_OP_LOG_DATE_LEN);
       localRpOpLogDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpOpLogDateConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshRpOpLogDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpOpLogDate() {	 
   		return (substring(getStringValue(),beginRpOpLogDate,beginRpOpLogDate + RP_OP_LOG_DATE_LEN));
   	}
     int localRpOpLogTimeCounter = -1;
     public boolean isRpOpLogTimeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpOpLogTimeCounter != sharedCounter;
         localRpOpLogTimeCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_OP_LOG_TIME_LEN = 6;
	/**
	 * 	serialize this RpOpLogTime
	 */
   protected void serializeRpOpLogTime(char[] rpOpLogTime) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpOpLogTime,0,getStringValue(),beginRpOpLogTime,RP_OP_LOG_TIME_LEN);
       localRpOpLogTimeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpOpLogTimeConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshRpOpLogTime is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpOpLogTime() {	 
   		return (substring(getStringValue(),beginRpOpLogTime,beginRpOpLogTime + RP_OP_LOG_TIME_LEN));
   	}
     int localRpOpHeaderCounter = -1;
     public boolean isRpOpHeaderModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpOpHeaderCounter != sharedCounter;
         localRpOpHeaderCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_OP_HEADER_LEN = 8;
	/**
	 * 	serialize this RpOpHeader
	 */
   protected void serializeRpOpHeader(char[] rpOpHeader) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpOpHeader,0,getStringValue(),beginRpOpHeader,RP_OP_HEADER_LEN);
       localRpOpHeaderCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpOpHeaderConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshRpOpHeader is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpOpHeader() {	 
   		return (substring(getStringValue(),beginRpOpHeader,beginRpOpHeader + RP_OP_HEADER_LEN));
   	}
     int localRpOpDelimiterCounter = -1;
     public boolean isRpOpDelimiterModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpOpDelimiterCounter != sharedCounter;
         localRpOpDelimiterCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_OP_DELIMITER_LEN = 1;
	/**
	 * 	serialize this RpOpDelimiter
	 */
   protected void serializeRpOpDelimiter(char[] rpOpDelimiter) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpOpDelimiter,0,getStringValue(),beginRpOpDelimiter,RP_OP_DELIMITER_LEN);
       localRpOpDelimiterCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpOpDelimiterConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRpOpDelimiter is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpOpDelimiter() {	 
   		return (substring(getStringValue(),beginRpOpDelimiter,beginRpOpDelimiter + RP_OP_DELIMITER_LEN));
   	}
     int localRpOpOperatorMessageCounter = -1;
     public boolean isRpOpOperatorMessageModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpOpOperatorMessageCounter != sharedCounter;
         localRpOpOperatorMessageCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_OP_OPERATOR_MESSAGE_LEN = 85;
	/**
	 * 	serialize this RpOpOperatorMessage
	 */
   protected void serializeRpOpOperatorMessage(char[] rpOpOperatorMessage) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpOpOperatorMessage,0,getStringValue(),beginRpOpOperatorMessage,RP_OP_OPERATOR_MESSAGE_LEN);
       localRpOpOperatorMessageCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpOpOperatorMessageConstraints(char[] value) {
   			return super.checkConstraints(value , 85 ,false, false);
   }
    /**
	 *	refreshRpOpOperatorMessage is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpOpOperatorMessage() {	 
   		return (substring(getStringValue(),beginRpOpOperatorMessage,beginRpOpOperatorMessage + RP_OP_OPERATOR_MESSAGE_LEN));
   	}




}
  
