package com.cloudframe.app.mcwin.dto.serialize;

/**
*  The class MciwinReturnedYear800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MciwinReturnedYear800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MciwinReturnedYear800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MCIWIN_RETURNED_YEAR_800_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMciwinRetCentury800;
            protected  int beginMciwinRetYearL2800;
	
	/**
	* Constructor for MciwinReturnedYear800Serialized
	**/
    public MciwinReturnedYear800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in MciwinReturnedYear800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MCIWIN_RETURNED_YEAR_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMciwinRetCentury800 = getStartOffset() + 0;	// set offset for serialization
  
             beginMciwinRetYearL2800 = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMciwinRetCentury800Counter = -1;
     public boolean isMciwinRetCentury800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMciwinRetCentury800Counter != sharedCounter;
         localMciwinRetCentury800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of mciwinRetCentury800
	 *	@return mciwinRetCentury800
	 */
	public char[]  getMciwinRetCentury800String() {
	     return getCharArray(beginMciwinRetCentury800,MCIWIN_RET_CENTURY_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean mciwinRetCentury800IsNumeric() {
	    return isNumeric(beginMciwinRetCentury800
	                    ,beginMciwinRetCentury800 + MCIWIN_RET_CENTURY_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MCIWIN_RET_CENTURY_800_LEN = 2;
  	/**
	 * serializeMciwinRetCentury800
	 */
	protected void serializeMciwinRetCentury800(int mciwinRetCentury800) {
		 putNumber(beginMciwinRetCentury800,mciwinRetCentury800,MCIWIN_RET_CENTURY_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMciwinRetCentury800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMciwinRetCentury800
	 */
   	protected  int serializeMciwinRetCentury800(char[] value) {
	    int  mciwinRetCentury800;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    mciwinRetCentury800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginMciwinRetCentury800
		       ,2
		      );
		 localMciwinRetCentury800Counter = shareString.getSerializedField().getModifiedCounter();
		return  mciwinRetCentury800;
    }

   protected int checkMciwinRetCentury800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMciwinRetCentury800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMciwinRetCentury800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMciwinRetCentury800
			                 ,MCIWIN_RET_CENTURY_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("mciwinRetCentury800", beginMciwinRetCentury800,MCIWIN_RET_CENTURY_800_LEN);
    }
   	}
     int localMciwinRetYearL2800Counter = -1;
     public boolean isMciwinRetYearL2800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMciwinRetYearL2800Counter != sharedCounter;
         localMciwinRetYearL2800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of mciwinRetYearL2800
	 *	@return mciwinRetYearL2800
	 */
	public char[]  getMciwinRetYearL2800String() {
	     return getCharArray(beginMciwinRetYearL2800,MCIWIN_RET_YEAR_L_2800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean mciwinRetYearL2800IsNumeric() {
	    return isNumeric(beginMciwinRetYearL2800
	                    ,beginMciwinRetYearL2800 + MCIWIN_RET_YEAR_L_2800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MCIWIN_RET_YEAR_L_2800_LEN = 2;
  	/**
	 * serializeMciwinRetYearL2800
	 */
	protected void serializeMciwinRetYearL2800(int mciwinRetYearL2800) {
		 putNumber(beginMciwinRetYearL2800,mciwinRetYearL2800,MCIWIN_RET_YEAR_L_2800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMciwinRetYearL2800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMciwinRetYearL2800
	 */
   	protected  int serializeMciwinRetYearL2800(char[] value) {
	    int  mciwinRetYearL2800;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    mciwinRetYearL2800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginMciwinRetYearL2800
		       ,2
		      );
		 localMciwinRetYearL2800Counter = shareString.getSerializedField().getModifiedCounter();
		return  mciwinRetYearL2800;
    }

   protected int checkMciwinRetYearL2800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMciwinRetYearL2800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMciwinRetYearL2800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMciwinRetYearL2800
			                 ,MCIWIN_RET_YEAR_L_2800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("mciwinRetYearL2800", beginMciwinRetYearL2800,MCIWIN_RET_YEAR_L_2800_LEN);
    }
   	}




}
  
