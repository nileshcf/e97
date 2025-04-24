package com.cloudframe.app.mcissues.dto.serialize;

/**
*  The class Ip43501EiErrorInfoSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip43501EiErrorInfoSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip43501EiErrorInfoSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_43501_EI_ERROR_INFO_LENGTH = 1039;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp43501EiSourceAmount;
            protected  int beginIp43501EiSourceCurrency;
            protected  int beginIp43501EiSourceCurrExp;
            protected  int beginIp43501EiSourceMtiFunc;
	
	/**
	* Constructor for Ip43501EiErrorInfoSerialized
	**/
    public Ip43501EiErrorInfoSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip43501EiErrorInfoSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip43501EiErrorInfoSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip43501EiErrorInfoSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,256); // serialize this field at offset 256 by default 
    }
    
	/**
	* sets parent for this Ip43501EiErrorInfoSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 256 by default
    }    
	/**
	* initializes the field in Ip43501EiErrorInfoSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_43501_EI_ERROR_INFO_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp43501EiSourceAmount = getStartOffset() + 0;	// set offset for serialization
  
             beginIp43501EiSourceCurrency = getStartOffset() + 18;	// set offset for serialization
  
             beginIp43501EiSourceCurrExp = getStartOffset() + 21;	// set offset for serialization
  
             beginIp43501EiSourceMtiFunc = getStartOffset() + 22;	// set offset for serialization
  
  
  
	   /*  end of offset */
	}
     int localIp43501EiSourceAmountCounter = -1;
     public boolean isIp43501EiSourceAmountModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp43501EiSourceAmountCounter != sharedCounter;
         localIp43501EiSourceAmountCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip43501EiSourceAmount
	 *	@return ip43501EiSourceAmount
	 */
	public char[]  getIp43501EiSourceAmountString() {
	     return getCharArray(beginIp43501EiSourceAmount,IP_43501_EI_SOURCE_AMOUNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip43501EiSourceAmountIsNumeric() {
	    return isNumeric(beginIp43501EiSourceAmount
	                    ,beginIp43501EiSourceAmount + IP_43501_EI_SOURCE_AMOUNT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_43501_EI_SOURCE_AMOUNT_LEN = 18;
  	/**
	 * serializeIp43501EiSourceAmount
	 */
	protected void serializeIp43501EiSourceAmount(long ip43501EiSourceAmount) {
		 putNumber(beginIp43501EiSourceAmount,ip43501EiSourceAmount,IP_43501_EI_SOURCE_AMOUNT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp43501EiSourceAmountCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp43501EiSourceAmount
	 */
   	protected  long serializeIp43501EiSourceAmount(char[] value) {
	    long  ip43501EiSourceAmount;
	    if(value.length >0 && value.length!= 18)
            value = new String(value).trim().toCharArray();
	    if (value.length < 18) value = pad(18, value, ' ', LEFT_PAD);
	    else if (value.length > 18) value = substring(value,0,18);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip43501EiSourceAmount = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(18,value,false/*isSigned?*/)
		       ,beginIp43501EiSourceAmount
		       ,18
		      );
		 localIp43501EiSourceAmountCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip43501EiSourceAmount;
    }

   protected long checkIp43501EiSourceAmountMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1E/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp43501EiSourceAmount is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp43501EiSourceAmount() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp43501EiSourceAmount
			                 ,IP_43501_EI_SOURCE_AMOUNT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip43501EiSourceAmount", beginIp43501EiSourceAmount,IP_43501_EI_SOURCE_AMOUNT_LEN);
    }
   	}
     int localIp43501EiSourceCurrencyCounter = -1;
     public boolean isIp43501EiSourceCurrencyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp43501EiSourceCurrencyCounter != sharedCounter;
         localIp43501EiSourceCurrencyCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_43501_EI_SOURCE_CURRENCY_LEN = 3;
	/**
	 * 	serialize this Ip43501EiSourceCurrency
	 */
   protected void serializeIp43501EiSourceCurrency(char[] ip43501EiSourceCurrency) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip43501EiSourceCurrency,0,getStringValue(),beginIp43501EiSourceCurrency,IP_43501_EI_SOURCE_CURRENCY_LEN);
       localIp43501EiSourceCurrencyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp43501EiSourceCurrencyConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp43501EiSourceCurrency is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp43501EiSourceCurrency() {	 
   		return (substring(getStringValue(),beginIp43501EiSourceCurrency,beginIp43501EiSourceCurrency + IP_43501_EI_SOURCE_CURRENCY_LEN));
   	}
     int localIp43501EiSourceCurrExpCounter = -1;
     public boolean isIp43501EiSourceCurrExpModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp43501EiSourceCurrExpCounter != sharedCounter;
         localIp43501EiSourceCurrExpCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip43501EiSourceCurrExp
	 *	@return ip43501EiSourceCurrExp
	 */
	public char[]  getIp43501EiSourceCurrExpString() {
	     return getCharArray(beginIp43501EiSourceCurrExp,IP_43501_EI_SOURCE_CURR_EXP_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip43501EiSourceCurrExpIsNumeric() {
	    return isNumeric(beginIp43501EiSourceCurrExp
	                    ,beginIp43501EiSourceCurrExp + IP_43501_EI_SOURCE_CURR_EXP_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_43501_EI_SOURCE_CURR_EXP_LEN = 1;
  	/**
	 * serializeIp43501EiSourceCurrExp
	 */
	protected void serializeIp43501EiSourceCurrExp(int ip43501EiSourceCurrExp) {
		 putNumber(beginIp43501EiSourceCurrExp,ip43501EiSourceCurrExp,IP_43501_EI_SOURCE_CURR_EXP_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp43501EiSourceCurrExpCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp43501EiSourceCurrExp
	 */
   	protected  int serializeIp43501EiSourceCurrExp(char[] value) {
	    int  ip43501EiSourceCurrExp;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip43501EiSourceCurrExp = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginIp43501EiSourceCurrExp
		       ,1
		      );
		 localIp43501EiSourceCurrExpCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip43501EiSourceCurrExp;
    }

   protected int checkIp43501EiSourceCurrExpMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp43501EiSourceCurrExp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp43501EiSourceCurrExp() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp43501EiSourceCurrExp
			                 ,IP_43501_EI_SOURCE_CURR_EXP_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip43501EiSourceCurrExp", beginIp43501EiSourceCurrExp,IP_43501_EI_SOURCE_CURR_EXP_LEN);
    }
   	}
     int localIp43501EiSourceMtiFuncCounter = -1;
     public boolean isIp43501EiSourceMtiFuncModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp43501EiSourceMtiFuncCounter != sharedCounter;
         localIp43501EiSourceMtiFuncCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_43501_EI_SOURCE_MTI_FUNC_LEN = 8;
	/**
	 * 	serialize this Ip43501EiSourceMtiFunc
	 */
   protected void serializeIp43501EiSourceMtiFunc(char[] ip43501EiSourceMtiFunc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip43501EiSourceMtiFunc,0,getStringValue(),beginIp43501EiSourceMtiFunc,IP_43501_EI_SOURCE_MTI_FUNC_LEN);
       localIp43501EiSourceMtiFuncCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp43501EiSourceMtiFuncConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshIp43501EiSourceMtiFunc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp43501EiSourceMtiFunc() {	 
   		return (substring(getStringValue(),beginIp43501EiSourceMtiFunc,beginIp43501EiSourceMtiFunc + IP_43501_EI_SOURCE_MTI_FUNC_LEN));
   	}




}
  
