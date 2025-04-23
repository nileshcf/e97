package com.cloudframe.app.mcwin.dto.serialize;

/**
*  The class WorkArea800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:27. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkArea800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkArea800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_AREA_800_LENGTH = 18;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginParmsCheck800;
            protected  int beginCurrYear1800;
            protected  int beginCurrYear2800;
            protected  int beginCurrYear3800;
            protected  int beginYearValue800;
	
	/**
	* Constructor for WorkArea800Serialized
	**/
    public WorkArea800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WorkArea800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WORK_AREA_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginParmsCheck800 = getStartOffset() + 0;	// set offset for serialization
  
             beginCurrYear1800 = getStartOffset() + 2;	// set offset for serialization
  
             beginCurrYear2800 = getStartOffset() + 8;	// set offset for serialization
  
             beginCurrYear3800 = getStartOffset() + 13;	// set offset for serialization
  
             beginYearValue800 = getStartOffset() + 16;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localParmsCheck800Counter = -1;
     public boolean isParmsCheck800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localParmsCheck800Counter != sharedCounter;
         localParmsCheck800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of parmsCheck800
	 *	@return parmsCheck800
	 */
	public char[]  getParmsCheck800String() {
	     return getCharArray(beginParmsCheck800,PARMS_CHECK_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean parmsCheck800IsNumeric() {
	    return isNumeric(beginParmsCheck800
	                    ,beginParmsCheck800 + PARMS_CHECK_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PARMS_CHECK_800_LEN = 2;
  	/**
	 * serializeParmsCheck800
	 */
	protected void serializeParmsCheck800(int parmsCheck800) {
		 putNumber(beginParmsCheck800,parmsCheck800,PARMS_CHECK_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localParmsCheck800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeParmsCheck800
	 */
   	protected  int serializeParmsCheck800(char[] value) {
	    int  parmsCheck800;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    parmsCheck800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginParmsCheck800
		       ,2
		      );
		 localParmsCheck800Counter = shareString.getSerializedField().getModifiedCounter();
		return  parmsCheck800;
    }

   protected int checkParmsCheck800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshParmsCheck800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshParmsCheck800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginParmsCheck800
			                 ,PARMS_CHECK_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("parmsCheck800", beginParmsCheck800,PARMS_CHECK_800_LEN);
    }
   	}
     int localCurrYear1800Counter = -1;
     public boolean isCurrYear1800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrYear1800Counter != sharedCounter;
         localCurrYear1800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of currYear1800
	 *	@return currYear1800
	 */
	public char[]  getCurrYear1800String() {
	     return getCharArray(beginCurrYear1800,CURR_YEAR_1800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean currYear1800IsNumeric() {
	    return isNumeric(beginCurrYear1800
	                    ,beginCurrYear1800 + CURR_YEAR_1800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CURR_YEAR_1800_LEN = 6;
  	/**
	 * serializeCurrYear1800
	 */
	protected void serializeCurrYear1800(long currYear1800) {
		 putNumber(beginCurrYear1800,currYear1800,CURR_YEAR_1800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCurrYear1800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCurrYear1800
	 */
   	protected  long serializeCurrYear1800(char[] value) {
	    long  currYear1800;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    currYear1800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginCurrYear1800
		       ,6
		      );
		 localCurrYear1800Counter = shareString.getSerializedField().getModifiedCounter();
		return  currYear1800;
    }

   protected long checkCurrYear1800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCurrYear1800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshCurrYear1800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginCurrYear1800
			                 ,CURR_YEAR_1800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("currYear1800", beginCurrYear1800,CURR_YEAR_1800_LEN);
    }
   	}
     int localCurrYear2800Counter = -1;
     public boolean isCurrYear2800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrYear2800Counter != sharedCounter;
         localCurrYear2800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of currYear2800
	 *	@return currYear2800
	 */
	public char[]  getCurrYear2800String() {
	     return getCharArray(beginCurrYear2800,CURR_YEAR_2800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean currYear2800IsNumeric() {
	    return isNumeric(beginCurrYear2800
	                    ,beginCurrYear2800 + CURR_YEAR_2800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CURR_YEAR_2800_LEN = 5;
  	/**
	 * serializeCurrYear2800
	 */
	protected void serializeCurrYear2800(long currYear2800) {
		 putNumber(beginCurrYear2800,currYear2800,CURR_YEAR_2800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCurrYear2800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCurrYear2800
	 */
   	protected  long serializeCurrYear2800(char[] value) {
	    long  currYear2800;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    currYear2800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginCurrYear2800
		       ,5
		      );
		 localCurrYear2800Counter = shareString.getSerializedField().getModifiedCounter();
		return  currYear2800;
    }

   protected long checkCurrYear2800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCurrYear2800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshCurrYear2800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginCurrYear2800
			                 ,CURR_YEAR_2800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("currYear2800", beginCurrYear2800,CURR_YEAR_2800_LEN);
    }
   	}
     int localCurrYear3800Counter = -1;
     public boolean isCurrYear3800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrYear3800Counter != sharedCounter;
         localCurrYear3800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of currYear3800
	 *	@return currYear3800
	 */
	public char[]  getCurrYear3800String() {
	     return getCharArray(beginCurrYear3800,CURR_YEAR_3800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean currYear3800IsNumeric() {
	    return isNumeric(beginCurrYear3800
	                    ,beginCurrYear3800 + CURR_YEAR_3800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CURR_YEAR_3800_LEN = 3;
  	/**
	 * serializeCurrYear3800
	 */
	protected void serializeCurrYear3800(int currYear3800) {
		 putNumber(beginCurrYear3800,currYear3800,CURR_YEAR_3800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCurrYear3800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCurrYear3800
	 */
   	protected  int serializeCurrYear3800(char[] value) {
	    int  currYear3800;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    currYear3800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginCurrYear3800
		       ,3
		      );
		 localCurrYear3800Counter = shareString.getSerializedField().getModifiedCounter();
		return  currYear3800;
    }

   protected int checkCurrYear3800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCurrYear3800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCurrYear3800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCurrYear3800
			                 ,CURR_YEAR_3800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("currYear3800", beginCurrYear3800,CURR_YEAR_3800_LEN);
    }
   	}
     int localYearValue800Counter = -1;
     public boolean isYearValue800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localYearValue800Counter != sharedCounter;
         localYearValue800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of yearValue800
	 *	@return yearValue800
	 */
	public char[]  getYearValue800String() {
	     return getCharArray(beginYearValue800,YEAR_VALUE_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean yearValue800IsNumeric() {
	    return isNumeric(beginYearValue800
	                    ,beginYearValue800 + YEAR_VALUE_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int YEAR_VALUE_800_LEN = 2;
  	/**
	 * serializeYearValue800
	 */
	protected void serializeYearValue800(int yearValue800) {
		 putNumber(beginYearValue800,yearValue800,YEAR_VALUE_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localYearValue800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeYearValue800
	 */
   	protected  int serializeYearValue800(char[] value) {
	    int  yearValue800;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    yearValue800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginYearValue800
		       ,2
		      );
		 localYearValue800Counter = shareString.getSerializedField().getModifiedCounter();
		return  yearValue800;
    }

   protected int checkYearValue800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshYearValue800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshYearValue800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginYearValue800
			                 ,YEAR_VALUE_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("yearValue800", beginYearValue800,YEAR_VALUE_800_LEN);
    }
   	}




}
  
