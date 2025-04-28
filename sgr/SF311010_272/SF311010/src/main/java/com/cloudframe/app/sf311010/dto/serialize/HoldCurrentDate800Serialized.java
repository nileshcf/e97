package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class HoldCurrentDate800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:05. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class HoldCurrentDate800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(HoldCurrentDate800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HOLD_CURRENT_DATE_800_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginHoldCurrYy800;
            protected  int beginHoldCurrMm800;
            protected  int beginHoldCurrDd800;
	
	/**
	* Constructor for HoldCurrentDate800Serialized
	**/
    public HoldCurrentDate800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in HoldCurrentDate800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HOLD_CURRENT_DATE_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginHoldCurrYy800 = getStartOffset() + 0;	// set offset for serialization
  
             beginHoldCurrMm800 = getStartOffset() + 2;	// set offset for serialization
  
             beginHoldCurrDd800 = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localHoldCurrYy800Counter = -1;
     public boolean isHoldCurrYy800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHoldCurrYy800Counter != sharedCounter;
         localHoldCurrYy800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of holdCurrYy800
	 *	@return holdCurrYy800
	 */
	public char[]  getHoldCurrYy800String() {
	     return getCharArray(beginHoldCurrYy800,HOLD_CURR_YY_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean holdCurrYy800IsNumeric() {
	    return isNumeric(beginHoldCurrYy800
	                    ,beginHoldCurrYy800 + HOLD_CURR_YY_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int HOLD_CURR_YY_800_LEN = 2;
  	/**
	 * serializeHoldCurrYy800
	 */
	protected void serializeHoldCurrYy800(int holdCurrYy800) {
		 putNumber(beginHoldCurrYy800,holdCurrYy800,HOLD_CURR_YY_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localHoldCurrYy800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeHoldCurrYy800
	 */
   	protected  int serializeHoldCurrYy800(char[] value) {
	    int  holdCurrYy800;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    holdCurrYy800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginHoldCurrYy800
		       ,2
		      );
		 localHoldCurrYy800Counter = shareString.getSerializedField().getModifiedCounter();
		return  holdCurrYy800;
    }

   protected int checkHoldCurrYy800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshHoldCurrYy800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshHoldCurrYy800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginHoldCurrYy800
			                 ,HOLD_CURR_YY_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("holdCurrYy800", beginHoldCurrYy800,HOLD_CURR_YY_800_LEN);
    }
   	}
     int localHoldCurrMm800Counter = -1;
     public boolean isHoldCurrMm800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHoldCurrMm800Counter != sharedCounter;
         localHoldCurrMm800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of holdCurrMm800
	 *	@return holdCurrMm800
	 */
	public char[]  getHoldCurrMm800String() {
	     return getCharArray(beginHoldCurrMm800,HOLD_CURR_MM_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean holdCurrMm800IsNumeric() {
	    return isNumeric(beginHoldCurrMm800
	                    ,beginHoldCurrMm800 + HOLD_CURR_MM_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int HOLD_CURR_MM_800_LEN = 2;
  	/**
	 * serializeHoldCurrMm800
	 */
	protected void serializeHoldCurrMm800(int holdCurrMm800) {
		 putNumber(beginHoldCurrMm800,holdCurrMm800,HOLD_CURR_MM_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localHoldCurrMm800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeHoldCurrMm800
	 */
   	protected  int serializeHoldCurrMm800(char[] value) {
	    int  holdCurrMm800;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    holdCurrMm800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginHoldCurrMm800
		       ,2
		      );
		 localHoldCurrMm800Counter = shareString.getSerializedField().getModifiedCounter();
		return  holdCurrMm800;
    }

   protected int checkHoldCurrMm800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshHoldCurrMm800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshHoldCurrMm800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginHoldCurrMm800
			                 ,HOLD_CURR_MM_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("holdCurrMm800", beginHoldCurrMm800,HOLD_CURR_MM_800_LEN);
    }
   	}
     int localHoldCurrDd800Counter = -1;
     public boolean isHoldCurrDd800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHoldCurrDd800Counter != sharedCounter;
         localHoldCurrDd800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of holdCurrDd800
	 *	@return holdCurrDd800
	 */
	public char[]  getHoldCurrDd800String() {
	     return getCharArray(beginHoldCurrDd800,HOLD_CURR_DD_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean holdCurrDd800IsNumeric() {
	    return isNumeric(beginHoldCurrDd800
	                    ,beginHoldCurrDd800 + HOLD_CURR_DD_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int HOLD_CURR_DD_800_LEN = 2;
  	/**
	 * serializeHoldCurrDd800
	 */
	protected void serializeHoldCurrDd800(int holdCurrDd800) {
		 putNumber(beginHoldCurrDd800,holdCurrDd800,HOLD_CURR_DD_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localHoldCurrDd800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeHoldCurrDd800
	 */
   	protected  int serializeHoldCurrDd800(char[] value) {
	    int  holdCurrDd800;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    holdCurrDd800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginHoldCurrDd800
		       ,2
		      );
		 localHoldCurrDd800Counter = shareString.getSerializedField().getModifiedCounter();
		return  holdCurrDd800;
    }

   protected int checkHoldCurrDd800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshHoldCurrDd800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshHoldCurrDd800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginHoldCurrDd800
			                 ,HOLD_CURR_DD_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("holdCurrDd800", beginHoldCurrDd800,HOLD_CURR_DD_800_LEN);
    }
   	}




}
  
