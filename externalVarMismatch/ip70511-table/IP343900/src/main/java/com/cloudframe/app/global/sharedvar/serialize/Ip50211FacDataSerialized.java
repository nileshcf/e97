package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip50211FacDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class Ip50211FacDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip50211FacDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_50211_FAC_DATA_LENGTH = 129;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp50211InsertTimestamp;
            protected  int beginIp50211CycleIndicator;
            protected  int beginIp50211MsgRsnCd;
            protected  int beginIp50211ChargebackAmt;
            protected  int beginIp50211ChargebackCurrCd;
            protected  int beginIp50211ChargebackExpCd;
            protected  int beginIp50211ReversalIndicator;
            protected  int beginIp50211ChargebackRefNo;
            protected  int beginIp50211FuncCd;
            protected  int beginIp50211SwitchSerialNum;
            protected  int beginIp50211SourceCd;
            protected  int beginIp50211CntCd;
            protected  int beginIp50211OrigSwSerNum;
            protected  int beginIp50211ChgbkCnt;
            protected  int beginIp50211RejRsn1Cd;
            protected  int beginIp50211RejRsn2Cd;
            protected  int beginIp50211VrtlAcctNum;
	
	/**
	* Constructor for Ip50211FacDataSerialized
	**/
    public Ip50211FacDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip50211FacDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip50211FacDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip50211FacDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,25); // serialize this field at offset 25 by default 
    }
    
	/**
	* sets parent for this Ip50211FacDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 25 by default
    }    
	/**
	* initializes the field in Ip50211FacDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_50211_FAC_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp50211InsertTimestamp = getStartOffset() + 0;	// set offset for serialization
  
             beginIp50211CycleIndicator = getStartOffset() + 26;	// set offset for serialization
  
             beginIp50211MsgRsnCd = getStartOffset() + 29;	// set offset for serialization
  
             beginIp50211ChargebackAmt = getStartOffset() + 34;	// set offset for serialization
  
             beginIp50211ChargebackCurrCd = getStartOffset() + 47;	// set offset for serialization
  
             beginIp50211ChargebackExpCd = getStartOffset() + 50;	// set offset for serialization
  
             beginIp50211ReversalIndicator = getStartOffset() + 51;	// set offset for serialization
  
             beginIp50211ChargebackRefNo = getStartOffset() + 52;	// set offset for serialization
  
             beginIp50211FuncCd = getStartOffset() + 62;	// set offset for serialization
  
             beginIp50211SwitchSerialNum = getStartOffset() + 65;	// set offset for serialization
  
             beginIp50211SourceCd = getStartOffset() + 74;	// set offset for serialization
  
             beginIp50211CntCd = getStartOffset() + 78;	// set offset for serialization
  
             beginIp50211OrigSwSerNum = getStartOffset() + 80;	// set offset for serialization
  
  
             beginIp50211ChgbkCnt = getStartOffset() + 99;	// set offset for serialization
  
             beginIp50211RejRsn1Cd = getStartOffset() + 102;	// set offset for serialization
  
             beginIp50211RejRsn2Cd = getStartOffset() + 106;	// set offset for serialization
  
             beginIp50211VrtlAcctNum = getStartOffset() + 110;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp50211InsertTimestampCounter = -1;
     public boolean isIp50211InsertTimestampModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp50211InsertTimestampCounter != sharedCounter;
         localIp50211InsertTimestampCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_50211_INSERT_TIMESTAMP_LEN = 26;
	/**
	 * 	serialize this Ip50211InsertTimestamp
	 */
   protected void serializeIp50211InsertTimestamp(char[] ip50211InsertTimestamp) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip50211InsertTimestamp,0,getStringValue(),beginIp50211InsertTimestamp,IP_50211_INSERT_TIMESTAMP_LEN);
       localIp50211InsertTimestampCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp50211InsertTimestampConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshIp50211InsertTimestamp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp50211InsertTimestamp() {	 
   		return (substring(getStringValue(),beginIp50211InsertTimestamp,beginIp50211InsertTimestamp + IP_50211_INSERT_TIMESTAMP_LEN));
   	}
     int localIp50211CycleIndicatorCounter = -1;
     public boolean isIp50211CycleIndicatorModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp50211CycleIndicatorCounter != sharedCounter;
         localIp50211CycleIndicatorCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip50211CycleIndicator
	 *	@return ip50211CycleIndicator
	 */
	public char[]  getIp50211CycleIndicatorString() {
	     return getCharArray(beginIp50211CycleIndicator,IP_50211_CYCLE_INDICATOR_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip50211CycleIndicatorIsNumeric() {
	    return isNumeric(beginIp50211CycleIndicator
	                    ,beginIp50211CycleIndicator + IP_50211_CYCLE_INDICATOR_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_50211_CYCLE_INDICATOR_LEN = 3;
  	/**
	 * serializeIp50211CycleIndicator
	 */
	protected void serializeIp50211CycleIndicator(int ip50211CycleIndicator) {
		 putNumber(beginIp50211CycleIndicator,ip50211CycleIndicator,IP_50211_CYCLE_INDICATOR_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp50211CycleIndicatorCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp50211CycleIndicator
	 */
   	protected  int serializeIp50211CycleIndicator(char[] value) {
	    int  ip50211CycleIndicator;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip50211CycleIndicator = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginIp50211CycleIndicator
		       ,3
		      );
		 localIp50211CycleIndicatorCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip50211CycleIndicator;
    }

   protected int checkIp50211CycleIndicatorMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp50211CycleIndicator is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp50211CycleIndicator() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp50211CycleIndicator
			                 ,IP_50211_CYCLE_INDICATOR_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip50211CycleIndicator", beginIp50211CycleIndicator,IP_50211_CYCLE_INDICATOR_LEN);
    }
   	}
     int localIp50211MsgRsnCdCounter = -1;
     public boolean isIp50211MsgRsnCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp50211MsgRsnCdCounter != sharedCounter;
         localIp50211MsgRsnCdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip50211MsgRsnCd
	 *	@return ip50211MsgRsnCd
	 */
	public char[]  getIp50211MsgRsnCdString() {
	     return getCharArray(beginIp50211MsgRsnCd,IP_50211_MSG_RSN_CD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip50211MsgRsnCdIsNumeric() {
	    return isNumeric(beginIp50211MsgRsnCd
	                    ,beginIp50211MsgRsnCd + IP_50211_MSG_RSN_CD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_50211_MSG_RSN_CD_LEN = 5;
  	/**
	 * serializeIp50211MsgRsnCd
	 */
	protected void serializeIp50211MsgRsnCd(long ip50211MsgRsnCd) {
		 putNumber(beginIp50211MsgRsnCd,ip50211MsgRsnCd,IP_50211_MSG_RSN_CD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp50211MsgRsnCdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp50211MsgRsnCd
	 */
   	protected  long serializeIp50211MsgRsnCd(char[] value) {
	    long  ip50211MsgRsnCd;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip50211MsgRsnCd = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginIp50211MsgRsnCd
		       ,5
		      );
		 localIp50211MsgRsnCdCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip50211MsgRsnCd;
    }

   protected long checkIp50211MsgRsnCdMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp50211MsgRsnCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp50211MsgRsnCd() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp50211MsgRsnCd
			                 ,IP_50211_MSG_RSN_CD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip50211MsgRsnCd", beginIp50211MsgRsnCd,IP_50211_MSG_RSN_CD_LEN);
    }
   	}
     int localIp50211ChargebackAmtCounter = -1;
     public boolean isIp50211ChargebackAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp50211ChargebackAmtCounter != sharedCounter;
         localIp50211ChargebackAmtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip50211ChargebackAmt
	 *	@return ip50211ChargebackAmt
	 */
	public char[]  getIp50211ChargebackAmtString() {
	     return getCharArray(beginIp50211ChargebackAmt,IP_50211_CHARGEBACK_AMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip50211ChargebackAmtIsNumeric() {
	    return isNumeric(beginIp50211ChargebackAmt
	                    ,beginIp50211ChargebackAmt + IP_50211_CHARGEBACK_AMT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_50211_CHARGEBACK_AMT_LEN = 13;
  	/**
	 * serializeIp50211ChargebackAmt
	 */
	protected void serializeIp50211ChargebackAmt(long ip50211ChargebackAmt) {
		 putNumber(beginIp50211ChargebackAmt,ip50211ChargebackAmt,IP_50211_CHARGEBACK_AMT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp50211ChargebackAmtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp50211ChargebackAmt
	 */
   	protected  long serializeIp50211ChargebackAmt(char[] value) {
	    long  ip50211ChargebackAmt;
	    if(value.length >0 && value.length!= 13)
            value = new String(value).trim().toCharArray();
	    if (value.length < 13) value = pad(13, value, ' ', LEFT_PAD);
	    else if (value.length > 13) value = substring(value,0,13);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip50211ChargebackAmt = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(13,value,false/*isSigned?*/)
		       ,beginIp50211ChargebackAmt
		       ,13
		      );
		 localIp50211ChargebackAmtCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip50211ChargebackAmt;
    }

   protected long checkIp50211ChargebackAmtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_10T/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp50211ChargebackAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp50211ChargebackAmt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp50211ChargebackAmt
			                 ,IP_50211_CHARGEBACK_AMT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip50211ChargebackAmt", beginIp50211ChargebackAmt,IP_50211_CHARGEBACK_AMT_LEN);
    }
   	}
     int localIp50211ChargebackCurrCdCounter = -1;
     public boolean isIp50211ChargebackCurrCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp50211ChargebackCurrCdCounter != sharedCounter;
         localIp50211ChargebackCurrCdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip50211ChargebackCurrCd
	 *	@return ip50211ChargebackCurrCd
	 */
	public char[]  getIp50211ChargebackCurrCdString() {
	     return getCharArray(beginIp50211ChargebackCurrCd,IP_50211_CHARGEBACK_CURR_CD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip50211ChargebackCurrCdIsNumeric() {
	    return isNumeric(beginIp50211ChargebackCurrCd
	                    ,beginIp50211ChargebackCurrCd + IP_50211_CHARGEBACK_CURR_CD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_50211_CHARGEBACK_CURR_CD_LEN = 3;
  	/**
	 * serializeIp50211ChargebackCurrCd
	 */
	protected void serializeIp50211ChargebackCurrCd(int ip50211ChargebackCurrCd) {
		 putNumber(beginIp50211ChargebackCurrCd,ip50211ChargebackCurrCd,IP_50211_CHARGEBACK_CURR_CD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp50211ChargebackCurrCdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp50211ChargebackCurrCd
	 */
   	protected  int serializeIp50211ChargebackCurrCd(char[] value) {
	    int  ip50211ChargebackCurrCd;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip50211ChargebackCurrCd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginIp50211ChargebackCurrCd
		       ,3
		      );
		 localIp50211ChargebackCurrCdCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip50211ChargebackCurrCd;
    }

   protected int checkIp50211ChargebackCurrCdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp50211ChargebackCurrCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp50211ChargebackCurrCd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp50211ChargebackCurrCd
			                 ,IP_50211_CHARGEBACK_CURR_CD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip50211ChargebackCurrCd", beginIp50211ChargebackCurrCd,IP_50211_CHARGEBACK_CURR_CD_LEN);
    }
   	}
     int localIp50211ChargebackExpCdCounter = -1;
     public boolean isIp50211ChargebackExpCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp50211ChargebackExpCdCounter != sharedCounter;
         localIp50211ChargebackExpCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_50211_CHARGEBACK_EXP_CD_LEN = 1;
	/**
	 * 	serialize this Ip50211ChargebackExpCd
	 */
   protected void serializeIp50211ChargebackExpCd(char[] ip50211ChargebackExpCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip50211ChargebackExpCd,0,getStringValue(),beginIp50211ChargebackExpCd,IP_50211_CHARGEBACK_EXP_CD_LEN);
       localIp50211ChargebackExpCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp50211ChargebackExpCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp50211ChargebackExpCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp50211ChargebackExpCd() {	 
   		return (substring(getStringValue(),beginIp50211ChargebackExpCd,beginIp50211ChargebackExpCd + IP_50211_CHARGEBACK_EXP_CD_LEN));
   	}
     int localIp50211ReversalIndicatorCounter = -1;
     public boolean isIp50211ReversalIndicatorModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp50211ReversalIndicatorCounter != sharedCounter;
         localIp50211ReversalIndicatorCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_50211_REVERSAL_INDICATOR_LEN = 1;
	/**
	 * 	serialize this Ip50211ReversalIndicator
	 */
   protected void serializeIp50211ReversalIndicator(char[] ip50211ReversalIndicator) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip50211ReversalIndicator,0,getStringValue(),beginIp50211ReversalIndicator,IP_50211_REVERSAL_INDICATOR_LEN);
       localIp50211ReversalIndicatorCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp50211ReversalIndicatorConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp50211ReversalIndicator is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp50211ReversalIndicator() {	 
   		return (substring(getStringValue(),beginIp50211ReversalIndicator,beginIp50211ReversalIndicator + IP_50211_REVERSAL_INDICATOR_LEN));
   	}
     int localIp50211ChargebackRefNoCounter = -1;
     public boolean isIp50211ChargebackRefNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp50211ChargebackRefNoCounter != sharedCounter;
         localIp50211ChargebackRefNoCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_50211_CHARGEBACK_REF_NO_LEN = 10;
	/**
	 * 	serialize this Ip50211ChargebackRefNo
	 */
   protected void serializeIp50211ChargebackRefNo(char[] ip50211ChargebackRefNo) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip50211ChargebackRefNo,0,getStringValue(),beginIp50211ChargebackRefNo,IP_50211_CHARGEBACK_REF_NO_LEN);
       localIp50211ChargebackRefNoCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp50211ChargebackRefNoConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshIp50211ChargebackRefNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp50211ChargebackRefNo() {	 
   		return (substring(getStringValue(),beginIp50211ChargebackRefNo,beginIp50211ChargebackRefNo + IP_50211_CHARGEBACK_REF_NO_LEN));
   	}
     int localIp50211FuncCdCounter = -1;
     public boolean isIp50211FuncCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp50211FuncCdCounter != sharedCounter;
         localIp50211FuncCdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip50211FuncCd
	 *	@return ip50211FuncCd
	 */
	public char[]  getIp50211FuncCdString() {
	     return getCharArray(beginIp50211FuncCd,IP_50211_FUNC_CD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip50211FuncCdIsNumeric() {
	    return isNumeric(beginIp50211FuncCd
	                    ,beginIp50211FuncCd + IP_50211_FUNC_CD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_50211_FUNC_CD_LEN = 3;
  	/**
	 * serializeIp50211FuncCd
	 */
	protected void serializeIp50211FuncCd(int ip50211FuncCd) {
		 putNumber(beginIp50211FuncCd,ip50211FuncCd,IP_50211_FUNC_CD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp50211FuncCdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp50211FuncCd
	 */
   	protected  int serializeIp50211FuncCd(char[] value) {
	    int  ip50211FuncCd;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip50211FuncCd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginIp50211FuncCd
		       ,3
		      );
		 localIp50211FuncCdCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip50211FuncCd;
    }

   protected int checkIp50211FuncCdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp50211FuncCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp50211FuncCd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp50211FuncCd
			                 ,IP_50211_FUNC_CD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip50211FuncCd", beginIp50211FuncCd,IP_50211_FUNC_CD_LEN);
    }
   	}
     int localIp50211SwitchSerialNumCounter = -1;
     public boolean isIp50211SwitchSerialNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp50211SwitchSerialNumCounter != sharedCounter;
         localIp50211SwitchSerialNumCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_50211_SWITCH_SERIAL_NUM_LEN = 9;
	/**
	 * 	serialize this Ip50211SwitchSerialNum
	 */
   protected void serializeIp50211SwitchSerialNum(char[] ip50211SwitchSerialNum) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip50211SwitchSerialNum,0,getStringValue(),beginIp50211SwitchSerialNum,IP_50211_SWITCH_SERIAL_NUM_LEN);
       localIp50211SwitchSerialNumCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp50211SwitchSerialNumConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshIp50211SwitchSerialNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp50211SwitchSerialNum() {	 
   		return (substring(getStringValue(),beginIp50211SwitchSerialNum,beginIp50211SwitchSerialNum + IP_50211_SWITCH_SERIAL_NUM_LEN));
   	}
     int localIp50211SourceCdCounter = -1;
     public boolean isIp50211SourceCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp50211SourceCdCounter != sharedCounter;
         localIp50211SourceCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_50211_SOURCE_CD_LEN = 4;
	/**
	 * 	serialize this Ip50211SourceCd
	 */
   protected void serializeIp50211SourceCd(char[] ip50211SourceCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip50211SourceCd,0,getStringValue(),beginIp50211SourceCd,IP_50211_SOURCE_CD_LEN);
       localIp50211SourceCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp50211SourceCdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp50211SourceCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp50211SourceCd() {	 
   		return (substring(getStringValue(),beginIp50211SourceCd,beginIp50211SourceCd + IP_50211_SOURCE_CD_LEN));
   	}
        int localIp50211CntCdCounter = -1;
        public boolean isIp50211CntCdModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localIp50211CntCdCounter != sharedCounter;
           localIp50211CntCdCounter = sharedCounter; return hasModified; 
        }
	    public boolean ip50211CntCdIsNumeric() {
	      return decimalIsNumeric(beginIp50211CntCd,IP_50211_CNT_CD_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int IP_50211_CNT_CD_LEN = 2;
  	/**
	 * 	serializeIp50211CntCd
	 */
	protected void serializeIp50211CntCd(short ip50211CntCd) {
		   putDecimal(beginIp50211CntCd,ip50211CntCd,IP_50211_CNT_CD_LEN,true);
   }
   

   protected short checkIp50211CntCdMaxLimit(long number) {
	   return (short)checkMaxLimit(number , MAX_1000 /*limit*/  , true /*isSigned*/);
   }

     /**
	 *	refreshIp50211CntCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp50211CntCd() throws CFException {	
   	try { 
		 return (getShortDecimal(beginIp50211CntCd,IP_50211_CNT_CD_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("ip50211CntCd", beginIp50211CntCd,IP_50211_CNT_CD_LEN);
     }
   	}
     int localIp50211OrigSwSerNumCounter = -1;
     public boolean isIp50211OrigSwSerNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp50211OrigSwSerNumCounter != sharedCounter;
         localIp50211OrigSwSerNumCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_50211_ORIG_SW_SER_NUM_LEN = 9;
	/**
	 * 	serialize this Ip50211OrigSwSerNum
	 */
   protected void serializeIp50211OrigSwSerNum(char[] ip50211OrigSwSerNum) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip50211OrigSwSerNum,0,getStringValue(),beginIp50211OrigSwSerNum,IP_50211_ORIG_SW_SER_NUM_LEN);
       localIp50211OrigSwSerNumCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp50211OrigSwSerNumConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshIp50211OrigSwSerNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp50211OrigSwSerNum() {	 
   		return (substring(getStringValue(),beginIp50211OrigSwSerNum,beginIp50211OrigSwSerNum + IP_50211_ORIG_SW_SER_NUM_LEN));
   	}
     int localIp50211ChgbkCntCounter = -1;
     public boolean isIp50211ChgbkCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp50211ChgbkCntCounter != sharedCounter;
         localIp50211ChgbkCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip50211ChgbkCnt
	 *	@return ip50211ChgbkCnt
	 */
	public char[]  getIp50211ChgbkCntString() {
	     return getCharArray(beginIp50211ChgbkCnt,IP_50211_CHGBK_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip50211ChgbkCntIsNumeric() {
	    return isNumeric(beginIp50211ChgbkCnt
	                    ,beginIp50211ChgbkCnt + IP_50211_CHGBK_CNT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_50211_CHGBK_CNT_LEN = 3;
  	/**
	 * serializeIp50211ChgbkCnt
	 */
	protected void serializeIp50211ChgbkCnt(int ip50211ChgbkCnt) {
		 putNumber(beginIp50211ChgbkCnt,ip50211ChgbkCnt,IP_50211_CHGBK_CNT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp50211ChgbkCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp50211ChgbkCnt
	 */
   	protected  int serializeIp50211ChgbkCnt(char[] value) {
	    int  ip50211ChgbkCnt;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip50211ChgbkCnt = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginIp50211ChgbkCnt
		       ,3
		      );
		 localIp50211ChgbkCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip50211ChgbkCnt;
    }

   protected int checkIp50211ChgbkCntMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp50211ChgbkCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp50211ChgbkCnt() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp50211ChgbkCnt
			                 ,IP_50211_CHGBK_CNT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip50211ChgbkCnt", beginIp50211ChgbkCnt,IP_50211_CHGBK_CNT_LEN);
    }
   	}
     int localIp50211RejRsn1CdCounter = -1;
     public boolean isIp50211RejRsn1CdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp50211RejRsn1CdCounter != sharedCounter;
         localIp50211RejRsn1CdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_50211_REJ_RSN_1_CD_LEN = 4;
	/**
	 * 	serialize this Ip50211RejRsn1Cd
	 */
   protected void serializeIp50211RejRsn1Cd(char[] ip50211RejRsn1Cd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip50211RejRsn1Cd,0,getStringValue(),beginIp50211RejRsn1Cd,IP_50211_REJ_RSN_1_CD_LEN);
       localIp50211RejRsn1CdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp50211RejRsn1CdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp50211RejRsn1Cd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp50211RejRsn1Cd() {	 
   		return (substring(getStringValue(),beginIp50211RejRsn1Cd,beginIp50211RejRsn1Cd + IP_50211_REJ_RSN_1_CD_LEN));
   	}
     int localIp50211RejRsn2CdCounter = -1;
     public boolean isIp50211RejRsn2CdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp50211RejRsn2CdCounter != sharedCounter;
         localIp50211RejRsn2CdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_50211_REJ_RSN_2_CD_LEN = 4;
	/**
	 * 	serialize this Ip50211RejRsn2Cd
	 */
   protected void serializeIp50211RejRsn2Cd(char[] ip50211RejRsn2Cd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip50211RejRsn2Cd,0,getStringValue(),beginIp50211RejRsn2Cd,IP_50211_REJ_RSN_2_CD_LEN);
       localIp50211RejRsn2CdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp50211RejRsn2CdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp50211RejRsn2Cd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp50211RejRsn2Cd() {	 
   		return (substring(getStringValue(),beginIp50211RejRsn2Cd,beginIp50211RejRsn2Cd + IP_50211_REJ_RSN_2_CD_LEN));
   	}
     int localIp50211VrtlAcctNumCounter = -1;
     public boolean isIp50211VrtlAcctNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp50211VrtlAcctNumCounter != sharedCounter;
         localIp50211VrtlAcctNumCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_50211_VRTL_ACCT_NUM_LEN = 19;
	/**
	 * 	serialize this Ip50211VrtlAcctNum
	 */
   protected void serializeIp50211VrtlAcctNum(char[] ip50211VrtlAcctNum) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip50211VrtlAcctNum,0,getStringValue(),beginIp50211VrtlAcctNum,IP_50211_VRTL_ACCT_NUM_LEN);
       localIp50211VrtlAcctNumCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp50211VrtlAcctNumConstraints(char[] value) {
   			return super.checkConstraints(value , 19 ,false, false);
   }
    /**
	 *	refreshIp50211VrtlAcctNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp50211VrtlAcctNum() {	 
   		return (substring(getStringValue(),beginIp50211VrtlAcctNum,beginIp50211VrtlAcctNum + IP_50211_VRTL_ACCT_NUM_LEN));
   	}




}
  
