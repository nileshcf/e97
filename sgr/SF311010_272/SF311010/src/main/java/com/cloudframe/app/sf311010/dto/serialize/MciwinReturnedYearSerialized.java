package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class MciwinReturnedYearSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MciwinReturnedYearSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MciwinReturnedYearSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MCIWIN_RETURNED_YEAR_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMciwinRetCentury;
            protected  int beginMciwinRetYearL2;
	
	/**
	* Constructor for MciwinReturnedYearSerialized
	**/
    public MciwinReturnedYearSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in MciwinReturnedYearSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MCIWIN_RETURNED_YEAR_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMciwinRetCentury = getStartOffset() + 0;	// set offset for serialization
  
             beginMciwinRetYearL2 = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMciwinRetCenturyCounter = -1;
     public boolean isMciwinRetCenturyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMciwinRetCenturyCounter != sharedCounter;
         localMciwinRetCenturyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of mciwinRetCentury
	 *	@return mciwinRetCentury
	 */
	public char[]  getMciwinRetCenturyString() {
	     return getCharArray(beginMciwinRetCentury,MCIWIN_RET_CENTURY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean mciwinRetCenturyIsNumeric() {
	    return isNumeric(beginMciwinRetCentury
	                    ,beginMciwinRetCentury + MCIWIN_RET_CENTURY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MCIWIN_RET_CENTURY_LEN = 2;
  	/**
	 * serializeMciwinRetCentury
	 */
	protected void serializeMciwinRetCentury(int mciwinRetCentury) {
		 putNumber(beginMciwinRetCentury,mciwinRetCentury,MCIWIN_RET_CENTURY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMciwinRetCenturyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMciwinRetCentury
	 */
   	protected  int serializeMciwinRetCentury(char[] value) {
	    int  mciwinRetCentury;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    mciwinRetCentury = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginMciwinRetCentury
		       ,2
		      );
		 localMciwinRetCenturyCounter = shareString.getSerializedField().getModifiedCounter();
		return  mciwinRetCentury;
    }

   protected int checkMciwinRetCenturyMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMciwinRetCentury is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMciwinRetCentury() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMciwinRetCentury
			                 ,MCIWIN_RET_CENTURY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("mciwinRetCentury", beginMciwinRetCentury,MCIWIN_RET_CENTURY_LEN);
    }
   	}
     int localMciwinRetYearL2Counter = -1;
     public boolean isMciwinRetYearL2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMciwinRetYearL2Counter != sharedCounter;
         localMciwinRetYearL2Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of mciwinRetYearL2
	 *	@return mciwinRetYearL2
	 */
	public char[]  getMciwinRetYearL2String() {
	     return getCharArray(beginMciwinRetYearL2,MCIWIN_RET_YEAR_L_2_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean mciwinRetYearL2IsNumeric() {
	    return isNumeric(beginMciwinRetYearL2
	                    ,beginMciwinRetYearL2 + MCIWIN_RET_YEAR_L_2_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MCIWIN_RET_YEAR_L_2_LEN = 2;
  	/**
	 * serializeMciwinRetYearL2
	 */
	protected void serializeMciwinRetYearL2(int mciwinRetYearL2) {
		 putNumber(beginMciwinRetYearL2,mciwinRetYearL2,MCIWIN_RET_YEAR_L_2_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMciwinRetYearL2Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMciwinRetYearL2
	 */
   	protected  int serializeMciwinRetYearL2(char[] value) {
	    int  mciwinRetYearL2;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    mciwinRetYearL2 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginMciwinRetYearL2
		       ,2
		      );
		 localMciwinRetYearL2Counter = shareString.getSerializedField().getModifiedCounter();
		return  mciwinRetYearL2;
    }

   protected int checkMciwinRetYearL2MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMciwinRetYearL2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMciwinRetYearL2() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMciwinRetYearL2
			                 ,MCIWIN_RET_YEAR_L_2_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("mciwinRetYearL2", beginMciwinRetYearL2,MCIWIN_RET_YEAR_L_2_LEN);
    }
   	}




}
  
