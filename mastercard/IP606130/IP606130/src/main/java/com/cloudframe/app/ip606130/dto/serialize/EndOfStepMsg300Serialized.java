package com.cloudframe.app.ip606130.dto.serialize;

/**
*  The class EndOfStepMsg300Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:08. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class EndOfStepMsg300Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(EndOfStepMsg300Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int END_OF_STEP_MSG_300_LENGTH = 48;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCondCode300;
	
	/**
	* Constructor for EndOfStepMsg300Serialized
	**/
    public EndOfStepMsg300Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in EndOfStepMsg300Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(END_OF_STEP_MSG_300_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
             beginCondCode300 = getStartOffset() + 44;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCondCode300Counter = -1;
     public boolean isCondCode300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCondCode300Counter != sharedCounter;
         localCondCode300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of condCode300
	 *	@return condCode300
	 */
	public char[]  getCondCode300String() {
	     return getCharArray(beginCondCode300,COND_CODE_300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean condCode300IsNumeric() {
	    return isNumeric(beginCondCode300
	                    ,beginCondCode300 + COND_CODE_300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int COND_CODE_300_LEN = 4;
  	/**
	 * serializeCondCode300
	 */
	protected void serializeCondCode300(int condCode300) {
		 putNumber(beginCondCode300,condCode300,COND_CODE_300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCondCode300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCondCode300
	 */
   	protected  int serializeCondCode300(char[] value) {
	    int  condCode300;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    condCode300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginCondCode300
		       ,4
		      );
		 localCondCode300Counter = shareString.getSerializedField().getModifiedCounter();
		return  condCode300;
    }

   protected int checkCondCode300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCondCode300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCondCode300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCondCode300
			                 ,COND_CODE_300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("condCode300", beginCondCode300,COND_CODE_300_LEN);
    }
   	}




}
  
