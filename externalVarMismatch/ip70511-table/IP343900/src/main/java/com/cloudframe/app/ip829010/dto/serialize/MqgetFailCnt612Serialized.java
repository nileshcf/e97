package com.cloudframe.app.ip829010.dto.serialize;

/**
*  The class MqgetFailCnt612Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:04. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MqgetFailCnt612Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MqgetFailCnt612Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MQGET_FAIL_CNT_612_LENGTH = 61;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginGetFailCnt612;
	
	/**
	* Constructor for MqgetFailCnt612Serialized
	**/
    public MqgetFailCnt612Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in MqgetFailCnt612Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MQGET_FAIL_CNT_612_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
             beginGetFailCnt612 = getStartOffset() + 52;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localGetFailCnt612Counter = -1;
     public boolean isGetFailCnt612Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGetFailCnt612Counter != sharedCounter;
         localGetFailCnt612Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of getFailCnt612
	 *	@return getFailCnt612
	 */
	public char[]  getGetFailCnt612String() {
	     return getCharArray(beginGetFailCnt612,GET_FAIL_CNT_612_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean getFailCnt612IsNumeric() {
	    return isNumeric(beginGetFailCnt612
	                    ,beginGetFailCnt612 + GET_FAIL_CNT_612_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int GET_FAIL_CNT_612_LEN = 9;
  	/**
	 * serializeGetFailCnt612
	 */
	protected void serializeGetFailCnt612(long getFailCnt612) {
		 putNumber(beginGetFailCnt612,getFailCnt612,GET_FAIL_CNT_612_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localGetFailCnt612Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeGetFailCnt612
	 */
   	protected  long serializeGetFailCnt612(char[] value) {
	    long  getFailCnt612;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    getFailCnt612 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginGetFailCnt612
		       ,9
		      );
		 localGetFailCnt612Counter = shareString.getSerializedField().getModifiedCounter();
		return  getFailCnt612;
    }

   protected long checkGetFailCnt612MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshGetFailCnt612 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshGetFailCnt612() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginGetFailCnt612
			                 ,GET_FAIL_CNT_612_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("getFailCnt612", beginGetFailCnt612,GET_FAIL_CNT_612_LEN);
    }
   	}




}
  
