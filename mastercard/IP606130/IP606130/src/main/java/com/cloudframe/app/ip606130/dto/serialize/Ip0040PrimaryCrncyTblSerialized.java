package com.cloudframe.app.ip606130.dto.serialize;

/**
*  The class Ip0040PrimaryCrncyTblSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip0040PrimaryCrncyTblSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip0040PrimaryCrncyTblSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_0040_PRIMARY_CRNCY_TBL_LENGTH = 7;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp0040CardPrimeTxnCur;
            protected  int beginIp0040CardPrimeBlngCur;
            protected  int beginIp0040CardPrimeBlngExp;
	
	/**
	* Constructor for Ip0040PrimaryCrncyTblSerialized
	**/
    public Ip0040PrimaryCrncyTblSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip0040PrimaryCrncyTblSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0040PrimaryCrncyTblSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip0040PrimaryCrncyTblSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,113); // serialize this field at offset 113 by default 
    }
    
	/**
	* sets parent for this Ip0040PrimaryCrncyTblSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 113 by default
    }    
	/**
	* initializes the field in Ip0040PrimaryCrncyTblSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_0040_PRIMARY_CRNCY_TBL_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp0040CardPrimeTxnCur = getStartOffset() + 0;	// set offset for serialization
  
             beginIp0040CardPrimeBlngCur = getStartOffset() + 3;	// set offset for serialization
  
             beginIp0040CardPrimeBlngExp = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp0040CardPrimeTxnCurCounter = -1;
     public boolean isIp0040CardPrimeTxnCurModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040CardPrimeTxnCurCounter != sharedCounter;
         localIp0040CardPrimeTxnCurCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip0040CardPrimeTxnCur
	 *	@return ip0040CardPrimeTxnCur
	 */
	public char[]  getIp0040CardPrimeTxnCurString() {
	     return getCharArray(beginIp0040CardPrimeTxnCur,IP_0040_CARD_PRIME_TXN_CUR_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip0040CardPrimeTxnCurIsNumeric() {
	    return isNumeric(beginIp0040CardPrimeTxnCur
	                    ,beginIp0040CardPrimeTxnCur + IP_0040_CARD_PRIME_TXN_CUR_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_0040_CARD_PRIME_TXN_CUR_LEN = 3;
  	/**
	 * serializeIp0040CardPrimeTxnCur
	 */
	protected void serializeIp0040CardPrimeTxnCur(int ip0040CardPrimeTxnCur) {
		 putNumber(beginIp0040CardPrimeTxnCur,ip0040CardPrimeTxnCur,IP_0040_CARD_PRIME_TXN_CUR_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp0040CardPrimeTxnCurCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp0040CardPrimeTxnCur
	 */
   	protected  int serializeIp0040CardPrimeTxnCur(char[] value) {
	    int  ip0040CardPrimeTxnCur;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip0040CardPrimeTxnCur = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginIp0040CardPrimeTxnCur
		       ,3
		      );
		 localIp0040CardPrimeTxnCurCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip0040CardPrimeTxnCur;
    }

   protected int checkIp0040CardPrimeTxnCurMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp0040CardPrimeTxnCur is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp0040CardPrimeTxnCur() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp0040CardPrimeTxnCur
			                 ,IP_0040_CARD_PRIME_TXN_CUR_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip0040CardPrimeTxnCur", beginIp0040CardPrimeTxnCur,IP_0040_CARD_PRIME_TXN_CUR_LEN);
    }
   	}
     int localIp0040CardPrimeBlngCurCounter = -1;
     public boolean isIp0040CardPrimeBlngCurModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040CardPrimeBlngCurCounter != sharedCounter;
         localIp0040CardPrimeBlngCurCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip0040CardPrimeBlngCur
	 *	@return ip0040CardPrimeBlngCur
	 */
	public char[]  getIp0040CardPrimeBlngCurString() {
	     return getCharArray(beginIp0040CardPrimeBlngCur,IP_0040_CARD_PRIME_BLNG_CUR_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip0040CardPrimeBlngCurIsNumeric() {
	    return isNumeric(beginIp0040CardPrimeBlngCur
	                    ,beginIp0040CardPrimeBlngCur + IP_0040_CARD_PRIME_BLNG_CUR_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_0040_CARD_PRIME_BLNG_CUR_LEN = 3;
  	/**
	 * serializeIp0040CardPrimeBlngCur
	 */
	protected void serializeIp0040CardPrimeBlngCur(int ip0040CardPrimeBlngCur) {
		 putNumber(beginIp0040CardPrimeBlngCur,ip0040CardPrimeBlngCur,IP_0040_CARD_PRIME_BLNG_CUR_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp0040CardPrimeBlngCurCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp0040CardPrimeBlngCur
	 */
   	protected  int serializeIp0040CardPrimeBlngCur(char[] value) {
	    int  ip0040CardPrimeBlngCur;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip0040CardPrimeBlngCur = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginIp0040CardPrimeBlngCur
		       ,3
		      );
		 localIp0040CardPrimeBlngCurCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip0040CardPrimeBlngCur;
    }

   protected int checkIp0040CardPrimeBlngCurMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp0040CardPrimeBlngCur is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp0040CardPrimeBlngCur() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp0040CardPrimeBlngCur
			                 ,IP_0040_CARD_PRIME_BLNG_CUR_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip0040CardPrimeBlngCur", beginIp0040CardPrimeBlngCur,IP_0040_CARD_PRIME_BLNG_CUR_LEN);
    }
   	}
     int localIp0040CardPrimeBlngExpCounter = -1;
     public boolean isIp0040CardPrimeBlngExpModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040CardPrimeBlngExpCounter != sharedCounter;
         localIp0040CardPrimeBlngExpCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip0040CardPrimeBlngExp
	 *	@return ip0040CardPrimeBlngExp
	 */
	public char[]  getIp0040CardPrimeBlngExpString() {
	     return getCharArray(beginIp0040CardPrimeBlngExp,IP_0040_CARD_PRIME_BLNG_EXP_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip0040CardPrimeBlngExpIsNumeric() {
	    return isNumeric(beginIp0040CardPrimeBlngExp
	                    ,beginIp0040CardPrimeBlngExp + IP_0040_CARD_PRIME_BLNG_EXP_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_0040_CARD_PRIME_BLNG_EXP_LEN = 1;
  	/**
	 * serializeIp0040CardPrimeBlngExp
	 */
	protected void serializeIp0040CardPrimeBlngExp(int ip0040CardPrimeBlngExp) {
		 putNumber(beginIp0040CardPrimeBlngExp,ip0040CardPrimeBlngExp,IP_0040_CARD_PRIME_BLNG_EXP_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp0040CardPrimeBlngExpCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp0040CardPrimeBlngExp
	 */
   	protected  int serializeIp0040CardPrimeBlngExp(char[] value) {
	    int  ip0040CardPrimeBlngExp;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip0040CardPrimeBlngExp = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginIp0040CardPrimeBlngExp
		       ,1
		      );
		 localIp0040CardPrimeBlngExpCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip0040CardPrimeBlngExp;
    }

   protected int checkIp0040CardPrimeBlngExpMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp0040CardPrimeBlngExp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp0040CardPrimeBlngExp() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp0040CardPrimeBlngExp
			                 ,IP_0040_CARD_PRIME_BLNG_EXP_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip0040CardPrimeBlngExp", beginIp0040CardPrimeBlngExp,IP_0040_CARD_PRIME_BLNG_EXP_LEN);
    }
   	}




}
  
