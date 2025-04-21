package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class MciwinNewWindowYearGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MciwinNewWindowYearGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MciwinNewWindowYearGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MCIWIN_NEW_WINDOW_YEAR_GROUP_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMciwinNewWindowYear;
	
	/**
	* Constructor for MciwinNewWindowYearGroupSerialized
	**/
    public MciwinNewWindowYearGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in MciwinNewWindowYearGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MCIWIN_NEW_WINDOW_YEAR_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMciwinNewWindowYear = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMciwinNewWindowYearCounter = -1;
     public boolean isMciwinNewWindowYearModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMciwinNewWindowYearCounter != sharedCounter;
         localMciwinNewWindowYearCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of mciwinNewWindowYear
	 *	@return mciwinNewWindowYear
	 */
	public char[]  getMciwinNewWindowYearString() {
	     return getCharArray(beginMciwinNewWindowYear,MCIWIN_NEW_WINDOW_YEAR_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean mciwinNewWindowYearIsNumeric() {
	    return isNumeric(beginMciwinNewWindowYear
	                    ,beginMciwinNewWindowYear + MCIWIN_NEW_WINDOW_YEAR_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MCIWIN_NEW_WINDOW_YEAR_LEN = 2;
  	/**
	 * serializeMciwinNewWindowYear
	 */
	protected void serializeMciwinNewWindowYear(int mciwinNewWindowYear) {
		 putNumber(beginMciwinNewWindowYear,mciwinNewWindowYear,MCIWIN_NEW_WINDOW_YEAR_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMciwinNewWindowYearCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMciwinNewWindowYear
	 */
   	protected  int serializeMciwinNewWindowYear(char[] value) {
	    int  mciwinNewWindowYear;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    mciwinNewWindowYear = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginMciwinNewWindowYear
		       ,2
		      );
		 localMciwinNewWindowYearCounter = shareString.getSerializedField().getModifiedCounter();
		return  mciwinNewWindowYear;
    }

   protected int checkMciwinNewWindowYearMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMciwinNewWindowYear is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMciwinNewWindowYear() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMciwinNewWindowYear
			                 ,MCIWIN_NEW_WINDOW_YEAR_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("mciwinNewWindowYear", beginMciwinNewWindowYear,MCIWIN_NEW_WINDOW_YEAR_LEN);
    }
   	}




}
  
