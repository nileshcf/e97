package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class RpC8Detail1Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RpC8Detail1Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RpC8Detail1Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RP_C_8_DETAIL_1_LENGTH = 132;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRpC8Det1Cc;
            protected  int beginRpC8Det1Alert;
            protected  int beginRpC8Det1RemMipId;
            protected  int beginRpC8Det1OperId;
            protected  int beginRpC8Det1LogDate;
            protected  int beginRpC8Det1LogTime;
            protected  int beginRpC8Det1LocMipId;
            protected  int beginRpC8Det1LogType;
            protected  int beginRpC8Det1LogDesc;
	
	/**
	* Constructor for RpC8Detail1Serialized
	**/
    public RpC8Detail1Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in RpC8Detail1Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RP_C_8_DETAIL_1_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRpC8Det1Cc = getStartOffset() + 0;	// set offset for serialization
  
  
             beginRpC8Det1Alert = getStartOffset() + 7;	// set offset for serialization
  
  
             beginRpC8Det1RemMipId = getStartOffset() + 22;	// set offset for serialization
  
  
             beginRpC8Det1OperId = getStartOffset() + 28;	// set offset for serialization
  
  
             beginRpC8Det1LogDate = getStartOffset() + 38;	// set offset for serialization
  
  
             beginRpC8Det1LogTime = getStartOffset() + 48;	// set offset for serialization
  
  
             beginRpC8Det1LocMipId = getStartOffset() + 59;	// set offset for serialization
  
  
             beginRpC8Det1LogType = getStartOffset() + 69;	// set offset for serialization
  
  
             beginRpC8Det1LogDesc = getStartOffset() + 76;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localRpC8Det1CcCounter = -1;
     public boolean isRpC8Det1CcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC8Det1CcCounter != sharedCounter;
         localRpC8Det1CcCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_C_8_DET_1_CC_LEN = 1;
	/**
	 * 	serialize this RpC8Det1Cc
	 */
   protected void serializeRpC8Det1Cc(char[] rpC8Det1Cc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpC8Det1Cc,0,getStringValue(),beginRpC8Det1Cc,RP_C_8_DET_1_CC_LEN);
       localRpC8Det1CcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpC8Det1CcConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRpC8Det1Cc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpC8Det1Cc() {	 
   		return (substring(getStringValue(),beginRpC8Det1Cc,beginRpC8Det1Cc + RP_C_8_DET_1_CC_LEN));
   	}
     int localRpC8Det1AlertCounter = -1;
     public boolean isRpC8Det1AlertModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC8Det1AlertCounter != sharedCounter;
         localRpC8Det1AlertCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_C_8_DET_1_ALERT_LEN = 8;
	/**
	 * 	serialize this RpC8Det1Alert
	 */
   protected void serializeRpC8Det1Alert(char[] rpC8Det1Alert) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpC8Det1Alert,0,getStringValue(),beginRpC8Det1Alert,RP_C_8_DET_1_ALERT_LEN);
       localRpC8Det1AlertCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpC8Det1AlertConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshRpC8Det1Alert is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpC8Det1Alert() {	 
   		return (substring(getStringValue(),beginRpC8Det1Alert,beginRpC8Det1Alert + RP_C_8_DET_1_ALERT_LEN));
   	}
     int localRpC8Det1RemMipIdCounter = -1;
     public boolean isRpC8Det1RemMipIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC8Det1RemMipIdCounter != sharedCounter;
         localRpC8Det1RemMipIdCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_C_8_DET_1_REM_MIP_ID_LEN = 3;
	/**
	 * 	serialize this RpC8Det1RemMipId
	 */
   protected void serializeRpC8Det1RemMipId(char[] rpC8Det1RemMipId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpC8Det1RemMipId,0,getStringValue(),beginRpC8Det1RemMipId,RP_C_8_DET_1_REM_MIP_ID_LEN);
       localRpC8Det1RemMipIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpC8Det1RemMipIdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshRpC8Det1RemMipId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpC8Det1RemMipId() {	 
   		return (substring(getStringValue(),beginRpC8Det1RemMipId,beginRpC8Det1RemMipId + RP_C_8_DET_1_REM_MIP_ID_LEN));
   	}
     int localRpC8Det1OperIdCounter = -1;
     public boolean isRpC8Det1OperIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC8Det1OperIdCounter != sharedCounter;
         localRpC8Det1OperIdCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_C_8_DET_1_OPER_ID_LEN = 7;
	/**
	 * 	serialize this RpC8Det1OperId
	 */
   protected void serializeRpC8Det1OperId(char[] rpC8Det1OperId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpC8Det1OperId,0,getStringValue(),beginRpC8Det1OperId,RP_C_8_DET_1_OPER_ID_LEN);
       localRpC8Det1OperIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpC8Det1OperIdConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshRpC8Det1OperId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpC8Det1OperId() {	 
   		return (substring(getStringValue(),beginRpC8Det1OperId,beginRpC8Det1OperId + RP_C_8_DET_1_OPER_ID_LEN));
   	}
     int localRpC8Det1LogDateCounter = -1;
     public boolean isRpC8Det1LogDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC8Det1LogDateCounter != sharedCounter;
         localRpC8Det1LogDateCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_C_8_DET_1_LOG_DATE_LEN = 8;
	/**
	 * 	serialize this RpC8Det1LogDate
	 */
   protected void serializeRpC8Det1LogDate(char[] rpC8Det1LogDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpC8Det1LogDate,0,getStringValue(),beginRpC8Det1LogDate,RP_C_8_DET_1_LOG_DATE_LEN);
       localRpC8Det1LogDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpC8Det1LogDateConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshRpC8Det1LogDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpC8Det1LogDate() {	 
   		return (substring(getStringValue(),beginRpC8Det1LogDate,beginRpC8Det1LogDate + RP_C_8_DET_1_LOG_DATE_LEN));
   	}
     int localRpC8Det1LogTimeCounter = -1;
     public boolean isRpC8Det1LogTimeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC8Det1LogTimeCounter != sharedCounter;
         localRpC8Det1LogTimeCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_C_8_DET_1_LOG_TIME_LEN = 8;
	/**
	 * 	serialize this RpC8Det1LogTime
	 */
   protected void serializeRpC8Det1LogTime(char[] rpC8Det1LogTime) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpC8Det1LogTime,0,getStringValue(),beginRpC8Det1LogTime,RP_C_8_DET_1_LOG_TIME_LEN);
       localRpC8Det1LogTimeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpC8Det1LogTimeConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshRpC8Det1LogTime is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpC8Det1LogTime() {	 
   		return (substring(getStringValue(),beginRpC8Det1LogTime,beginRpC8Det1LogTime + RP_C_8_DET_1_LOG_TIME_LEN));
   	}
     int localRpC8Det1LocMipIdCounter = -1;
     public boolean isRpC8Det1LocMipIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC8Det1LocMipIdCounter != sharedCounter;
         localRpC8Det1LocMipIdCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_C_8_DET_1_LOC_MIP_ID_LEN = 3;
	/**
	 * 	serialize this RpC8Det1LocMipId
	 */
   protected void serializeRpC8Det1LocMipId(char[] rpC8Det1LocMipId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpC8Det1LocMipId,0,getStringValue(),beginRpC8Det1LocMipId,RP_C_8_DET_1_LOC_MIP_ID_LEN);
       localRpC8Det1LocMipIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpC8Det1LocMipIdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshRpC8Det1LocMipId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpC8Det1LocMipId() {	 
   		return (substring(getStringValue(),beginRpC8Det1LocMipId,beginRpC8Det1LocMipId + RP_C_8_DET_1_LOC_MIP_ID_LEN));
   	}
     int localRpC8Det1LogTypeCounter = -1;
     public boolean isRpC8Det1LogTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC8Det1LogTypeCounter != sharedCounter;
         localRpC8Det1LogTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_C_8_DET_1_LOG_TYPE_LEN = 1;
	/**
	 * 	serialize this RpC8Det1LogType
	 */
   protected void serializeRpC8Det1LogType(char[] rpC8Det1LogType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpC8Det1LogType,0,getStringValue(),beginRpC8Det1LogType,RP_C_8_DET_1_LOG_TYPE_LEN);
       localRpC8Det1LogTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpC8Det1LogTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRpC8Det1LogType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpC8Det1LogType() {	 
   		return (substring(getStringValue(),beginRpC8Det1LogType,beginRpC8Det1LogType + RP_C_8_DET_1_LOG_TYPE_LEN));
   	}
     int localRpC8Det1LogDescCounter = -1;
     public boolean isRpC8Det1LogDescModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC8Det1LogDescCounter != sharedCounter;
         localRpC8Det1LogDescCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_C_8_DET_1_LOG_DESC_LEN = 45;
	/**
	 * 	serialize this RpC8Det1LogDesc
	 */
   protected void serializeRpC8Det1LogDesc(char[] rpC8Det1LogDesc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpC8Det1LogDesc,0,getStringValue(),beginRpC8Det1LogDesc,RP_C_8_DET_1_LOG_DESC_LEN);
       localRpC8Det1LogDescCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpC8Det1LogDescConstraints(char[] value) {
   			return super.checkConstraints(value , 45 ,false, false);
   }
    /**
	 *	refreshRpC8Det1LogDesc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpC8Det1LogDesc() {	 
   		return (substring(getStringValue(),beginRpC8Det1LogDesc,beginRpC8Det1LogDesc + RP_C_8_DET_1_LOG_DESC_LEN));
   	}




}
  
