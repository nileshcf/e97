package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class Sf503PsPosTranLogSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:34. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sf503PsPosTranLogSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sf503PsPosTranLogSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SF_503_PS_POS_TRAN_LOG_LENGTH = 32737;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSf503PsRecordType;
            protected  int beginSf503PsReferenceNbr;
            protected  int beginSf503PsTime;
            protected  int beginSf503PsTransDate;
            protected  int beginSf503PsFloorLimInd;
            protected  int beginSf503PsFloorLimAmt;
            protected  int beginSf503PsPosResponse;
            protected  int beginSf503PsRejectReason;
            protected  int beginSf503PsInasTransCode;
            protected  int beginSf503PsInasResponse;
            protected  int beginSf503PsAuthorizationCode;
            protected  int beginSf503PsIcaNumber;
            protected  int beginSf503PsTerminalId;
            protected  int beginSf503PsCardholderNbr;
            protected  int beginSf503PsExpirationDate;
            protected  int beginSf503PsMagneticStripeInd;
            protected  int beginSf503PsMessageStatus;
            protected  int beginSf503PsNetworkType;
            protected  int beginSf503PsQueueIdInputPort;
            protected  int beginSf503PsTerminalAuthCode;
	
	/**
	* Constructor for Sf503PsPosTranLogSerialized
	**/
    public Sf503PsPosTranLogSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Sf503PsPosTranLogSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf503PsPosTranLogSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Sf503PsPosTranLogSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,15); // serialize this field at offset 15 by default 
    }
    
	/**
	* sets parent for this Sf503PsPosTranLogSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 15 by default
    }    
	/**
	* initializes the field in Sf503PsPosTranLogSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SF_503_PS_POS_TRAN_LOG_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSf503PsRecordType = getStartOffset() + 1;	// set offset for serialization
  
             beginSf503PsReferenceNbr = getStartOffset() + 3;	// set offset for serialization
  
             beginSf503PsTime = getStartOffset() + 10;	// set offset for serialization
  
             beginSf503PsTransDate = getStartOffset() + 19;	// set offset for serialization
  
             beginSf503PsFloorLimInd = getStartOffset() + 28;	// set offset for serialization
  
             beginSf503PsFloorLimAmt = getStartOffset() + 30;	// set offset for serialization
  
             beginSf503PsPosResponse = getStartOffset() + 35;	// set offset for serialization
  
             beginSf503PsRejectReason = getStartOffset() + 36;	// set offset for serialization
  
             beginSf503PsInasTransCode = getStartOffset() + 37;	// set offset for serialization
  
             beginSf503PsInasResponse = getStartOffset() + 40;	// set offset for serialization
  
             beginSf503PsAuthorizationCode = getStartOffset() + 41;	// set offset for serialization
  
             beginSf503PsIcaNumber = getStartOffset() + 47;	// set offset for serialization
  
             beginSf503PsTerminalId = getStartOffset() + 54;	// set offset for serialization
  
             beginSf503PsCardholderNbr = getStartOffset() + 72;	// set offset for serialization
  
             beginSf503PsExpirationDate = getStartOffset() + 91;	// set offset for serialization
  
  
             beginSf503PsMagneticStripeInd = getStartOffset() + 102;	// set offset for serialization
  
             beginSf503PsMessageStatus = getStartOffset() + 104;	// set offset for serialization
  
             beginSf503PsNetworkType = getStartOffset() + 105;	// set offset for serialization
  
             beginSf503PsQueueIdInputPort = getStartOffset() + 106;	// set offset for serialization
  
  
             beginSf503PsTerminalAuthCode = getStartOffset() + 117;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSf503PsRecordTypeCounter = -1;
     public boolean isSf503PsRecordTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf503PsRecordTypeCounter != sharedCounter;
         localSf503PsRecordTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_503_PS_RECORD_TYPE_LEN = 1;
	/**
	 * 	serialize this Sf503PsRecordType
	 */
   protected void serializeSf503PsRecordType(char[] sf503PsRecordType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf503PsRecordType,0,getStringValue(),beginSf503PsRecordType,SF_503_PS_RECORD_TYPE_LEN);
       localSf503PsRecordTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf503PsRecordTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSf503PsRecordType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf503PsRecordType() {	 
   		return (substring(getStringValue(),beginSf503PsRecordType,beginSf503PsRecordType + SF_503_PS_RECORD_TYPE_LEN));
   	}
     int localSf503PsReferenceNbrCounter = -1;
     public boolean isSf503PsReferenceNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf503PsReferenceNbrCounter != sharedCounter;
         localSf503PsReferenceNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_503_PS_REFERENCE_NBR_LEN = 6;
	/**
	 * 	serialize this Sf503PsReferenceNbr
	 */
   protected void serializeSf503PsReferenceNbr(char[] sf503PsReferenceNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf503PsReferenceNbr,0,getStringValue(),beginSf503PsReferenceNbr,SF_503_PS_REFERENCE_NBR_LEN);
       localSf503PsReferenceNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf503PsReferenceNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshSf503PsReferenceNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf503PsReferenceNbr() {	 
   		return (substring(getStringValue(),beginSf503PsReferenceNbr,beginSf503PsReferenceNbr + SF_503_PS_REFERENCE_NBR_LEN));
   	}
     int localSf503PsTimeCounter = -1;
     public boolean isSf503PsTimeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf503PsTimeCounter != sharedCounter;
         localSf503PsTimeCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_503_PS_TIME_LEN = 8;
	/**
	 * 	serialize this Sf503PsTime
	 */
   protected void serializeSf503PsTime(char[] sf503PsTime) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf503PsTime,0,getStringValue(),beginSf503PsTime,SF_503_PS_TIME_LEN);
       localSf503PsTimeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf503PsTimeConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshSf503PsTime is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf503PsTime() {	 
   		return (substring(getStringValue(),beginSf503PsTime,beginSf503PsTime + SF_503_PS_TIME_LEN));
   	}
     int localSf503PsTransDateCounter = -1;
     public boolean isSf503PsTransDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf503PsTransDateCounter != sharedCounter;
         localSf503PsTransDateCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_503_PS_TRANS_DATE_LEN = 8;
	/**
	 * 	serialize this Sf503PsTransDate
	 */
   protected void serializeSf503PsTransDate(char[] sf503PsTransDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf503PsTransDate,0,getStringValue(),beginSf503PsTransDate,SF_503_PS_TRANS_DATE_LEN);
       localSf503PsTransDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf503PsTransDateConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshSf503PsTransDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf503PsTransDate() {	 
   		return (substring(getStringValue(),beginSf503PsTransDate,beginSf503PsTransDate + SF_503_PS_TRANS_DATE_LEN));
   	}
     int localSf503PsFloorLimIndCounter = -1;
     public boolean isSf503PsFloorLimIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf503PsFloorLimIndCounter != sharedCounter;
         localSf503PsFloorLimIndCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_503_PS_FLOOR_LIM_IND_LEN = 1;
	/**
	 * 	serialize this Sf503PsFloorLimInd
	 */
   protected void serializeSf503PsFloorLimInd(char[] sf503PsFloorLimInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf503PsFloorLimInd,0,getStringValue(),beginSf503PsFloorLimInd,SF_503_PS_FLOOR_LIM_IND_LEN);
       localSf503PsFloorLimIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf503PsFloorLimIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSf503PsFloorLimInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf503PsFloorLimInd() {	 
   		return (substring(getStringValue(),beginSf503PsFloorLimInd,beginSf503PsFloorLimInd + SF_503_PS_FLOOR_LIM_IND_LEN));
   	}
     int localSf503PsFloorLimAmtCounter = -1;
     public boolean isSf503PsFloorLimAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf503PsFloorLimAmtCounter != sharedCounter;
         localSf503PsFloorLimAmtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of sf503PsFloorLimAmt
	 *	@return sf503PsFloorLimAmt
	 */
	public char[]  getSf503PsFloorLimAmtString() {
	     return getCharArray(beginSf503PsFloorLimAmt,SF_503_PS_FLOOR_LIM_AMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sf503PsFloorLimAmtIsNumeric() {
	    return isNumeric(beginSf503PsFloorLimAmt
	                    ,beginSf503PsFloorLimAmt + SF_503_PS_FLOOR_LIM_AMT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SF_503_PS_FLOOR_LIM_AMT_LEN = 5;
  	/**
	 * serializeSf503PsFloorLimAmt
	 */
	protected void serializeSf503PsFloorLimAmt(long sf503PsFloorLimAmt) {
		 putNumber(beginSf503PsFloorLimAmt,sf503PsFloorLimAmt,SF_503_PS_FLOOR_LIM_AMT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSf503PsFloorLimAmtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSf503PsFloorLimAmt
	 */
   	protected  long serializeSf503PsFloorLimAmt(char[] value) {
	    long  sf503PsFloorLimAmt;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    sf503PsFloorLimAmt = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginSf503PsFloorLimAmt
		       ,5
		      );
		 localSf503PsFloorLimAmtCounter = shareString.getSerializedField().getModifiedCounter();
		return  sf503PsFloorLimAmt;
    }

   protected long checkSf503PsFloorLimAmtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSf503PsFloorLimAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSf503PsFloorLimAmt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSf503PsFloorLimAmt
			                 ,SF_503_PS_FLOOR_LIM_AMT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("sf503PsFloorLimAmt", beginSf503PsFloorLimAmt,SF_503_PS_FLOOR_LIM_AMT_LEN);
    }
   	}
     int localSf503PsPosResponseCounter = -1;
     public boolean isSf503PsPosResponseModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf503PsPosResponseCounter != sharedCounter;
         localSf503PsPosResponseCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_503_PS_POS_RESPONSE_LEN = 1;
	/**
	 * 	serialize this Sf503PsPosResponse
	 */
   protected void serializeSf503PsPosResponse(char[] sf503PsPosResponse) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf503PsPosResponse,0,getStringValue(),beginSf503PsPosResponse,SF_503_PS_POS_RESPONSE_LEN);
       localSf503PsPosResponseCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf503PsPosResponseConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSf503PsPosResponse is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf503PsPosResponse() {	 
   		return (substring(getStringValue(),beginSf503PsPosResponse,beginSf503PsPosResponse + SF_503_PS_POS_RESPONSE_LEN));
   	}
     int localSf503PsRejectReasonCounter = -1;
     public boolean isSf503PsRejectReasonModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf503PsRejectReasonCounter != sharedCounter;
         localSf503PsRejectReasonCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_503_PS_REJECT_REASON_LEN = 1;
	/**
	 * 	serialize this Sf503PsRejectReason
	 */
   protected void serializeSf503PsRejectReason(char[] sf503PsRejectReason) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf503PsRejectReason,0,getStringValue(),beginSf503PsRejectReason,SF_503_PS_REJECT_REASON_LEN);
       localSf503PsRejectReasonCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf503PsRejectReasonConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSf503PsRejectReason is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf503PsRejectReason() {	 
   		return (substring(getStringValue(),beginSf503PsRejectReason,beginSf503PsRejectReason + SF_503_PS_REJECT_REASON_LEN));
   	}
     int localSf503PsInasTransCodeCounter = -1;
     public boolean isSf503PsInasTransCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf503PsInasTransCodeCounter != sharedCounter;
         localSf503PsInasTransCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_503_PS_INAS_TRANS_CODE_LEN = 3;
	/**
	 * 	serialize this Sf503PsInasTransCode
	 */
   protected void serializeSf503PsInasTransCode(char[] sf503PsInasTransCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf503PsInasTransCode,0,getStringValue(),beginSf503PsInasTransCode,SF_503_PS_INAS_TRANS_CODE_LEN);
       localSf503PsInasTransCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf503PsInasTransCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshSf503PsInasTransCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf503PsInasTransCode() {	 
   		return (substring(getStringValue(),beginSf503PsInasTransCode,beginSf503PsInasTransCode + SF_503_PS_INAS_TRANS_CODE_LEN));
   	}
     int localSf503PsInasResponseCounter = -1;
     public boolean isSf503PsInasResponseModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf503PsInasResponseCounter != sharedCounter;
         localSf503PsInasResponseCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_503_PS_INAS_RESPONSE_LEN = 1;
	/**
	 * 	serialize this Sf503PsInasResponse
	 */
   protected void serializeSf503PsInasResponse(char[] sf503PsInasResponse) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf503PsInasResponse,0,getStringValue(),beginSf503PsInasResponse,SF_503_PS_INAS_RESPONSE_LEN);
       localSf503PsInasResponseCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf503PsInasResponseConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSf503PsInasResponse is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf503PsInasResponse() {	 
   		return (substring(getStringValue(),beginSf503PsInasResponse,beginSf503PsInasResponse + SF_503_PS_INAS_RESPONSE_LEN));
   	}
     int localSf503PsAuthorizationCodeCounter = -1;
     public boolean isSf503PsAuthorizationCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf503PsAuthorizationCodeCounter != sharedCounter;
         localSf503PsAuthorizationCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_503_PS_AUTHORIZATION_CODE_LEN = 6;
	/**
	 * 	serialize this Sf503PsAuthorizationCode
	 */
   protected void serializeSf503PsAuthorizationCode(char[] sf503PsAuthorizationCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf503PsAuthorizationCode,0,getStringValue(),beginSf503PsAuthorizationCode,SF_503_PS_AUTHORIZATION_CODE_LEN);
       localSf503PsAuthorizationCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf503PsAuthorizationCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshSf503PsAuthorizationCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf503PsAuthorizationCode() {	 
   		return (substring(getStringValue(),beginSf503PsAuthorizationCode,beginSf503PsAuthorizationCode + SF_503_PS_AUTHORIZATION_CODE_LEN));
   	}
     int localSf503PsIcaNumberCounter = -1;
     public boolean isSf503PsIcaNumberModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf503PsIcaNumberCounter != sharedCounter;
         localSf503PsIcaNumberCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_503_PS_ICA_NUMBER_LEN = 6;
	/**
	 * 	serialize this Sf503PsIcaNumber
	 */
   protected void serializeSf503PsIcaNumber(char[] sf503PsIcaNumber) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf503PsIcaNumber,0,getStringValue(),beginSf503PsIcaNumber,SF_503_PS_ICA_NUMBER_LEN);
       localSf503PsIcaNumberCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf503PsIcaNumberConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshSf503PsIcaNumber is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf503PsIcaNumber() {	 
   		return (substring(getStringValue(),beginSf503PsIcaNumber,beginSf503PsIcaNumber + SF_503_PS_ICA_NUMBER_LEN));
   	}
     int localSf503PsTerminalIdCounter = -1;
     public boolean isSf503PsTerminalIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf503PsTerminalIdCounter != sharedCounter;
         localSf503PsTerminalIdCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_503_PS_TERMINAL_ID_LEN = 18;
	/**
	 * 	serialize this Sf503PsTerminalId
	 */
   protected void serializeSf503PsTerminalId(char[] sf503PsTerminalId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf503PsTerminalId,0,getStringValue(),beginSf503PsTerminalId,SF_503_PS_TERMINAL_ID_LEN);
       localSf503PsTerminalIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf503PsTerminalIdConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshSf503PsTerminalId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf503PsTerminalId() {	 
   		return (substring(getStringValue(),beginSf503PsTerminalId,beginSf503PsTerminalId + SF_503_PS_TERMINAL_ID_LEN));
   	}
     int localSf503PsCardholderNbrCounter = -1;
     public boolean isSf503PsCardholderNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf503PsCardholderNbrCounter != sharedCounter;
         localSf503PsCardholderNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_503_PS_CARDHOLDER_NBR_LEN = 19;
	/**
	 * 	serialize this Sf503PsCardholderNbr
	 */
   protected void serializeSf503PsCardholderNbr(char[] sf503PsCardholderNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf503PsCardholderNbr,0,getStringValue(),beginSf503PsCardholderNbr,SF_503_PS_CARDHOLDER_NBR_LEN);
       localSf503PsCardholderNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf503PsCardholderNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 19 ,false, false);
   }
    /**
	 *	refreshSf503PsCardholderNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf503PsCardholderNbr() {	 
   		return (substring(getStringValue(),beginSf503PsCardholderNbr,beginSf503PsCardholderNbr + SF_503_PS_CARDHOLDER_NBR_LEN));
   	}
     int localSf503PsExpirationDateCounter = -1;
     public boolean isSf503PsExpirationDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf503PsExpirationDateCounter != sharedCounter;
         localSf503PsExpirationDateCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_503_PS_EXPIRATION_DATE_LEN = 4;
	/**
	 * 	serialize this Sf503PsExpirationDate
	 */
   protected void serializeSf503PsExpirationDate(char[] sf503PsExpirationDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf503PsExpirationDate,0,getStringValue(),beginSf503PsExpirationDate,SF_503_PS_EXPIRATION_DATE_LEN);
       localSf503PsExpirationDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf503PsExpirationDateConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshSf503PsExpirationDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf503PsExpirationDate() {	 
   		return (substring(getStringValue(),beginSf503PsExpirationDate,beginSf503PsExpirationDate + SF_503_PS_EXPIRATION_DATE_LEN));
   	}
     int localSf503PsMagneticStripeIndCounter = -1;
     public boolean isSf503PsMagneticStripeIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf503PsMagneticStripeIndCounter != sharedCounter;
         localSf503PsMagneticStripeIndCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_503_PS_MAGNETIC_STRIPE_IND_LEN = 1;
	/**
	 * 	serialize this Sf503PsMagneticStripeInd
	 */
   protected void serializeSf503PsMagneticStripeInd(char[] sf503PsMagneticStripeInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf503PsMagneticStripeInd,0,getStringValue(),beginSf503PsMagneticStripeInd,SF_503_PS_MAGNETIC_STRIPE_IND_LEN);
       localSf503PsMagneticStripeIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf503PsMagneticStripeIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSf503PsMagneticStripeInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf503PsMagneticStripeInd() {	 
   		return (substring(getStringValue(),beginSf503PsMagneticStripeInd,beginSf503PsMagneticStripeInd + SF_503_PS_MAGNETIC_STRIPE_IND_LEN));
   	}
     int localSf503PsMessageStatusCounter = -1;
     public boolean isSf503PsMessageStatusModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf503PsMessageStatusCounter != sharedCounter;
         localSf503PsMessageStatusCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_503_PS_MESSAGE_STATUS_LEN = 1;
	/**
	 * 	serialize this Sf503PsMessageStatus
	 */
   protected void serializeSf503PsMessageStatus(char[] sf503PsMessageStatus) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf503PsMessageStatus,0,getStringValue(),beginSf503PsMessageStatus,SF_503_PS_MESSAGE_STATUS_LEN);
       localSf503PsMessageStatusCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf503PsMessageStatusConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSf503PsMessageStatus is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf503PsMessageStatus() {	 
   		return (substring(getStringValue(),beginSf503PsMessageStatus,beginSf503PsMessageStatus + SF_503_PS_MESSAGE_STATUS_LEN));
   	}
     int localSf503PsNetworkTypeCounter = -1;
     public boolean isSf503PsNetworkTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf503PsNetworkTypeCounter != sharedCounter;
         localSf503PsNetworkTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_503_PS_NETWORK_TYPE_LEN = 1;
	/**
	 * 	serialize this Sf503PsNetworkType
	 */
   protected void serializeSf503PsNetworkType(char[] sf503PsNetworkType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf503PsNetworkType,0,getStringValue(),beginSf503PsNetworkType,SF_503_PS_NETWORK_TYPE_LEN);
       localSf503PsNetworkTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf503PsNetworkTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSf503PsNetworkType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf503PsNetworkType() {	 
   		return (substring(getStringValue(),beginSf503PsNetworkType,beginSf503PsNetworkType + SF_503_PS_NETWORK_TYPE_LEN));
   	}
         int localSf503PsQueueIdInputPortCounter = -1;
         public boolean isSf503PsQueueIdInputPortModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSf503PsQueueIdInputPortCounter != sharedCounter;
            localSf503PsQueueIdInputPortCounter = sharedCounter; return hasModified; 
         }
   protected static final int SF_503_PS_QUEUE_ID_INPUT_PORT_LEN = 2;
  	/**
	 * serializeSf503PsQueueIdInputPort
	 */
	protected void serializeSf503PsQueueIdInputPort(int sf503PsQueueIdInputPort) {
           replaceValue( //  save the value as string
                   getBinaryString( sf503PsQueueIdInputPort,SF_503_PS_QUEUE_ID_INPUT_PORT_LEN)
                  ,beginSf503PsQueueIdInputPort
                  ,SF_503_PS_QUEUE_ID_INPUT_PORT_LEN
                 );
            localSf503PsQueueIdInputPortCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSf503PsQueueIdInputPortMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSf503PsQueueIdInputPort is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSf503PsQueueIdInputPort() {	 
			return (getUnsignedShort(beginSf503PsQueueIdInputPort));
   	}
     int localSf503PsTerminalAuthCodeCounter = -1;
     public boolean isSf503PsTerminalAuthCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf503PsTerminalAuthCodeCounter != sharedCounter;
         localSf503PsTerminalAuthCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_503_PS_TERMINAL_AUTH_CODE_LEN = 6;
	/**
	 * 	serialize this Sf503PsTerminalAuthCode
	 */
   protected void serializeSf503PsTerminalAuthCode(char[] sf503PsTerminalAuthCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf503PsTerminalAuthCode,0,getStringValue(),beginSf503PsTerminalAuthCode,SF_503_PS_TERMINAL_AUTH_CODE_LEN);
       localSf503PsTerminalAuthCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf503PsTerminalAuthCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshSf503PsTerminalAuthCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf503PsTerminalAuthCode() {	 
   		return (substring(getStringValue(),beginSf503PsTerminalAuthCode,beginSf503PsTerminalAuthCode + SF_503_PS_TERMINAL_AUTH_CODE_LEN));
   	}




}
  
