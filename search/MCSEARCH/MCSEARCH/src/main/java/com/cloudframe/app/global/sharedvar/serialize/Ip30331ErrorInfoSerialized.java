package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip30331ErrorInfoSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:57. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip30331ErrorInfoSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip30331ErrorInfoSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_30331_ERROR_INFO_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp30331ErrorMsgNumber;
	
	/**
	* Constructor for Ip30331ErrorInfoSerialized
	**/
    public Ip30331ErrorInfoSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip30331ErrorInfoSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip30331ErrorInfoSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip30331ErrorInfoSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,12); // serialize this field at offset 12 by default 
    }
    
	/**
	* sets parent for this Ip30331ErrorInfoSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 12 by default
    }    
	/**
	* initializes the field in Ip30331ErrorInfoSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_30331_ERROR_INFO_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginIp30331ErrorMsgNumber = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp30331ErrorMsgNumberCounter = -1;
     public boolean isIp30331ErrorMsgNumberModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp30331ErrorMsgNumberCounter != sharedCounter;
         localIp30331ErrorMsgNumberCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip30331ErrorMsgNumber
	 *	@return ip30331ErrorMsgNumber
	 */
	public char[]  getIp30331ErrorMsgNumberString() {
	     return getCharArray(beginIp30331ErrorMsgNumber,IP_30331_ERROR_MSG_NUMBER_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip30331ErrorMsgNumberIsNumeric() {
	    return isNumeric(beginIp30331ErrorMsgNumber
	                    ,beginIp30331ErrorMsgNumber + IP_30331_ERROR_MSG_NUMBER_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_30331_ERROR_MSG_NUMBER_LEN = 4;
  	/**
	 * serializeIp30331ErrorMsgNumber
	 */
	protected void serializeIp30331ErrorMsgNumber(int ip30331ErrorMsgNumber) {
		 putNumber(beginIp30331ErrorMsgNumber,ip30331ErrorMsgNumber,IP_30331_ERROR_MSG_NUMBER_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp30331ErrorMsgNumberCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp30331ErrorMsgNumber
	 */
   	protected  int serializeIp30331ErrorMsgNumber(char[] value) {
	    int  ip30331ErrorMsgNumber;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip30331ErrorMsgNumber = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginIp30331ErrorMsgNumber
		       ,4
		      );
		 localIp30331ErrorMsgNumberCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip30331ErrorMsgNumber;
    }

   protected int checkIp30331ErrorMsgNumberMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp30331ErrorMsgNumber is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp30331ErrorMsgNumber() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp30331ErrorMsgNumber
			                 ,IP_30331_ERROR_MSG_NUMBER_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip30331ErrorMsgNumber", beginIp30331ErrorMsgNumber,IP_30331_ERROR_MSG_NUMBER_LEN);
    }
   	}




}
  
