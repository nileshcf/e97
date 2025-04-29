package com.cloudframe.app.mcwin.dto.serialize;

/**
*  The class MciwinFormats800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MciwinFormats800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MciwinFormats800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MCIWIN_FORMATS_800_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMciwin2DigitYearZd800;
	
	/**
	* Constructor for MciwinFormats800Serialized
	**/
    public MciwinFormats800Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MciwinFormats800Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MciwinFormats800Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MciwinFormats800Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this MciwinFormats800Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in MciwinFormats800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MCIWIN_FORMATS_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMciwin2DigitYearZd800 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localMciwin2DigitYearZd800Counter = -1;
     public boolean isMciwin2DigitYearZd800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMciwin2DigitYearZd800Counter != sharedCounter;
         localMciwin2DigitYearZd800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of mciwin2DigitYearZd800
	 *	@return mciwin2DigitYearZd800
	 */
	public char[]  getMciwin2DigitYearZd800String() {
	     return getCharArray(beginMciwin2DigitYearZd800,MCIWIN_2_DIGIT_YEAR_ZD_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean mciwin2DigitYearZd800IsNumeric() {
	    return isNumeric(beginMciwin2DigitYearZd800
	                    ,beginMciwin2DigitYearZd800 + MCIWIN_2_DIGIT_YEAR_ZD_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MCIWIN_2_DIGIT_YEAR_ZD_800_LEN = 2;
  	/**
	 * serializeMciwin2DigitYearZd800
	 */
	protected void serializeMciwin2DigitYearZd800(int mciwin2DigitYearZd800) {
		 putNumber(beginMciwin2DigitYearZd800,mciwin2DigitYearZd800,MCIWIN_2_DIGIT_YEAR_ZD_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMciwin2DigitYearZd800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMciwin2DigitYearZd800
	 */
   	protected  int serializeMciwin2DigitYearZd800(char[] value) {
	    int  mciwin2DigitYearZd800;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    mciwin2DigitYearZd800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginMciwin2DigitYearZd800
		       ,2
		      );
		 localMciwin2DigitYearZd800Counter = shareString.getSerializedField().getModifiedCounter();
		return  mciwin2DigitYearZd800;
    }

   protected int checkMciwin2DigitYearZd800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMciwin2DigitYearZd800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMciwin2DigitYearZd800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMciwin2DigitYearZd800
			                 ,MCIWIN_2_DIGIT_YEAR_ZD_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("mciwin2DigitYearZd800", beginMciwin2DigitYearZd800,MCIWIN_2_DIGIT_YEAR_ZD_800_LEN);
    }
   	}




}
  
