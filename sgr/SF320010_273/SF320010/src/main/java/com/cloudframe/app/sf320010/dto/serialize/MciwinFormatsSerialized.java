package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class MciwinFormatsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MciwinFormatsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MciwinFormatsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MCIWIN_FORMATS_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMciwin2DigitYearZd;
	
	/**
	* Constructor for MciwinFormatsSerialized
	**/
    public MciwinFormatsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MciwinFormatsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MciwinFormatsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MciwinFormatsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this MciwinFormatsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in MciwinFormatsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MCIWIN_FORMATS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMciwin2DigitYearZd = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localMciwin2DigitYearZdCounter = -1;
     public boolean isMciwin2DigitYearZdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMciwin2DigitYearZdCounter != sharedCounter;
         localMciwin2DigitYearZdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of mciwin2DigitYearZd
	 *	@return mciwin2DigitYearZd
	 */
	public char[]  getMciwin2DigitYearZdString() {
	     return getCharArray(beginMciwin2DigitYearZd,MCIWIN_2_DIGIT_YEAR_ZD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean mciwin2DigitYearZdIsNumeric() {
	    return isNumeric(beginMciwin2DigitYearZd
	                    ,beginMciwin2DigitYearZd + MCIWIN_2_DIGIT_YEAR_ZD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MCIWIN_2_DIGIT_YEAR_ZD_LEN = 2;
  	/**
	 * serializeMciwin2DigitYearZd
	 */
	protected void serializeMciwin2DigitYearZd(int mciwin2DigitYearZd) {
		 putNumber(beginMciwin2DigitYearZd,mciwin2DigitYearZd,MCIWIN_2_DIGIT_YEAR_ZD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMciwin2DigitYearZdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMciwin2DigitYearZd
	 */
   	protected  int serializeMciwin2DigitYearZd(char[] value) {
	    int  mciwin2DigitYearZd;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    mciwin2DigitYearZd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginMciwin2DigitYearZd
		       ,2
		      );
		 localMciwin2DigitYearZdCounter = shareString.getSerializedField().getModifiedCounter();
		return  mciwin2DigitYearZd;
    }

   protected int checkMciwin2DigitYearZdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMciwin2DigitYearZd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMciwin2DigitYearZd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMciwin2DigitYearZd
			                 ,MCIWIN_2_DIGIT_YEAR_ZD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("mciwin2DigitYearZd", beginMciwin2DigitYearZd,MCIWIN_2_DIGIT_YEAR_ZD_LEN);
    }
   	}




}
  
