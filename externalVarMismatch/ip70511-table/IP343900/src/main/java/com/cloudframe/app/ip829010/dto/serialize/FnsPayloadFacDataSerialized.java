package com.cloudframe.app.ip829010.dto.serialize;

/**
*  The class FnsPayloadFacDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class FnsPayloadFacDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FnsPayloadFacDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FNS_PAYLOAD_FAC_DATA_LENGTH = 129;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFnsPayloadInsertTimestamp;
            protected  int beginFnsPayloadCycleIndicator;
            protected  int beginFnsPayloadMsgRsnCd;
            protected  int beginFnsPayloadChargebackAmt;
            protected  int beginFnsPayloadChargebackCurrCd;
            protected  int beginFnsPayloadChargebackExpCd;
            protected  int beginFnsPayloadReversalIndicator;
            protected  int beginFnsPayloadChargebackRefNo;
            protected  int beginFnsPayloadFuncCd;
            protected  int beginFnsPayloadSwitchSerialNum;
            protected  int beginFnsPayloadSourceCd;
            protected  int beginFnsPayloadCntCd;
            protected  int beginFnsPayloadOrigSwSerNum;
            protected  int beginFnsPayloadChgbkCnt;
            protected  int beginFnsPayloadRejRsn1Cd;
            protected  int beginFnsPayloadRejRsn2Cd;
            protected  int beginFnsPayloadVrtlAcctNum;
	
	/**
	* Constructor for FnsPayloadFacDataSerialized
	**/
    public FnsPayloadFacDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for FnsPayloadFacDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FnsPayloadFacDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this FnsPayloadFacDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,93); // serialize this field at offset 93 by default 
    }
    
	/**
	* sets parent for this FnsPayloadFacDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 93 by default
    }    
	/**
	* initializes the field in FnsPayloadFacDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FNS_PAYLOAD_FAC_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFnsPayloadInsertTimestamp = getStartOffset() + 0;	// set offset for serialization
  
             beginFnsPayloadCycleIndicator = getStartOffset() + 26;	// set offset for serialization
  
             beginFnsPayloadMsgRsnCd = getStartOffset() + 29;	// set offset for serialization
  
             beginFnsPayloadChargebackAmt = getStartOffset() + 34;	// set offset for serialization
  
             beginFnsPayloadChargebackCurrCd = getStartOffset() + 47;	// set offset for serialization
  
             beginFnsPayloadChargebackExpCd = getStartOffset() + 50;	// set offset for serialization
  
             beginFnsPayloadReversalIndicator = getStartOffset() + 51;	// set offset for serialization
  
             beginFnsPayloadChargebackRefNo = getStartOffset() + 52;	// set offset for serialization
  
             beginFnsPayloadFuncCd = getStartOffset() + 62;	// set offset for serialization
  
             beginFnsPayloadSwitchSerialNum = getStartOffset() + 65;	// set offset for serialization
  
             beginFnsPayloadSourceCd = getStartOffset() + 74;	// set offset for serialization
  
             beginFnsPayloadCntCd = getStartOffset() + 78;	// set offset for serialization
  
             beginFnsPayloadOrigSwSerNum = getStartOffset() + 80;	// set offset for serialization
  
  
             beginFnsPayloadChgbkCnt = getStartOffset() + 99;	// set offset for serialization
  
             beginFnsPayloadRejRsn1Cd = getStartOffset() + 102;	// set offset for serialization
  
             beginFnsPayloadRejRsn2Cd = getStartOffset() + 106;	// set offset for serialization
  
             beginFnsPayloadVrtlAcctNum = getStartOffset() + 110;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFnsPayloadInsertTimestampCounter = -1;
     public boolean isFnsPayloadInsertTimestampModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFnsPayloadInsertTimestampCounter != sharedCounter;
         localFnsPayloadInsertTimestampCounter = sharedCounter; return hasModified;
     }
	protected static final int FNS_PAYLOAD_INSERT_TIMESTAMP_LEN = 26;
	/**
	 * 	serialize this FnsPayloadInsertTimestamp
	 */
   protected void serializeFnsPayloadInsertTimestamp(char[] fnsPayloadInsertTimestamp) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fnsPayloadInsertTimestamp,0,getStringValue(),beginFnsPayloadInsertTimestamp,FNS_PAYLOAD_INSERT_TIMESTAMP_LEN);
       localFnsPayloadInsertTimestampCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFnsPayloadInsertTimestampConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshFnsPayloadInsertTimestamp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFnsPayloadInsertTimestamp() {	 
   		return (substring(getStringValue(),beginFnsPayloadInsertTimestamp,beginFnsPayloadInsertTimestamp + FNS_PAYLOAD_INSERT_TIMESTAMP_LEN));
   	}
     int localFnsPayloadCycleIndicatorCounter = -1;
     public boolean isFnsPayloadCycleIndicatorModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFnsPayloadCycleIndicatorCounter != sharedCounter;
         localFnsPayloadCycleIndicatorCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of fnsPayloadCycleIndicator
	 *	@return fnsPayloadCycleIndicator
	 */
	public char[]  getFnsPayloadCycleIndicatorString() {
	     return getCharArray(beginFnsPayloadCycleIndicator,FNS_PAYLOAD_CYCLE_INDICATOR_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean fnsPayloadCycleIndicatorIsNumeric() {
	    return isNumeric(beginFnsPayloadCycleIndicator
	                    ,beginFnsPayloadCycleIndicator + FNS_PAYLOAD_CYCLE_INDICATOR_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int FNS_PAYLOAD_CYCLE_INDICATOR_LEN = 3;
  	/**
	 * serializeFnsPayloadCycleIndicator
	 */
	protected void serializeFnsPayloadCycleIndicator(int fnsPayloadCycleIndicator) {
		 putNumber(beginFnsPayloadCycleIndicator,fnsPayloadCycleIndicator,FNS_PAYLOAD_CYCLE_INDICATOR_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localFnsPayloadCycleIndicatorCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeFnsPayloadCycleIndicator
	 */
   	protected  int serializeFnsPayloadCycleIndicator(char[] value) {
	    int  fnsPayloadCycleIndicator;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    fnsPayloadCycleIndicator = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginFnsPayloadCycleIndicator
		       ,3
		      );
		 localFnsPayloadCycleIndicatorCounter = shareString.getSerializedField().getModifiedCounter();
		return  fnsPayloadCycleIndicator;
    }

   protected int checkFnsPayloadCycleIndicatorMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshFnsPayloadCycleIndicator is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFnsPayloadCycleIndicator() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginFnsPayloadCycleIndicator
			                 ,FNS_PAYLOAD_CYCLE_INDICATOR_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("fnsPayloadCycleIndicator", beginFnsPayloadCycleIndicator,FNS_PAYLOAD_CYCLE_INDICATOR_LEN);
    }
   	}
     int localFnsPayloadMsgRsnCdCounter = -1;
     public boolean isFnsPayloadMsgRsnCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFnsPayloadMsgRsnCdCounter != sharedCounter;
         localFnsPayloadMsgRsnCdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of fnsPayloadMsgRsnCd
	 *	@return fnsPayloadMsgRsnCd
	 */
	public char[]  getFnsPayloadMsgRsnCdString() {
	     return getCharArray(beginFnsPayloadMsgRsnCd,FNS_PAYLOAD_MSG_RSN_CD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean fnsPayloadMsgRsnCdIsNumeric() {
	    return isNumeric(beginFnsPayloadMsgRsnCd
	                    ,beginFnsPayloadMsgRsnCd + FNS_PAYLOAD_MSG_RSN_CD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int FNS_PAYLOAD_MSG_RSN_CD_LEN = 5;
  	/**
	 * serializeFnsPayloadMsgRsnCd
	 */
	protected void serializeFnsPayloadMsgRsnCd(long fnsPayloadMsgRsnCd) {
		 putNumber(beginFnsPayloadMsgRsnCd,fnsPayloadMsgRsnCd,FNS_PAYLOAD_MSG_RSN_CD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localFnsPayloadMsgRsnCdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeFnsPayloadMsgRsnCd
	 */
   	protected  long serializeFnsPayloadMsgRsnCd(char[] value) {
	    long  fnsPayloadMsgRsnCd;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    fnsPayloadMsgRsnCd = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginFnsPayloadMsgRsnCd
		       ,5
		      );
		 localFnsPayloadMsgRsnCdCounter = shareString.getSerializedField().getModifiedCounter();
		return  fnsPayloadMsgRsnCd;
    }

   protected long checkFnsPayloadMsgRsnCdMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshFnsPayloadMsgRsnCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshFnsPayloadMsgRsnCd() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginFnsPayloadMsgRsnCd
			                 ,FNS_PAYLOAD_MSG_RSN_CD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("fnsPayloadMsgRsnCd", beginFnsPayloadMsgRsnCd,FNS_PAYLOAD_MSG_RSN_CD_LEN);
    }
   	}
     int localFnsPayloadChargebackAmtCounter = -1;
     public boolean isFnsPayloadChargebackAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFnsPayloadChargebackAmtCounter != sharedCounter;
         localFnsPayloadChargebackAmtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of fnsPayloadChargebackAmt
	 *	@return fnsPayloadChargebackAmt
	 */
	public char[]  getFnsPayloadChargebackAmtString() {
	     return getCharArray(beginFnsPayloadChargebackAmt,FNS_PAYLOAD_CHARGEBACK_AMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean fnsPayloadChargebackAmtIsNumeric() {
	    return isNumeric(beginFnsPayloadChargebackAmt
	                    ,beginFnsPayloadChargebackAmt + FNS_PAYLOAD_CHARGEBACK_AMT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int FNS_PAYLOAD_CHARGEBACK_AMT_LEN = 13;
  	/**
	 * serializeFnsPayloadChargebackAmt
	 */
	protected void serializeFnsPayloadChargebackAmt(long fnsPayloadChargebackAmt) {
		 putNumber(beginFnsPayloadChargebackAmt,fnsPayloadChargebackAmt,FNS_PAYLOAD_CHARGEBACK_AMT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localFnsPayloadChargebackAmtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeFnsPayloadChargebackAmt
	 */
   	protected  long serializeFnsPayloadChargebackAmt(char[] value) {
	    long  fnsPayloadChargebackAmt;
	    if(value.length >0 && value.length!= 13)
            value = new String(value).trim().toCharArray();
	    if (value.length < 13) value = pad(13, value, ' ', LEFT_PAD);
	    else if (value.length > 13) value = substring(value,0,13);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    fnsPayloadChargebackAmt = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(13,value,false/*isSigned?*/)
		       ,beginFnsPayloadChargebackAmt
		       ,13
		      );
		 localFnsPayloadChargebackAmtCounter = shareString.getSerializedField().getModifiedCounter();
		return  fnsPayloadChargebackAmt;
    }

   protected long checkFnsPayloadChargebackAmtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_10T/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshFnsPayloadChargebackAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshFnsPayloadChargebackAmt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginFnsPayloadChargebackAmt
			                 ,FNS_PAYLOAD_CHARGEBACK_AMT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("fnsPayloadChargebackAmt", beginFnsPayloadChargebackAmt,FNS_PAYLOAD_CHARGEBACK_AMT_LEN);
    }
   	}
     int localFnsPayloadChargebackCurrCdCounter = -1;
     public boolean isFnsPayloadChargebackCurrCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFnsPayloadChargebackCurrCdCounter != sharedCounter;
         localFnsPayloadChargebackCurrCdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of fnsPayloadChargebackCurrCd
	 *	@return fnsPayloadChargebackCurrCd
	 */
	public char[]  getFnsPayloadChargebackCurrCdString() {
	     return getCharArray(beginFnsPayloadChargebackCurrCd,FNS_PAYLOAD_CHARGEBACK_CURR_CD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean fnsPayloadChargebackCurrCdIsNumeric() {
	    return isNumeric(beginFnsPayloadChargebackCurrCd
	                    ,beginFnsPayloadChargebackCurrCd + FNS_PAYLOAD_CHARGEBACK_CURR_CD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int FNS_PAYLOAD_CHARGEBACK_CURR_CD_LEN = 3;
  	/**
	 * serializeFnsPayloadChargebackCurrCd
	 */
	protected void serializeFnsPayloadChargebackCurrCd(int fnsPayloadChargebackCurrCd) {
		 putNumber(beginFnsPayloadChargebackCurrCd,fnsPayloadChargebackCurrCd,FNS_PAYLOAD_CHARGEBACK_CURR_CD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localFnsPayloadChargebackCurrCdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeFnsPayloadChargebackCurrCd
	 */
   	protected  int serializeFnsPayloadChargebackCurrCd(char[] value) {
	    int  fnsPayloadChargebackCurrCd;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    fnsPayloadChargebackCurrCd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginFnsPayloadChargebackCurrCd
		       ,3
		      );
		 localFnsPayloadChargebackCurrCdCounter = shareString.getSerializedField().getModifiedCounter();
		return  fnsPayloadChargebackCurrCd;
    }

   protected int checkFnsPayloadChargebackCurrCdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshFnsPayloadChargebackCurrCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFnsPayloadChargebackCurrCd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginFnsPayloadChargebackCurrCd
			                 ,FNS_PAYLOAD_CHARGEBACK_CURR_CD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("fnsPayloadChargebackCurrCd", beginFnsPayloadChargebackCurrCd,FNS_PAYLOAD_CHARGEBACK_CURR_CD_LEN);
    }
   	}
     int localFnsPayloadChargebackExpCdCounter = -1;
     public boolean isFnsPayloadChargebackExpCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFnsPayloadChargebackExpCdCounter != sharedCounter;
         localFnsPayloadChargebackExpCdCounter = sharedCounter; return hasModified;
     }
	protected static final int FNS_PAYLOAD_CHARGEBACK_EXP_CD_LEN = 1;
	/**
	 * 	serialize this FnsPayloadChargebackExpCd
	 */
   protected void serializeFnsPayloadChargebackExpCd(char[] fnsPayloadChargebackExpCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fnsPayloadChargebackExpCd,0,getStringValue(),beginFnsPayloadChargebackExpCd,FNS_PAYLOAD_CHARGEBACK_EXP_CD_LEN);
       localFnsPayloadChargebackExpCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFnsPayloadChargebackExpCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshFnsPayloadChargebackExpCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFnsPayloadChargebackExpCd() {	 
   		return (substring(getStringValue(),beginFnsPayloadChargebackExpCd,beginFnsPayloadChargebackExpCd + FNS_PAYLOAD_CHARGEBACK_EXP_CD_LEN));
   	}
     int localFnsPayloadReversalIndicatorCounter = -1;
     public boolean isFnsPayloadReversalIndicatorModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFnsPayloadReversalIndicatorCounter != sharedCounter;
         localFnsPayloadReversalIndicatorCounter = sharedCounter; return hasModified;
     }
	protected static final int FNS_PAYLOAD_REVERSAL_INDICATOR_LEN = 1;
	/**
	 * 	serialize this FnsPayloadReversalIndicator
	 */
   protected void serializeFnsPayloadReversalIndicator(char[] fnsPayloadReversalIndicator) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fnsPayloadReversalIndicator,0,getStringValue(),beginFnsPayloadReversalIndicator,FNS_PAYLOAD_REVERSAL_INDICATOR_LEN);
       localFnsPayloadReversalIndicatorCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFnsPayloadReversalIndicatorConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshFnsPayloadReversalIndicator is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFnsPayloadReversalIndicator() {	 
   		return (substring(getStringValue(),beginFnsPayloadReversalIndicator,beginFnsPayloadReversalIndicator + FNS_PAYLOAD_REVERSAL_INDICATOR_LEN));
   	}
     int localFnsPayloadChargebackRefNoCounter = -1;
     public boolean isFnsPayloadChargebackRefNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFnsPayloadChargebackRefNoCounter != sharedCounter;
         localFnsPayloadChargebackRefNoCounter = sharedCounter; return hasModified;
     }
	protected static final int FNS_PAYLOAD_CHARGEBACK_REF_NO_LEN = 10;
	/**
	 * 	serialize this FnsPayloadChargebackRefNo
	 */
   protected void serializeFnsPayloadChargebackRefNo(char[] fnsPayloadChargebackRefNo) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fnsPayloadChargebackRefNo,0,getStringValue(),beginFnsPayloadChargebackRefNo,FNS_PAYLOAD_CHARGEBACK_REF_NO_LEN);
       localFnsPayloadChargebackRefNoCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFnsPayloadChargebackRefNoConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshFnsPayloadChargebackRefNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFnsPayloadChargebackRefNo() {	 
   		return (substring(getStringValue(),beginFnsPayloadChargebackRefNo,beginFnsPayloadChargebackRefNo + FNS_PAYLOAD_CHARGEBACK_REF_NO_LEN));
   	}
     int localFnsPayloadFuncCdCounter = -1;
     public boolean isFnsPayloadFuncCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFnsPayloadFuncCdCounter != sharedCounter;
         localFnsPayloadFuncCdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of fnsPayloadFuncCd
	 *	@return fnsPayloadFuncCd
	 */
	public char[]  getFnsPayloadFuncCdString() {
	     return getCharArray(beginFnsPayloadFuncCd,FNS_PAYLOAD_FUNC_CD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean fnsPayloadFuncCdIsNumeric() {
	    return isNumeric(beginFnsPayloadFuncCd
	                    ,beginFnsPayloadFuncCd + FNS_PAYLOAD_FUNC_CD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int FNS_PAYLOAD_FUNC_CD_LEN = 3;
  	/**
	 * serializeFnsPayloadFuncCd
	 */
	protected void serializeFnsPayloadFuncCd(int fnsPayloadFuncCd) {
		 putNumber(beginFnsPayloadFuncCd,fnsPayloadFuncCd,FNS_PAYLOAD_FUNC_CD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localFnsPayloadFuncCdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeFnsPayloadFuncCd
	 */
   	protected  int serializeFnsPayloadFuncCd(char[] value) {
	    int  fnsPayloadFuncCd;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    fnsPayloadFuncCd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginFnsPayloadFuncCd
		       ,3
		      );
		 localFnsPayloadFuncCdCounter = shareString.getSerializedField().getModifiedCounter();
		return  fnsPayloadFuncCd;
    }

   protected int checkFnsPayloadFuncCdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshFnsPayloadFuncCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFnsPayloadFuncCd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginFnsPayloadFuncCd
			                 ,FNS_PAYLOAD_FUNC_CD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("fnsPayloadFuncCd", beginFnsPayloadFuncCd,FNS_PAYLOAD_FUNC_CD_LEN);
    }
   	}
     int localFnsPayloadSwitchSerialNumCounter = -1;
     public boolean isFnsPayloadSwitchSerialNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFnsPayloadSwitchSerialNumCounter != sharedCounter;
         localFnsPayloadSwitchSerialNumCounter = sharedCounter; return hasModified;
     }
	protected static final int FNS_PAYLOAD_SWITCH_SERIAL_NUM_LEN = 9;
	/**
	 * 	serialize this FnsPayloadSwitchSerialNum
	 */
   protected void serializeFnsPayloadSwitchSerialNum(char[] fnsPayloadSwitchSerialNum) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fnsPayloadSwitchSerialNum,0,getStringValue(),beginFnsPayloadSwitchSerialNum,FNS_PAYLOAD_SWITCH_SERIAL_NUM_LEN);
       localFnsPayloadSwitchSerialNumCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFnsPayloadSwitchSerialNumConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshFnsPayloadSwitchSerialNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFnsPayloadSwitchSerialNum() {	 
   		return (substring(getStringValue(),beginFnsPayloadSwitchSerialNum,beginFnsPayloadSwitchSerialNum + FNS_PAYLOAD_SWITCH_SERIAL_NUM_LEN));
   	}
     int localFnsPayloadSourceCdCounter = -1;
     public boolean isFnsPayloadSourceCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFnsPayloadSourceCdCounter != sharedCounter;
         localFnsPayloadSourceCdCounter = sharedCounter; return hasModified;
     }
	protected static final int FNS_PAYLOAD_SOURCE_CD_LEN = 4;
	/**
	 * 	serialize this FnsPayloadSourceCd
	 */
   protected void serializeFnsPayloadSourceCd(char[] fnsPayloadSourceCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fnsPayloadSourceCd,0,getStringValue(),beginFnsPayloadSourceCd,FNS_PAYLOAD_SOURCE_CD_LEN);
       localFnsPayloadSourceCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFnsPayloadSourceCdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshFnsPayloadSourceCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFnsPayloadSourceCd() {	 
   		return (substring(getStringValue(),beginFnsPayloadSourceCd,beginFnsPayloadSourceCd + FNS_PAYLOAD_SOURCE_CD_LEN));
   	}
        int localFnsPayloadCntCdCounter = -1;
        public boolean isFnsPayloadCntCdModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localFnsPayloadCntCdCounter != sharedCounter;
           localFnsPayloadCntCdCounter = sharedCounter; return hasModified; 
        }
	    public boolean fnsPayloadCntCdIsNumeric() {
	      return decimalIsNumeric(beginFnsPayloadCntCd,FNS_PAYLOAD_CNT_CD_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int FNS_PAYLOAD_CNT_CD_LEN = 2;
  	/**
	 * 	serializeFnsPayloadCntCd
	 */
	protected void serializeFnsPayloadCntCd(short fnsPayloadCntCd) {
		   putDecimal(beginFnsPayloadCntCd,fnsPayloadCntCd,FNS_PAYLOAD_CNT_CD_LEN,true);
   }
   

   protected short checkFnsPayloadCntCdMaxLimit(long number) {
	   return (short)checkMaxLimit(number , MAX_1000 /*limit*/  , true /*isSigned*/);
   }

     /**
	 *	refreshFnsPayloadCntCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshFnsPayloadCntCd() throws CFException {	
   	try { 
		 return (getShortDecimal(beginFnsPayloadCntCd,FNS_PAYLOAD_CNT_CD_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("fnsPayloadCntCd", beginFnsPayloadCntCd,FNS_PAYLOAD_CNT_CD_LEN);
     }
   	}
     int localFnsPayloadOrigSwSerNumCounter = -1;
     public boolean isFnsPayloadOrigSwSerNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFnsPayloadOrigSwSerNumCounter != sharedCounter;
         localFnsPayloadOrigSwSerNumCounter = sharedCounter; return hasModified;
     }
	protected static final int FNS_PAYLOAD_ORIG_SW_SER_NUM_LEN = 9;
	/**
	 * 	serialize this FnsPayloadOrigSwSerNum
	 */
   protected void serializeFnsPayloadOrigSwSerNum(char[] fnsPayloadOrigSwSerNum) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fnsPayloadOrigSwSerNum,0,getStringValue(),beginFnsPayloadOrigSwSerNum,FNS_PAYLOAD_ORIG_SW_SER_NUM_LEN);
       localFnsPayloadOrigSwSerNumCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFnsPayloadOrigSwSerNumConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshFnsPayloadOrigSwSerNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFnsPayloadOrigSwSerNum() {	 
   		return (substring(getStringValue(),beginFnsPayloadOrigSwSerNum,beginFnsPayloadOrigSwSerNum + FNS_PAYLOAD_ORIG_SW_SER_NUM_LEN));
   	}
     int localFnsPayloadChgbkCntCounter = -1;
     public boolean isFnsPayloadChgbkCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFnsPayloadChgbkCntCounter != sharedCounter;
         localFnsPayloadChgbkCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of fnsPayloadChgbkCnt
	 *	@return fnsPayloadChgbkCnt
	 */
	public char[]  getFnsPayloadChgbkCntString() {
	     return getCharArray(beginFnsPayloadChgbkCnt,FNS_PAYLOAD_CHGBK_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean fnsPayloadChgbkCntIsNumeric() {
	    return isNumeric(beginFnsPayloadChgbkCnt
	                    ,beginFnsPayloadChgbkCnt + FNS_PAYLOAD_CHGBK_CNT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int FNS_PAYLOAD_CHGBK_CNT_LEN = 3;
  	/**
	 * serializeFnsPayloadChgbkCnt
	 */
	protected void serializeFnsPayloadChgbkCnt(int fnsPayloadChgbkCnt) {
		 putNumber(beginFnsPayloadChgbkCnt,fnsPayloadChgbkCnt,FNS_PAYLOAD_CHGBK_CNT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localFnsPayloadChgbkCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeFnsPayloadChgbkCnt
	 */
   	protected  int serializeFnsPayloadChgbkCnt(char[] value) {
	    int  fnsPayloadChgbkCnt;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    fnsPayloadChgbkCnt = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginFnsPayloadChgbkCnt
		       ,3
		      );
		 localFnsPayloadChgbkCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  fnsPayloadChgbkCnt;
    }

   protected int checkFnsPayloadChgbkCntMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshFnsPayloadChgbkCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFnsPayloadChgbkCnt() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginFnsPayloadChgbkCnt
			                 ,FNS_PAYLOAD_CHGBK_CNT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("fnsPayloadChgbkCnt", beginFnsPayloadChgbkCnt,FNS_PAYLOAD_CHGBK_CNT_LEN);
    }
   	}
     int localFnsPayloadRejRsn1CdCounter = -1;
     public boolean isFnsPayloadRejRsn1CdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFnsPayloadRejRsn1CdCounter != sharedCounter;
         localFnsPayloadRejRsn1CdCounter = sharedCounter; return hasModified;
     }
	protected static final int FNS_PAYLOAD_REJ_RSN_1_CD_LEN = 4;
	/**
	 * 	serialize this FnsPayloadRejRsn1Cd
	 */
   protected void serializeFnsPayloadRejRsn1Cd(char[] fnsPayloadRejRsn1Cd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fnsPayloadRejRsn1Cd,0,getStringValue(),beginFnsPayloadRejRsn1Cd,FNS_PAYLOAD_REJ_RSN_1_CD_LEN);
       localFnsPayloadRejRsn1CdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFnsPayloadRejRsn1CdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshFnsPayloadRejRsn1Cd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFnsPayloadRejRsn1Cd() {	 
   		return (substring(getStringValue(),beginFnsPayloadRejRsn1Cd,beginFnsPayloadRejRsn1Cd + FNS_PAYLOAD_REJ_RSN_1_CD_LEN));
   	}
     int localFnsPayloadRejRsn2CdCounter = -1;
     public boolean isFnsPayloadRejRsn2CdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFnsPayloadRejRsn2CdCounter != sharedCounter;
         localFnsPayloadRejRsn2CdCounter = sharedCounter; return hasModified;
     }
	protected static final int FNS_PAYLOAD_REJ_RSN_2_CD_LEN = 4;
	/**
	 * 	serialize this FnsPayloadRejRsn2Cd
	 */
   protected void serializeFnsPayloadRejRsn2Cd(char[] fnsPayloadRejRsn2Cd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fnsPayloadRejRsn2Cd,0,getStringValue(),beginFnsPayloadRejRsn2Cd,FNS_PAYLOAD_REJ_RSN_2_CD_LEN);
       localFnsPayloadRejRsn2CdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFnsPayloadRejRsn2CdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshFnsPayloadRejRsn2Cd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFnsPayloadRejRsn2Cd() {	 
   		return (substring(getStringValue(),beginFnsPayloadRejRsn2Cd,beginFnsPayloadRejRsn2Cd + FNS_PAYLOAD_REJ_RSN_2_CD_LEN));
   	}
     int localFnsPayloadVrtlAcctNumCounter = -1;
     public boolean isFnsPayloadVrtlAcctNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFnsPayloadVrtlAcctNumCounter != sharedCounter;
         localFnsPayloadVrtlAcctNumCounter = sharedCounter; return hasModified;
     }
	protected static final int FNS_PAYLOAD_VRTL_ACCT_NUM_LEN = 19;
	/**
	 * 	serialize this FnsPayloadVrtlAcctNum
	 */
   protected void serializeFnsPayloadVrtlAcctNum(char[] fnsPayloadVrtlAcctNum) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fnsPayloadVrtlAcctNum,0,getStringValue(),beginFnsPayloadVrtlAcctNum,FNS_PAYLOAD_VRTL_ACCT_NUM_LEN);
       localFnsPayloadVrtlAcctNumCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFnsPayloadVrtlAcctNumConstraints(char[] value) {
   			return super.checkConstraints(value , 19 ,false, false);
   }
    /**
	 *	refreshFnsPayloadVrtlAcctNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFnsPayloadVrtlAcctNum() {	 
   		return (substring(getStringValue(),beginFnsPayloadVrtlAcctNum,beginFnsPayloadVrtlAcctNum + FNS_PAYLOAD_VRTL_ACCT_NUM_LEN));
   	}




}
  
