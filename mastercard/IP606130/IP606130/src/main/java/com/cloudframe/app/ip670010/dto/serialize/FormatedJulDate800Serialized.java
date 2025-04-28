package com.cloudframe.app.ip670010.dto.serialize;

/**
*  The class FormatedJulDate800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:54. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FormatedJulDate800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FormatedJulDate800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FORMATED_JUL_DATE_800_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginJulianDate800;
	
	/**
	* Constructor for FormatedJulDate800Serialized
	**/
    public FormatedJulDate800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in FormatedJulDate800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FORMATED_JUL_DATE_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginJulianDate800 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localJulianDate800Counter = -1;
     public boolean isJulianDate800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localJulianDate800Counter != sharedCounter;
         localJulianDate800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of julianDate800
	 *	@return julianDate800
	 */
	public char[]  getJulianDate800String() {
	     return getCharArray(beginJulianDate800,JULIAN_DATE_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean julianDate800IsNumeric() {
	    return isNumeric(beginJulianDate800
	                    ,beginJulianDate800 + JULIAN_DATE_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int JULIAN_DATE_800_LEN = 7;
  	/**
	 * serializeJulianDate800
	 */
	protected void serializeJulianDate800(long julianDate800) {
		 putNumber(beginJulianDate800,julianDate800,JULIAN_DATE_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localJulianDate800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeJulianDate800
	 */
   	protected  long serializeJulianDate800(char[] value) {
	    long  julianDate800;
	    if(value.length >0 && value.length!= 7)
            value = new String(value).trim().toCharArray();
	    if (value.length < 7) value = pad(7, value, ' ', LEFT_PAD);
	    else if (value.length > 7) value = substring(value,0,7);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    julianDate800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(7,value,false/*isSigned?*/)
		       ,beginJulianDate800
		       ,7
		      );
		 localJulianDate800Counter = shareString.getSerializedField().getModifiedCounter();
		return  julianDate800;
    }

   protected long checkJulianDate800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshJulianDate800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshJulianDate800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginJulianDate800
			                 ,JULIAN_DATE_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("julianDate800", beginJulianDate800,JULIAN_DATE_800_LEN);
    }
   	}




}
  
