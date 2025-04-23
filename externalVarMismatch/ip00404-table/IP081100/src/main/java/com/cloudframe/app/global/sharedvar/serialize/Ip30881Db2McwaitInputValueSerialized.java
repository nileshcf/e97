package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip30881Db2McwaitInputValueSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:31. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip30881Db2McwaitInputValueSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip30881Db2McwaitInputValueSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_30881_DB_2_MCWAIT_INPUT_VALUE_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp30881911RetryValue;
	
	/**
	* Constructor for Ip30881Db2McwaitInputValueSerialized
	**/
    public Ip30881Db2McwaitInputValueSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip30881Db2McwaitInputValueSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_30881_DB_2_MCWAIT_INPUT_VALUE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp30881911RetryValue = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp30881911RetryValueCounter = -1;
     public boolean isIp30881911RetryValueModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp30881911RetryValueCounter != sharedCounter;
         localIp30881911RetryValueCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip30881911RetryValue
	 *	@return ip30881911RetryValue
	 */
	public char[]  getIp30881911RetryValueString() {
	     return getCharArray(beginIp30881911RetryValue,IP_30881911_RETRY_VALUE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip30881911RetryValueIsNumeric() {
	    return isNumeric(beginIp30881911RetryValue
	                    ,beginIp30881911RetryValue + IP_30881911_RETRY_VALUE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_30881911_RETRY_VALUE_LEN = 2;
  	/**
	 * serializeIp30881911RetryValue
	 */
	protected void serializeIp30881911RetryValue(int ip30881911RetryValue) {
		 putNumber(beginIp30881911RetryValue,ip30881911RetryValue,IP_30881911_RETRY_VALUE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp30881911RetryValueCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp30881911RetryValue
	 */
   	protected  int serializeIp30881911RetryValue(char[] value) {
	    int  ip30881911RetryValue;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip30881911RetryValue = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginIp30881911RetryValue
		       ,2
		      );
		 localIp30881911RetryValueCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip30881911RetryValue;
    }

   protected int checkIp30881911RetryValueMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp30881911RetryValue is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp30881911RetryValue() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp30881911RetryValue
			                 ,IP_30881911_RETRY_VALUE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip30881911RetryValue", beginIp30881911RetryValue,IP_30881911_RETRY_VALUE_LEN);
    }
   	}




}
  
