package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class RpPsDetailSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RpPsDetailSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RpPsDetailSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RP_PS_DETAIL_LENGTH = 133;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRpPsDCc;
            protected  int beginRpPsRecordType;
            protected  int beginRpPsReferenceNbr;
            protected  int beginRpPsTime;
            protected  int beginRpPsTransDate;
            protected  int beginRpPsFloorLimInd;
            protected  int beginRpPsFloorLimAmt;
            protected  int beginRpPsPosResponse;
            protected  int beginRpPsRejectReason;
            protected  int beginRpPsInasTransCode;
            protected  int beginRpPsInasResponse;
            protected  int beginRpPsAuthorizationCode;
            protected  int beginRpPsIcaNumber;
            protected  int beginRpPsTerminalId;
            protected  int beginRpPsCardholderNbr;
            protected  int beginRpPsExpirationDate;
            protected  int beginRpPsMagneticStripeInd;
            protected  int beginRpPsMessageStatus;
            protected  int beginRpPsNetworkType;
            protected  int beginRpPsQueueIdInputPort;
            protected  int beginRpPsTimeInSystemHh;
            protected  int beginRpPsTimeInSystemMm;
            protected  int beginRpPsTimeInSystemSs;
            protected  int beginRpPsTerminalAuthCode;
	
	/**
	* Constructor for RpPsDetailSerialized
	**/
    public RpPsDetailSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in RpPsDetailSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RP_PS_DETAIL_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRpPsDCc = getStartOffset() + 0;	// set offset for serialization
  
             beginRpPsRecordType = getStartOffset() + 1;	// set offset for serialization
  
  
             beginRpPsReferenceNbr = getStartOffset() + 3;	// set offset for serialization
  
  
             beginRpPsTime = getStartOffset() + 10;	// set offset for serialization
  
  
             beginRpPsTransDate = getStartOffset() + 17;	// set offset for serialization
  
  
             beginRpPsFloorLimInd = getStartOffset() + 24;	// set offset for serialization
  
  
             beginRpPsFloorLimAmt = getStartOffset() + 26;	// set offset for serialization
  
  
             beginRpPsPosResponse = getStartOffset() + 32;	// set offset for serialization
  
  
             beginRpPsRejectReason = getStartOffset() + 34;	// set offset for serialization
  
  
             beginRpPsInasTransCode = getStartOffset() + 36;	// set offset for serialization
  
  
             beginRpPsInasResponse = getStartOffset() + 40;	// set offset for serialization
  
  
             beginRpPsAuthorizationCode = getStartOffset() + 42;	// set offset for serialization
  
  
             beginRpPsIcaNumber = getStartOffset() + 49;	// set offset for serialization
  
  
             beginRpPsTerminalId = getStartOffset() + 56;	// set offset for serialization
  
  
             beginRpPsCardholderNbr = getStartOffset() + 75;	// set offset for serialization
  
  
             beginRpPsExpirationDate = getStartOffset() + 95;	// set offset for serialization
  
  
  
  
             beginRpPsMagneticStripeInd = getStartOffset() + 109;	// set offset for serialization
  
  
             beginRpPsMessageStatus = getStartOffset() + 111;	// set offset for serialization
  
  
             beginRpPsNetworkType = getStartOffset() + 113;	// set offset for serialization
  
  
             beginRpPsQueueIdInputPort = getStartOffset() + 115;	// set offset for serialization
  
  
             beginRpPsTimeInSystemHh = getStartOffset() + 120;	// set offset for serialization
  
             beginRpPsTimeInSystemMm = getStartOffset() + 122;	// set offset for serialization
  
             beginRpPsTimeInSystemSs = getStartOffset() + 124;	// set offset for serialization
  
  
             beginRpPsTerminalAuthCode = getStartOffset() + 127;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRpPsDCcCounter = -1;
     public boolean isRpPsDCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpPsDCcCounter != sharedCounter;
         localRpPsDCcCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_PS_DCC_LEN = 1;
	/**
	 * 	serialize this RpPsDCc
	 */
   protected void serializeRpPsDCc(char[] rpPsDCc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpPsDCc,0,getStringValue(),beginRpPsDCc,RP_PS_DCC_LEN);
       localRpPsDCcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpPsDCcConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRpPsDCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpPsDCc() {	 
   		return (substring(getStringValue(),beginRpPsDCc,beginRpPsDCc + RP_PS_DCC_LEN));
   	}
     int localRpPsRecordTypeCounter = -1;
     public boolean isRpPsRecordTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpPsRecordTypeCounter != sharedCounter;
         localRpPsRecordTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_PS_RECORD_TYPE_LEN = 1;
	/**
	 * 	serialize this RpPsRecordType
	 */
   protected void serializeRpPsRecordType(char[] rpPsRecordType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpPsRecordType,0,getStringValue(),beginRpPsRecordType,RP_PS_RECORD_TYPE_LEN);
       localRpPsRecordTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpPsRecordTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRpPsRecordType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpPsRecordType() {	 
   		return (substring(getStringValue(),beginRpPsRecordType,beginRpPsRecordType + RP_PS_RECORD_TYPE_LEN));
   	}
     int localRpPsReferenceNbrCounter = -1;
     public boolean isRpPsReferenceNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpPsReferenceNbrCounter != sharedCounter;
         localRpPsReferenceNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_PS_REFERENCE_NBR_LEN = 6;
	/**
	 * 	serialize this RpPsReferenceNbr
	 */
   protected void serializeRpPsReferenceNbr(char[] rpPsReferenceNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpPsReferenceNbr,0,getStringValue(),beginRpPsReferenceNbr,RP_PS_REFERENCE_NBR_LEN);
       localRpPsReferenceNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpPsReferenceNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshRpPsReferenceNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpPsReferenceNbr() {	 
   		return (substring(getStringValue(),beginRpPsReferenceNbr,beginRpPsReferenceNbr + RP_PS_REFERENCE_NBR_LEN));
   	}
     int localRpPsTimeCounter = -1;
     public boolean isRpPsTimeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpPsTimeCounter != sharedCounter;
         localRpPsTimeCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_PS_TIME_LEN = 6;
	/**
	 * 	serialize this RpPsTime
	 */
   protected void serializeRpPsTime(char[] rpPsTime) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpPsTime,0,getStringValue(),beginRpPsTime,RP_PS_TIME_LEN);
       localRpPsTimeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpPsTimeConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshRpPsTime is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpPsTime() {	 
   		return (substring(getStringValue(),beginRpPsTime,beginRpPsTime + RP_PS_TIME_LEN));
   	}
     int localRpPsTransDateCounter = -1;
     public boolean isRpPsTransDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpPsTransDateCounter != sharedCounter;
         localRpPsTransDateCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_PS_TRANS_DATE_LEN = 6;
	/**
	 * 	serialize this RpPsTransDate
	 */
   protected void serializeRpPsTransDate(char[] rpPsTransDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpPsTransDate,0,getStringValue(),beginRpPsTransDate,RP_PS_TRANS_DATE_LEN);
       localRpPsTransDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpPsTransDateConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshRpPsTransDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpPsTransDate() {	 
   		return (substring(getStringValue(),beginRpPsTransDate,beginRpPsTransDate + RP_PS_TRANS_DATE_LEN));
   	}
     int localRpPsFloorLimIndCounter = -1;
     public boolean isRpPsFloorLimIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpPsFloorLimIndCounter != sharedCounter;
         localRpPsFloorLimIndCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_PS_FLOOR_LIM_IND_LEN = 1;
	/**
	 * 	serialize this RpPsFloorLimInd
	 */
   protected void serializeRpPsFloorLimInd(char[] rpPsFloorLimInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpPsFloorLimInd,0,getStringValue(),beginRpPsFloorLimInd,RP_PS_FLOOR_LIM_IND_LEN);
       localRpPsFloorLimIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpPsFloorLimIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRpPsFloorLimInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpPsFloorLimInd() {	 
   		return (substring(getStringValue(),beginRpPsFloorLimInd,beginRpPsFloorLimInd + RP_PS_FLOOR_LIM_IND_LEN));
   	}
     int localRpPsFloorLimAmtCounter = -1;
     public boolean isRpPsFloorLimAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpPsFloorLimAmtCounter != sharedCounter;
         localRpPsFloorLimAmtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of rpPsFloorLimAmt
	 *	@return rpPsFloorLimAmt
	 */
	public char[]  getRpPsFloorLimAmtString() {
	     return getCharArray(beginRpPsFloorLimAmt,RP_PS_FLOOR_LIM_AMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean rpPsFloorLimAmtIsNumeric() {
	    return isNumeric(beginRpPsFloorLimAmt
	                    ,beginRpPsFloorLimAmt + RP_PS_FLOOR_LIM_AMT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int RP_PS_FLOOR_LIM_AMT_LEN = 5;
  	/**
	 * serializeRpPsFloorLimAmt
	 */
	protected void serializeRpPsFloorLimAmt(long rpPsFloorLimAmt) {
		 putNumber(beginRpPsFloorLimAmt,rpPsFloorLimAmt,RP_PS_FLOOR_LIM_AMT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRpPsFloorLimAmtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeRpPsFloorLimAmt
	 */
   	protected  long serializeRpPsFloorLimAmt(char[] value) {
	    long  rpPsFloorLimAmt;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    rpPsFloorLimAmt = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginRpPsFloorLimAmt
		       ,5
		      );
		 localRpPsFloorLimAmtCounter = shareString.getSerializedField().getModifiedCounter();
		return  rpPsFloorLimAmt;
    }

   protected long checkRpPsFloorLimAmtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshRpPsFloorLimAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshRpPsFloorLimAmt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginRpPsFloorLimAmt
			                 ,RP_PS_FLOOR_LIM_AMT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("rpPsFloorLimAmt", beginRpPsFloorLimAmt,RP_PS_FLOOR_LIM_AMT_LEN);
    }
   	}
     int localRpPsPosResponseCounter = -1;
     public boolean isRpPsPosResponseModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpPsPosResponseCounter != sharedCounter;
         localRpPsPosResponseCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_PS_POS_RESPONSE_LEN = 1;
	/**
	 * 	serialize this RpPsPosResponse
	 */
   protected void serializeRpPsPosResponse(char[] rpPsPosResponse) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpPsPosResponse,0,getStringValue(),beginRpPsPosResponse,RP_PS_POS_RESPONSE_LEN);
       localRpPsPosResponseCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpPsPosResponseConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRpPsPosResponse is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpPsPosResponse() {	 
   		return (substring(getStringValue(),beginRpPsPosResponse,beginRpPsPosResponse + RP_PS_POS_RESPONSE_LEN));
   	}
     int localRpPsRejectReasonCounter = -1;
     public boolean isRpPsRejectReasonModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpPsRejectReasonCounter != sharedCounter;
         localRpPsRejectReasonCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_PS_REJECT_REASON_LEN = 1;
	/**
	 * 	serialize this RpPsRejectReason
	 */
   protected void serializeRpPsRejectReason(char[] rpPsRejectReason) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpPsRejectReason,0,getStringValue(),beginRpPsRejectReason,RP_PS_REJECT_REASON_LEN);
       localRpPsRejectReasonCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpPsRejectReasonConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRpPsRejectReason is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpPsRejectReason() {	 
   		return (substring(getStringValue(),beginRpPsRejectReason,beginRpPsRejectReason + RP_PS_REJECT_REASON_LEN));
   	}
     int localRpPsInasTransCodeCounter = -1;
     public boolean isRpPsInasTransCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpPsInasTransCodeCounter != sharedCounter;
         localRpPsInasTransCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_PS_INAS_TRANS_CODE_LEN = 3;
	/**
	 * 	serialize this RpPsInasTransCode
	 */
   protected void serializeRpPsInasTransCode(char[] rpPsInasTransCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpPsInasTransCode,0,getStringValue(),beginRpPsInasTransCode,RP_PS_INAS_TRANS_CODE_LEN);
       localRpPsInasTransCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpPsInasTransCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshRpPsInasTransCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpPsInasTransCode() {	 
   		return (substring(getStringValue(),beginRpPsInasTransCode,beginRpPsInasTransCode + RP_PS_INAS_TRANS_CODE_LEN));
   	}
     int localRpPsInasResponseCounter = -1;
     public boolean isRpPsInasResponseModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpPsInasResponseCounter != sharedCounter;
         localRpPsInasResponseCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_PS_INAS_RESPONSE_LEN = 1;
	/**
	 * 	serialize this RpPsInasResponse
	 */
   protected void serializeRpPsInasResponse(char[] rpPsInasResponse) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpPsInasResponse,0,getStringValue(),beginRpPsInasResponse,RP_PS_INAS_RESPONSE_LEN);
       localRpPsInasResponseCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpPsInasResponseConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRpPsInasResponse is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpPsInasResponse() {	 
   		return (substring(getStringValue(),beginRpPsInasResponse,beginRpPsInasResponse + RP_PS_INAS_RESPONSE_LEN));
   	}
     int localRpPsAuthorizationCodeCounter = -1;
     public boolean isRpPsAuthorizationCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpPsAuthorizationCodeCounter != sharedCounter;
         localRpPsAuthorizationCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_PS_AUTHORIZATION_CODE_LEN = 6;
	/**
	 * 	serialize this RpPsAuthorizationCode
	 */
   protected void serializeRpPsAuthorizationCode(char[] rpPsAuthorizationCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpPsAuthorizationCode,0,getStringValue(),beginRpPsAuthorizationCode,RP_PS_AUTHORIZATION_CODE_LEN);
       localRpPsAuthorizationCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpPsAuthorizationCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshRpPsAuthorizationCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpPsAuthorizationCode() {	 
   		return (substring(getStringValue(),beginRpPsAuthorizationCode,beginRpPsAuthorizationCode + RP_PS_AUTHORIZATION_CODE_LEN));
   	}
     int localRpPsIcaNumberCounter = -1;
     public boolean isRpPsIcaNumberModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpPsIcaNumberCounter != sharedCounter;
         localRpPsIcaNumberCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_PS_ICA_NUMBER_LEN = 6;
	/**
	 * 	serialize this RpPsIcaNumber
	 */
   protected void serializeRpPsIcaNumber(char[] rpPsIcaNumber) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpPsIcaNumber,0,getStringValue(),beginRpPsIcaNumber,RP_PS_ICA_NUMBER_LEN);
       localRpPsIcaNumberCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpPsIcaNumberConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshRpPsIcaNumber is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpPsIcaNumber() {	 
   		return (substring(getStringValue(),beginRpPsIcaNumber,beginRpPsIcaNumber + RP_PS_ICA_NUMBER_LEN));
   	}
     int localRpPsTerminalIdCounter = -1;
     public boolean isRpPsTerminalIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpPsTerminalIdCounter != sharedCounter;
         localRpPsTerminalIdCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_PS_TERMINAL_ID_LEN = 18;
	/**
	 * 	serialize this RpPsTerminalId
	 */
   protected void serializeRpPsTerminalId(char[] rpPsTerminalId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpPsTerminalId,0,getStringValue(),beginRpPsTerminalId,RP_PS_TERMINAL_ID_LEN);
       localRpPsTerminalIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpPsTerminalIdConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshRpPsTerminalId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpPsTerminalId() {	 
   		return (substring(getStringValue(),beginRpPsTerminalId,beginRpPsTerminalId + RP_PS_TERMINAL_ID_LEN));
   	}
     int localRpPsCardholderNbrCounter = -1;
     public boolean isRpPsCardholderNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpPsCardholderNbrCounter != sharedCounter;
         localRpPsCardholderNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_PS_CARDHOLDER_NBR_LEN = 19;
	/**
	 * 	serialize this RpPsCardholderNbr
	 */
   protected void serializeRpPsCardholderNbr(char[] rpPsCardholderNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpPsCardholderNbr,0,getStringValue(),beginRpPsCardholderNbr,RP_PS_CARDHOLDER_NBR_LEN);
       localRpPsCardholderNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpPsCardholderNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 19 ,false, false);
   }
    /**
	 *	refreshRpPsCardholderNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpPsCardholderNbr() {	 
   		return (substring(getStringValue(),beginRpPsCardholderNbr,beginRpPsCardholderNbr + RP_PS_CARDHOLDER_NBR_LEN));
   	}
     int localRpPsExpirationDateCounter = -1;
     public boolean isRpPsExpirationDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpPsExpirationDateCounter != sharedCounter;
         localRpPsExpirationDateCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_PS_EXPIRATION_DATE_LEN = 4;
	/**
	 * 	serialize this RpPsExpirationDate
	 */
   protected void serializeRpPsExpirationDate(char[] rpPsExpirationDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpPsExpirationDate,0,getStringValue(),beginRpPsExpirationDate,RP_PS_EXPIRATION_DATE_LEN);
       localRpPsExpirationDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpPsExpirationDateConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshRpPsExpirationDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpPsExpirationDate() {	 
   		return (substring(getStringValue(),beginRpPsExpirationDate,beginRpPsExpirationDate + RP_PS_EXPIRATION_DATE_LEN));
   	}
     int localRpPsMagneticStripeIndCounter = -1;
     public boolean isRpPsMagneticStripeIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpPsMagneticStripeIndCounter != sharedCounter;
         localRpPsMagneticStripeIndCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_PS_MAGNETIC_STRIPE_IND_LEN = 1;
	/**
	 * 	serialize this RpPsMagneticStripeInd
	 */
   protected void serializeRpPsMagneticStripeInd(char[] rpPsMagneticStripeInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpPsMagneticStripeInd,0,getStringValue(),beginRpPsMagneticStripeInd,RP_PS_MAGNETIC_STRIPE_IND_LEN);
       localRpPsMagneticStripeIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpPsMagneticStripeIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRpPsMagneticStripeInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpPsMagneticStripeInd() {	 
   		return (substring(getStringValue(),beginRpPsMagneticStripeInd,beginRpPsMagneticStripeInd + RP_PS_MAGNETIC_STRIPE_IND_LEN));
   	}
     int localRpPsMessageStatusCounter = -1;
     public boolean isRpPsMessageStatusModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpPsMessageStatusCounter != sharedCounter;
         localRpPsMessageStatusCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_PS_MESSAGE_STATUS_LEN = 1;
	/**
	 * 	serialize this RpPsMessageStatus
	 */
   protected void serializeRpPsMessageStatus(char[] rpPsMessageStatus) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpPsMessageStatus,0,getStringValue(),beginRpPsMessageStatus,RP_PS_MESSAGE_STATUS_LEN);
       localRpPsMessageStatusCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpPsMessageStatusConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRpPsMessageStatus is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpPsMessageStatus() {	 
   		return (substring(getStringValue(),beginRpPsMessageStatus,beginRpPsMessageStatus + RP_PS_MESSAGE_STATUS_LEN));
   	}
     int localRpPsNetworkTypeCounter = -1;
     public boolean isRpPsNetworkTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpPsNetworkTypeCounter != sharedCounter;
         localRpPsNetworkTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_PS_NETWORK_TYPE_LEN = 1;
	/**
	 * 	serialize this RpPsNetworkType
	 */
   protected void serializeRpPsNetworkType(char[] rpPsNetworkType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpPsNetworkType,0,getStringValue(),beginRpPsNetworkType,RP_PS_NETWORK_TYPE_LEN);
       localRpPsNetworkTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpPsNetworkTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRpPsNetworkType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpPsNetworkType() {	 
   		return (substring(getStringValue(),beginRpPsNetworkType,beginRpPsNetworkType + RP_PS_NETWORK_TYPE_LEN));
   	}
     int localRpPsQueueIdInputPortCounter = -1;
     public boolean isRpPsQueueIdInputPortModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpPsQueueIdInputPortCounter != sharedCounter;
         localRpPsQueueIdInputPortCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of rpPsQueueIdInputPort
	 *	@return rpPsQueueIdInputPort
	 */
	public char[]  getRpPsQueueIdInputPortString() {
	     return getCharArray(beginRpPsQueueIdInputPort,RP_PS_QUEUE_ID_INPUT_PORT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean rpPsQueueIdInputPortIsNumeric() {
	    return isNumeric(beginRpPsQueueIdInputPort
	                    ,beginRpPsQueueIdInputPort + RP_PS_QUEUE_ID_INPUT_PORT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int RP_PS_QUEUE_ID_INPUT_PORT_LEN = 4;
  	/**
	 * serializeRpPsQueueIdInputPort
	 */
	protected void serializeRpPsQueueIdInputPort(int rpPsQueueIdInputPort) {
		 putNumber(beginRpPsQueueIdInputPort,rpPsQueueIdInputPort,RP_PS_QUEUE_ID_INPUT_PORT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRpPsQueueIdInputPortCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeRpPsQueueIdInputPort
	 */
   	protected  int serializeRpPsQueueIdInputPort(char[] value) {
	    int  rpPsQueueIdInputPort;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    rpPsQueueIdInputPort = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginRpPsQueueIdInputPort
		       ,4
		      );
		 localRpPsQueueIdInputPortCounter = shareString.getSerializedField().getModifiedCounter();
		return  rpPsQueueIdInputPort;
    }

   protected int checkRpPsQueueIdInputPortMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshRpPsQueueIdInputPort is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshRpPsQueueIdInputPort() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginRpPsQueueIdInputPort
			                 ,RP_PS_QUEUE_ID_INPUT_PORT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("rpPsQueueIdInputPort", beginRpPsQueueIdInputPort,RP_PS_QUEUE_ID_INPUT_PORT_LEN);
    }
   	}
     int localRpPsTimeInSystemHhCounter = -1;
     public boolean isRpPsTimeInSystemHhModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpPsTimeInSystemHhCounter != sharedCounter;
         localRpPsTimeInSystemHhCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of rpPsTimeInSystemHh
	 *	@return rpPsTimeInSystemHh
	 */
	public char[]  getRpPsTimeInSystemHhString() {
	     return getCharArray(beginRpPsTimeInSystemHh,RP_PS_TIME_IN_SYSTEM_HH_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean rpPsTimeInSystemHhIsNumeric() {
	    return isNumeric(beginRpPsTimeInSystemHh
	                    ,beginRpPsTimeInSystemHh + RP_PS_TIME_IN_SYSTEM_HH_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int RP_PS_TIME_IN_SYSTEM_HH_LEN = 2;
  	/**
	 * serializeRpPsTimeInSystemHh
	 */
	protected void serializeRpPsTimeInSystemHh(int rpPsTimeInSystemHh) {
		 putNumber(beginRpPsTimeInSystemHh,rpPsTimeInSystemHh,RP_PS_TIME_IN_SYSTEM_HH_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRpPsTimeInSystemHhCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeRpPsTimeInSystemHh
	 */
   	protected  int serializeRpPsTimeInSystemHh(char[] value) {
	    int  rpPsTimeInSystemHh;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    rpPsTimeInSystemHh = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginRpPsTimeInSystemHh
		       ,2
		      );
		 localRpPsTimeInSystemHhCounter = shareString.getSerializedField().getModifiedCounter();
		return  rpPsTimeInSystemHh;
    }

   protected int checkRpPsTimeInSystemHhMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshRpPsTimeInSystemHh is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshRpPsTimeInSystemHh() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginRpPsTimeInSystemHh
			                 ,RP_PS_TIME_IN_SYSTEM_HH_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("rpPsTimeInSystemHh", beginRpPsTimeInSystemHh,RP_PS_TIME_IN_SYSTEM_HH_LEN);
    }
   	}
     int localRpPsTimeInSystemMmCounter = -1;
     public boolean isRpPsTimeInSystemMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpPsTimeInSystemMmCounter != sharedCounter;
         localRpPsTimeInSystemMmCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of rpPsTimeInSystemMm
	 *	@return rpPsTimeInSystemMm
	 */
	public char[]  getRpPsTimeInSystemMmString() {
	     return getCharArray(beginRpPsTimeInSystemMm,RP_PS_TIME_IN_SYSTEM_MM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean rpPsTimeInSystemMmIsNumeric() {
	    return isNumeric(beginRpPsTimeInSystemMm
	                    ,beginRpPsTimeInSystemMm + RP_PS_TIME_IN_SYSTEM_MM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int RP_PS_TIME_IN_SYSTEM_MM_LEN = 2;
  	/**
	 * serializeRpPsTimeInSystemMm
	 */
	protected void serializeRpPsTimeInSystemMm(int rpPsTimeInSystemMm) {
		 putNumber(beginRpPsTimeInSystemMm,rpPsTimeInSystemMm,RP_PS_TIME_IN_SYSTEM_MM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRpPsTimeInSystemMmCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeRpPsTimeInSystemMm
	 */
   	protected  int serializeRpPsTimeInSystemMm(char[] value) {
	    int  rpPsTimeInSystemMm;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    rpPsTimeInSystemMm = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginRpPsTimeInSystemMm
		       ,2
		      );
		 localRpPsTimeInSystemMmCounter = shareString.getSerializedField().getModifiedCounter();
		return  rpPsTimeInSystemMm;
    }

   protected int checkRpPsTimeInSystemMmMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshRpPsTimeInSystemMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshRpPsTimeInSystemMm() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginRpPsTimeInSystemMm
			                 ,RP_PS_TIME_IN_SYSTEM_MM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("rpPsTimeInSystemMm", beginRpPsTimeInSystemMm,RP_PS_TIME_IN_SYSTEM_MM_LEN);
    }
   	}
     int localRpPsTimeInSystemSsCounter = -1;
     public boolean isRpPsTimeInSystemSsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpPsTimeInSystemSsCounter != sharedCounter;
         localRpPsTimeInSystemSsCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of rpPsTimeInSystemSs
	 *	@return rpPsTimeInSystemSs
	 */
	public char[]  getRpPsTimeInSystemSsString() {
	     return getCharArray(beginRpPsTimeInSystemSs,RP_PS_TIME_IN_SYSTEM_SS_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean rpPsTimeInSystemSsIsNumeric() {
	    return isNumeric(beginRpPsTimeInSystemSs
	                    ,beginRpPsTimeInSystemSs + RP_PS_TIME_IN_SYSTEM_SS_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int RP_PS_TIME_IN_SYSTEM_SS_LEN = 2;
  	/**
	 * serializeRpPsTimeInSystemSs
	 */
	protected void serializeRpPsTimeInSystemSs(int rpPsTimeInSystemSs) {
		 putNumber(beginRpPsTimeInSystemSs,rpPsTimeInSystemSs,RP_PS_TIME_IN_SYSTEM_SS_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRpPsTimeInSystemSsCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeRpPsTimeInSystemSs
	 */
   	protected  int serializeRpPsTimeInSystemSs(char[] value) {
	    int  rpPsTimeInSystemSs;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    rpPsTimeInSystemSs = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginRpPsTimeInSystemSs
		       ,2
		      );
		 localRpPsTimeInSystemSsCounter = shareString.getSerializedField().getModifiedCounter();
		return  rpPsTimeInSystemSs;
    }

   protected int checkRpPsTimeInSystemSsMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshRpPsTimeInSystemSs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshRpPsTimeInSystemSs() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginRpPsTimeInSystemSs
			                 ,RP_PS_TIME_IN_SYSTEM_SS_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("rpPsTimeInSystemSs", beginRpPsTimeInSystemSs,RP_PS_TIME_IN_SYSTEM_SS_LEN);
    }
   	}
     int localRpPsTerminalAuthCodeCounter = -1;
     public boolean isRpPsTerminalAuthCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpPsTerminalAuthCodeCounter != sharedCounter;
         localRpPsTerminalAuthCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_PS_TERMINAL_AUTH_CODE_LEN = 6;
	/**
	 * 	serialize this RpPsTerminalAuthCode
	 */
   protected void serializeRpPsTerminalAuthCode(char[] rpPsTerminalAuthCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpPsTerminalAuthCode,0,getStringValue(),beginRpPsTerminalAuthCode,RP_PS_TERMINAL_AUTH_CODE_LEN);
       localRpPsTerminalAuthCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpPsTerminalAuthCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshRpPsTerminalAuthCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpPsTerminalAuthCode() {	 
   		return (substring(getStringValue(),beginRpPsTerminalAuthCode,beginRpPsTerminalAuthCode + RP_PS_TERMINAL_AUTH_CODE_LEN));
   	}




}
  
