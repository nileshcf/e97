package com.cloudframe.app.ip343690.dto.serialize;

/**
*  The class Db2Workarea800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Db2Workarea800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Db2Workarea800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DB_2_WORKAREA_800_LENGTH = 26;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAbendCd800;
            protected  int beginNoTimes911Try800;
            protected  int beginCurrTime800;
	
	/**
	* Constructor for Db2Workarea800Serialized
	**/
    public Db2Workarea800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Db2Workarea800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DB_2_WORKAREA_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginAbendCd800 = getStartOffset() + 0;	// set offset for serialization
  
  
             beginNoTimes911Try800 = getStartOffset() + 8;	// set offset for serialization
  
  
             beginCurrTime800 = getStartOffset() + 18;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localAbendCd800Counter = -1;
     public boolean isAbendCd800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendCd800Counter != sharedCounter;
         localAbendCd800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of abendCd800
	 *	@return abendCd800
	 */
	public char[]  getAbendCd800String() {
	     return getCharArray(beginAbendCd800,ABEND_CD_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean abendCd800IsNumeric() {
	    return isNumeric(beginAbendCd800
	                    ,beginAbendCd800 + ABEND_CD_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int ABEND_CD_800_LEN = 4;
  	/**
	 * serializeAbendCd800
	 */
	protected void serializeAbendCd800(int abendCd800) {
		 putNumber(beginAbendCd800,abendCd800,ABEND_CD_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localAbendCd800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeAbendCd800
	 */
   	protected  int serializeAbendCd800(char[] value) {
	    int  abendCd800;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    abendCd800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginAbendCd800
		       ,4
		      );
		 localAbendCd800Counter = shareString.getSerializedField().getModifiedCounter();
		return  abendCd800;
    }

   protected int checkAbendCd800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshAbendCd800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshAbendCd800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginAbendCd800
			                 ,ABEND_CD_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("abendCd800", beginAbendCd800,ABEND_CD_800_LEN);
    }
   	}
     int localNoTimes911Try800Counter = -1;
     public boolean isNoTimes911Try800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNoTimes911Try800Counter != sharedCounter;
         localNoTimes911Try800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of noTimes911Try800
	 *	@return noTimes911Try800
	 */
	public char[]  getNoTimes911Try800String() {
	     return getCharArray(beginNoTimes911Try800,NO_TIMES_911_TRY_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean noTimes911Try800IsNumeric() {
	    return isNumeric(beginNoTimes911Try800
	                    ,beginNoTimes911Try800 + NO_TIMES_911_TRY_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int NO_TIMES_911_TRY_800_LEN = 2;
  	/**
	 * serializeNoTimes911Try800
	 */
	protected void serializeNoTimes911Try800(int noTimes911Try800) {
		 putNumber(beginNoTimes911Try800,noTimes911Try800,NO_TIMES_911_TRY_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localNoTimes911Try800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeNoTimes911Try800
	 */
   	protected  int serializeNoTimes911Try800(char[] value) {
	    int  noTimes911Try800;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    noTimes911Try800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginNoTimes911Try800
		       ,2
		      );
		 localNoTimes911Try800Counter = shareString.getSerializedField().getModifiedCounter();
		return  noTimes911Try800;
    }

   protected int checkNoTimes911Try800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshNoTimes911Try800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshNoTimes911Try800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginNoTimes911Try800
			                 ,NO_TIMES_911_TRY_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("noTimes911Try800", beginNoTimes911Try800,NO_TIMES_911_TRY_800_LEN);
    }
   	}
     int localCurrTime800Counter = -1;
     public boolean isCurrTime800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrTime800Counter != sharedCounter;
         localCurrTime800Counter = sharedCounter; return hasModified;
     }
	protected static final int CURR_TIME_800_LEN = 8;
	/**
	 * 	serialize this CurrTime800
	 */
   protected void serializeCurrTime800(char[] currTime800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(currTime800,0,getStringValue(),beginCurrTime800,CURR_TIME_800_LEN);
       localCurrTime800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCurrTime800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshCurrTime800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCurrTime800() {	 
   		return (substring(getStringValue(),beginCurrTime800,beginCurrTime800 + CURR_TIME_800_LEN));
   	}




}
  
