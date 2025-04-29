package com.cloudframe.app.bm8090m.dto.serialize;

/**
*  The class WTipPerGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:28. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WTipPerGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WTipPerGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int W_TIP_PER_GROUP_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWTipPer01;
	
	/**
	* Constructor for WTipPerGroupSerialized
	**/
    public WTipPerGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WTipPerGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(W_TIP_PER_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWTipPer01 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localWTipPer01Counter = -1;
     public boolean isWTipPer01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWTipPer01Counter != sharedCounter;
         localWTipPer01Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of wTipPer01
	 *	@return wTipPer01
	 */
	public char[]  getWTipPer01String() {
	     return getCharArray(beginWTipPer01,W_TIP_PER_01_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wTipPer01IsNumeric() {
	    return isNumeric(beginWTipPer01
	                    ,beginWTipPer01 + W_TIP_PER_01_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int W_TIP_PER_01_LEN = 2;
  	/**
	 * serializeWTipPer01
	 */
	protected void serializeWTipPer01(int wTipPer01) {
		 putNumber(beginWTipPer01,wTipPer01,W_TIP_PER_01_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWTipPer01Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWTipPer01
	 */
   	protected  int serializeWTipPer01(char[] value) {
	    int  wTipPer01;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    wTipPer01 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginWTipPer01
		       ,2
		      );
		 localWTipPer01Counter = shareString.getSerializedField().getModifiedCounter();
		return  wTipPer01;
    }

   protected int checkWTipPer01MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWTipPer01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWTipPer01() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginWTipPer01
			                 ,W_TIP_PER_01_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("wTipPer01", beginWTipPer01,W_TIP_PER_01_LEN);
    }
   	}




}
  
