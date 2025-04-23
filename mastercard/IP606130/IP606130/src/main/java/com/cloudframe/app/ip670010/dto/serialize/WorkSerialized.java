package com.cloudframe.app.ip670010.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:21. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 75;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginValue1300;
            protected  int beginValue2300;
            protected  int beginValue4300;
            protected  int beginValue5300;
            protected  int beginValue7300;
            protected  int beginValue11300;
            protected  int beginValue12300;
            protected  int beginValue19300;
            protected  int beginValue20300;
            protected  int beginValue29300;
            protected  int beginValue28300;
            protected  int beginValue49300;
            protected  int beginValue97300;
            protected  int beginValue98300;
            protected  int beginValue99300;
            protected  int beginValue100300;
            protected  int beginValue365300;
            protected  int beginValue366300;
            protected  int beginValue400300;
            protected  int beginValidateMonth800;
            protected  int beginIntegerDate800;
            protected  int beginGregorianDateCal800;
            protected  int beginJulianDateCal800;
            protected  int beginWorkYear801;
            protected  int beginWorkRemainder801;
            protected  int beginWorkYear2801;
            protected  int beginWorkRemainder2801;
            protected  int beginWorkYear3801;
	
	/**
	* Constructor for WorkSerialized
	**/
    public WorkSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WorkSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WORK_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
  
             beginValue1300 = getStartOffset() + 0;	// set offset for serialization
  
             beginValue2300 = getStartOffset() + 2;	// set offset for serialization
  
             beginValue4300 = getStartOffset() + 4;	// set offset for serialization
  
             beginValue5300 = getStartOffset() + 6;	// set offset for serialization
  
             beginValue7300 = getStartOffset() + 8;	// set offset for serialization
  
             beginValue11300 = getStartOffset() + 9;	// set offset for serialization
  
             beginValue12300 = getStartOffset() + 11;	// set offset for serialization
  
             beginValue19300 = getStartOffset() + 13;	// set offset for serialization
  
             beginValue20300 = getStartOffset() + 15;	// set offset for serialization
  
             beginValue29300 = getStartOffset() + 17;	// set offset for serialization
  
             beginValue28300 = getStartOffset() + 19;	// set offset for serialization
  
             beginValue49300 = getStartOffset() + 21;	// set offset for serialization
  
             beginValue97300 = getStartOffset() + 23;	// set offset for serialization
  
             beginValue98300 = getStartOffset() + 25;	// set offset for serialization
  
             beginValue99300 = getStartOffset() + 27;	// set offset for serialization
  
             beginValue100300 = getStartOffset() + 29;	// set offset for serialization
  
             beginValue365300 = getStartOffset() + 32;	// set offset for serialization
  
             beginValue366300 = getStartOffset() + 35;	// set offset for serialization
  
             beginValue400300 = getStartOffset() + 38;	// set offset for serialization
  
  
             beginValidateMonth800 = getStartOffset() + 41;	// set offset for serialization
  
             beginIntegerDate800 = getStartOffset() + 43;	// set offset for serialization
  
             beginGregorianDateCal800 = getStartOffset() + 51;	// set offset for serialization
  
             beginJulianDateCal800 = getStartOffset() + 59;	// set offset for serialization
  
             beginWorkYear801 = getStartOffset() + 66;	// set offset for serialization
  
             beginWorkRemainder801 = getStartOffset() + 68;	// set offset for serialization
  
             beginWorkYear2801 = getStartOffset() + 69;	// set offset for serialization
  
             beginWorkRemainder2801 = getStartOffset() + 71;	// set offset for serialization
  
             beginWorkYear3801 = getStartOffset() + 72;	// set offset for serialization
  
  
  
  
  
	   /*  end of offset */
	}
     int localIsItFirstTime100Counter = -1;
     public boolean isIsItFirstTime100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIsItFirstTime100Counter != sharedCounter;
         localIsItFirstTime100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkIsItFirstTime100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localIsItLeapYear100Counter = -1;
     public boolean isIsItLeapYear100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIsItLeapYear100Counter != sharedCounter;
         localIsItLeapYear100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkIsItLeapYear100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localIp670010300Counter = -1;
     public boolean isIp670010300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp670010300Counter != sharedCounter;
         localIp670010300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkIp670010300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmVersion300Counter = -1;
     public boolean isPgmVersion300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmVersion300Counter != sharedCounter;
         localPgmVersion300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmVersion300Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
     int localValue1300Counter = -1;
     public boolean isValue1300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValue1300Counter != sharedCounter;
         localValue1300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of value1300
	 *	@return value1300
	 */
	public char[]  getValue1300String() {
	     return getCharArray(beginValue1300,VALUE_1300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value1300IsNumeric() {
	    return isNumeric(beginValue1300
	                    ,beginValue1300 + VALUE_1300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int VALUE_1300_LEN = 2;
  	/**
	 * serializeValue1300
	 */
	protected void serializeValue1300(int value1300) {
		 putNumber(beginValue1300,value1300,VALUE_1300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localValue1300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeValue1300
	 */
   	protected  int serializeValue1300(char[] value) {
	    int  value1300;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    value1300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginValue1300
		       ,2
		      );
		 localValue1300Counter = shareString.getSerializedField().getModifiedCounter();
		return  value1300;
    }

   protected int checkValue1300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshValue1300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshValue1300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginValue1300
			                 ,VALUE_1300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("value1300", beginValue1300,VALUE_1300_LEN);
    }
   	}
     int localValue2300Counter = -1;
     public boolean isValue2300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValue2300Counter != sharedCounter;
         localValue2300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of value2300
	 *	@return value2300
	 */
	public char[]  getValue2300String() {
	     return getCharArray(beginValue2300,VALUE_2300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value2300IsNumeric() {
	    return isNumeric(beginValue2300
	                    ,beginValue2300 + VALUE_2300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int VALUE_2300_LEN = 2;
  	/**
	 * serializeValue2300
	 */
	protected void serializeValue2300(int value2300) {
		 putNumber(beginValue2300,value2300,VALUE_2300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localValue2300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeValue2300
	 */
   	protected  int serializeValue2300(char[] value) {
	    int  value2300;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    value2300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginValue2300
		       ,2
		      );
		 localValue2300Counter = shareString.getSerializedField().getModifiedCounter();
		return  value2300;
    }

   protected int checkValue2300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshValue2300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshValue2300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginValue2300
			                 ,VALUE_2300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("value2300", beginValue2300,VALUE_2300_LEN);
    }
   	}
     int localValue4300Counter = -1;
     public boolean isValue4300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValue4300Counter != sharedCounter;
         localValue4300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of value4300
	 *	@return value4300
	 */
	public char[]  getValue4300String() {
	     return getCharArray(beginValue4300,VALUE_4300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value4300IsNumeric() {
	    return isNumeric(beginValue4300
	                    ,beginValue4300 + VALUE_4300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int VALUE_4300_LEN = 2;
  	/**
	 * serializeValue4300
	 */
	protected void serializeValue4300(int value4300) {
		 putNumber(beginValue4300,value4300,VALUE_4300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localValue4300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeValue4300
	 */
   	protected  int serializeValue4300(char[] value) {
	    int  value4300;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    value4300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginValue4300
		       ,2
		      );
		 localValue4300Counter = shareString.getSerializedField().getModifiedCounter();
		return  value4300;
    }

   protected int checkValue4300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshValue4300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshValue4300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginValue4300
			                 ,VALUE_4300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("value4300", beginValue4300,VALUE_4300_LEN);
    }
   	}
     int localValue5300Counter = -1;
     public boolean isValue5300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValue5300Counter != sharedCounter;
         localValue5300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of value5300
	 *	@return value5300
	 */
	public char[]  getValue5300String() {
	     return getCharArray(beginValue5300,VALUE_5300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value5300IsNumeric() {
	    return isNumeric(beginValue5300
	                    ,beginValue5300 + VALUE_5300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int VALUE_5300_LEN = 2;
  	/**
	 * serializeValue5300
	 */
	protected void serializeValue5300(int value5300) {
		 putNumber(beginValue5300,value5300,VALUE_5300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localValue5300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeValue5300
	 */
   	protected  int serializeValue5300(char[] value) {
	    int  value5300;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    value5300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginValue5300
		       ,2
		      );
		 localValue5300Counter = shareString.getSerializedField().getModifiedCounter();
		return  value5300;
    }

   protected int checkValue5300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshValue5300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshValue5300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginValue5300
			                 ,VALUE_5300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("value5300", beginValue5300,VALUE_5300_LEN);
    }
   	}
     int localValue7300Counter = -1;
     public boolean isValue7300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValue7300Counter != sharedCounter;
         localValue7300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of value7300
	 *	@return value7300
	 */
	public char[]  getValue7300String() {
	     return getCharArray(beginValue7300,VALUE_7300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value7300IsNumeric() {
	    return isNumeric(beginValue7300
	                    ,beginValue7300 + VALUE_7300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int VALUE_7300_LEN = 1;
  	/**
	 * serializeValue7300
	 */
	protected void serializeValue7300(int value7300) {
		 putNumber(beginValue7300,value7300,VALUE_7300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localValue7300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeValue7300
	 */
   	protected  int serializeValue7300(char[] value) {
	    int  value7300;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    value7300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginValue7300
		       ,1
		      );
		 localValue7300Counter = shareString.getSerializedField().getModifiedCounter();
		return  value7300;
    }

   protected int checkValue7300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshValue7300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshValue7300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginValue7300
			                 ,VALUE_7300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("value7300", beginValue7300,VALUE_7300_LEN);
    }
   	}
     int localValue11300Counter = -1;
     public boolean isValue11300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValue11300Counter != sharedCounter;
         localValue11300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of value11300
	 *	@return value11300
	 */
	public char[]  getValue11300String() {
	     return getCharArray(beginValue11300,VALUE_11300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value11300IsNumeric() {
	    return isNumeric(beginValue11300
	                    ,beginValue11300 + VALUE_11300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int VALUE_11300_LEN = 2;
  	/**
	 * serializeValue11300
	 */
	protected void serializeValue11300(int value11300) {
		 putNumber(beginValue11300,value11300,VALUE_11300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localValue11300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeValue11300
	 */
   	protected  int serializeValue11300(char[] value) {
	    int  value11300;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    value11300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginValue11300
		       ,2
		      );
		 localValue11300Counter = shareString.getSerializedField().getModifiedCounter();
		return  value11300;
    }

   protected int checkValue11300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshValue11300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshValue11300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginValue11300
			                 ,VALUE_11300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("value11300", beginValue11300,VALUE_11300_LEN);
    }
   	}
     int localValue12300Counter = -1;
     public boolean isValue12300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValue12300Counter != sharedCounter;
         localValue12300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of value12300
	 *	@return value12300
	 */
	public char[]  getValue12300String() {
	     return getCharArray(beginValue12300,VALUE_12300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value12300IsNumeric() {
	    return isNumeric(beginValue12300
	                    ,beginValue12300 + VALUE_12300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int VALUE_12300_LEN = 2;
  	/**
	 * serializeValue12300
	 */
	protected void serializeValue12300(int value12300) {
		 putNumber(beginValue12300,value12300,VALUE_12300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localValue12300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeValue12300
	 */
   	protected  int serializeValue12300(char[] value) {
	    int  value12300;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    value12300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginValue12300
		       ,2
		      );
		 localValue12300Counter = shareString.getSerializedField().getModifiedCounter();
		return  value12300;
    }

   protected int checkValue12300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshValue12300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshValue12300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginValue12300
			                 ,VALUE_12300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("value12300", beginValue12300,VALUE_12300_LEN);
    }
   	}
     int localValue19300Counter = -1;
     public boolean isValue19300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValue19300Counter != sharedCounter;
         localValue19300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of value19300
	 *	@return value19300
	 */
	public char[]  getValue19300String() {
	     return getCharArray(beginValue19300,VALUE_19300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value19300IsNumeric() {
	    return isNumeric(beginValue19300
	                    ,beginValue19300 + VALUE_19300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int VALUE_19300_LEN = 2;
  	/**
	 * serializeValue19300
	 */
	protected void serializeValue19300(int value19300) {
		 putNumber(beginValue19300,value19300,VALUE_19300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localValue19300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeValue19300
	 */
   	protected  int serializeValue19300(char[] value) {
	    int  value19300;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    value19300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginValue19300
		       ,2
		      );
		 localValue19300Counter = shareString.getSerializedField().getModifiedCounter();
		return  value19300;
    }

   protected int checkValue19300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshValue19300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshValue19300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginValue19300
			                 ,VALUE_19300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("value19300", beginValue19300,VALUE_19300_LEN);
    }
   	}
     int localValue20300Counter = -1;
     public boolean isValue20300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValue20300Counter != sharedCounter;
         localValue20300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of value20300
	 *	@return value20300
	 */
	public char[]  getValue20300String() {
	     return getCharArray(beginValue20300,VALUE_20300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value20300IsNumeric() {
	    return isNumeric(beginValue20300
	                    ,beginValue20300 + VALUE_20300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int VALUE_20300_LEN = 2;
  	/**
	 * serializeValue20300
	 */
	protected void serializeValue20300(int value20300) {
		 putNumber(beginValue20300,value20300,VALUE_20300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localValue20300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeValue20300
	 */
   	protected  int serializeValue20300(char[] value) {
	    int  value20300;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    value20300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginValue20300
		       ,2
		      );
		 localValue20300Counter = shareString.getSerializedField().getModifiedCounter();
		return  value20300;
    }

   protected int checkValue20300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshValue20300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshValue20300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginValue20300
			                 ,VALUE_20300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("value20300", beginValue20300,VALUE_20300_LEN);
    }
   	}
     int localValue29300Counter = -1;
     public boolean isValue29300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValue29300Counter != sharedCounter;
         localValue29300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of value29300
	 *	@return value29300
	 */
	public char[]  getValue29300String() {
	     return getCharArray(beginValue29300,VALUE_29300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value29300IsNumeric() {
	    return isNumeric(beginValue29300
	                    ,beginValue29300 + VALUE_29300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int VALUE_29300_LEN = 2;
  	/**
	 * serializeValue29300
	 */
	protected void serializeValue29300(int value29300) {
		 putNumber(beginValue29300,value29300,VALUE_29300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localValue29300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeValue29300
	 */
   	protected  int serializeValue29300(char[] value) {
	    int  value29300;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    value29300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginValue29300
		       ,2
		      );
		 localValue29300Counter = shareString.getSerializedField().getModifiedCounter();
		return  value29300;
    }

   protected int checkValue29300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshValue29300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshValue29300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginValue29300
			                 ,VALUE_29300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("value29300", beginValue29300,VALUE_29300_LEN);
    }
   	}
     int localValue28300Counter = -1;
     public boolean isValue28300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValue28300Counter != sharedCounter;
         localValue28300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of value28300
	 *	@return value28300
	 */
	public char[]  getValue28300String() {
	     return getCharArray(beginValue28300,VALUE_28300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value28300IsNumeric() {
	    return isNumeric(beginValue28300
	                    ,beginValue28300 + VALUE_28300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int VALUE_28300_LEN = 2;
  	/**
	 * serializeValue28300
	 */
	protected void serializeValue28300(int value28300) {
		 putNumber(beginValue28300,value28300,VALUE_28300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localValue28300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeValue28300
	 */
   	protected  int serializeValue28300(char[] value) {
	    int  value28300;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    value28300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginValue28300
		       ,2
		      );
		 localValue28300Counter = shareString.getSerializedField().getModifiedCounter();
		return  value28300;
    }

   protected int checkValue28300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshValue28300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshValue28300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginValue28300
			                 ,VALUE_28300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("value28300", beginValue28300,VALUE_28300_LEN);
    }
   	}
     int localValue49300Counter = -1;
     public boolean isValue49300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValue49300Counter != sharedCounter;
         localValue49300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of value49300
	 *	@return value49300
	 */
	public char[]  getValue49300String() {
	     return getCharArray(beginValue49300,VALUE_49300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value49300IsNumeric() {
	    return isNumeric(beginValue49300
	                    ,beginValue49300 + VALUE_49300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int VALUE_49300_LEN = 2;
  	/**
	 * serializeValue49300
	 */
	protected void serializeValue49300(int value49300) {
		 putNumber(beginValue49300,value49300,VALUE_49300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localValue49300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeValue49300
	 */
   	protected  int serializeValue49300(char[] value) {
	    int  value49300;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    value49300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginValue49300
		       ,2
		      );
		 localValue49300Counter = shareString.getSerializedField().getModifiedCounter();
		return  value49300;
    }

   protected int checkValue49300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshValue49300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshValue49300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginValue49300
			                 ,VALUE_49300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("value49300", beginValue49300,VALUE_49300_LEN);
    }
   	}
     int localValue97300Counter = -1;
     public boolean isValue97300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValue97300Counter != sharedCounter;
         localValue97300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of value97300
	 *	@return value97300
	 */
	public char[]  getValue97300String() {
	     return getCharArray(beginValue97300,VALUE_97300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value97300IsNumeric() {
	    return isNumeric(beginValue97300
	                    ,beginValue97300 + VALUE_97300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int VALUE_97300_LEN = 2;
  	/**
	 * serializeValue97300
	 */
	protected void serializeValue97300(int value97300) {
		 putNumber(beginValue97300,value97300,VALUE_97300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localValue97300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeValue97300
	 */
   	protected  int serializeValue97300(char[] value) {
	    int  value97300;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    value97300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginValue97300
		       ,2
		      );
		 localValue97300Counter = shareString.getSerializedField().getModifiedCounter();
		return  value97300;
    }

   protected int checkValue97300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshValue97300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshValue97300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginValue97300
			                 ,VALUE_97300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("value97300", beginValue97300,VALUE_97300_LEN);
    }
   	}
     int localValue98300Counter = -1;
     public boolean isValue98300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValue98300Counter != sharedCounter;
         localValue98300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of value98300
	 *	@return value98300
	 */
	public char[]  getValue98300String() {
	     return getCharArray(beginValue98300,VALUE_98300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value98300IsNumeric() {
	    return isNumeric(beginValue98300
	                    ,beginValue98300 + VALUE_98300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int VALUE_98300_LEN = 2;
  	/**
	 * serializeValue98300
	 */
	protected void serializeValue98300(int value98300) {
		 putNumber(beginValue98300,value98300,VALUE_98300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localValue98300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeValue98300
	 */
   	protected  int serializeValue98300(char[] value) {
	    int  value98300;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    value98300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginValue98300
		       ,2
		      );
		 localValue98300Counter = shareString.getSerializedField().getModifiedCounter();
		return  value98300;
    }

   protected int checkValue98300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshValue98300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshValue98300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginValue98300
			                 ,VALUE_98300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("value98300", beginValue98300,VALUE_98300_LEN);
    }
   	}
     int localValue99300Counter = -1;
     public boolean isValue99300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValue99300Counter != sharedCounter;
         localValue99300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of value99300
	 *	@return value99300
	 */
	public char[]  getValue99300String() {
	     return getCharArray(beginValue99300,VALUE_99300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value99300IsNumeric() {
	    return isNumeric(beginValue99300
	                    ,beginValue99300 + VALUE_99300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int VALUE_99300_LEN = 2;
  	/**
	 * serializeValue99300
	 */
	protected void serializeValue99300(int value99300) {
		 putNumber(beginValue99300,value99300,VALUE_99300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localValue99300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeValue99300
	 */
   	protected  int serializeValue99300(char[] value) {
	    int  value99300;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    value99300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginValue99300
		       ,2
		      );
		 localValue99300Counter = shareString.getSerializedField().getModifiedCounter();
		return  value99300;
    }

   protected int checkValue99300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshValue99300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshValue99300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginValue99300
			                 ,VALUE_99300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("value99300", beginValue99300,VALUE_99300_LEN);
    }
   	}
     int localValue100300Counter = -1;
     public boolean isValue100300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValue100300Counter != sharedCounter;
         localValue100300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of value100300
	 *	@return value100300
	 */
	public char[]  getValue100300String() {
	     return getCharArray(beginValue100300,VALUE_100300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value100300IsNumeric() {
	    return isNumeric(beginValue100300
	                    ,beginValue100300 + VALUE_100300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int VALUE_100300_LEN = 3;
  	/**
	 * serializeValue100300
	 */
	protected void serializeValue100300(int value100300) {
		 putNumber(beginValue100300,value100300,VALUE_100300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localValue100300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeValue100300
	 */
   	protected  int serializeValue100300(char[] value) {
	    int  value100300;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    value100300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginValue100300
		       ,3
		      );
		 localValue100300Counter = shareString.getSerializedField().getModifiedCounter();
		return  value100300;
    }

   protected int checkValue100300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshValue100300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshValue100300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginValue100300
			                 ,VALUE_100300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("value100300", beginValue100300,VALUE_100300_LEN);
    }
   	}
     int localValue365300Counter = -1;
     public boolean isValue365300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValue365300Counter != sharedCounter;
         localValue365300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of value365300
	 *	@return value365300
	 */
	public char[]  getValue365300String() {
	     return getCharArray(beginValue365300,VALUE_365300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value365300IsNumeric() {
	    return isNumeric(beginValue365300
	                    ,beginValue365300 + VALUE_365300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int VALUE_365300_LEN = 3;
  	/**
	 * serializeValue365300
	 */
	protected void serializeValue365300(int value365300) {
		 putNumber(beginValue365300,value365300,VALUE_365300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localValue365300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeValue365300
	 */
   	protected  int serializeValue365300(char[] value) {
	    int  value365300;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    value365300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginValue365300
		       ,3
		      );
		 localValue365300Counter = shareString.getSerializedField().getModifiedCounter();
		return  value365300;
    }

   protected int checkValue365300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshValue365300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshValue365300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginValue365300
			                 ,VALUE_365300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("value365300", beginValue365300,VALUE_365300_LEN);
    }
   	}
     int localValue366300Counter = -1;
     public boolean isValue366300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValue366300Counter != sharedCounter;
         localValue366300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of value366300
	 *	@return value366300
	 */
	public char[]  getValue366300String() {
	     return getCharArray(beginValue366300,VALUE_366300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value366300IsNumeric() {
	    return isNumeric(beginValue366300
	                    ,beginValue366300 + VALUE_366300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int VALUE_366300_LEN = 3;
  	/**
	 * serializeValue366300
	 */
	protected void serializeValue366300(int value366300) {
		 putNumber(beginValue366300,value366300,VALUE_366300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localValue366300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeValue366300
	 */
   	protected  int serializeValue366300(char[] value) {
	    int  value366300;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    value366300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginValue366300
		       ,3
		      );
		 localValue366300Counter = shareString.getSerializedField().getModifiedCounter();
		return  value366300;
    }

   protected int checkValue366300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshValue366300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshValue366300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginValue366300
			                 ,VALUE_366300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("value366300", beginValue366300,VALUE_366300_LEN);
    }
   	}
     int localValue400300Counter = -1;
     public boolean isValue400300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValue400300Counter != sharedCounter;
         localValue400300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of value400300
	 *	@return value400300
	 */
	public char[]  getValue400300String() {
	     return getCharArray(beginValue400300,VALUE_400300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value400300IsNumeric() {
	    return isNumeric(beginValue400300
	                    ,beginValue400300 + VALUE_400300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int VALUE_400300_LEN = 3;
  	/**
	 * serializeValue400300
	 */
	protected void serializeValue400300(int value400300) {
		 putNumber(beginValue400300,value400300,VALUE_400300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localValue400300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeValue400300
	 */
   	protected  int serializeValue400300(char[] value) {
	    int  value400300;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    value400300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginValue400300
		       ,3
		      );
		 localValue400300Counter = shareString.getSerializedField().getModifiedCounter();
		return  value400300;
    }

   protected int checkValue400300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshValue400300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshValue400300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginValue400300
			                 ,VALUE_400300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("value400300", beginValue400300,VALUE_400300_LEN);
    }
   	}
     int localInvalidCallMessage600Counter = -1;
     public boolean isInvalidCallMessage600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localInvalidCallMessage600Counter != sharedCounter;
         localInvalidCallMessage600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkInvalidCallMessage600Constraints(char[] value) {
   			return super.checkConstraints(value , 50 ,false, false);
   }
     int localValidateMonth800Counter = -1;
     public boolean isValidateMonth800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValidateMonth800Counter != sharedCounter;
         localValidateMonth800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of validateMonth800
	 *	@return validateMonth800
	 */
	public char[]  getValidateMonth800String() {
	     return getCharArray(beginValidateMonth800,VALIDATE_MONTH_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean validateMonth800IsNumeric() {
	    return isNumeric(beginValidateMonth800
	                    ,beginValidateMonth800 + VALIDATE_MONTH_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int VALIDATE_MONTH_800_LEN = 2;
  	/**
	 * serializeValidateMonth800
	 */
	protected void serializeValidateMonth800(int validateMonth800) {
		 putNumber(beginValidateMonth800,validateMonth800,VALIDATE_MONTH_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localValidateMonth800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeValidateMonth800
	 */
   	protected  int serializeValidateMonth800(char[] value) {
	    int  validateMonth800;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    validateMonth800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginValidateMonth800
		       ,2
		      );
		 localValidateMonth800Counter = shareString.getSerializedField().getModifiedCounter();
		return  validateMonth800;
    }

   protected int checkValidateMonth800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshValidateMonth800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshValidateMonth800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginValidateMonth800
			                 ,VALIDATE_MONTH_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("validateMonth800", beginValidateMonth800,VALIDATE_MONTH_800_LEN);
    }
   	}
     int localIntegerDate800Counter = -1;
     public boolean isIntegerDate800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIntegerDate800Counter != sharedCounter;
         localIntegerDate800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of integerDate800
	 *	@return integerDate800
	 */
	public char[]  getIntegerDate800String() {
	     return getCharArray(beginIntegerDate800,INTEGER_DATE_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean integerDate800IsNumeric() {
	    return isNumeric(beginIntegerDate800
	                    ,beginIntegerDate800 + INTEGER_DATE_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int INTEGER_DATE_800_LEN = 8;
  	/**
	 * serializeIntegerDate800
	 */
	protected void serializeIntegerDate800(long integerDate800) {
		 putNumber(beginIntegerDate800,integerDate800,INTEGER_DATE_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIntegerDate800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIntegerDate800
	 */
   	protected  long serializeIntegerDate800(char[] value) {
	    long  integerDate800;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    integerDate800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginIntegerDate800
		       ,8
		      );
		 localIntegerDate800Counter = shareString.getSerializedField().getModifiedCounter();
		return  integerDate800;
    }

   protected long checkIntegerDate800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIntegerDate800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIntegerDate800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIntegerDate800
			                 ,INTEGER_DATE_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("integerDate800", beginIntegerDate800,INTEGER_DATE_800_LEN);
    }
   	}
     int localGregorianDateCal800Counter = -1;
     public boolean isGregorianDateCal800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGregorianDateCal800Counter != sharedCounter;
         localGregorianDateCal800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of gregorianDateCal800
	 *	@return gregorianDateCal800
	 */
	public char[]  getGregorianDateCal800String() {
	     return getCharArray(beginGregorianDateCal800,GREGORIAN_DATE_CAL_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean gregorianDateCal800IsNumeric() {
	    return isNumeric(beginGregorianDateCal800
	                    ,beginGregorianDateCal800 + GREGORIAN_DATE_CAL_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int GREGORIAN_DATE_CAL_800_LEN = 8;
  	/**
	 * serializeGregorianDateCal800
	 */
	protected void serializeGregorianDateCal800(long gregorianDateCal800) {
		 putNumber(beginGregorianDateCal800,gregorianDateCal800,GREGORIAN_DATE_CAL_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localGregorianDateCal800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeGregorianDateCal800
	 */
   	protected  long serializeGregorianDateCal800(char[] value) {
	    long  gregorianDateCal800;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    gregorianDateCal800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginGregorianDateCal800
		       ,8
		      );
		 localGregorianDateCal800Counter = shareString.getSerializedField().getModifiedCounter();
		return  gregorianDateCal800;
    }

   protected long checkGregorianDateCal800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshGregorianDateCal800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshGregorianDateCal800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginGregorianDateCal800
			                 ,GREGORIAN_DATE_CAL_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("gregorianDateCal800", beginGregorianDateCal800,GREGORIAN_DATE_CAL_800_LEN);
    }
   	}
     int localJulianDateCal800Counter = -1;
     public boolean isJulianDateCal800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localJulianDateCal800Counter != sharedCounter;
         localJulianDateCal800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of julianDateCal800
	 *	@return julianDateCal800
	 */
	public char[]  getJulianDateCal800String() {
	     return getCharArray(beginJulianDateCal800,JULIAN_DATE_CAL_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean julianDateCal800IsNumeric() {
	    return isNumeric(beginJulianDateCal800
	                    ,beginJulianDateCal800 + JULIAN_DATE_CAL_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int JULIAN_DATE_CAL_800_LEN = 7;
  	/**
	 * serializeJulianDateCal800
	 */
	protected void serializeJulianDateCal800(long julianDateCal800) {
		 putNumber(beginJulianDateCal800,julianDateCal800,JULIAN_DATE_CAL_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localJulianDateCal800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeJulianDateCal800
	 */
   	protected  long serializeJulianDateCal800(char[] value) {
	    long  julianDateCal800;
	    if(value.length >0 && value.length!= 7)
            value = new String(value).trim().toCharArray();
	    if (value.length < 7) value = pad(7, value, ' ', LEFT_PAD);
	    else if (value.length > 7) value = substring(value,0,7);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    julianDateCal800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(7,value,false/*isSigned?*/)
		       ,beginJulianDateCal800
		       ,7
		      );
		 localJulianDateCal800Counter = shareString.getSerializedField().getModifiedCounter();
		return  julianDateCal800;
    }

   protected long checkJulianDateCal800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshJulianDateCal800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshJulianDateCal800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginJulianDateCal800
			                 ,JULIAN_DATE_CAL_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("julianDateCal800", beginJulianDateCal800,JULIAN_DATE_CAL_800_LEN);
    }
   	}
     int localWorkYear801Counter = -1;
     public boolean isWorkYear801Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWorkYear801Counter != sharedCounter;
         localWorkYear801Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of workYear801
	 *	@return workYear801
	 */
	public char[]  getWorkYear801String() {
	     return getCharArray(beginWorkYear801,WORK_YEAR_801_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean workYear801IsNumeric() {
	    return isNumeric(beginWorkYear801
	                    ,beginWorkYear801 + WORK_YEAR_801_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WORK_YEAR_801_LEN = 2;
  	/**
	 * serializeWorkYear801
	 */
	protected void serializeWorkYear801(int workYear801) {
		 putNumber(beginWorkYear801,workYear801,WORK_YEAR_801_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWorkYear801Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWorkYear801
	 */
   	protected  int serializeWorkYear801(char[] value) {
	    int  workYear801;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    workYear801 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginWorkYear801
		       ,2
		      );
		 localWorkYear801Counter = shareString.getSerializedField().getModifiedCounter();
		return  workYear801;
    }

   protected int checkWorkYear801MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWorkYear801 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWorkYear801() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginWorkYear801
			                 ,WORK_YEAR_801_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("workYear801", beginWorkYear801,WORK_YEAR_801_LEN);
    }
   	}
     int localWorkRemainder801Counter = -1;
     public boolean isWorkRemainder801Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWorkRemainder801Counter != sharedCounter;
         localWorkRemainder801Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of workRemainder801
	 *	@return workRemainder801
	 */
	public char[]  getWorkRemainder801String() {
	     return getCharArray(beginWorkRemainder801,WORK_REMAINDER_801_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean workRemainder801IsNumeric() {
	    return isNumeric(beginWorkRemainder801
	                    ,beginWorkRemainder801 + WORK_REMAINDER_801_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WORK_REMAINDER_801_LEN = 1;
  	/**
	 * serializeWorkRemainder801
	 */
	protected void serializeWorkRemainder801(int workRemainder801) {
		 putNumber(beginWorkRemainder801,workRemainder801,WORK_REMAINDER_801_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWorkRemainder801Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWorkRemainder801
	 */
   	protected  int serializeWorkRemainder801(char[] value) {
	    int  workRemainder801;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    workRemainder801 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginWorkRemainder801
		       ,1
		      );
		 localWorkRemainder801Counter = shareString.getSerializedField().getModifiedCounter();
		return  workRemainder801;
    }

   protected int checkWorkRemainder801MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWorkRemainder801 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWorkRemainder801() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginWorkRemainder801
			                 ,WORK_REMAINDER_801_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("workRemainder801", beginWorkRemainder801,WORK_REMAINDER_801_LEN);
    }
   	}
     int localWorkYear2801Counter = -1;
     public boolean isWorkYear2801Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWorkYear2801Counter != sharedCounter;
         localWorkYear2801Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of workYear2801
	 *	@return workYear2801
	 */
	public char[]  getWorkYear2801String() {
	     return getCharArray(beginWorkYear2801,WORK_YEAR_2801_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean workYear2801IsNumeric() {
	    return isNumeric(beginWorkYear2801
	                    ,beginWorkYear2801 + WORK_YEAR_2801_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WORK_YEAR_2801_LEN = 2;
  	/**
	 * serializeWorkYear2801
	 */
	protected void serializeWorkYear2801(int workYear2801) {
		 putNumber(beginWorkYear2801,workYear2801,WORK_YEAR_2801_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWorkYear2801Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWorkYear2801
	 */
   	protected  int serializeWorkYear2801(char[] value) {
	    int  workYear2801;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    workYear2801 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginWorkYear2801
		       ,2
		      );
		 localWorkYear2801Counter = shareString.getSerializedField().getModifiedCounter();
		return  workYear2801;
    }

   protected int checkWorkYear2801MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWorkYear2801 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWorkYear2801() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginWorkYear2801
			                 ,WORK_YEAR_2801_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("workYear2801", beginWorkYear2801,WORK_YEAR_2801_LEN);
    }
   	}
     int localWorkRemainder2801Counter = -1;
     public boolean isWorkRemainder2801Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWorkRemainder2801Counter != sharedCounter;
         localWorkRemainder2801Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of workRemainder2801
	 *	@return workRemainder2801
	 */
	public char[]  getWorkRemainder2801String() {
	     return getCharArray(beginWorkRemainder2801,WORK_REMAINDER_2801_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean workRemainder2801IsNumeric() {
	    return isNumeric(beginWorkRemainder2801
	                    ,beginWorkRemainder2801 + WORK_REMAINDER_2801_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WORK_REMAINDER_2801_LEN = 1;
  	/**
	 * serializeWorkRemainder2801
	 */
	protected void serializeWorkRemainder2801(int workRemainder2801) {
		 putNumber(beginWorkRemainder2801,workRemainder2801,WORK_REMAINDER_2801_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWorkRemainder2801Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWorkRemainder2801
	 */
   	protected  int serializeWorkRemainder2801(char[] value) {
	    int  workRemainder2801;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    workRemainder2801 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginWorkRemainder2801
		       ,1
		      );
		 localWorkRemainder2801Counter = shareString.getSerializedField().getModifiedCounter();
		return  workRemainder2801;
    }

   protected int checkWorkRemainder2801MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWorkRemainder2801 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWorkRemainder2801() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginWorkRemainder2801
			                 ,WORK_REMAINDER_2801_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("workRemainder2801", beginWorkRemainder2801,WORK_REMAINDER_2801_LEN);
    }
   	}
     int localWorkYear3801Counter = -1;
     public boolean isWorkYear3801Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWorkYear3801Counter != sharedCounter;
         localWorkYear3801Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of workYear3801
	 *	@return workYear3801
	 */
	public char[]  getWorkYear3801String() {
	     return getCharArray(beginWorkYear3801,WORK_YEAR_3801_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean workYear3801IsNumeric() {
	    return isNumeric(beginWorkYear3801
	                    ,beginWorkYear3801 + WORK_YEAR_3801_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WORK_YEAR_3801_LEN = 3;
  	/**
	 * serializeWorkYear3801
	 */
	protected void serializeWorkYear3801(int workYear3801) {
		 putNumber(beginWorkYear3801,workYear3801,WORK_YEAR_3801_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWorkYear3801Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWorkYear3801
	 */
   	protected  int serializeWorkYear3801(char[] value) {
	    int  workYear3801;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    workYear3801 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginWorkYear3801
		       ,3
		      );
		 localWorkYear3801Counter = shareString.getSerializedField().getModifiedCounter();
		return  workYear3801;
    }

   protected int checkWorkYear3801MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWorkYear3801 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWorkYear3801() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginWorkYear3801
			                 ,WORK_YEAR_3801_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("workYear3801", beginWorkYear3801,WORK_YEAR_3801_LEN);
    }
   	}
         int localWorkHr800Counter = -1;
         public boolean isWorkHr800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWorkHr800Counter != sharedCounter;
            localWorkHr800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkWorkHr800MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localWorkMin800Counter = -1;
         public boolean isWorkMin800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWorkMin800Counter != sharedCounter;
            localWorkMin800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkWorkMin800MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localWorkOffsetHr800Counter = -1;
         public boolean isWorkOffsetHr800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWorkOffsetHr800Counter != sharedCounter;
            localWorkOffsetHr800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkWorkOffsetHr800MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localWorkOffsetMin800Counter = -1;
         public boolean isWorkOffsetMin800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWorkOffsetMin800Counter != sharedCounter;
            localWorkOffsetMin800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkWorkOffsetMin800MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }




}
  
