package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class FunctionTs800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FunctionTs800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FunctionTs800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FUNCTION_TS_800_LENGTH = 21;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFunctionDate800;
            protected  int beginFunctionHour800;
            protected  int beginFunctionMinute800;
            protected  int beginFunctionSecond800;
            protected  int beginFunctionHundredth800;
            protected  int beginFunctionGmtAdjust800;
            protected  int beginFunctionGmtHours800;
            protected  int beginFunctionGmtMinutes800;
	
	/**
	* Constructor for FunctionTs800Serialized
	**/
    public FunctionTs800Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for FunctionTs800Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FunctionTs800Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this FunctionTs800Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1235); // serialize this field at offset 1235 by default 
    }
    
	/**
	* sets parent for this FunctionTs800Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1235 by default
    }    
	/**
	* initializes the field in FunctionTs800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FUNCTION_TS_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFunctionDate800 = getStartOffset() + 0;	// set offset for serialization
  
  
             beginFunctionHour800 = getStartOffset() + 8;	// set offset for serialization
  
             beginFunctionMinute800 = getStartOffset() + 10;	// set offset for serialization
  
             beginFunctionSecond800 = getStartOffset() + 12;	// set offset for serialization
  
             beginFunctionHundredth800 = getStartOffset() + 14;	// set offset for serialization
  
             beginFunctionGmtAdjust800 = getStartOffset() + 16;	// set offset for serialization
  
             beginFunctionGmtHours800 = getStartOffset() + 17;	// set offset for serialization
  
             beginFunctionGmtMinutes800 = getStartOffset() + 19;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFunctionDate800Counter = -1;
     public boolean isFunctionDate800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFunctionDate800Counter != sharedCounter;
         localFunctionDate800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of functionDate800
	 *	@return functionDate800
	 */
	public char[]  getFunctionDate800String() {
	     return getCharArray(beginFunctionDate800,FUNCTION_DATE_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean functionDate800IsNumeric() {
	    return isNumeric(beginFunctionDate800
	                    ,beginFunctionDate800 + FUNCTION_DATE_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int FUNCTION_DATE_800_LEN = 8;
  	/**
	 * serializeFunctionDate800
	 */
	protected void serializeFunctionDate800(long functionDate800) {
		 putNumber(beginFunctionDate800,functionDate800,FUNCTION_DATE_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localFunctionDate800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeFunctionDate800
	 */
   	protected  long serializeFunctionDate800(char[] value) {
	    long  functionDate800;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    functionDate800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginFunctionDate800
		       ,8
		      );
		 localFunctionDate800Counter = shareString.getSerializedField().getModifiedCounter();
		return  functionDate800;
    }

   protected long checkFunctionDate800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshFunctionDate800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshFunctionDate800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginFunctionDate800
			                 ,FUNCTION_DATE_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("functionDate800", beginFunctionDate800,FUNCTION_DATE_800_LEN);
    }
   	}
     int localFunctionHour800Counter = -1;
     public boolean isFunctionHour800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFunctionHour800Counter != sharedCounter;
         localFunctionHour800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of functionHour800
	 *	@return functionHour800
	 */
	public char[]  getFunctionHour800String() {
	     return getCharArray(beginFunctionHour800,FUNCTION_HOUR_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean functionHour800IsNumeric() {
	    return isNumeric(beginFunctionHour800
	                    ,beginFunctionHour800 + FUNCTION_HOUR_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int FUNCTION_HOUR_800_LEN = 2;
  	/**
	 * serializeFunctionHour800
	 */
	protected void serializeFunctionHour800(int functionHour800) {
		 putNumber(beginFunctionHour800,functionHour800,FUNCTION_HOUR_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localFunctionHour800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeFunctionHour800
	 */
   	protected  int serializeFunctionHour800(char[] value) {
	    int  functionHour800;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    functionHour800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginFunctionHour800
		       ,2
		      );
		 localFunctionHour800Counter = shareString.getSerializedField().getModifiedCounter();
		return  functionHour800;
    }

   protected int checkFunctionHour800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshFunctionHour800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFunctionHour800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginFunctionHour800
			                 ,FUNCTION_HOUR_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("functionHour800", beginFunctionHour800,FUNCTION_HOUR_800_LEN);
    }
   	}
     int localFunctionMinute800Counter = -1;
     public boolean isFunctionMinute800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFunctionMinute800Counter != sharedCounter;
         localFunctionMinute800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of functionMinute800
	 *	@return functionMinute800
	 */
	public char[]  getFunctionMinute800String() {
	     return getCharArray(beginFunctionMinute800,FUNCTION_MINUTE_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean functionMinute800IsNumeric() {
	    return isNumeric(beginFunctionMinute800
	                    ,beginFunctionMinute800 + FUNCTION_MINUTE_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int FUNCTION_MINUTE_800_LEN = 2;
  	/**
	 * serializeFunctionMinute800
	 */
	protected void serializeFunctionMinute800(int functionMinute800) {
		 putNumber(beginFunctionMinute800,functionMinute800,FUNCTION_MINUTE_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localFunctionMinute800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeFunctionMinute800
	 */
   	protected  int serializeFunctionMinute800(char[] value) {
	    int  functionMinute800;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    functionMinute800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginFunctionMinute800
		       ,2
		      );
		 localFunctionMinute800Counter = shareString.getSerializedField().getModifiedCounter();
		return  functionMinute800;
    }

   protected int checkFunctionMinute800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshFunctionMinute800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFunctionMinute800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginFunctionMinute800
			                 ,FUNCTION_MINUTE_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("functionMinute800", beginFunctionMinute800,FUNCTION_MINUTE_800_LEN);
    }
   	}
     int localFunctionSecond800Counter = -1;
     public boolean isFunctionSecond800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFunctionSecond800Counter != sharedCounter;
         localFunctionSecond800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of functionSecond800
	 *	@return functionSecond800
	 */
	public char[]  getFunctionSecond800String() {
	     return getCharArray(beginFunctionSecond800,FUNCTION_SECOND_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean functionSecond800IsNumeric() {
	    return isNumeric(beginFunctionSecond800
	                    ,beginFunctionSecond800 + FUNCTION_SECOND_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int FUNCTION_SECOND_800_LEN = 2;
  	/**
	 * serializeFunctionSecond800
	 */
	protected void serializeFunctionSecond800(int functionSecond800) {
		 putNumber(beginFunctionSecond800,functionSecond800,FUNCTION_SECOND_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localFunctionSecond800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeFunctionSecond800
	 */
   	protected  int serializeFunctionSecond800(char[] value) {
	    int  functionSecond800;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    functionSecond800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginFunctionSecond800
		       ,2
		      );
		 localFunctionSecond800Counter = shareString.getSerializedField().getModifiedCounter();
		return  functionSecond800;
    }

   protected int checkFunctionSecond800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshFunctionSecond800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFunctionSecond800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginFunctionSecond800
			                 ,FUNCTION_SECOND_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("functionSecond800", beginFunctionSecond800,FUNCTION_SECOND_800_LEN);
    }
   	}
     int localFunctionHundredth800Counter = -1;
     public boolean isFunctionHundredth800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFunctionHundredth800Counter != sharedCounter;
         localFunctionHundredth800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of functionHundredth800
	 *	@return functionHundredth800
	 */
	public char[]  getFunctionHundredth800String() {
	     return getCharArray(beginFunctionHundredth800,FUNCTION_HUNDREDTH_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean functionHundredth800IsNumeric() {
	    return isNumeric(beginFunctionHundredth800
	                    ,beginFunctionHundredth800 + FUNCTION_HUNDREDTH_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int FUNCTION_HUNDREDTH_800_LEN = 2;
  	/**
	 * serializeFunctionHundredth800
	 */
	protected void serializeFunctionHundredth800(int functionHundredth800) {
		 putNumber(beginFunctionHundredth800,functionHundredth800,FUNCTION_HUNDREDTH_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localFunctionHundredth800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeFunctionHundredth800
	 */
   	protected  int serializeFunctionHundredth800(char[] value) {
	    int  functionHundredth800;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    functionHundredth800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginFunctionHundredth800
		       ,2
		      );
		 localFunctionHundredth800Counter = shareString.getSerializedField().getModifiedCounter();
		return  functionHundredth800;
    }

   protected int checkFunctionHundredth800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshFunctionHundredth800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFunctionHundredth800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginFunctionHundredth800
			                 ,FUNCTION_HUNDREDTH_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("functionHundredth800", beginFunctionHundredth800,FUNCTION_HUNDREDTH_800_LEN);
    }
   	}
     int localFunctionGmtAdjust800Counter = -1;
     public boolean isFunctionGmtAdjust800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFunctionGmtAdjust800Counter != sharedCounter;
         localFunctionGmtAdjust800Counter = sharedCounter; return hasModified;
     }
	protected static final int FUNCTION_GMT_ADJUST_800_LEN = 1;
	/**
	 * 	serialize this FunctionGmtAdjust800
	 */
   protected void serializeFunctionGmtAdjust800(char[] functionGmtAdjust800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(functionGmtAdjust800,0,getStringValue(),beginFunctionGmtAdjust800,FUNCTION_GMT_ADJUST_800_LEN);
       localFunctionGmtAdjust800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFunctionGmtAdjust800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshFunctionGmtAdjust800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFunctionGmtAdjust800() {	 
   		return (substring(getStringValue(),beginFunctionGmtAdjust800,beginFunctionGmtAdjust800 + FUNCTION_GMT_ADJUST_800_LEN));
   	}
     int localFunctionGmtHours800Counter = -1;
     public boolean isFunctionGmtHours800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFunctionGmtHours800Counter != sharedCounter;
         localFunctionGmtHours800Counter = sharedCounter; return hasModified;
     }
	protected static final int FUNCTION_GMT_HOURS_800_LEN = 2;
	/**
	 * 	serialize this FunctionGmtHours800
	 */
   protected void serializeFunctionGmtHours800(char[] functionGmtHours800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(functionGmtHours800,0,getStringValue(),beginFunctionGmtHours800,FUNCTION_GMT_HOURS_800_LEN);
       localFunctionGmtHours800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFunctionGmtHours800Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshFunctionGmtHours800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFunctionGmtHours800() {	 
   		return (substring(getStringValue(),beginFunctionGmtHours800,beginFunctionGmtHours800 + FUNCTION_GMT_HOURS_800_LEN));
   	}
     int localFunctionGmtMinutes800Counter = -1;
     public boolean isFunctionGmtMinutes800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFunctionGmtMinutes800Counter != sharedCounter;
         localFunctionGmtMinutes800Counter = sharedCounter; return hasModified;
     }
	protected static final int FUNCTION_GMT_MINUTES_800_LEN = 2;
	/**
	 * 	serialize this FunctionGmtMinutes800
	 */
   protected void serializeFunctionGmtMinutes800(char[] functionGmtMinutes800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(functionGmtMinutes800,0,getStringValue(),beginFunctionGmtMinutes800,FUNCTION_GMT_MINUTES_800_LEN);
       localFunctionGmtMinutes800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFunctionGmtMinutes800Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshFunctionGmtMinutes800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFunctionGmtMinutes800() {	 
   		return (substring(getStringValue(),beginFunctionGmtMinutes800,beginFunctionGmtMinutes800 + FUNCTION_GMT_MINUTES_800_LEN));
   	}




}
  
