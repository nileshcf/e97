package com.cloudframe.app.ip670010.dto.serialize;

/**
*  The class CtcCcyy2Group802Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:25. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CtcCcyy2Group802Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CtcCcyy2Group802Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CTC_CCYY_2_GROUP_802_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCtcCcyy2802;
	
	/**
	* Constructor for CtcCcyy2Group802Serialized
	**/
    public CtcCcyy2Group802Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in CtcCcyy2Group802Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CTC_CCYY_2_GROUP_802_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCtcCcyy2802 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localCtcCcyy2802Counter = -1;
     public boolean isCtcCcyy2802Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCtcCcyy2802Counter != sharedCounter;
         localCtcCcyy2802Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ctcCcyy2802
	 *	@return ctcCcyy2802
	 */
	public char[]  getCtcCcyy2802String() {
	     return getCharArray(beginCtcCcyy2802,CTC_CCYY_2802_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ctcCcyy2802IsNumeric() {
	    return isNumeric(beginCtcCcyy2802
	                    ,beginCtcCcyy2802 + CTC_CCYY_2802_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CTC_CCYY_2802_LEN = 4;
  	/**
	 * serializeCtcCcyy2802
	 */
	protected void serializeCtcCcyy2802(int ctcCcyy2802) {
		 putNumber(beginCtcCcyy2802,ctcCcyy2802,CTC_CCYY_2802_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCtcCcyy2802Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCtcCcyy2802
	 */
   	protected  int serializeCtcCcyy2802(char[] value) {
	    int  ctcCcyy2802;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ctcCcyy2802 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginCtcCcyy2802
		       ,4
		      );
		 localCtcCcyy2802Counter = shareString.getSerializedField().getModifiedCounter();
		return  ctcCcyy2802;
    }

   protected int checkCtcCcyy2802MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCtcCcyy2802 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCtcCcyy2802() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCtcCcyy2802
			                 ,CTC_CCYY_2802_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ctcCcyy2802", beginCtcCcyy2802,CTC_CCYY_2802_LEN);
    }
   	}




}
  
