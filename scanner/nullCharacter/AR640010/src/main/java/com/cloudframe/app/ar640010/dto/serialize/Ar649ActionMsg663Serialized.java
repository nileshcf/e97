package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class Ar649ActionMsg663Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:49. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ar649ActionMsg663Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ar649ActionMsg663Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int AR_649_ACTION_MSG_663_LENGTH = 52;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAr649ActionCode663;
	
	/**
	* Constructor for Ar649ActionMsg663Serialized
	**/
    public Ar649ActionMsg663Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ar649ActionMsg663Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(AR_649_ACTION_MSG_663_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginAr649ActionCode663 = getStartOffset() + 48;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localAr649ActionCode663Counter = -1;
     public boolean isAr649ActionCode663Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAr649ActionCode663Counter != sharedCounter;
         localAr649ActionCode663Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ar649ActionCode663
	 *	@return ar649ActionCode663
	 */
	public char[]  getAr649ActionCode663String() {
	     return getCharArray(beginAr649ActionCode663,AR_649_ACTION_CODE_663_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ar649ActionCode663IsNumeric() {
	    return isNumeric(beginAr649ActionCode663
	                    ,beginAr649ActionCode663 + AR_649_ACTION_CODE_663_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int AR_649_ACTION_CODE_663_LEN = 4;
  	/**
	 * serializeAr649ActionCode663
	 */
	protected void serializeAr649ActionCode663(int ar649ActionCode663) {
		 putNumber(beginAr649ActionCode663,ar649ActionCode663,AR_649_ACTION_CODE_663_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localAr649ActionCode663Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeAr649ActionCode663
	 */
   	protected  int serializeAr649ActionCode663(char[] value) {
	    int  ar649ActionCode663;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ar649ActionCode663 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginAr649ActionCode663
		       ,4
		      );
		 localAr649ActionCode663Counter = shareString.getSerializedField().getModifiedCounter();
		return  ar649ActionCode663;
    }

   protected int checkAr649ActionCode663MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshAr649ActionCode663 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshAr649ActionCode663() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginAr649ActionCode663
			                 ,AR_649_ACTION_CODE_663_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ar649ActionCode663", beginAr649ActionCode663,AR_649_ACTION_CODE_663_LEN);
    }
   	}




}
  
