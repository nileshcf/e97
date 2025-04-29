package com.cloudframe.app.ip829010.dto.serialize;

/**
*  The class Ip82921FacDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class Ip82921FacDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip82921FacDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_82921_FAC_DATA_LENGTH = 129;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp82921InsertTimestamp;
            protected  int beginIp82921CycleIndicator;
            protected  int beginIp82921MsgRsnCd;
            protected  int beginIp82921ChargebackAmt;
            protected  int beginIp82921ChargebackCurrCd;
            protected  int beginIp82921ChargebackExpCd;
            protected  int beginIp82921ReversalIndicator;
            protected  int beginIp82921ChargebackRefNo;
            protected  int beginIp82921FuncCd;
            protected  int beginIp82921SwitchSerialNum;
            protected  int beginIp82921SourceCd;
            protected  int beginIp82921CntCd;
            protected  int beginIp82921OrigSwSerNum;
            protected  int beginIp82921ChgbkCnt;
            protected  int beginIp82921RejRsn1Cd;
            protected  int beginIp82921RejRsn2Cd;
            protected  int beginIp82921VrtlAcctNum;
	
	/**
	* Constructor for Ip82921FacDataSerialized
	**/
    public Ip82921FacDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip82921FacDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip82921FacDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip82921FacDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,93); // serialize this field at offset 93 by default 
    }
    
	/**
	* sets parent for this Ip82921FacDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 93 by default
    }    
	/**
	* initializes the field in Ip82921FacDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_82921_FAC_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp82921InsertTimestamp = getStartOffset() + 0;	// set offset for serialization
  
             beginIp82921CycleIndicator = getStartOffset() + 26;	// set offset for serialization
  
             beginIp82921MsgRsnCd = getStartOffset() + 29;	// set offset for serialization
  
             beginIp82921ChargebackAmt = getStartOffset() + 34;	// set offset for serialization
  
             beginIp82921ChargebackCurrCd = getStartOffset() + 47;	// set offset for serialization
  
             beginIp82921ChargebackExpCd = getStartOffset() + 50;	// set offset for serialization
  
             beginIp82921ReversalIndicator = getStartOffset() + 51;	// set offset for serialization
  
             beginIp82921ChargebackRefNo = getStartOffset() + 52;	// set offset for serialization
  
             beginIp82921FuncCd = getStartOffset() + 62;	// set offset for serialization
  
             beginIp82921SwitchSerialNum = getStartOffset() + 65;	// set offset for serialization
  
             beginIp82921SourceCd = getStartOffset() + 74;	// set offset for serialization
  
             beginIp82921CntCd = getStartOffset() + 78;	// set offset for serialization
  
             beginIp82921OrigSwSerNum = getStartOffset() + 80;	// set offset for serialization
  
  
             beginIp82921ChgbkCnt = getStartOffset() + 99;	// set offset for serialization
  
             beginIp82921RejRsn1Cd = getStartOffset() + 102;	// set offset for serialization
  
             beginIp82921RejRsn2Cd = getStartOffset() + 106;	// set offset for serialization
  
             beginIp82921VrtlAcctNum = getStartOffset() + 110;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp82921InsertTimestampCounter = -1;
     public boolean isIp82921InsertTimestampModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp82921InsertTimestampCounter != sharedCounter;
         localIp82921InsertTimestampCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_82921_INSERT_TIMESTAMP_LEN = 26;
	/**
	 * 	serialize this Ip82921InsertTimestamp
	 */
   protected void serializeIp82921InsertTimestamp(char[] ip82921InsertTimestamp) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip82921InsertTimestamp,0,getStringValue(),beginIp82921InsertTimestamp,IP_82921_INSERT_TIMESTAMP_LEN);
       localIp82921InsertTimestampCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp82921InsertTimestampConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshIp82921InsertTimestamp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp82921InsertTimestamp() {	 
   		return (substring(getStringValue(),beginIp82921InsertTimestamp,beginIp82921InsertTimestamp + IP_82921_INSERT_TIMESTAMP_LEN));
   	}
     int localIp82921CycleIndicatorCounter = -1;
     public boolean isIp82921CycleIndicatorModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp82921CycleIndicatorCounter != sharedCounter;
         localIp82921CycleIndicatorCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip82921CycleIndicator
	 *	@return ip82921CycleIndicator
	 */
	public char[]  getIp82921CycleIndicatorString() {
	     return getCharArray(beginIp82921CycleIndicator,IP_82921_CYCLE_INDICATOR_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip82921CycleIndicatorIsNumeric() {
	    return isNumeric(beginIp82921CycleIndicator
	                    ,beginIp82921CycleIndicator + IP_82921_CYCLE_INDICATOR_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_82921_CYCLE_INDICATOR_LEN = 3;
  	/**
	 * serializeIp82921CycleIndicator
	 */
	protected void serializeIp82921CycleIndicator(int ip82921CycleIndicator) {
		 putNumber(beginIp82921CycleIndicator,ip82921CycleIndicator,IP_82921_CYCLE_INDICATOR_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp82921CycleIndicatorCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp82921CycleIndicator
	 */
   	protected  int serializeIp82921CycleIndicator(char[] value) {
	    int  ip82921CycleIndicator;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip82921CycleIndicator = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginIp82921CycleIndicator
		       ,3
		      );
		 localIp82921CycleIndicatorCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip82921CycleIndicator;
    }

   protected int checkIp82921CycleIndicatorMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp82921CycleIndicator is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp82921CycleIndicator() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp82921CycleIndicator
			                 ,IP_82921_CYCLE_INDICATOR_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip82921CycleIndicator", beginIp82921CycleIndicator,IP_82921_CYCLE_INDICATOR_LEN);
    }
   	}
     int localIp82921MsgRsnCdCounter = -1;
     public boolean isIp82921MsgRsnCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp82921MsgRsnCdCounter != sharedCounter;
         localIp82921MsgRsnCdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip82921MsgRsnCd
	 *	@return ip82921MsgRsnCd
	 */
	public char[]  getIp82921MsgRsnCdString() {
	     return getCharArray(beginIp82921MsgRsnCd,IP_82921_MSG_RSN_CD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip82921MsgRsnCdIsNumeric() {
	    return isNumeric(beginIp82921MsgRsnCd
	                    ,beginIp82921MsgRsnCd + IP_82921_MSG_RSN_CD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_82921_MSG_RSN_CD_LEN = 5;
  	/**
	 * serializeIp82921MsgRsnCd
	 */
	protected void serializeIp82921MsgRsnCd(long ip82921MsgRsnCd) {
		 putNumber(beginIp82921MsgRsnCd,ip82921MsgRsnCd,IP_82921_MSG_RSN_CD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp82921MsgRsnCdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp82921MsgRsnCd
	 */
   	protected  long serializeIp82921MsgRsnCd(char[] value) {
	    long  ip82921MsgRsnCd;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip82921MsgRsnCd = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginIp82921MsgRsnCd
		       ,5
		      );
		 localIp82921MsgRsnCdCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip82921MsgRsnCd;
    }

   protected long checkIp82921MsgRsnCdMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp82921MsgRsnCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp82921MsgRsnCd() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp82921MsgRsnCd
			                 ,IP_82921_MSG_RSN_CD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip82921MsgRsnCd", beginIp82921MsgRsnCd,IP_82921_MSG_RSN_CD_LEN);
    }
   	}
     int localIp82921ChargebackAmtCounter = -1;
     public boolean isIp82921ChargebackAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp82921ChargebackAmtCounter != sharedCounter;
         localIp82921ChargebackAmtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip82921ChargebackAmt
	 *	@return ip82921ChargebackAmt
	 */
	public char[]  getIp82921ChargebackAmtString() {
	     return getCharArray(beginIp82921ChargebackAmt,IP_82921_CHARGEBACK_AMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip82921ChargebackAmtIsNumeric() {
	    return isNumeric(beginIp82921ChargebackAmt
	                    ,beginIp82921ChargebackAmt + IP_82921_CHARGEBACK_AMT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_82921_CHARGEBACK_AMT_LEN = 13;
  	/**
	 * serializeIp82921ChargebackAmt
	 */
	protected void serializeIp82921ChargebackAmt(long ip82921ChargebackAmt) {
		 putNumber(beginIp82921ChargebackAmt,ip82921ChargebackAmt,IP_82921_CHARGEBACK_AMT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp82921ChargebackAmtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp82921ChargebackAmt
	 */
   	protected  long serializeIp82921ChargebackAmt(char[] value) {
	    long  ip82921ChargebackAmt;
	    if(value.length >0 && value.length!= 13)
            value = new String(value).trim().toCharArray();
	    if (value.length < 13) value = pad(13, value, ' ', LEFT_PAD);
	    else if (value.length > 13) value = substring(value,0,13);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip82921ChargebackAmt = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(13,value,false/*isSigned?*/)
		       ,beginIp82921ChargebackAmt
		       ,13
		      );
		 localIp82921ChargebackAmtCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip82921ChargebackAmt;
    }

   protected long checkIp82921ChargebackAmtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_10T/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp82921ChargebackAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp82921ChargebackAmt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp82921ChargebackAmt
			                 ,IP_82921_CHARGEBACK_AMT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip82921ChargebackAmt", beginIp82921ChargebackAmt,IP_82921_CHARGEBACK_AMT_LEN);
    }
   	}
     int localIp82921ChargebackCurrCdCounter = -1;
     public boolean isIp82921ChargebackCurrCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp82921ChargebackCurrCdCounter != sharedCounter;
         localIp82921ChargebackCurrCdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip82921ChargebackCurrCd
	 *	@return ip82921ChargebackCurrCd
	 */
	public char[]  getIp82921ChargebackCurrCdString() {
	     return getCharArray(beginIp82921ChargebackCurrCd,IP_82921_CHARGEBACK_CURR_CD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip82921ChargebackCurrCdIsNumeric() {
	    return isNumeric(beginIp82921ChargebackCurrCd
	                    ,beginIp82921ChargebackCurrCd + IP_82921_CHARGEBACK_CURR_CD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_82921_CHARGEBACK_CURR_CD_LEN = 3;
  	/**
	 * serializeIp82921ChargebackCurrCd
	 */
	protected void serializeIp82921ChargebackCurrCd(int ip82921ChargebackCurrCd) {
		 putNumber(beginIp82921ChargebackCurrCd,ip82921ChargebackCurrCd,IP_82921_CHARGEBACK_CURR_CD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp82921ChargebackCurrCdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp82921ChargebackCurrCd
	 */
   	protected  int serializeIp82921ChargebackCurrCd(char[] value) {
	    int  ip82921ChargebackCurrCd;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip82921ChargebackCurrCd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginIp82921ChargebackCurrCd
		       ,3
		      );
		 localIp82921ChargebackCurrCdCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip82921ChargebackCurrCd;
    }

   protected int checkIp82921ChargebackCurrCdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp82921ChargebackCurrCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp82921ChargebackCurrCd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp82921ChargebackCurrCd
			                 ,IP_82921_CHARGEBACK_CURR_CD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip82921ChargebackCurrCd", beginIp82921ChargebackCurrCd,IP_82921_CHARGEBACK_CURR_CD_LEN);
    }
   	}
     int localIp82921ChargebackExpCdCounter = -1;
     public boolean isIp82921ChargebackExpCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp82921ChargebackExpCdCounter != sharedCounter;
         localIp82921ChargebackExpCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_82921_CHARGEBACK_EXP_CD_LEN = 1;
	/**
	 * 	serialize this Ip82921ChargebackExpCd
	 */
   protected void serializeIp82921ChargebackExpCd(char[] ip82921ChargebackExpCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip82921ChargebackExpCd,0,getStringValue(),beginIp82921ChargebackExpCd,IP_82921_CHARGEBACK_EXP_CD_LEN);
       localIp82921ChargebackExpCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp82921ChargebackExpCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp82921ChargebackExpCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp82921ChargebackExpCd() {	 
   		return (substring(getStringValue(),beginIp82921ChargebackExpCd,beginIp82921ChargebackExpCd + IP_82921_CHARGEBACK_EXP_CD_LEN));
   	}
     int localIp82921ReversalIndicatorCounter = -1;
     public boolean isIp82921ReversalIndicatorModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp82921ReversalIndicatorCounter != sharedCounter;
         localIp82921ReversalIndicatorCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_82921_REVERSAL_INDICATOR_LEN = 1;
	/**
	 * 	serialize this Ip82921ReversalIndicator
	 */
   protected void serializeIp82921ReversalIndicator(char[] ip82921ReversalIndicator) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip82921ReversalIndicator,0,getStringValue(),beginIp82921ReversalIndicator,IP_82921_REVERSAL_INDICATOR_LEN);
       localIp82921ReversalIndicatorCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp82921ReversalIndicatorConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp82921ReversalIndicator is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp82921ReversalIndicator() {	 
   		return (substring(getStringValue(),beginIp82921ReversalIndicator,beginIp82921ReversalIndicator + IP_82921_REVERSAL_INDICATOR_LEN));
   	}
     int localIp82921ChargebackRefNoCounter = -1;
     public boolean isIp82921ChargebackRefNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp82921ChargebackRefNoCounter != sharedCounter;
         localIp82921ChargebackRefNoCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_82921_CHARGEBACK_REF_NO_LEN = 10;
	/**
	 * 	serialize this Ip82921ChargebackRefNo
	 */
   protected void serializeIp82921ChargebackRefNo(char[] ip82921ChargebackRefNo) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip82921ChargebackRefNo,0,getStringValue(),beginIp82921ChargebackRefNo,IP_82921_CHARGEBACK_REF_NO_LEN);
       localIp82921ChargebackRefNoCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp82921ChargebackRefNoConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshIp82921ChargebackRefNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp82921ChargebackRefNo() {	 
   		return (substring(getStringValue(),beginIp82921ChargebackRefNo,beginIp82921ChargebackRefNo + IP_82921_CHARGEBACK_REF_NO_LEN));
   	}
     int localIp82921FuncCdCounter = -1;
     public boolean isIp82921FuncCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp82921FuncCdCounter != sharedCounter;
         localIp82921FuncCdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip82921FuncCd
	 *	@return ip82921FuncCd
	 */
	public char[]  getIp82921FuncCdString() {
	     return getCharArray(beginIp82921FuncCd,IP_82921_FUNC_CD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip82921FuncCdIsNumeric() {
	    return isNumeric(beginIp82921FuncCd
	                    ,beginIp82921FuncCd + IP_82921_FUNC_CD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_82921_FUNC_CD_LEN = 3;
  	/**
	 * serializeIp82921FuncCd
	 */
	protected void serializeIp82921FuncCd(int ip82921FuncCd) {
		 putNumber(beginIp82921FuncCd,ip82921FuncCd,IP_82921_FUNC_CD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp82921FuncCdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp82921FuncCd
	 */
   	protected  int serializeIp82921FuncCd(char[] value) {
	    int  ip82921FuncCd;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip82921FuncCd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginIp82921FuncCd
		       ,3
		      );
		 localIp82921FuncCdCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip82921FuncCd;
    }

   protected int checkIp82921FuncCdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp82921FuncCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp82921FuncCd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp82921FuncCd
			                 ,IP_82921_FUNC_CD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip82921FuncCd", beginIp82921FuncCd,IP_82921_FUNC_CD_LEN);
    }
   	}
     int localIp82921SwitchSerialNumCounter = -1;
     public boolean isIp82921SwitchSerialNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp82921SwitchSerialNumCounter != sharedCounter;
         localIp82921SwitchSerialNumCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_82921_SWITCH_SERIAL_NUM_LEN = 9;
	/**
	 * 	serialize this Ip82921SwitchSerialNum
	 */
   protected void serializeIp82921SwitchSerialNum(char[] ip82921SwitchSerialNum) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip82921SwitchSerialNum,0,getStringValue(),beginIp82921SwitchSerialNum,IP_82921_SWITCH_SERIAL_NUM_LEN);
       localIp82921SwitchSerialNumCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp82921SwitchSerialNumConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshIp82921SwitchSerialNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp82921SwitchSerialNum() {	 
   		return (substring(getStringValue(),beginIp82921SwitchSerialNum,beginIp82921SwitchSerialNum + IP_82921_SWITCH_SERIAL_NUM_LEN));
   	}
     int localIp82921SourceCdCounter = -1;
     public boolean isIp82921SourceCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp82921SourceCdCounter != sharedCounter;
         localIp82921SourceCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_82921_SOURCE_CD_LEN = 4;
	/**
	 * 	serialize this Ip82921SourceCd
	 */
   protected void serializeIp82921SourceCd(char[] ip82921SourceCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip82921SourceCd,0,getStringValue(),beginIp82921SourceCd,IP_82921_SOURCE_CD_LEN);
       localIp82921SourceCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp82921SourceCdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp82921SourceCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp82921SourceCd() {	 
   		return (substring(getStringValue(),beginIp82921SourceCd,beginIp82921SourceCd + IP_82921_SOURCE_CD_LEN));
   	}
        int localIp82921CntCdCounter = -1;
        public boolean isIp82921CntCdModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localIp82921CntCdCounter != sharedCounter;
           localIp82921CntCdCounter = sharedCounter; return hasModified; 
        }
	    public boolean ip82921CntCdIsNumeric() {
	      return decimalIsNumeric(beginIp82921CntCd,IP_82921_CNT_CD_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int IP_82921_CNT_CD_LEN = 2;
  	/**
	 * 	serializeIp82921CntCd
	 */
	protected void serializeIp82921CntCd(short ip82921CntCd) {
		   putDecimal(beginIp82921CntCd,ip82921CntCd,IP_82921_CNT_CD_LEN,true);
   }
   

   protected short checkIp82921CntCdMaxLimit(long number) {
	   return (short)checkMaxLimit(number , MAX_1000 /*limit*/  , true /*isSigned*/);
   }

     /**
	 *	refreshIp82921CntCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp82921CntCd() throws CFException {	
   	try { 
		 return (getShortDecimal(beginIp82921CntCd,IP_82921_CNT_CD_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("ip82921CntCd", beginIp82921CntCd,IP_82921_CNT_CD_LEN);
     }
   	}
     int localIp82921OrigSwSerNumCounter = -1;
     public boolean isIp82921OrigSwSerNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp82921OrigSwSerNumCounter != sharedCounter;
         localIp82921OrigSwSerNumCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_82921_ORIG_SW_SER_NUM_LEN = 9;
	/**
	 * 	serialize this Ip82921OrigSwSerNum
	 */
   protected void serializeIp82921OrigSwSerNum(char[] ip82921OrigSwSerNum) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip82921OrigSwSerNum,0,getStringValue(),beginIp82921OrigSwSerNum,IP_82921_ORIG_SW_SER_NUM_LEN);
       localIp82921OrigSwSerNumCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp82921OrigSwSerNumConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshIp82921OrigSwSerNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp82921OrigSwSerNum() {	 
   		return (substring(getStringValue(),beginIp82921OrigSwSerNum,beginIp82921OrigSwSerNum + IP_82921_ORIG_SW_SER_NUM_LEN));
   	}
     int localIp82921ChgbkCntCounter = -1;
     public boolean isIp82921ChgbkCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp82921ChgbkCntCounter != sharedCounter;
         localIp82921ChgbkCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip82921ChgbkCnt
	 *	@return ip82921ChgbkCnt
	 */
	public char[]  getIp82921ChgbkCntString() {
	     return getCharArray(beginIp82921ChgbkCnt,IP_82921_CHGBK_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip82921ChgbkCntIsNumeric() {
	    return isNumeric(beginIp82921ChgbkCnt
	                    ,beginIp82921ChgbkCnt + IP_82921_CHGBK_CNT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_82921_CHGBK_CNT_LEN = 3;
  	/**
	 * serializeIp82921ChgbkCnt
	 */
	protected void serializeIp82921ChgbkCnt(int ip82921ChgbkCnt) {
		 putNumber(beginIp82921ChgbkCnt,ip82921ChgbkCnt,IP_82921_CHGBK_CNT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp82921ChgbkCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp82921ChgbkCnt
	 */
   	protected  int serializeIp82921ChgbkCnt(char[] value) {
	    int  ip82921ChgbkCnt;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip82921ChgbkCnt = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginIp82921ChgbkCnt
		       ,3
		      );
		 localIp82921ChgbkCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip82921ChgbkCnt;
    }

   protected int checkIp82921ChgbkCntMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp82921ChgbkCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp82921ChgbkCnt() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp82921ChgbkCnt
			                 ,IP_82921_CHGBK_CNT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip82921ChgbkCnt", beginIp82921ChgbkCnt,IP_82921_CHGBK_CNT_LEN);
    }
   	}
     int localIp82921RejRsn1CdCounter = -1;
     public boolean isIp82921RejRsn1CdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp82921RejRsn1CdCounter != sharedCounter;
         localIp82921RejRsn1CdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_82921_REJ_RSN_1_CD_LEN = 4;
	/**
	 * 	serialize this Ip82921RejRsn1Cd
	 */
   protected void serializeIp82921RejRsn1Cd(char[] ip82921RejRsn1Cd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip82921RejRsn1Cd,0,getStringValue(),beginIp82921RejRsn1Cd,IP_82921_REJ_RSN_1_CD_LEN);
       localIp82921RejRsn1CdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp82921RejRsn1CdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp82921RejRsn1Cd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp82921RejRsn1Cd() {	 
   		return (substring(getStringValue(),beginIp82921RejRsn1Cd,beginIp82921RejRsn1Cd + IP_82921_REJ_RSN_1_CD_LEN));
   	}
     int localIp82921RejRsn2CdCounter = -1;
     public boolean isIp82921RejRsn2CdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp82921RejRsn2CdCounter != sharedCounter;
         localIp82921RejRsn2CdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_82921_REJ_RSN_2_CD_LEN = 4;
	/**
	 * 	serialize this Ip82921RejRsn2Cd
	 */
   protected void serializeIp82921RejRsn2Cd(char[] ip82921RejRsn2Cd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip82921RejRsn2Cd,0,getStringValue(),beginIp82921RejRsn2Cd,IP_82921_REJ_RSN_2_CD_LEN);
       localIp82921RejRsn2CdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp82921RejRsn2CdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp82921RejRsn2Cd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp82921RejRsn2Cd() {	 
   		return (substring(getStringValue(),beginIp82921RejRsn2Cd,beginIp82921RejRsn2Cd + IP_82921_REJ_RSN_2_CD_LEN));
   	}
     int localIp82921VrtlAcctNumCounter = -1;
     public boolean isIp82921VrtlAcctNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp82921VrtlAcctNumCounter != sharedCounter;
         localIp82921VrtlAcctNumCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_82921_VRTL_ACCT_NUM_LEN = 19;
	/**
	 * 	serialize this Ip82921VrtlAcctNum
	 */
   protected void serializeIp82921VrtlAcctNum(char[] ip82921VrtlAcctNum) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip82921VrtlAcctNum,0,getStringValue(),beginIp82921VrtlAcctNum,IP_82921_VRTL_ACCT_NUM_LEN);
       localIp82921VrtlAcctNumCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp82921VrtlAcctNumConstraints(char[] value) {
   			return super.checkConstraints(value , 19 ,false, false);
   }
    /**
	 *	refreshIp82921VrtlAcctNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp82921VrtlAcctNum() {	 
   		return (substring(getStringValue(),beginIp82921VrtlAcctNum,beginIp82921VrtlAcctNum + IP_82921_VRTL_ACCT_NUM_LEN));
   	}




}
  
