package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class WsaAcceptTimeSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WsaAcceptTimeSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WsaAcceptTimeSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSA_ACCEPT_TIME_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWsaTimeOfDay;
	
	/**
	* Constructor for WsaAcceptTimeSerialized
	**/
    public WsaAcceptTimeSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WsaAcceptTimeSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSA_ACCEPT_TIME_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWsaTimeOfDay = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localWsaTimeOfDayCounter = -1;
     public boolean isWsaTimeOfDayModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWsaTimeOfDayCounter != sharedCounter;
         localWsaTimeOfDayCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of wsaTimeOfDay
	 *	@return wsaTimeOfDay
	 */
	public char[]  getWsaTimeOfDayString() {
	     return getCharArray(beginWsaTimeOfDay,WSA_TIME_OF_DAY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wsaTimeOfDayIsNumeric() {
	    return isNumeric(beginWsaTimeOfDay
	                    ,beginWsaTimeOfDay + WSA_TIME_OF_DAY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WSA_TIME_OF_DAY_LEN = 6;
  	/**
	 * serializeWsaTimeOfDay
	 */
	protected void serializeWsaTimeOfDay(long wsaTimeOfDay) {
		 putNumber(beginWsaTimeOfDay,wsaTimeOfDay,WSA_TIME_OF_DAY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWsaTimeOfDayCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWsaTimeOfDay
	 */
   	protected  long serializeWsaTimeOfDay(char[] value) {
	    long  wsaTimeOfDay;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    wsaTimeOfDay = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginWsaTimeOfDay
		       ,6
		      );
		 localWsaTimeOfDayCounter = shareString.getSerializedField().getModifiedCounter();
		return  wsaTimeOfDay;
    }

   protected long checkWsaTimeOfDayMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWsaTimeOfDay is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshWsaTimeOfDay() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginWsaTimeOfDay
			                 ,WSA_TIME_OF_DAY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("wsaTimeOfDay", beginWsaTimeOfDay,WSA_TIME_OF_DAY_LEN);
    }
   	}




}
  
