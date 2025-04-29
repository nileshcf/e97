package com.cloudframe.app.ip343690.dto.serialize;

/**
*  The class SleepMessage600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:34. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SleepMessage600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SleepMessage600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SLEEP_MESSAGE_600_LENGTH = 78;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSleepTime600;
            protected  int beginCurrTime600;
	
	/**
	* Constructor for SleepMessage600Serialized
	**/
    public SleepMessage600Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in SleepMessage600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SLEEP_MESSAGE_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginSleepTime600 = getStartOffset() + 43;	// set offset for serialization
  
  
             beginCurrTime600 = getStartOffset() + 70;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSleepTime600Counter = -1;
     public boolean isSleepTime600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSleepTime600Counter != sharedCounter;
         localSleepTime600Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of sleepTime600
	 *	@return sleepTime600
	 */
	public char[]  getSleepTime600String() {
	     return getCharArray(beginSleepTime600,SLEEP_TIME_600_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sleepTime600IsNumeric() {
	    return isNumeric(beginSleepTime600
	                    ,beginSleepTime600 + SLEEP_TIME_600_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SLEEP_TIME_600_LEN = 8;
  	/**
	 * serializeSleepTime600
	 */
	protected void serializeSleepTime600(long sleepTime600) {
		 putNumber(beginSleepTime600,sleepTime600,SLEEP_TIME_600_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSleepTime600Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSleepTime600
	 */
   	protected  long serializeSleepTime600(char[] value) {
	    long  sleepTime600;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    sleepTime600 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginSleepTime600
		       ,8
		      );
		 localSleepTime600Counter = shareString.getSerializedField().getModifiedCounter();
		return  sleepTime600;
    }

   protected long checkSleepTime600MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSleepTime600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSleepTime600() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSleepTime600
			                 ,SLEEP_TIME_600_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("sleepTime600", beginSleepTime600,SLEEP_TIME_600_LEN);
    }
   	}
     int localCurrTime600Counter = -1;
     public boolean isCurrTime600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrTime600Counter != sharedCounter;
         localCurrTime600Counter = sharedCounter; return hasModified;
     }
	protected static final int CURR_TIME_600_LEN = 8;
	/**
	 * 	serialize this CurrTime600
	 */
   protected void serializeCurrTime600(char[] currTime600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(currTime600,0,getStringValue(),beginCurrTime600,CURR_TIME_600_LEN);
       localCurrTime600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCurrTime600Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshCurrTime600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCurrTime600() {	 
   		return (substring(getStringValue(),beginCurrTime600,beginCurrTime600 + CURR_TIME_600_LEN));
   	}




}
  
