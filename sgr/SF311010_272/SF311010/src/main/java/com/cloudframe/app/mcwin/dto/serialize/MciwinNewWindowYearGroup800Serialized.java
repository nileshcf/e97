package com.cloudframe.app.mcwin.dto.serialize;

/**
*  The class MciwinNewWindowYearGroup800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:27. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MciwinNewWindowYearGroup800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MciwinNewWindowYearGroup800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MCIWIN_NEW_WINDOW_YEAR_GROUP_800_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMciwinNewWindowYear800;
	
	/**
	* Constructor for MciwinNewWindowYearGroup800Serialized
	**/
    public MciwinNewWindowYearGroup800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in MciwinNewWindowYearGroup800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MCIWIN_NEW_WINDOW_YEAR_GROUP_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMciwinNewWindowYear800 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMciwinNewWindowYear800Counter = -1;
     public boolean isMciwinNewWindowYear800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMciwinNewWindowYear800Counter != sharedCounter;
         localMciwinNewWindowYear800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of mciwinNewWindowYear800
	 *	@return mciwinNewWindowYear800
	 */
	public char[]  getMciwinNewWindowYear800String() {
	     return getCharArray(beginMciwinNewWindowYear800,MCIWIN_NEW_WINDOW_YEAR_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean mciwinNewWindowYear800IsNumeric() {
	    return isNumeric(beginMciwinNewWindowYear800
	                    ,beginMciwinNewWindowYear800 + MCIWIN_NEW_WINDOW_YEAR_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MCIWIN_NEW_WINDOW_YEAR_800_LEN = 2;
  	/**
	 * serializeMciwinNewWindowYear800
	 */
	protected void serializeMciwinNewWindowYear800(int mciwinNewWindowYear800) {
		 putNumber(beginMciwinNewWindowYear800,mciwinNewWindowYear800,MCIWIN_NEW_WINDOW_YEAR_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMciwinNewWindowYear800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMciwinNewWindowYear800
	 */
   	protected  int serializeMciwinNewWindowYear800(char[] value) {
	    int  mciwinNewWindowYear800;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    mciwinNewWindowYear800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginMciwinNewWindowYear800
		       ,2
		      );
		 localMciwinNewWindowYear800Counter = shareString.getSerializedField().getModifiedCounter();
		return  mciwinNewWindowYear800;
    }

   protected int checkMciwinNewWindowYear800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMciwinNewWindowYear800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMciwinNewWindowYear800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMciwinNewWindowYear800
			                 ,MCIWIN_NEW_WINDOW_YEAR_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("mciwinNewWindowYear800", beginMciwinNewWindowYear800,MCIWIN_NEW_WINDOW_YEAR_800_LEN);
    }
   	}




}
  
