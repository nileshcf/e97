package com.cloudframe.app.init1.dto.serialize;

/**
*  The class WsrevRevoStatRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:56. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class WsrevRevoStatRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WsrevRevoStatRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSREV_REVO_STAT_RECORD_LENGTH = 300;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWsrevVisionInstanceCd;
            protected  int beginWsrevUbOrigInstance;
            protected  int beginWsrevUbOrigFileName;
            protected  int beginWsrevBillCycleDt;
            protected  int beginWsrevSwitchId;
            protected  int beginWsrevDataType;
            protected  int beginWsrevReceivedTmstamp;
            protected  int beginWsrevCreateTmstamp;
            protected  int beginWsrevFileStatus;
            protected  int beginWsrevReason;
            protected  int beginWsrevInputCount;
            protected  int beginWsrevFilteredCount;
            protected  int beginWsrevRejectedCount;
            protected  int beginWsrevBilledCount;
            protected  int beginWsrevStreamCd;
            protected  int beginWsrevIterNo;
            protected  int beginWsrevCycleNo;
            protected  int beginWsrevDataChgAmt;
            protected  int beginWsrevRejDataChgAmt;
            protected  int beginWsrevBilledDataChgAmt;
            protected  int beginWsrevVersionNum;
	
	/**
	* Constructor for WsrevRevoStatRecordSerialized
	**/
    public WsrevRevoStatRecordSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WsrevRevoStatRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSREV_REVO_STAT_RECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWsrevVisionInstanceCd = getStartOffset() + 0;	// set offset for serialization
  
             beginWsrevUbOrigInstance = getStartOffset() + 1;	// set offset for serialization
  
             beginWsrevUbOrigFileName = getStartOffset() + 21;	// set offset for serialization
  
             beginWsrevBillCycleDt = getStartOffset() + 61;	// set offset for serialization
  
             beginWsrevSwitchId = getStartOffset() + 71;	// set offset for serialization
  
             beginWsrevDataType = getStartOffset() + 74;	// set offset for serialization
  
             beginWsrevReceivedTmstamp = getStartOffset() + 78;	// set offset for serialization
  
             beginWsrevCreateTmstamp = getStartOffset() + 104;	// set offset for serialization
  
             beginWsrevFileStatus = getStartOffset() + 130;	// set offset for serialization
  
             beginWsrevReason = getStartOffset() + 140;	// set offset for serialization
  
             beginWsrevInputCount = getStartOffset() + 180;	// set offset for serialization
  
             beginWsrevFilteredCount = getStartOffset() + 189;	// set offset for serialization
  
             beginWsrevRejectedCount = getStartOffset() + 198;	// set offset for serialization
  
             beginWsrevBilledCount = getStartOffset() + 207;	// set offset for serialization
  
             beginWsrevStreamCd = getStartOffset() + 216;	// set offset for serialization
  
             beginWsrevIterNo = getStartOffset() + 217;	// set offset for serialization
  
             beginWsrevCycleNo = getStartOffset() + 221;	// set offset for serialization
  
             beginWsrevDataChgAmt = getStartOffset() + 223;	// set offset for serialization
  
             beginWsrevRejDataChgAmt = getStartOffset() + 232;	// set offset for serialization
  
             beginWsrevBilledDataChgAmt = getStartOffset() + 241;	// set offset for serialization
  
             beginWsrevVersionNum = getStartOffset() + 250;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localWsrevVisionInstanceCdCounter = -1;
     public boolean isWsrevVisionInstanceCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWsrevVisionInstanceCdCounter != sharedCounter;
         localWsrevVisionInstanceCdCounter = sharedCounter; return hasModified;
     }
	protected static final int WSREV_VISION_INSTANCE_CD_LEN = 1;
	/**
	 * 	serialize this WsrevVisionInstanceCd
	 */
   protected void serializeWsrevVisionInstanceCd(char[] wsrevVisionInstanceCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wsrevVisionInstanceCd,0,getStringValue(),beginWsrevVisionInstanceCd,WSREV_VISION_INSTANCE_CD_LEN);
       localWsrevVisionInstanceCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWsrevVisionInstanceCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshWsrevVisionInstanceCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWsrevVisionInstanceCd() {	 
   		return (substring(getStringValue(),beginWsrevVisionInstanceCd,beginWsrevVisionInstanceCd + WSREV_VISION_INSTANCE_CD_LEN));
   	}
     int localWsrevUbOrigInstanceCounter = -1;
     public boolean isWsrevUbOrigInstanceModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWsrevUbOrigInstanceCounter != sharedCounter;
         localWsrevUbOrigInstanceCounter = sharedCounter; return hasModified;
     }
	protected static final int WSREV_UB_ORIG_INSTANCE_LEN = 20;
	/**
	 * 	serialize this WsrevUbOrigInstance
	 */
   protected void serializeWsrevUbOrigInstance(char[] wsrevUbOrigInstance) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wsrevUbOrigInstance,0,getStringValue(),beginWsrevUbOrigInstance,WSREV_UB_ORIG_INSTANCE_LEN);
       localWsrevUbOrigInstanceCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWsrevUbOrigInstanceConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWsrevUbOrigInstance is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWsrevUbOrigInstance() {	 
   		return (substring(getStringValue(),beginWsrevUbOrigInstance,beginWsrevUbOrigInstance + WSREV_UB_ORIG_INSTANCE_LEN));
   	}
     int localWsrevUbOrigFileNameCounter = -1;
     public boolean isWsrevUbOrigFileNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWsrevUbOrigFileNameCounter != sharedCounter;
         localWsrevUbOrigFileNameCounter = sharedCounter; return hasModified;
     }
	protected static final int WSREV_UB_ORIG_FILE_NAME_LEN = 40;
	/**
	 * 	serialize this WsrevUbOrigFileName
	 */
   protected void serializeWsrevUbOrigFileName(char[] wsrevUbOrigFileName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wsrevUbOrigFileName,0,getStringValue(),beginWsrevUbOrigFileName,WSREV_UB_ORIG_FILE_NAME_LEN);
       localWsrevUbOrigFileNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWsrevUbOrigFileNameConstraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshWsrevUbOrigFileName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWsrevUbOrigFileName() {	 
   		return (substring(getStringValue(),beginWsrevUbOrigFileName,beginWsrevUbOrigFileName + WSREV_UB_ORIG_FILE_NAME_LEN));
   	}
     int localWsrevBillCycleDtCounter = -1;
     public boolean isWsrevBillCycleDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWsrevBillCycleDtCounter != sharedCounter;
         localWsrevBillCycleDtCounter = sharedCounter; return hasModified;
     }
	protected static final int WSREV_BILL_CYCLE_DT_LEN = 10;
	/**
	 * 	serialize this WsrevBillCycleDt
	 */
   protected void serializeWsrevBillCycleDt(char[] wsrevBillCycleDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wsrevBillCycleDt,0,getStringValue(),beginWsrevBillCycleDt,WSREV_BILL_CYCLE_DT_LEN);
       localWsrevBillCycleDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWsrevBillCycleDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshWsrevBillCycleDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWsrevBillCycleDt() {	 
   		return (substring(getStringValue(),beginWsrevBillCycleDt,beginWsrevBillCycleDt + WSREV_BILL_CYCLE_DT_LEN));
   	}
     int localWsrevSwitchIdCounter = -1;
     public boolean isWsrevSwitchIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWsrevSwitchIdCounter != sharedCounter;
         localWsrevSwitchIdCounter = sharedCounter; return hasModified;
     }
	protected static final int WSREV_SWITCH_ID_LEN = 3;
	/**
	 * 	serialize this WsrevSwitchId
	 */
   protected void serializeWsrevSwitchId(char[] wsrevSwitchId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wsrevSwitchId,0,getStringValue(),beginWsrevSwitchId,WSREV_SWITCH_ID_LEN);
       localWsrevSwitchIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWsrevSwitchIdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshWsrevSwitchId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWsrevSwitchId() {	 
   		return (substring(getStringValue(),beginWsrevSwitchId,beginWsrevSwitchId + WSREV_SWITCH_ID_LEN));
   	}
     int localWsrevDataTypeCounter = -1;
     public boolean isWsrevDataTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWsrevDataTypeCounter != sharedCounter;
         localWsrevDataTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int WSREV_DATA_TYPE_LEN = 4;
	/**
	 * 	serialize this WsrevDataType
	 */
   protected void serializeWsrevDataType(char[] wsrevDataType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wsrevDataType,0,getStringValue(),beginWsrevDataType,WSREV_DATA_TYPE_LEN);
       localWsrevDataTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWsrevDataTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshWsrevDataType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWsrevDataType() {	 
   		return (substring(getStringValue(),beginWsrevDataType,beginWsrevDataType + WSREV_DATA_TYPE_LEN));
   	}
     int localWsrevReceivedTmstampCounter = -1;
     public boolean isWsrevReceivedTmstampModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWsrevReceivedTmstampCounter != sharedCounter;
         localWsrevReceivedTmstampCounter = sharedCounter; return hasModified;
     }
	protected static final int WSREV_RECEIVED_TMSTAMP_LEN = 26;
	/**
	 * 	serialize this WsrevReceivedTmstamp
	 */
   protected void serializeWsrevReceivedTmstamp(char[] wsrevReceivedTmstamp) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wsrevReceivedTmstamp,0,getStringValue(),beginWsrevReceivedTmstamp,WSREV_RECEIVED_TMSTAMP_LEN);
       localWsrevReceivedTmstampCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWsrevReceivedTmstampConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshWsrevReceivedTmstamp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWsrevReceivedTmstamp() {	 
   		return (substring(getStringValue(),beginWsrevReceivedTmstamp,beginWsrevReceivedTmstamp + WSREV_RECEIVED_TMSTAMP_LEN));
   	}
     int localWsrevCreateTmstampCounter = -1;
     public boolean isWsrevCreateTmstampModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWsrevCreateTmstampCounter != sharedCounter;
         localWsrevCreateTmstampCounter = sharedCounter; return hasModified;
     }
	protected static final int WSREV_CREATE_TMSTAMP_LEN = 26;
	/**
	 * 	serialize this WsrevCreateTmstamp
	 */
   protected void serializeWsrevCreateTmstamp(char[] wsrevCreateTmstamp) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wsrevCreateTmstamp,0,getStringValue(),beginWsrevCreateTmstamp,WSREV_CREATE_TMSTAMP_LEN);
       localWsrevCreateTmstampCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWsrevCreateTmstampConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshWsrevCreateTmstamp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWsrevCreateTmstamp() {	 
   		return (substring(getStringValue(),beginWsrevCreateTmstamp,beginWsrevCreateTmstamp + WSREV_CREATE_TMSTAMP_LEN));
   	}
     int localWsrevFileStatusCounter = -1;
     public boolean isWsrevFileStatusModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWsrevFileStatusCounter != sharedCounter;
         localWsrevFileStatusCounter = sharedCounter; return hasModified;
     }
	protected static final int WSREV_FILE_STATUS_LEN = 10;
	/**
	 * 	serialize this WsrevFileStatus
	 */
   protected void serializeWsrevFileStatus(char[] wsrevFileStatus) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wsrevFileStatus,0,getStringValue(),beginWsrevFileStatus,WSREV_FILE_STATUS_LEN);
       localWsrevFileStatusCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWsrevFileStatusConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshWsrevFileStatus is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWsrevFileStatus() {	 
   		return (substring(getStringValue(),beginWsrevFileStatus,beginWsrevFileStatus + WSREV_FILE_STATUS_LEN));
   	}
     int localWsrevReasonCounter = -1;
     public boolean isWsrevReasonModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWsrevReasonCounter != sharedCounter;
         localWsrevReasonCounter = sharedCounter; return hasModified;
     }
	protected static final int WSREV_REASON_LEN = 40;
	/**
	 * 	serialize this WsrevReason
	 */
   protected void serializeWsrevReason(char[] wsrevReason) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wsrevReason,0,getStringValue(),beginWsrevReason,WSREV_REASON_LEN);
       localWsrevReasonCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWsrevReasonConstraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshWsrevReason is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWsrevReason() {	 
   		return (substring(getStringValue(),beginWsrevReason,beginWsrevReason + WSREV_REASON_LEN));
   	}
     int localWsrevInputCountCounter = -1;
     public boolean isWsrevInputCountModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWsrevInputCountCounter != sharedCounter;
         localWsrevInputCountCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of wsrevInputCount
	 *	@return wsrevInputCount
	 */
	public char[]  getWsrevInputCountString() {
	     return getCharArray(beginWsrevInputCount,WSREV_INPUT_COUNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wsrevInputCountIsNumeric() {
	    return isNumeric(beginWsrevInputCount
	                    ,beginWsrevInputCount + WSREV_INPUT_COUNT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WSREV_INPUT_COUNT_LEN = 9;
  	/**
	 * serializeWsrevInputCount
	 */
	protected void serializeWsrevInputCount(long wsrevInputCount) {
		 putNumber(beginWsrevInputCount,wsrevInputCount,WSREV_INPUT_COUNT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWsrevInputCountCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWsrevInputCount
	 */
   	protected  long serializeWsrevInputCount(char[] value) {
	    long  wsrevInputCount;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    wsrevInputCount = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginWsrevInputCount
		       ,9
		      );
		 localWsrevInputCountCounter = shareString.getSerializedField().getModifiedCounter();
		return  wsrevInputCount;
    }

   protected long checkWsrevInputCountMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWsrevInputCount is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshWsrevInputCount() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginWsrevInputCount
			                 ,WSREV_INPUT_COUNT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("wsrevInputCount", beginWsrevInputCount,WSREV_INPUT_COUNT_LEN);
    }
   	}
     int localWsrevFilteredCountCounter = -1;
     public boolean isWsrevFilteredCountModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWsrevFilteredCountCounter != sharedCounter;
         localWsrevFilteredCountCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of wsrevFilteredCount
	 *	@return wsrevFilteredCount
	 */
	public char[]  getWsrevFilteredCountString() {
	     return getCharArray(beginWsrevFilteredCount,WSREV_FILTERED_COUNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wsrevFilteredCountIsNumeric() {
	    return isNumeric(beginWsrevFilteredCount
	                    ,beginWsrevFilteredCount + WSREV_FILTERED_COUNT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WSREV_FILTERED_COUNT_LEN = 9;
  	/**
	 * serializeWsrevFilteredCount
	 */
	protected void serializeWsrevFilteredCount(long wsrevFilteredCount) {
		 putNumber(beginWsrevFilteredCount,wsrevFilteredCount,WSREV_FILTERED_COUNT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWsrevFilteredCountCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWsrevFilteredCount
	 */
   	protected  long serializeWsrevFilteredCount(char[] value) {
	    long  wsrevFilteredCount;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    wsrevFilteredCount = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginWsrevFilteredCount
		       ,9
		      );
		 localWsrevFilteredCountCounter = shareString.getSerializedField().getModifiedCounter();
		return  wsrevFilteredCount;
    }

   protected long checkWsrevFilteredCountMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWsrevFilteredCount is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshWsrevFilteredCount() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginWsrevFilteredCount
			                 ,WSREV_FILTERED_COUNT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("wsrevFilteredCount", beginWsrevFilteredCount,WSREV_FILTERED_COUNT_LEN);
    }
   	}
     int localWsrevRejectedCountCounter = -1;
     public boolean isWsrevRejectedCountModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWsrevRejectedCountCounter != sharedCounter;
         localWsrevRejectedCountCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of wsrevRejectedCount
	 *	@return wsrevRejectedCount
	 */
	public char[]  getWsrevRejectedCountString() {
	     return getCharArray(beginWsrevRejectedCount,WSREV_REJECTED_COUNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wsrevRejectedCountIsNumeric() {
	    return isNumeric(beginWsrevRejectedCount
	                    ,beginWsrevRejectedCount + WSREV_REJECTED_COUNT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WSREV_REJECTED_COUNT_LEN = 9;
  	/**
	 * serializeWsrevRejectedCount
	 */
	protected void serializeWsrevRejectedCount(long wsrevRejectedCount) {
		 putNumber(beginWsrevRejectedCount,wsrevRejectedCount,WSREV_REJECTED_COUNT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWsrevRejectedCountCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWsrevRejectedCount
	 */
   	protected  long serializeWsrevRejectedCount(char[] value) {
	    long  wsrevRejectedCount;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    wsrevRejectedCount = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginWsrevRejectedCount
		       ,9
		      );
		 localWsrevRejectedCountCounter = shareString.getSerializedField().getModifiedCounter();
		return  wsrevRejectedCount;
    }

   protected long checkWsrevRejectedCountMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWsrevRejectedCount is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshWsrevRejectedCount() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginWsrevRejectedCount
			                 ,WSREV_REJECTED_COUNT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("wsrevRejectedCount", beginWsrevRejectedCount,WSREV_REJECTED_COUNT_LEN);
    }
   	}
     int localWsrevBilledCountCounter = -1;
     public boolean isWsrevBilledCountModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWsrevBilledCountCounter != sharedCounter;
         localWsrevBilledCountCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of wsrevBilledCount
	 *	@return wsrevBilledCount
	 */
	public char[]  getWsrevBilledCountString() {
	     return getCharArray(beginWsrevBilledCount,WSREV_BILLED_COUNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wsrevBilledCountIsNumeric() {
	    return isNumeric(beginWsrevBilledCount
	                    ,beginWsrevBilledCount + WSREV_BILLED_COUNT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WSREV_BILLED_COUNT_LEN = 9;
  	/**
	 * serializeWsrevBilledCount
	 */
	protected void serializeWsrevBilledCount(long wsrevBilledCount) {
		 putNumber(beginWsrevBilledCount,wsrevBilledCount,WSREV_BILLED_COUNT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWsrevBilledCountCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWsrevBilledCount
	 */
   	protected  long serializeWsrevBilledCount(char[] value) {
	    long  wsrevBilledCount;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    wsrevBilledCount = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginWsrevBilledCount
		       ,9
		      );
		 localWsrevBilledCountCounter = shareString.getSerializedField().getModifiedCounter();
		return  wsrevBilledCount;
    }

   protected long checkWsrevBilledCountMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWsrevBilledCount is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshWsrevBilledCount() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginWsrevBilledCount
			                 ,WSREV_BILLED_COUNT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("wsrevBilledCount", beginWsrevBilledCount,WSREV_BILLED_COUNT_LEN);
    }
   	}
     int localWsrevStreamCdCounter = -1;
     public boolean isWsrevStreamCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWsrevStreamCdCounter != sharedCounter;
         localWsrevStreamCdCounter = sharedCounter; return hasModified;
     }
	protected static final int WSREV_STREAM_CD_LEN = 1;
	/**
	 * 	serialize this WsrevStreamCd
	 */
   protected void serializeWsrevStreamCd(char[] wsrevStreamCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wsrevStreamCd,0,getStringValue(),beginWsrevStreamCd,WSREV_STREAM_CD_LEN);
       localWsrevStreamCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWsrevStreamCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshWsrevStreamCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWsrevStreamCd() {	 
   		return (substring(getStringValue(),beginWsrevStreamCd,beginWsrevStreamCd + WSREV_STREAM_CD_LEN));
   	}
     int localWsrevIterNoCounter = -1;
     public boolean isWsrevIterNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWsrevIterNoCounter != sharedCounter;
         localWsrevIterNoCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of wsrevIterNo
	 *	@return wsrevIterNo
	 */
	public char[]  getWsrevIterNoString() {
	     return getCharArray(beginWsrevIterNo,WSREV_ITER_NO_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wsrevIterNoIsNumeric() {
	    return isNumeric(beginWsrevIterNo
	                    ,beginWsrevIterNo + WSREV_ITER_NO_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WSREV_ITER_NO_LEN = 4;
  	/**
	 * serializeWsrevIterNo
	 */
	protected void serializeWsrevIterNo(int wsrevIterNo) {
		 putNumber(beginWsrevIterNo,wsrevIterNo,WSREV_ITER_NO_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWsrevIterNoCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWsrevIterNo
	 */
   	protected  int serializeWsrevIterNo(char[] value) {
	    int  wsrevIterNo;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    wsrevIterNo = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginWsrevIterNo
		       ,4
		      );
		 localWsrevIterNoCounter = shareString.getSerializedField().getModifiedCounter();
		return  wsrevIterNo;
    }

   protected int checkWsrevIterNoMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWsrevIterNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWsrevIterNo() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginWsrevIterNo
			                 ,WSREV_ITER_NO_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("wsrevIterNo", beginWsrevIterNo,WSREV_ITER_NO_LEN);
    }
   	}
     int localWsrevCycleNoCounter = -1;
     public boolean isWsrevCycleNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWsrevCycleNoCounter != sharedCounter;
         localWsrevCycleNoCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of wsrevCycleNo
	 *	@return wsrevCycleNo
	 */
	public char[]  getWsrevCycleNoString() {
	     return getCharArray(beginWsrevCycleNo,WSREV_CYCLE_NO_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wsrevCycleNoIsNumeric() {
	    return isNumeric(beginWsrevCycleNo
	                    ,beginWsrevCycleNo + WSREV_CYCLE_NO_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WSREV_CYCLE_NO_LEN = 2;
  	/**
	 * serializeWsrevCycleNo
	 */
	protected void serializeWsrevCycleNo(int wsrevCycleNo) {
		 putNumber(beginWsrevCycleNo,wsrevCycleNo,WSREV_CYCLE_NO_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWsrevCycleNoCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWsrevCycleNo
	 */
   	protected  int serializeWsrevCycleNo(char[] value) {
	    int  wsrevCycleNo;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    wsrevCycleNo = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginWsrevCycleNo
		       ,2
		      );
		 localWsrevCycleNoCounter = shareString.getSerializedField().getModifiedCounter();
		return  wsrevCycleNo;
    }

   protected int checkWsrevCycleNoMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWsrevCycleNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWsrevCycleNo() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginWsrevCycleNo
			                 ,WSREV_CYCLE_NO_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("wsrevCycleNo", beginWsrevCycleNo,WSREV_CYCLE_NO_LEN);
    }
   	}
     int localWsrevDataChgAmtCounter = -1;
     
     public boolean isWsrevDataChgAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWsrevDataChgAmtCounter != sharedCounter;
         localWsrevDataChgAmtCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of wsrevDataChgAmt
	 *	@return wsrevDataChgAmt
	 */
	public char[]  getWsrevDataChgAmtString() {
	    return getCharArray(beginWsrevDataChgAmt,WSREV_DATA_CHG_AMT_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wsrevDataChgAmtIsNumeric() {
		    return isNumeric(beginWsrevDataChgAmt
	                    ,beginWsrevDataChgAmt + WSREV_DATA_CHG_AMT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int WSREV_DATA_CHG_AMT_LEN = 9;
  protected  static final int WSREV_DATA_CHG_AMT_SCALE = 2;

   protected BigDecimal checkWsrevDataChgAmtMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,9/*precision*/);
   }

  	/**
	 * serializeWsrevDataChgAmt
	 */
	protected void serializeWsrevDataChgAmt(BigDecimal wsrevDataChgAmt) {
	       putNumber(beginWsrevDataChgAmt,wsrevDataChgAmt,WSREV_DATA_CHG_AMT_LEN,WSREV_DATA_CHG_AMT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWsrevDataChgAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeWsrevDataChgAmt
	 */
   	protected  BigDecimal serializeWsrevDataChgAmt(char[] value) throws CFException {
        if (value.length < 9) value = pad(9, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginWsrevDataChgAmt
		       ,9
		      );		 localWsrevDataChgAmtCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,WSREV_DATA_CHG_AMT_LEN,WSREV_DATA_CHG_AMT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("wsrevDataChgAmt", beginWsrevDataChgAmt,WSREV_DATA_CHG_AMT_LEN);
    	}
    }
    /**
	 *	refreshWsrevDataChgAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWsrevDataChgAmt() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginWsrevDataChgAmt
			            ,WSREV_DATA_CHG_AMT_LEN
			            ,WSREV_DATA_CHG_AMT_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("wsrevDataChgAmt", beginWsrevDataChgAmt,WSREV_DATA_CHG_AMT_LEN);
    }
   	}
     int localWsrevRejDataChgAmtCounter = -1;
     
     public boolean isWsrevRejDataChgAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWsrevRejDataChgAmtCounter != sharedCounter;
         localWsrevRejDataChgAmtCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of wsrevRejDataChgAmt
	 *	@return wsrevRejDataChgAmt
	 */
	public char[]  getWsrevRejDataChgAmtString() {
	    return getCharArray(beginWsrevRejDataChgAmt,WSREV_REJ_DATA_CHG_AMT_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wsrevRejDataChgAmtIsNumeric() {
		    return isNumeric(beginWsrevRejDataChgAmt
	                    ,beginWsrevRejDataChgAmt + WSREV_REJ_DATA_CHG_AMT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int WSREV_REJ_DATA_CHG_AMT_LEN = 9;
  protected  static final int WSREV_REJ_DATA_CHG_AMT_SCALE = 2;

   protected BigDecimal checkWsrevRejDataChgAmtMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,9/*precision*/);
   }

  	/**
	 * serializeWsrevRejDataChgAmt
	 */
	protected void serializeWsrevRejDataChgAmt(BigDecimal wsrevRejDataChgAmt) {
	       putNumber(beginWsrevRejDataChgAmt,wsrevRejDataChgAmt,WSREV_REJ_DATA_CHG_AMT_LEN,WSREV_REJ_DATA_CHG_AMT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWsrevRejDataChgAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeWsrevRejDataChgAmt
	 */
   	protected  BigDecimal serializeWsrevRejDataChgAmt(char[] value) throws CFException {
        if (value.length < 9) value = pad(9, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginWsrevRejDataChgAmt
		       ,9
		      );		 localWsrevRejDataChgAmtCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,WSREV_REJ_DATA_CHG_AMT_LEN,WSREV_REJ_DATA_CHG_AMT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("wsrevRejDataChgAmt", beginWsrevRejDataChgAmt,WSREV_REJ_DATA_CHG_AMT_LEN);
    	}
    }
    /**
	 *	refreshWsrevRejDataChgAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWsrevRejDataChgAmt() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginWsrevRejDataChgAmt
			            ,WSREV_REJ_DATA_CHG_AMT_LEN
			            ,WSREV_REJ_DATA_CHG_AMT_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("wsrevRejDataChgAmt", beginWsrevRejDataChgAmt,WSREV_REJ_DATA_CHG_AMT_LEN);
    }
   	}
     int localWsrevBilledDataChgAmtCounter = -1;
     
     public boolean isWsrevBilledDataChgAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWsrevBilledDataChgAmtCounter != sharedCounter;
         localWsrevBilledDataChgAmtCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of wsrevBilledDataChgAmt
	 *	@return wsrevBilledDataChgAmt
	 */
	public char[]  getWsrevBilledDataChgAmtString() {
	    return getCharArray(beginWsrevBilledDataChgAmt,WSREV_BILLED_DATA_CHG_AMT_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wsrevBilledDataChgAmtIsNumeric() {
		    return isNumeric(beginWsrevBilledDataChgAmt
	                    ,beginWsrevBilledDataChgAmt + WSREV_BILLED_DATA_CHG_AMT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int WSREV_BILLED_DATA_CHG_AMT_LEN = 9;
  protected  static final int WSREV_BILLED_DATA_CHG_AMT_SCALE = 2;

   protected BigDecimal checkWsrevBilledDataChgAmtMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,9/*precision*/);
   }

  	/**
	 * serializeWsrevBilledDataChgAmt
	 */
	protected void serializeWsrevBilledDataChgAmt(BigDecimal wsrevBilledDataChgAmt) {
	       putNumber(beginWsrevBilledDataChgAmt,wsrevBilledDataChgAmt,WSREV_BILLED_DATA_CHG_AMT_LEN,WSREV_BILLED_DATA_CHG_AMT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWsrevBilledDataChgAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeWsrevBilledDataChgAmt
	 */
   	protected  BigDecimal serializeWsrevBilledDataChgAmt(char[] value) throws CFException {
        if (value.length < 9) value = pad(9, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginWsrevBilledDataChgAmt
		       ,9
		      );		 localWsrevBilledDataChgAmtCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,WSREV_BILLED_DATA_CHG_AMT_LEN,WSREV_BILLED_DATA_CHG_AMT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("wsrevBilledDataChgAmt", beginWsrevBilledDataChgAmt,WSREV_BILLED_DATA_CHG_AMT_LEN);
    	}
    }
    /**
	 *	refreshWsrevBilledDataChgAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWsrevBilledDataChgAmt() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginWsrevBilledDataChgAmt
			            ,WSREV_BILLED_DATA_CHG_AMT_LEN
			            ,WSREV_BILLED_DATA_CHG_AMT_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("wsrevBilledDataChgAmt", beginWsrevBilledDataChgAmt,WSREV_BILLED_DATA_CHG_AMT_LEN);
    }
   	}
     int localWsrevVersionNumCounter = -1;
     public boolean isWsrevVersionNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWsrevVersionNumCounter != sharedCounter;
         localWsrevVersionNumCounter = sharedCounter; return hasModified;
     }
	protected static final int WSREV_VERSION_NUM_LEN = 4;
	/**
	 * 	serialize this WsrevVersionNum
	 */
   protected void serializeWsrevVersionNum(char[] wsrevVersionNum) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wsrevVersionNum,0,getStringValue(),beginWsrevVersionNum,WSREV_VERSION_NUM_LEN);
       localWsrevVersionNumCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWsrevVersionNumConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshWsrevVersionNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWsrevVersionNum() {	 
   		return (substring(getStringValue(),beginWsrevVersionNum,beginWsrevVersionNum + WSREV_VERSION_NUM_LEN));
   	}




}
  
