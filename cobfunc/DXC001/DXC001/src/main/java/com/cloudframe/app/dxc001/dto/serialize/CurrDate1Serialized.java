package com.cloudframe.app.dxc001.dto.serialize;

/**
*  The class CurrDate1Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:54. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CurrDate1Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CurrDate1Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CURR_DATE_1_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginChckYear1;
            protected  int beginChckMonth1;
            protected  int beginChckDay1;
	
	/**
	* Constructor for CurrDate1Serialized
	**/
    public CurrDate1Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in CurrDate1Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CURR_DATE_1_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginChckYear1 = getStartOffset() + 0;	// set offset for serialization
  
             beginChckMonth1 = getStartOffset() + 4;	// set offset for serialization
  
             beginChckDay1 = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localChckYear1Counter = -1;
     public boolean isChckYear1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localChckYear1Counter != sharedCounter;
         localChckYear1Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of chckYear1
	 *	@return chckYear1
	 */
	public char[]  getChckYear1String() {
	     return getCharArray(beginChckYear1,CHCK_YEAR_1_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean chckYear1IsNumeric() {
	    return isNumeric(beginChckYear1
	                    ,beginChckYear1 + CHCK_YEAR_1_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CHCK_YEAR_1_LEN = 4;
  	/**
	 * serializeChckYear1
	 */
	protected void serializeChckYear1(int chckYear1) {
		 putNumber(beginChckYear1,chckYear1,CHCK_YEAR_1_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localChckYear1Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeChckYear1
	 */
   	protected  int serializeChckYear1(char[] value) {
	    int  chckYear1;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    chckYear1 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginChckYear1
		       ,4
		      );
		 localChckYear1Counter = shareString.getSerializedField().getModifiedCounter();
		return  chckYear1;
    }

   protected int checkChckYear1MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshChckYear1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshChckYear1() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginChckYear1
			                 ,CHCK_YEAR_1_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("chckYear1", beginChckYear1,CHCK_YEAR_1_LEN);
    }
   	}
     int localChckMonth1Counter = -1;
     public boolean isChckMonth1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localChckMonth1Counter != sharedCounter;
         localChckMonth1Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of chckMonth1
	 *	@return chckMonth1
	 */
	public char[]  getChckMonth1String() {
	     return getCharArray(beginChckMonth1,CHCK_MONTH_1_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean chckMonth1IsNumeric() {
	    return isNumeric(beginChckMonth1
	                    ,beginChckMonth1 + CHCK_MONTH_1_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CHCK_MONTH_1_LEN = 2;
  	/**
	 * serializeChckMonth1
	 */
	protected void serializeChckMonth1(int chckMonth1) {
		 putNumber(beginChckMonth1,chckMonth1,CHCK_MONTH_1_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localChckMonth1Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeChckMonth1
	 */
   	protected  int serializeChckMonth1(char[] value) {
	    int  chckMonth1;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    chckMonth1 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginChckMonth1
		       ,2
		      );
		 localChckMonth1Counter = shareString.getSerializedField().getModifiedCounter();
		return  chckMonth1;
    }

   protected int checkChckMonth1MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshChckMonth1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshChckMonth1() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginChckMonth1
			                 ,CHCK_MONTH_1_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("chckMonth1", beginChckMonth1,CHCK_MONTH_1_LEN);
    }
   	}
     int localChckDay1Counter = -1;
     public boolean isChckDay1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localChckDay1Counter != sharedCounter;
         localChckDay1Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of chckDay1
	 *	@return chckDay1
	 */
	public char[]  getChckDay1String() {
	     return getCharArray(beginChckDay1,CHCK_DAY_1_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean chckDay1IsNumeric() {
	    return isNumeric(beginChckDay1
	                    ,beginChckDay1 + CHCK_DAY_1_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CHCK_DAY_1_LEN = 2;
  	/**
	 * serializeChckDay1
	 */
	protected void serializeChckDay1(int chckDay1) {
		 putNumber(beginChckDay1,chckDay1,CHCK_DAY_1_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localChckDay1Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeChckDay1
	 */
   	protected  int serializeChckDay1(char[] value) {
	    int  chckDay1;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    chckDay1 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginChckDay1
		       ,2
		      );
		 localChckDay1Counter = shareString.getSerializedField().getModifiedCounter();
		return  chckDay1;
    }

   protected int checkChckDay1MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshChckDay1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshChckDay1() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginChckDay1
			                 ,CHCK_DAY_1_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("chckDay1", beginChckDay1,CHCK_DAY_1_LEN);
    }
   	}




}
  
