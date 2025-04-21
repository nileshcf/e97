package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip00174CurrCdKeySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:04. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip00174CurrCdKeySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip00174CurrCdKeySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_00174_CURR_CD_KEY_LENGTH = 3;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp00174CurrCdCode;
	
	/**
	* Constructor for Ip00174CurrCdKeySerialized
	**/
    public Ip00174CurrCdKeySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip00174CurrCdKeySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00174CurrCdKeySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip00174CurrCdKeySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip00174CurrCdKeySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip00174CurrCdKeySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_00174_CURR_CD_KEY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp00174CurrCdCode = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp00174CurrCdCodeCounter = -1;
     public boolean isIp00174CurrCdCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00174CurrCdCodeCounter != sharedCounter;
         localIp00174CurrCdCodeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip00174CurrCdCode
	 *	@return ip00174CurrCdCode
	 */
	public char[]  getIp00174CurrCdCodeString() {
	     return getCharArray(beginIp00174CurrCdCode,IP_00174_CURR_CD_CODE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00174CurrCdCodeIsNumeric() {
	    return isNumeric(beginIp00174CurrCdCode
	                    ,beginIp00174CurrCdCode + IP_00174_CURR_CD_CODE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_00174_CURR_CD_CODE_LEN = 3;
  	/**
	 * serializeIp00174CurrCdCode
	 */
	protected void serializeIp00174CurrCdCode(int ip00174CurrCdCode) {
		 putNumber(beginIp00174CurrCdCode,ip00174CurrCdCode,IP_00174_CURR_CD_CODE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp00174CurrCdCodeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp00174CurrCdCode
	 */
   	protected  int serializeIp00174CurrCdCode(char[] value) {
	    int  ip00174CurrCdCode;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip00174CurrCdCode = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginIp00174CurrCdCode
		       ,3
		      );
		 localIp00174CurrCdCodeCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip00174CurrCdCode;
    }

   protected int checkIp00174CurrCdCodeMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp00174CurrCdCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp00174CurrCdCode() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp00174CurrCdCode
			                 ,IP_00174_CURR_CD_CODE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip00174CurrCdCode", beginIp00174CurrCdCode,IP_00174_CURR_CD_CODE_LEN);
    }
   	}




}
  
