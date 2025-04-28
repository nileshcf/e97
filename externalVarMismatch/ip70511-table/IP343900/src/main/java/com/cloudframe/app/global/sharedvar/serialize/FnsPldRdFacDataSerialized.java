package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class FnsPldRdFacDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class FnsPldRdFacDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FnsPldRdFacDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FNS_PLD_RD_FAC_DATA_LENGTH = 129;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFnsPldRdInsertTimestamp;
            protected  int beginFnsPldRdCycleIndicator;
            protected  int beginFnsPldRdMsgRsnCd;
            protected  int beginFnsPldRdChargebackAmt;
            protected  int beginFnsPldRdChargebackCurrCd;
            protected  int beginFnsPldRdChargebackExpCd;
            protected  int beginFnsPldRdReversalIndicator;
            protected  int beginFnsPldRdChargebackRefNo;
            protected  int beginFnsPldRdFuncCd;
            protected  int beginFnsPldRdSwitchSerialNum;
            protected  int beginFnsPldRdSourceCd;
            protected  int beginFnsPldRdCntCd;
            protected  int beginFnsPldRdOrigSwSerNum;
            protected  int beginFnsPldRdChgbkCnt;
            protected  int beginFnsPldRdRejRsn1Cd;
            protected  int beginFnsPldRdRejRsn2Cd;
            protected  int beginFnsPldRdVrtlAcctNum;
	
	/**
	* Constructor for FnsPldRdFacDataSerialized
	**/
    public FnsPldRdFacDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for FnsPldRdFacDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FnsPldRdFacDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this FnsPldRdFacDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,93); // serialize this field at offset 93 by default 
    }
    
	/**
	* sets parent for this FnsPldRdFacDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 93 by default
    }    
	/**
	* initializes the field in FnsPldRdFacDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FNS_PLD_RD_FAC_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFnsPldRdInsertTimestamp = getStartOffset() + 0;	// set offset for serialization
  
             beginFnsPldRdCycleIndicator = getStartOffset() + 26;	// set offset for serialization
  
             beginFnsPldRdMsgRsnCd = getStartOffset() + 29;	// set offset for serialization
  
             beginFnsPldRdChargebackAmt = getStartOffset() + 34;	// set offset for serialization
  
             beginFnsPldRdChargebackCurrCd = getStartOffset() + 47;	// set offset for serialization
  
             beginFnsPldRdChargebackExpCd = getStartOffset() + 50;	// set offset for serialization
  
             beginFnsPldRdReversalIndicator = getStartOffset() + 51;	// set offset for serialization
  
             beginFnsPldRdChargebackRefNo = getStartOffset() + 52;	// set offset for serialization
  
             beginFnsPldRdFuncCd = getStartOffset() + 62;	// set offset for serialization
  
             beginFnsPldRdSwitchSerialNum = getStartOffset() + 65;	// set offset for serialization
  
             beginFnsPldRdSourceCd = getStartOffset() + 74;	// set offset for serialization
  
             beginFnsPldRdCntCd = getStartOffset() + 78;	// set offset for serialization
  
             beginFnsPldRdOrigSwSerNum = getStartOffset() + 80;	// set offset for serialization
  
  
             beginFnsPldRdChgbkCnt = getStartOffset() + 99;	// set offset for serialization
  
             beginFnsPldRdRejRsn1Cd = getStartOffset() + 102;	// set offset for serialization
  
             beginFnsPldRdRejRsn2Cd = getStartOffset() + 106;	// set offset for serialization
  
             beginFnsPldRdVrtlAcctNum = getStartOffset() + 110;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFnsPldRdInsertTimestampCounter = -1;
     public boolean isFnsPldRdInsertTimestampModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFnsPldRdInsertTimestampCounter != sharedCounter;
         localFnsPldRdInsertTimestampCounter = sharedCounter; return hasModified;
     }
	protected static final int FNS_PLD_RD_INSERT_TIMESTAMP_LEN = 26;
	/**
	 * 	serialize this FnsPldRdInsertTimestamp
	 */
   protected void serializeFnsPldRdInsertTimestamp(char[] fnsPldRdInsertTimestamp) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fnsPldRdInsertTimestamp,0,getStringValue(),beginFnsPldRdInsertTimestamp,FNS_PLD_RD_INSERT_TIMESTAMP_LEN);
       localFnsPldRdInsertTimestampCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFnsPldRdInsertTimestampConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshFnsPldRdInsertTimestamp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFnsPldRdInsertTimestamp() {	 
   		return (substring(getStringValue(),beginFnsPldRdInsertTimestamp,beginFnsPldRdInsertTimestamp + FNS_PLD_RD_INSERT_TIMESTAMP_LEN));
   	}
     int localFnsPldRdCycleIndicatorCounter = -1;
     public boolean isFnsPldRdCycleIndicatorModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFnsPldRdCycleIndicatorCounter != sharedCounter;
         localFnsPldRdCycleIndicatorCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of fnsPldRdCycleIndicator
	 *	@return fnsPldRdCycleIndicator
	 */
	public char[]  getFnsPldRdCycleIndicatorString() {
	     return getCharArray(beginFnsPldRdCycleIndicator,FNS_PLD_RD_CYCLE_INDICATOR_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean fnsPldRdCycleIndicatorIsNumeric() {
	    return isNumeric(beginFnsPldRdCycleIndicator
	                    ,beginFnsPldRdCycleIndicator + FNS_PLD_RD_CYCLE_INDICATOR_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int FNS_PLD_RD_CYCLE_INDICATOR_LEN = 3;
  	/**
	 * serializeFnsPldRdCycleIndicator
	 */
	protected void serializeFnsPldRdCycleIndicator(int fnsPldRdCycleIndicator) {
		 putNumber(beginFnsPldRdCycleIndicator,fnsPldRdCycleIndicator,FNS_PLD_RD_CYCLE_INDICATOR_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localFnsPldRdCycleIndicatorCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeFnsPldRdCycleIndicator
	 */
   	protected  int serializeFnsPldRdCycleIndicator(char[] value) {
	    int  fnsPldRdCycleIndicator;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    fnsPldRdCycleIndicator = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginFnsPldRdCycleIndicator
		       ,3
		      );
		 localFnsPldRdCycleIndicatorCounter = shareString.getSerializedField().getModifiedCounter();
		return  fnsPldRdCycleIndicator;
    }

   protected int checkFnsPldRdCycleIndicatorMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshFnsPldRdCycleIndicator is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFnsPldRdCycleIndicator() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginFnsPldRdCycleIndicator
			                 ,FNS_PLD_RD_CYCLE_INDICATOR_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("fnsPldRdCycleIndicator", beginFnsPldRdCycleIndicator,FNS_PLD_RD_CYCLE_INDICATOR_LEN);
    }
   	}
     int localFnsPldRdMsgRsnCdCounter = -1;
     public boolean isFnsPldRdMsgRsnCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFnsPldRdMsgRsnCdCounter != sharedCounter;
         localFnsPldRdMsgRsnCdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of fnsPldRdMsgRsnCd
	 *	@return fnsPldRdMsgRsnCd
	 */
	public char[]  getFnsPldRdMsgRsnCdString() {
	     return getCharArray(beginFnsPldRdMsgRsnCd,FNS_PLD_RD_MSG_RSN_CD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean fnsPldRdMsgRsnCdIsNumeric() {
	    return isNumeric(beginFnsPldRdMsgRsnCd
	                    ,beginFnsPldRdMsgRsnCd + FNS_PLD_RD_MSG_RSN_CD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int FNS_PLD_RD_MSG_RSN_CD_LEN = 5;
  	/**
	 * serializeFnsPldRdMsgRsnCd
	 */
	protected void serializeFnsPldRdMsgRsnCd(long fnsPldRdMsgRsnCd) {
		 putNumber(beginFnsPldRdMsgRsnCd,fnsPldRdMsgRsnCd,FNS_PLD_RD_MSG_RSN_CD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localFnsPldRdMsgRsnCdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeFnsPldRdMsgRsnCd
	 */
   	protected  long serializeFnsPldRdMsgRsnCd(char[] value) {
	    long  fnsPldRdMsgRsnCd;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    fnsPldRdMsgRsnCd = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginFnsPldRdMsgRsnCd
		       ,5
		      );
		 localFnsPldRdMsgRsnCdCounter = shareString.getSerializedField().getModifiedCounter();
		return  fnsPldRdMsgRsnCd;
    }

   protected long checkFnsPldRdMsgRsnCdMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshFnsPldRdMsgRsnCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshFnsPldRdMsgRsnCd() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginFnsPldRdMsgRsnCd
			                 ,FNS_PLD_RD_MSG_RSN_CD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("fnsPldRdMsgRsnCd", beginFnsPldRdMsgRsnCd,FNS_PLD_RD_MSG_RSN_CD_LEN);
    }
   	}
     int localFnsPldRdChargebackAmtCounter = -1;
     public boolean isFnsPldRdChargebackAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFnsPldRdChargebackAmtCounter != sharedCounter;
         localFnsPldRdChargebackAmtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of fnsPldRdChargebackAmt
	 *	@return fnsPldRdChargebackAmt
	 */
	public char[]  getFnsPldRdChargebackAmtString() {
	     return getCharArray(beginFnsPldRdChargebackAmt,FNS_PLD_RD_CHARGEBACK_AMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean fnsPldRdChargebackAmtIsNumeric() {
	    return isNumeric(beginFnsPldRdChargebackAmt
	                    ,beginFnsPldRdChargebackAmt + FNS_PLD_RD_CHARGEBACK_AMT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int FNS_PLD_RD_CHARGEBACK_AMT_LEN = 13;
  	/**
	 * serializeFnsPldRdChargebackAmt
	 */
	protected void serializeFnsPldRdChargebackAmt(long fnsPldRdChargebackAmt) {
		 putNumber(beginFnsPldRdChargebackAmt,fnsPldRdChargebackAmt,FNS_PLD_RD_CHARGEBACK_AMT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localFnsPldRdChargebackAmtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeFnsPldRdChargebackAmt
	 */
   	protected  long serializeFnsPldRdChargebackAmt(char[] value) {
	    long  fnsPldRdChargebackAmt;
	    if(value.length >0 && value.length!= 13)
            value = new String(value).trim().toCharArray();
	    if (value.length < 13) value = pad(13, value, ' ', LEFT_PAD);
	    else if (value.length > 13) value = substring(value,0,13);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    fnsPldRdChargebackAmt = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(13,value,false/*isSigned?*/)
		       ,beginFnsPldRdChargebackAmt
		       ,13
		      );
		 localFnsPldRdChargebackAmtCounter = shareString.getSerializedField().getModifiedCounter();
		return  fnsPldRdChargebackAmt;
    }

   protected long checkFnsPldRdChargebackAmtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_10T/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshFnsPldRdChargebackAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshFnsPldRdChargebackAmt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginFnsPldRdChargebackAmt
			                 ,FNS_PLD_RD_CHARGEBACK_AMT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("fnsPldRdChargebackAmt", beginFnsPldRdChargebackAmt,FNS_PLD_RD_CHARGEBACK_AMT_LEN);
    }
   	}
     int localFnsPldRdChargebackCurrCdCounter = -1;
     public boolean isFnsPldRdChargebackCurrCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFnsPldRdChargebackCurrCdCounter != sharedCounter;
         localFnsPldRdChargebackCurrCdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of fnsPldRdChargebackCurrCd
	 *	@return fnsPldRdChargebackCurrCd
	 */
	public char[]  getFnsPldRdChargebackCurrCdString() {
	     return getCharArray(beginFnsPldRdChargebackCurrCd,FNS_PLD_RD_CHARGEBACK_CURR_CD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean fnsPldRdChargebackCurrCdIsNumeric() {
	    return isNumeric(beginFnsPldRdChargebackCurrCd
	                    ,beginFnsPldRdChargebackCurrCd + FNS_PLD_RD_CHARGEBACK_CURR_CD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int FNS_PLD_RD_CHARGEBACK_CURR_CD_LEN = 3;
  	/**
	 * serializeFnsPldRdChargebackCurrCd
	 */
	protected void serializeFnsPldRdChargebackCurrCd(int fnsPldRdChargebackCurrCd) {
		 putNumber(beginFnsPldRdChargebackCurrCd,fnsPldRdChargebackCurrCd,FNS_PLD_RD_CHARGEBACK_CURR_CD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localFnsPldRdChargebackCurrCdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeFnsPldRdChargebackCurrCd
	 */
   	protected  int serializeFnsPldRdChargebackCurrCd(char[] value) {
	    int  fnsPldRdChargebackCurrCd;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    fnsPldRdChargebackCurrCd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginFnsPldRdChargebackCurrCd
		       ,3
		      );
		 localFnsPldRdChargebackCurrCdCounter = shareString.getSerializedField().getModifiedCounter();
		return  fnsPldRdChargebackCurrCd;
    }

   protected int checkFnsPldRdChargebackCurrCdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshFnsPldRdChargebackCurrCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFnsPldRdChargebackCurrCd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginFnsPldRdChargebackCurrCd
			                 ,FNS_PLD_RD_CHARGEBACK_CURR_CD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("fnsPldRdChargebackCurrCd", beginFnsPldRdChargebackCurrCd,FNS_PLD_RD_CHARGEBACK_CURR_CD_LEN);
    }
   	}
     int localFnsPldRdChargebackExpCdCounter = -1;
     public boolean isFnsPldRdChargebackExpCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFnsPldRdChargebackExpCdCounter != sharedCounter;
         localFnsPldRdChargebackExpCdCounter = sharedCounter; return hasModified;
     }
	protected static final int FNS_PLD_RD_CHARGEBACK_EXP_CD_LEN = 1;
	/**
	 * 	serialize this FnsPldRdChargebackExpCd
	 */
   protected void serializeFnsPldRdChargebackExpCd(char[] fnsPldRdChargebackExpCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fnsPldRdChargebackExpCd,0,getStringValue(),beginFnsPldRdChargebackExpCd,FNS_PLD_RD_CHARGEBACK_EXP_CD_LEN);
       localFnsPldRdChargebackExpCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFnsPldRdChargebackExpCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshFnsPldRdChargebackExpCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFnsPldRdChargebackExpCd() {	 
   		return (substring(getStringValue(),beginFnsPldRdChargebackExpCd,beginFnsPldRdChargebackExpCd + FNS_PLD_RD_CHARGEBACK_EXP_CD_LEN));
   	}
     int localFnsPldRdReversalIndicatorCounter = -1;
     public boolean isFnsPldRdReversalIndicatorModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFnsPldRdReversalIndicatorCounter != sharedCounter;
         localFnsPldRdReversalIndicatorCounter = sharedCounter; return hasModified;
     }
	protected static final int FNS_PLD_RD_REVERSAL_INDICATOR_LEN = 1;
	/**
	 * 	serialize this FnsPldRdReversalIndicator
	 */
   protected void serializeFnsPldRdReversalIndicator(char[] fnsPldRdReversalIndicator) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fnsPldRdReversalIndicator,0,getStringValue(),beginFnsPldRdReversalIndicator,FNS_PLD_RD_REVERSAL_INDICATOR_LEN);
       localFnsPldRdReversalIndicatorCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFnsPldRdReversalIndicatorConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshFnsPldRdReversalIndicator is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFnsPldRdReversalIndicator() {	 
   		return (substring(getStringValue(),beginFnsPldRdReversalIndicator,beginFnsPldRdReversalIndicator + FNS_PLD_RD_REVERSAL_INDICATOR_LEN));
   	}
     int localFnsPldRdChargebackRefNoCounter = -1;
     public boolean isFnsPldRdChargebackRefNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFnsPldRdChargebackRefNoCounter != sharedCounter;
         localFnsPldRdChargebackRefNoCounter = sharedCounter; return hasModified;
     }
	protected static final int FNS_PLD_RD_CHARGEBACK_REF_NO_LEN = 10;
	/**
	 * 	serialize this FnsPldRdChargebackRefNo
	 */
   protected void serializeFnsPldRdChargebackRefNo(char[] fnsPldRdChargebackRefNo) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fnsPldRdChargebackRefNo,0,getStringValue(),beginFnsPldRdChargebackRefNo,FNS_PLD_RD_CHARGEBACK_REF_NO_LEN);
       localFnsPldRdChargebackRefNoCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFnsPldRdChargebackRefNoConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshFnsPldRdChargebackRefNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFnsPldRdChargebackRefNo() {	 
   		return (substring(getStringValue(),beginFnsPldRdChargebackRefNo,beginFnsPldRdChargebackRefNo + FNS_PLD_RD_CHARGEBACK_REF_NO_LEN));
   	}
     int localFnsPldRdFuncCdCounter = -1;
     public boolean isFnsPldRdFuncCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFnsPldRdFuncCdCounter != sharedCounter;
         localFnsPldRdFuncCdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of fnsPldRdFuncCd
	 *	@return fnsPldRdFuncCd
	 */
	public char[]  getFnsPldRdFuncCdString() {
	     return getCharArray(beginFnsPldRdFuncCd,FNS_PLD_RD_FUNC_CD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean fnsPldRdFuncCdIsNumeric() {
	    return isNumeric(beginFnsPldRdFuncCd
	                    ,beginFnsPldRdFuncCd + FNS_PLD_RD_FUNC_CD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int FNS_PLD_RD_FUNC_CD_LEN = 3;
  	/**
	 * serializeFnsPldRdFuncCd
	 */
	protected void serializeFnsPldRdFuncCd(int fnsPldRdFuncCd) {
		 putNumber(beginFnsPldRdFuncCd,fnsPldRdFuncCd,FNS_PLD_RD_FUNC_CD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localFnsPldRdFuncCdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeFnsPldRdFuncCd
	 */
   	protected  int serializeFnsPldRdFuncCd(char[] value) {
	    int  fnsPldRdFuncCd;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    fnsPldRdFuncCd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginFnsPldRdFuncCd
		       ,3
		      );
		 localFnsPldRdFuncCdCounter = shareString.getSerializedField().getModifiedCounter();
		return  fnsPldRdFuncCd;
    }

   protected int checkFnsPldRdFuncCdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshFnsPldRdFuncCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFnsPldRdFuncCd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginFnsPldRdFuncCd
			                 ,FNS_PLD_RD_FUNC_CD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("fnsPldRdFuncCd", beginFnsPldRdFuncCd,FNS_PLD_RD_FUNC_CD_LEN);
    }
   	}
     int localFnsPldRdSwitchSerialNumCounter = -1;
     public boolean isFnsPldRdSwitchSerialNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFnsPldRdSwitchSerialNumCounter != sharedCounter;
         localFnsPldRdSwitchSerialNumCounter = sharedCounter; return hasModified;
     }
	protected static final int FNS_PLD_RD_SWITCH_SERIAL_NUM_LEN = 9;
	/**
	 * 	serialize this FnsPldRdSwitchSerialNum
	 */
   protected void serializeFnsPldRdSwitchSerialNum(char[] fnsPldRdSwitchSerialNum) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fnsPldRdSwitchSerialNum,0,getStringValue(),beginFnsPldRdSwitchSerialNum,FNS_PLD_RD_SWITCH_SERIAL_NUM_LEN);
       localFnsPldRdSwitchSerialNumCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFnsPldRdSwitchSerialNumConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshFnsPldRdSwitchSerialNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFnsPldRdSwitchSerialNum() {	 
   		return (substring(getStringValue(),beginFnsPldRdSwitchSerialNum,beginFnsPldRdSwitchSerialNum + FNS_PLD_RD_SWITCH_SERIAL_NUM_LEN));
   	}
     int localFnsPldRdSourceCdCounter = -1;
     public boolean isFnsPldRdSourceCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFnsPldRdSourceCdCounter != sharedCounter;
         localFnsPldRdSourceCdCounter = sharedCounter; return hasModified;
     }
	protected static final int FNS_PLD_RD_SOURCE_CD_LEN = 4;
	/**
	 * 	serialize this FnsPldRdSourceCd
	 */
   protected void serializeFnsPldRdSourceCd(char[] fnsPldRdSourceCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fnsPldRdSourceCd,0,getStringValue(),beginFnsPldRdSourceCd,FNS_PLD_RD_SOURCE_CD_LEN);
       localFnsPldRdSourceCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFnsPldRdSourceCdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshFnsPldRdSourceCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFnsPldRdSourceCd() {	 
   		return (substring(getStringValue(),beginFnsPldRdSourceCd,beginFnsPldRdSourceCd + FNS_PLD_RD_SOURCE_CD_LEN));
   	}
        int localFnsPldRdCntCdCounter = -1;
        public boolean isFnsPldRdCntCdModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localFnsPldRdCntCdCounter != sharedCounter;
           localFnsPldRdCntCdCounter = sharedCounter; return hasModified; 
        }
	    public boolean fnsPldRdCntCdIsNumeric() {
	      return decimalIsNumeric(beginFnsPldRdCntCd,FNS_PLD_RD_CNT_CD_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int FNS_PLD_RD_CNT_CD_LEN = 2;
  	/**
	 * 	serializeFnsPldRdCntCd
	 */
	protected void serializeFnsPldRdCntCd(short fnsPldRdCntCd) {
		   putDecimal(beginFnsPldRdCntCd,fnsPldRdCntCd,FNS_PLD_RD_CNT_CD_LEN,true);
   }
   

   protected short checkFnsPldRdCntCdMaxLimit(long number) {
	   return (short)checkMaxLimit(number , MAX_1000 /*limit*/  , true /*isSigned*/);
   }

     /**
	 *	refreshFnsPldRdCntCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshFnsPldRdCntCd() throws CFException {	
   	try { 
		 return (getShortDecimal(beginFnsPldRdCntCd,FNS_PLD_RD_CNT_CD_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("fnsPldRdCntCd", beginFnsPldRdCntCd,FNS_PLD_RD_CNT_CD_LEN);
     }
   	}
     int localFnsPldRdOrigSwSerNumCounter = -1;
     public boolean isFnsPldRdOrigSwSerNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFnsPldRdOrigSwSerNumCounter != sharedCounter;
         localFnsPldRdOrigSwSerNumCounter = sharedCounter; return hasModified;
     }
	protected static final int FNS_PLD_RD_ORIG_SW_SER_NUM_LEN = 9;
	/**
	 * 	serialize this FnsPldRdOrigSwSerNum
	 */
   protected void serializeFnsPldRdOrigSwSerNum(char[] fnsPldRdOrigSwSerNum) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fnsPldRdOrigSwSerNum,0,getStringValue(),beginFnsPldRdOrigSwSerNum,FNS_PLD_RD_ORIG_SW_SER_NUM_LEN);
       localFnsPldRdOrigSwSerNumCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFnsPldRdOrigSwSerNumConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshFnsPldRdOrigSwSerNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFnsPldRdOrigSwSerNum() {	 
   		return (substring(getStringValue(),beginFnsPldRdOrigSwSerNum,beginFnsPldRdOrigSwSerNum + FNS_PLD_RD_ORIG_SW_SER_NUM_LEN));
   	}
     int localFnsPldRdChgbkCntCounter = -1;
     public boolean isFnsPldRdChgbkCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFnsPldRdChgbkCntCounter != sharedCounter;
         localFnsPldRdChgbkCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of fnsPldRdChgbkCnt
	 *	@return fnsPldRdChgbkCnt
	 */
	public char[]  getFnsPldRdChgbkCntString() {
	     return getCharArray(beginFnsPldRdChgbkCnt,FNS_PLD_RD_CHGBK_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean fnsPldRdChgbkCntIsNumeric() {
	    return isNumeric(beginFnsPldRdChgbkCnt
	                    ,beginFnsPldRdChgbkCnt + FNS_PLD_RD_CHGBK_CNT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int FNS_PLD_RD_CHGBK_CNT_LEN = 3;
  	/**
	 * serializeFnsPldRdChgbkCnt
	 */
	protected void serializeFnsPldRdChgbkCnt(int fnsPldRdChgbkCnt) {
		 putNumber(beginFnsPldRdChgbkCnt,fnsPldRdChgbkCnt,FNS_PLD_RD_CHGBK_CNT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localFnsPldRdChgbkCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeFnsPldRdChgbkCnt
	 */
   	protected  int serializeFnsPldRdChgbkCnt(char[] value) {
	    int  fnsPldRdChgbkCnt;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    fnsPldRdChgbkCnt = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginFnsPldRdChgbkCnt
		       ,3
		      );
		 localFnsPldRdChgbkCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  fnsPldRdChgbkCnt;
    }

   protected int checkFnsPldRdChgbkCntMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshFnsPldRdChgbkCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFnsPldRdChgbkCnt() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginFnsPldRdChgbkCnt
			                 ,FNS_PLD_RD_CHGBK_CNT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("fnsPldRdChgbkCnt", beginFnsPldRdChgbkCnt,FNS_PLD_RD_CHGBK_CNT_LEN);
    }
   	}
     int localFnsPldRdRejRsn1CdCounter = -1;
     public boolean isFnsPldRdRejRsn1CdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFnsPldRdRejRsn1CdCounter != sharedCounter;
         localFnsPldRdRejRsn1CdCounter = sharedCounter; return hasModified;
     }
	protected static final int FNS_PLD_RD_REJ_RSN_1_CD_LEN = 4;
	/**
	 * 	serialize this FnsPldRdRejRsn1Cd
	 */
   protected void serializeFnsPldRdRejRsn1Cd(char[] fnsPldRdRejRsn1Cd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fnsPldRdRejRsn1Cd,0,getStringValue(),beginFnsPldRdRejRsn1Cd,FNS_PLD_RD_REJ_RSN_1_CD_LEN);
       localFnsPldRdRejRsn1CdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFnsPldRdRejRsn1CdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshFnsPldRdRejRsn1Cd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFnsPldRdRejRsn1Cd() {	 
   		return (substring(getStringValue(),beginFnsPldRdRejRsn1Cd,beginFnsPldRdRejRsn1Cd + FNS_PLD_RD_REJ_RSN_1_CD_LEN));
   	}
     int localFnsPldRdRejRsn2CdCounter = -1;
     public boolean isFnsPldRdRejRsn2CdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFnsPldRdRejRsn2CdCounter != sharedCounter;
         localFnsPldRdRejRsn2CdCounter = sharedCounter; return hasModified;
     }
	protected static final int FNS_PLD_RD_REJ_RSN_2_CD_LEN = 4;
	/**
	 * 	serialize this FnsPldRdRejRsn2Cd
	 */
   protected void serializeFnsPldRdRejRsn2Cd(char[] fnsPldRdRejRsn2Cd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fnsPldRdRejRsn2Cd,0,getStringValue(),beginFnsPldRdRejRsn2Cd,FNS_PLD_RD_REJ_RSN_2_CD_LEN);
       localFnsPldRdRejRsn2CdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFnsPldRdRejRsn2CdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshFnsPldRdRejRsn2Cd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFnsPldRdRejRsn2Cd() {	 
   		return (substring(getStringValue(),beginFnsPldRdRejRsn2Cd,beginFnsPldRdRejRsn2Cd + FNS_PLD_RD_REJ_RSN_2_CD_LEN));
   	}
     int localFnsPldRdVrtlAcctNumCounter = -1;
     public boolean isFnsPldRdVrtlAcctNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFnsPldRdVrtlAcctNumCounter != sharedCounter;
         localFnsPldRdVrtlAcctNumCounter = sharedCounter; return hasModified;
     }
	protected static final int FNS_PLD_RD_VRTL_ACCT_NUM_LEN = 19;
	/**
	 * 	serialize this FnsPldRdVrtlAcctNum
	 */
   protected void serializeFnsPldRdVrtlAcctNum(char[] fnsPldRdVrtlAcctNum) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fnsPldRdVrtlAcctNum,0,getStringValue(),beginFnsPldRdVrtlAcctNum,FNS_PLD_RD_VRTL_ACCT_NUM_LEN);
       localFnsPldRdVrtlAcctNumCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFnsPldRdVrtlAcctNumConstraints(char[] value) {
   			return super.checkConstraints(value , 19 ,false, false);
   }
    /**
	 *	refreshFnsPldRdVrtlAcctNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFnsPldRdVrtlAcctNum() {	 
   		return (substring(getStringValue(),beginFnsPldRdVrtlAcctNum,beginFnsPldRdVrtlAcctNum + FNS_PLD_RD_VRTL_ACCT_NUM_LEN));
   	}




}
  
