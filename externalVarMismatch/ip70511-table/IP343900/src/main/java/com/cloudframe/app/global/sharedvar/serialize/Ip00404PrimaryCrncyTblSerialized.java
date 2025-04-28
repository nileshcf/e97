package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip00404PrimaryCrncyTblSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip00404PrimaryCrncyTblSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip00404PrimaryCrncyTblSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_00404_PRIMARY_CRNCY_TBL_LENGTH = 7;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp00404CardPrimeTxnCur;
            protected  int beginIp00404CardPrimeBlngCur;
            protected  int beginIp00404CardPrimeBlngExp;
	
	/**
	* Constructor for Ip00404PrimaryCrncyTblSerialized
	**/
    public Ip00404PrimaryCrncyTblSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip00404PrimaryCrncyTblSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00404PrimaryCrncyTblSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip00404PrimaryCrncyTblSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,104); // serialize this field at offset 104 by default 
    }
    
	/**
	* sets parent for this Ip00404PrimaryCrncyTblSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 104 by default
    }    
	/**
	* initializes the field in Ip00404PrimaryCrncyTblSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_00404_PRIMARY_CRNCY_TBL_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp00404CardPrimeTxnCur = getStartOffset() + 0;	// set offset for serialization
  
             beginIp00404CardPrimeBlngCur = getStartOffset() + 3;	// set offset for serialization
  
             beginIp00404CardPrimeBlngExp = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp00404CardPrimeTxnCurCounter = -1;
     public boolean isIp00404CardPrimeTxnCurModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404CardPrimeTxnCurCounter != sharedCounter;
         localIp00404CardPrimeTxnCurCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip00404CardPrimeTxnCur
	 *	@return ip00404CardPrimeTxnCur
	 */
	public char[]  getIp00404CardPrimeTxnCurString() {
	     return getCharArray(beginIp00404CardPrimeTxnCur,IP_00404_CARD_PRIME_TXN_CUR_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00404CardPrimeTxnCurIsNumeric() {
	    return isNumeric(beginIp00404CardPrimeTxnCur
	                    ,beginIp00404CardPrimeTxnCur + IP_00404_CARD_PRIME_TXN_CUR_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_00404_CARD_PRIME_TXN_CUR_LEN = 3;
  	/**
	 * serializeIp00404CardPrimeTxnCur
	 */
	protected void serializeIp00404CardPrimeTxnCur(int ip00404CardPrimeTxnCur) {
		 putNumber(beginIp00404CardPrimeTxnCur,ip00404CardPrimeTxnCur,IP_00404_CARD_PRIME_TXN_CUR_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp00404CardPrimeTxnCurCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp00404CardPrimeTxnCur
	 */
   	protected  int serializeIp00404CardPrimeTxnCur(char[] value) {
	    int  ip00404CardPrimeTxnCur;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip00404CardPrimeTxnCur = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginIp00404CardPrimeTxnCur
		       ,3
		      );
		 localIp00404CardPrimeTxnCurCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip00404CardPrimeTxnCur;
    }

   protected int checkIp00404CardPrimeTxnCurMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp00404CardPrimeTxnCur is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp00404CardPrimeTxnCur() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp00404CardPrimeTxnCur
			                 ,IP_00404_CARD_PRIME_TXN_CUR_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip00404CardPrimeTxnCur", beginIp00404CardPrimeTxnCur,IP_00404_CARD_PRIME_TXN_CUR_LEN);
    }
   	}
     int localIp00404CardPrimeBlngCurCounter = -1;
     public boolean isIp00404CardPrimeBlngCurModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404CardPrimeBlngCurCounter != sharedCounter;
         localIp00404CardPrimeBlngCurCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip00404CardPrimeBlngCur
	 *	@return ip00404CardPrimeBlngCur
	 */
	public char[]  getIp00404CardPrimeBlngCurString() {
	     return getCharArray(beginIp00404CardPrimeBlngCur,IP_00404_CARD_PRIME_BLNG_CUR_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00404CardPrimeBlngCurIsNumeric() {
	    return isNumeric(beginIp00404CardPrimeBlngCur
	                    ,beginIp00404CardPrimeBlngCur + IP_00404_CARD_PRIME_BLNG_CUR_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_00404_CARD_PRIME_BLNG_CUR_LEN = 3;
  	/**
	 * serializeIp00404CardPrimeBlngCur
	 */
	protected void serializeIp00404CardPrimeBlngCur(int ip00404CardPrimeBlngCur) {
		 putNumber(beginIp00404CardPrimeBlngCur,ip00404CardPrimeBlngCur,IP_00404_CARD_PRIME_BLNG_CUR_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp00404CardPrimeBlngCurCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp00404CardPrimeBlngCur
	 */
   	protected  int serializeIp00404CardPrimeBlngCur(char[] value) {
	    int  ip00404CardPrimeBlngCur;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip00404CardPrimeBlngCur = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginIp00404CardPrimeBlngCur
		       ,3
		      );
		 localIp00404CardPrimeBlngCurCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip00404CardPrimeBlngCur;
    }

   protected int checkIp00404CardPrimeBlngCurMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp00404CardPrimeBlngCur is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp00404CardPrimeBlngCur() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp00404CardPrimeBlngCur
			                 ,IP_00404_CARD_PRIME_BLNG_CUR_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip00404CardPrimeBlngCur", beginIp00404CardPrimeBlngCur,IP_00404_CARD_PRIME_BLNG_CUR_LEN);
    }
   	}
     int localIp00404CardPrimeBlngExpCounter = -1;
     public boolean isIp00404CardPrimeBlngExpModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404CardPrimeBlngExpCounter != sharedCounter;
         localIp00404CardPrimeBlngExpCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip00404CardPrimeBlngExp
	 *	@return ip00404CardPrimeBlngExp
	 */
	public char[]  getIp00404CardPrimeBlngExpString() {
	     return getCharArray(beginIp00404CardPrimeBlngExp,IP_00404_CARD_PRIME_BLNG_EXP_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00404CardPrimeBlngExpIsNumeric() {
	    return isNumeric(beginIp00404CardPrimeBlngExp
	                    ,beginIp00404CardPrimeBlngExp + IP_00404_CARD_PRIME_BLNG_EXP_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_00404_CARD_PRIME_BLNG_EXP_LEN = 1;
  	/**
	 * serializeIp00404CardPrimeBlngExp
	 */
	protected void serializeIp00404CardPrimeBlngExp(int ip00404CardPrimeBlngExp) {
		 putNumber(beginIp00404CardPrimeBlngExp,ip00404CardPrimeBlngExp,IP_00404_CARD_PRIME_BLNG_EXP_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp00404CardPrimeBlngExpCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp00404CardPrimeBlngExp
	 */
   	protected  int serializeIp00404CardPrimeBlngExp(char[] value) {
	    int  ip00404CardPrimeBlngExp;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip00404CardPrimeBlngExp = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginIp00404CardPrimeBlngExp
		       ,1
		      );
		 localIp00404CardPrimeBlngExpCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip00404CardPrimeBlngExp;
    }

   protected int checkIp00404CardPrimeBlngExpMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp00404CardPrimeBlngExp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp00404CardPrimeBlngExp() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp00404CardPrimeBlngExp
			                 ,IP_00404_CARD_PRIME_BLNG_EXP_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip00404CardPrimeBlngExp", beginIp00404CardPrimeBlngExp,IP_00404_CARD_PRIME_BLNG_EXP_LEN);
    }
   	}




}
  
