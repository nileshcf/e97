package com.cloudframe.app.sorttbl.dto.serialize;

/**
*  The class Ip00854wTableData01Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:31. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip00854wTableData01Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip00854wTableData01Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_00854W_TABLE_DATA_01_LENGTH = 17;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp00854wTxnCurrCd;
            protected  int beginIp00854wTxnCurrCdX;
            protected  int beginIp00854wReconCurrCd;
            protected  int beginIp00854wReconCurrCdX;
            protected  int beginIp00854wRuleEffDate;
	
	/**
	* Constructor for Ip00854wTableData01Serialized
	**/
    public Ip00854wTableData01Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip00854wTableData01Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00854wTableData01Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip00854wTableData01Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip00854wTableData01Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip00854wTableData01Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_00854W_TABLE_DATA_01_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp00854wTxnCurrCd = getStartOffset() + 0;	// set offset for serialization
  
             beginIp00854wTxnCurrCdX = getStartOffset() + 0;	// set offset for serialization
  
             beginIp00854wReconCurrCd = getStartOffset() + 3;	// set offset for serialization
  
             beginIp00854wReconCurrCdX = getStartOffset() + 3;	// set offset for serialization
  
             beginIp00854wRuleEffDate = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp00854wTxnCurrCdCounter = -1;
     public boolean isIp00854wTxnCurrCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00854wTxnCurrCdCounter != sharedCounter;
         localIp00854wTxnCurrCdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip00854wTxnCurrCd
	 *	@return ip00854wTxnCurrCd
	 */
	public char[]  getIp00854wTxnCurrCdString() {
	     return getCharArray(beginIp00854wTxnCurrCd,IP_00854W_TXN_CURR_CD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00854wTxnCurrCdIsNumeric() {
	    return isNumeric(beginIp00854wTxnCurrCd
	                    ,beginIp00854wTxnCurrCd + IP_00854W_TXN_CURR_CD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_00854W_TXN_CURR_CD_LEN = 3;
  	/**
	 * serializeIp00854wTxnCurrCd
	 */
	protected void serializeIp00854wTxnCurrCd(int ip00854wTxnCurrCd) {
		 putNumber(beginIp00854wTxnCurrCd,ip00854wTxnCurrCd,IP_00854W_TXN_CURR_CD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp00854wTxnCurrCdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp00854wTxnCurrCd
	 */
   	protected  int serializeIp00854wTxnCurrCd(char[] value) {
	    int  ip00854wTxnCurrCd;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip00854wTxnCurrCd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginIp00854wTxnCurrCd
		       ,3
		      );
		 localIp00854wTxnCurrCdCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip00854wTxnCurrCd;
    }

   protected int checkIp00854wTxnCurrCdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp00854wTxnCurrCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp00854wTxnCurrCd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp00854wTxnCurrCd
			                 ,IP_00854W_TXN_CURR_CD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip00854wTxnCurrCd", beginIp00854wTxnCurrCd,IP_00854W_TXN_CURR_CD_LEN);
    }
   	}
     int localIp00854wTxnCurrCdXCounter = -1;
     public boolean isIp00854wTxnCurrCdXModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00854wTxnCurrCdXCounter != sharedCounter;
         localIp00854wTxnCurrCdXCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00854W_TXN_CURR_CD_X_LEN = 3;
	/**
	 * 	serialize this Ip00854wTxnCurrCdX
	 */
   protected void serializeIp00854wTxnCurrCdX(char[] ip00854wTxnCurrCdX) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00854wTxnCurrCdX,0,getStringValue(),beginIp00854wTxnCurrCdX,IP_00854W_TXN_CURR_CD_X_LEN);
       localIp00854wTxnCurrCdXCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00854wTxnCurrCdXConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp00854wTxnCurrCdX is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00854wTxnCurrCdX() {	 
   		return (substring(getStringValue(),beginIp00854wTxnCurrCdX,beginIp00854wTxnCurrCdX + IP_00854W_TXN_CURR_CD_X_LEN));
   	}
     int localIp00854wReconCurrCdCounter = -1;
     public boolean isIp00854wReconCurrCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00854wReconCurrCdCounter != sharedCounter;
         localIp00854wReconCurrCdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip00854wReconCurrCd
	 *	@return ip00854wReconCurrCd
	 */
	public char[]  getIp00854wReconCurrCdString() {
	     return getCharArray(beginIp00854wReconCurrCd,IP_00854W_RECON_CURR_CD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00854wReconCurrCdIsNumeric() {
	    return isNumeric(beginIp00854wReconCurrCd
	                    ,beginIp00854wReconCurrCd + IP_00854W_RECON_CURR_CD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_00854W_RECON_CURR_CD_LEN = 3;
  	/**
	 * serializeIp00854wReconCurrCd
	 */
	protected void serializeIp00854wReconCurrCd(int ip00854wReconCurrCd) {
		 putNumber(beginIp00854wReconCurrCd,ip00854wReconCurrCd,IP_00854W_RECON_CURR_CD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp00854wReconCurrCdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp00854wReconCurrCd
	 */
   	protected  int serializeIp00854wReconCurrCd(char[] value) {
	    int  ip00854wReconCurrCd;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip00854wReconCurrCd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginIp00854wReconCurrCd
		       ,3
		      );
		 localIp00854wReconCurrCdCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip00854wReconCurrCd;
    }

   protected int checkIp00854wReconCurrCdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp00854wReconCurrCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp00854wReconCurrCd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp00854wReconCurrCd
			                 ,IP_00854W_RECON_CURR_CD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip00854wReconCurrCd", beginIp00854wReconCurrCd,IP_00854W_RECON_CURR_CD_LEN);
    }
   	}
     int localIp00854wReconCurrCdXCounter = -1;
     public boolean isIp00854wReconCurrCdXModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00854wReconCurrCdXCounter != sharedCounter;
         localIp00854wReconCurrCdXCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00854W_RECON_CURR_CD_X_LEN = 3;
	/**
	 * 	serialize this Ip00854wReconCurrCdX
	 */
   protected void serializeIp00854wReconCurrCdX(char[] ip00854wReconCurrCdX) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00854wReconCurrCdX,0,getStringValue(),beginIp00854wReconCurrCdX,IP_00854W_RECON_CURR_CD_X_LEN);
       localIp00854wReconCurrCdXCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00854wReconCurrCdXConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp00854wReconCurrCdX is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00854wReconCurrCdX() {	 
   		return (substring(getStringValue(),beginIp00854wReconCurrCdX,beginIp00854wReconCurrCdX + IP_00854W_RECON_CURR_CD_X_LEN));
   	}
     int localIp00854wRuleEffDateCounter = -1;
     public boolean isIp00854wRuleEffDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00854wRuleEffDateCounter != sharedCounter;
         localIp00854wRuleEffDateCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip00854wRuleEffDate
	 *	@return ip00854wRuleEffDate
	 */
	public char[]  getIp00854wRuleEffDateString() {
	     return getCharArray(beginIp00854wRuleEffDate,IP_00854W_RULE_EFF_DATE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00854wRuleEffDateIsNumeric() {
	    return isNumeric(beginIp00854wRuleEffDate
	                    ,beginIp00854wRuleEffDate + IP_00854W_RULE_EFF_DATE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_00854W_RULE_EFF_DATE_LEN = 8;
  	/**
	 * serializeIp00854wRuleEffDate
	 */
	protected void serializeIp00854wRuleEffDate(long ip00854wRuleEffDate) {
		 putNumber(beginIp00854wRuleEffDate,ip00854wRuleEffDate,IP_00854W_RULE_EFF_DATE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp00854wRuleEffDateCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp00854wRuleEffDate
	 */
   	protected  long serializeIp00854wRuleEffDate(char[] value) {
	    long  ip00854wRuleEffDate;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip00854wRuleEffDate = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginIp00854wRuleEffDate
		       ,8
		      );
		 localIp00854wRuleEffDateCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip00854wRuleEffDate;
    }

   protected long checkIp00854wRuleEffDateMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp00854wRuleEffDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp00854wRuleEffDate() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp00854wRuleEffDate
			                 ,IP_00854W_RULE_EFF_DATE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip00854wRuleEffDate", beginIp00854wRuleEffDate,IP_00854W_RULE_EFF_DATE_LEN);
    }
   	}




}
  
