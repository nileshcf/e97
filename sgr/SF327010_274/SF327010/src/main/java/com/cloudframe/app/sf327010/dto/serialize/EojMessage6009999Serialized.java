package com.cloudframe.app.sf327010.dto.serialize;

/**
*  The class EojMessage6009999Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:58. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class EojMessage6009999Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(EojMessage6009999Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int EOJ_MESSAGE_6009999_LENGTH = 49;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginReturnCode6009999;
	
	/**
	* Constructor for EojMessage6009999Serialized
	**/
    public EojMessage6009999Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in EojMessage6009999Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(EOJ_MESSAGE_6009999_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginReturnCode6009999 = getStartOffset() + 45;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localReturnCode6009999Counter = -1;
     public boolean isReturnCode6009999Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localReturnCode6009999Counter != sharedCounter;
         localReturnCode6009999Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of returnCode6009999
	 *	@return returnCode6009999
	 */
	public char[]  getReturnCode6009999String() {
	     return getCharArray(beginReturnCode6009999,RETURN_CODE_6009999_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean returnCode6009999IsNumeric() {
	    return isNumeric(beginReturnCode6009999
	                    ,beginReturnCode6009999 + RETURN_CODE_6009999_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int RETURN_CODE_6009999_LEN = 4;
  	/**
	 * serializeReturnCode6009999
	 */
	protected void serializeReturnCode6009999(int returnCode6009999) {
		 putNumber(beginReturnCode6009999,returnCode6009999,RETURN_CODE_6009999_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localReturnCode6009999Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeReturnCode6009999
	 */
   	protected  int serializeReturnCode6009999(char[] value) {
	    int  returnCode6009999;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    returnCode6009999 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginReturnCode6009999
		       ,4
		      );
		 localReturnCode6009999Counter = shareString.getSerializedField().getModifiedCounter();
		return  returnCode6009999;
    }

   protected int checkReturnCode6009999MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshReturnCode6009999 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshReturnCode6009999() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginReturnCode6009999
			                 ,RETURN_CODE_6009999_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("returnCode6009999", beginReturnCode6009999,RETURN_CODE_6009999_LEN);
    }
   	}




}
  
