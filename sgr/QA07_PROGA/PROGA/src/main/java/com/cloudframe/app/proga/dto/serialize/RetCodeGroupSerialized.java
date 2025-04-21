package com.cloudframe.app.proga.dto.serialize;

/**
*  The class RetCodeGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:08. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RetCodeGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RetCodeGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RET_CODE_GROUP_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRetCode;
	
	/**
	* Constructor for RetCodeGroupSerialized
	**/
    public RetCodeGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in RetCodeGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RET_CODE_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRetCode = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRetCodeCounter = -1;
     public boolean isRetCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRetCodeCounter != sharedCounter;
         localRetCodeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of retCode
	 *	@return retCode
	 */
	public char[]  getRetCodeString() {
	     return getCharArray(beginRetCode,RET_CODE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean retCodeIsNumeric() {
	    return isNumeric(beginRetCode
	                    ,beginRetCode + RET_CODE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int RET_CODE_LEN = 4;
  	/**
	 * serializeRetCode
	 */
	protected void serializeRetCode(int retCode) {
		 putNumber(beginRetCode,retCode,RET_CODE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRetCodeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeRetCode
	 */
   	protected  int serializeRetCode(char[] value) {
	    int  retCode;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    retCode = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginRetCode
		       ,4
		      );
		 localRetCodeCounter = shareString.getSerializedField().getModifiedCounter();
		return  retCode;
    }

   protected int checkRetCodeMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshRetCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshRetCode() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginRetCode
			                 ,RET_CODE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("retCode", beginRetCode,RET_CODE_LEN);
    }
   	}




}
  
