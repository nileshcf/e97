package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class Ar647ErrorMsg661Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ar647ErrorMsg661Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ar647ErrorMsg661Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int AR_647_ERROR_MSG_661_LENGTH = 68;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAr647ReturnCode661;
	
	/**
	* Constructor for Ar647ErrorMsg661Serialized
	**/
    public Ar647ErrorMsg661Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ar647ErrorMsg661Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(AR_647_ERROR_MSG_661_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
             beginAr647ReturnCode661 = getStartOffset() + 64;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localAr647ReturnCode661Counter = -1;
     public boolean isAr647ReturnCode661Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAr647ReturnCode661Counter != sharedCounter;
         localAr647ReturnCode661Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ar647ReturnCode661
	 *	@return ar647ReturnCode661
	 */
	public char[]  getAr647ReturnCode661String() {
	     return getCharArray(beginAr647ReturnCode661,AR_647_RETURN_CODE_661_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ar647ReturnCode661IsNumeric() {
	    return isNumeric(beginAr647ReturnCode661
	                    ,beginAr647ReturnCode661 + AR_647_RETURN_CODE_661_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int AR_647_RETURN_CODE_661_LEN = 4;
  	/**
	 * serializeAr647ReturnCode661
	 */
	protected void serializeAr647ReturnCode661(int ar647ReturnCode661) {
		 putNumber(beginAr647ReturnCode661,ar647ReturnCode661,AR_647_RETURN_CODE_661_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localAr647ReturnCode661Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeAr647ReturnCode661
	 */
   	protected  int serializeAr647ReturnCode661(char[] value) {
	    int  ar647ReturnCode661;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ar647ReturnCode661 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginAr647ReturnCode661
		       ,4
		      );
		 localAr647ReturnCode661Counter = shareString.getSerializedField().getModifiedCounter();
		return  ar647ReturnCode661;
    }

   protected int checkAr647ReturnCode661MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshAr647ReturnCode661 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshAr647ReturnCode661() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginAr647ReturnCode661
			                 ,AR_647_RETURN_CODE_661_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ar647ReturnCode661", beginAr647ReturnCode661,AR_647_RETURN_CODE_661_LEN);
    }
   	}




}
  
