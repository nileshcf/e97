package com.cloudframe.app.ip670010.dto.serialize;

/**
*  The class CtcDate802Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:55. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CtcDate802Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CtcDate802Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CTC_DATE_802_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCtcCcyy802;
	
	/**
	* Constructor for CtcDate802Serialized
	**/
    public CtcDate802Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in CtcDate802Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CTC_DATE_802_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCtcCcyy802 = getStartOffset() + 0;	// set offset for serialization
  
  
  
  
	   /*  end of offset */
	}
     int localCtcCcyy802Counter = -1;
     public boolean isCtcCcyy802Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCtcCcyy802Counter != sharedCounter;
         localCtcCcyy802Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ctcCcyy802
	 *	@return ctcCcyy802
	 */
	public char[]  getCtcCcyy802String() {
	     return getCharArray(beginCtcCcyy802,CTC_CCYY_802_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ctcCcyy802IsNumeric() {
	    return isNumeric(beginCtcCcyy802
	                    ,beginCtcCcyy802 + CTC_CCYY_802_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CTC_CCYY_802_LEN = 4;
  	/**
	 * serializeCtcCcyy802
	 */
	protected void serializeCtcCcyy802(int ctcCcyy802) {
		 putNumber(beginCtcCcyy802,ctcCcyy802,CTC_CCYY_802_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCtcCcyy802Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCtcCcyy802
	 */
   	protected  int serializeCtcCcyy802(char[] value) {
	    int  ctcCcyy802;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ctcCcyy802 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginCtcCcyy802
		       ,4
		      );
		 localCtcCcyy802Counter = shareString.getSerializedField().getModifiedCounter();
		return  ctcCcyy802;
    }

   protected int checkCtcCcyy802MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCtcCcyy802 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCtcCcyy802() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCtcCcyy802
			                 ,CTC_CCYY_802_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ctcCcyy802", beginCtcCcyy802,CTC_CCYY_802_LEN);
    }
   	}




}
  
