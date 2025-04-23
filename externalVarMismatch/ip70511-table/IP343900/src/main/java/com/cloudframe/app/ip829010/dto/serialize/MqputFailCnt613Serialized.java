package com.cloudframe.app.ip829010.dto.serialize;

/**
*  The class MqputFailCnt613Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MqputFailCnt613Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MqputFailCnt613Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MQPUT_FAIL_CNT_613_LENGTH = 61;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginPutFailCnt613;
	
	/**
	* Constructor for MqputFailCnt613Serialized
	**/
    public MqputFailCnt613Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in MqputFailCnt613Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MQPUT_FAIL_CNT_613_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
             beginPutFailCnt613 = getStartOffset() + 52;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localPutFailCnt613Counter = -1;
     public boolean isPutFailCnt613Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPutFailCnt613Counter != sharedCounter;
         localPutFailCnt613Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of putFailCnt613
	 *	@return putFailCnt613
	 */
	public char[]  getPutFailCnt613String() {
	     return getCharArray(beginPutFailCnt613,PUT_FAIL_CNT_613_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean putFailCnt613IsNumeric() {
	    return isNumeric(beginPutFailCnt613
	                    ,beginPutFailCnt613 + PUT_FAIL_CNT_613_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PUT_FAIL_CNT_613_LEN = 9;
  	/**
	 * serializePutFailCnt613
	 */
	protected void serializePutFailCnt613(long putFailCnt613) {
		 putNumber(beginPutFailCnt613,putFailCnt613,PUT_FAIL_CNT_613_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPutFailCnt613Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePutFailCnt613
	 */
   	protected  long serializePutFailCnt613(char[] value) {
	    long  putFailCnt613;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    putFailCnt613 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginPutFailCnt613
		       ,9
		      );
		 localPutFailCnt613Counter = shareString.getSerializedField().getModifiedCounter();
		return  putFailCnt613;
    }

   protected long checkPutFailCnt613MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshPutFailCnt613 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPutFailCnt613() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPutFailCnt613
			                 ,PUT_FAIL_CNT_613_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("putFailCnt613", beginPutFailCnt613,PUT_FAIL_CNT_613_LEN);
    }
   	}




}
  
