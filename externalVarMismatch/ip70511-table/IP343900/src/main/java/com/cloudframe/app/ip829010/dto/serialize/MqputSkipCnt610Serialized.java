package com.cloudframe.app.ip829010.dto.serialize;

/**
*  The class MqputSkipCnt610Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:04. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MqputSkipCnt610Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MqputSkipCnt610Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MQPUT_SKIP_CNT_610_LENGTH = 61;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginPutSkipCnt610;
	
	/**
	* Constructor for MqputSkipCnt610Serialized
	**/
    public MqputSkipCnt610Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in MqputSkipCnt610Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MQPUT_SKIP_CNT_610_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
             beginPutSkipCnt610 = getStartOffset() + 52;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localPutSkipCnt610Counter = -1;
     public boolean isPutSkipCnt610Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPutSkipCnt610Counter != sharedCounter;
         localPutSkipCnt610Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of putSkipCnt610
	 *	@return putSkipCnt610
	 */
	public char[]  getPutSkipCnt610String() {
	     return getCharArray(beginPutSkipCnt610,PUT_SKIP_CNT_610_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean putSkipCnt610IsNumeric() {
	    return isNumeric(beginPutSkipCnt610
	                    ,beginPutSkipCnt610 + PUT_SKIP_CNT_610_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PUT_SKIP_CNT_610_LEN = 9;
  	/**
	 * serializePutSkipCnt610
	 */
	protected void serializePutSkipCnt610(long putSkipCnt610) {
		 putNumber(beginPutSkipCnt610,putSkipCnt610,PUT_SKIP_CNT_610_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPutSkipCnt610Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePutSkipCnt610
	 */
   	protected  long serializePutSkipCnt610(char[] value) {
	    long  putSkipCnt610;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    putSkipCnt610 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginPutSkipCnt610
		       ,9
		      );
		 localPutSkipCnt610Counter = shareString.getSerializedField().getModifiedCounter();
		return  putSkipCnt610;
    }

   protected long checkPutSkipCnt610MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshPutSkipCnt610 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPutSkipCnt610() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPutSkipCnt610
			                 ,PUT_SKIP_CNT_610_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("putSkipCnt610", beginPutSkipCnt610,PUT_SKIP_CNT_610_LEN);
    }
   	}




}
  
