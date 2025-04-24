package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip0040iPrimaryCrncyTblSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:39. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip0040iPrimaryCrncyTblSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip0040iPrimaryCrncyTblSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_0040I_PRIMARY_CRNCY_TBL_LENGTH = 7;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp0040iCardPrimeTxnCur;
            protected  int beginIp0040iCardPrimeBlngCur;
            protected  int beginIp0040iCardPrimeBlngExp;
	
	/**
	* Constructor for Ip0040iPrimaryCrncyTblSerialized
	**/
    public Ip0040iPrimaryCrncyTblSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip0040iPrimaryCrncyTblSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0040iPrimaryCrncyTblSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip0040iPrimaryCrncyTblSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,62); // serialize this field at offset 62 by default 
    }
    
	/**
	* sets parent for this Ip0040iPrimaryCrncyTblSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 62 by default
    }    
	/**
	* initializes the field in Ip0040iPrimaryCrncyTblSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_0040I_PRIMARY_CRNCY_TBL_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp0040iCardPrimeTxnCur = getStartOffset() + 0;	// set offset for serialization
  
             beginIp0040iCardPrimeBlngCur = getStartOffset() + 3;	// set offset for serialization
  
             beginIp0040iCardPrimeBlngExp = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp0040iCardPrimeTxnCurCounter = -1;
     public boolean isIp0040iCardPrimeTxnCurModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iCardPrimeTxnCurCounter != sharedCounter;
         localIp0040iCardPrimeTxnCurCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip0040iCardPrimeTxnCur
	 *	@return ip0040iCardPrimeTxnCur
	 */
	public char[]  getIp0040iCardPrimeTxnCurString() {
	     return getCharArray(beginIp0040iCardPrimeTxnCur,IP_0040I_CARD_PRIME_TXN_CUR_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip0040iCardPrimeTxnCurIsNumeric() {
	    return isNumeric(beginIp0040iCardPrimeTxnCur
	                    ,beginIp0040iCardPrimeTxnCur + IP_0040I_CARD_PRIME_TXN_CUR_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_0040I_CARD_PRIME_TXN_CUR_LEN = 3;
  	/**
	 * serializeIp0040iCardPrimeTxnCur
	 */
	protected void serializeIp0040iCardPrimeTxnCur(int ip0040iCardPrimeTxnCur) {
		 putNumber(beginIp0040iCardPrimeTxnCur,ip0040iCardPrimeTxnCur,IP_0040I_CARD_PRIME_TXN_CUR_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp0040iCardPrimeTxnCurCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp0040iCardPrimeTxnCur
	 */
   	protected  int serializeIp0040iCardPrimeTxnCur(char[] value) {
	    int  ip0040iCardPrimeTxnCur;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip0040iCardPrimeTxnCur = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginIp0040iCardPrimeTxnCur
		       ,3
		      );
		 localIp0040iCardPrimeTxnCurCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip0040iCardPrimeTxnCur;
    }

   protected int checkIp0040iCardPrimeTxnCurMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp0040iCardPrimeTxnCur is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp0040iCardPrimeTxnCur() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp0040iCardPrimeTxnCur
			                 ,IP_0040I_CARD_PRIME_TXN_CUR_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip0040iCardPrimeTxnCur", beginIp0040iCardPrimeTxnCur,IP_0040I_CARD_PRIME_TXN_CUR_LEN);
    }
   	}
     int localIp0040iCardPrimeBlngCurCounter = -1;
     public boolean isIp0040iCardPrimeBlngCurModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iCardPrimeBlngCurCounter != sharedCounter;
         localIp0040iCardPrimeBlngCurCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip0040iCardPrimeBlngCur
	 *	@return ip0040iCardPrimeBlngCur
	 */
	public char[]  getIp0040iCardPrimeBlngCurString() {
	     return getCharArray(beginIp0040iCardPrimeBlngCur,IP_0040I_CARD_PRIME_BLNG_CUR_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip0040iCardPrimeBlngCurIsNumeric() {
	    return isNumeric(beginIp0040iCardPrimeBlngCur
	                    ,beginIp0040iCardPrimeBlngCur + IP_0040I_CARD_PRIME_BLNG_CUR_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_0040I_CARD_PRIME_BLNG_CUR_LEN = 3;
  	/**
	 * serializeIp0040iCardPrimeBlngCur
	 */
	protected void serializeIp0040iCardPrimeBlngCur(int ip0040iCardPrimeBlngCur) {
		 putNumber(beginIp0040iCardPrimeBlngCur,ip0040iCardPrimeBlngCur,IP_0040I_CARD_PRIME_BLNG_CUR_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp0040iCardPrimeBlngCurCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp0040iCardPrimeBlngCur
	 */
   	protected  int serializeIp0040iCardPrimeBlngCur(char[] value) {
	    int  ip0040iCardPrimeBlngCur;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip0040iCardPrimeBlngCur = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginIp0040iCardPrimeBlngCur
		       ,3
		      );
		 localIp0040iCardPrimeBlngCurCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip0040iCardPrimeBlngCur;
    }

   protected int checkIp0040iCardPrimeBlngCurMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp0040iCardPrimeBlngCur is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp0040iCardPrimeBlngCur() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp0040iCardPrimeBlngCur
			                 ,IP_0040I_CARD_PRIME_BLNG_CUR_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip0040iCardPrimeBlngCur", beginIp0040iCardPrimeBlngCur,IP_0040I_CARD_PRIME_BLNG_CUR_LEN);
    }
   	}
     int localIp0040iCardPrimeBlngExpCounter = -1;
     public boolean isIp0040iCardPrimeBlngExpModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iCardPrimeBlngExpCounter != sharedCounter;
         localIp0040iCardPrimeBlngExpCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip0040iCardPrimeBlngExp
	 *	@return ip0040iCardPrimeBlngExp
	 */
	public char[]  getIp0040iCardPrimeBlngExpString() {
	     return getCharArray(beginIp0040iCardPrimeBlngExp,IP_0040I_CARD_PRIME_BLNG_EXP_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip0040iCardPrimeBlngExpIsNumeric() {
	    return isNumeric(beginIp0040iCardPrimeBlngExp
	                    ,beginIp0040iCardPrimeBlngExp + IP_0040I_CARD_PRIME_BLNG_EXP_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_0040I_CARD_PRIME_BLNG_EXP_LEN = 1;
  	/**
	 * serializeIp0040iCardPrimeBlngExp
	 */
	protected void serializeIp0040iCardPrimeBlngExp(int ip0040iCardPrimeBlngExp) {
		 putNumber(beginIp0040iCardPrimeBlngExp,ip0040iCardPrimeBlngExp,IP_0040I_CARD_PRIME_BLNG_EXP_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp0040iCardPrimeBlngExpCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp0040iCardPrimeBlngExp
	 */
   	protected  int serializeIp0040iCardPrimeBlngExp(char[] value) {
	    int  ip0040iCardPrimeBlngExp;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip0040iCardPrimeBlngExp = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginIp0040iCardPrimeBlngExp
		       ,1
		      );
		 localIp0040iCardPrimeBlngExpCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip0040iCardPrimeBlngExp;
    }

   protected int checkIp0040iCardPrimeBlngExpMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp0040iCardPrimeBlngExp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp0040iCardPrimeBlngExp() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp0040iCardPrimeBlngExp
			                 ,IP_0040I_CARD_PRIME_BLNG_EXP_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip0040iCardPrimeBlngExp", beginIp0040iCardPrimeBlngExp,IP_0040I_CARD_PRIME_BLNG_EXP_LEN);
    }
   	}




}
  
