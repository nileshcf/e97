package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class Ar642FunctionMsg660Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ar642FunctionMsg660Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ar642FunctionMsg660Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int AR_642_FUNCTION_MSG_660_LENGTH = 94;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAr642FunctionReturn660;
            protected  int beginAr642FunctionReason660;
            protected  int beginAr642FunctionAbend660;
	
	/**
	* Constructor for Ar642FunctionMsg660Serialized
	**/
    public Ar642FunctionMsg660Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ar642FunctionMsg660Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(AR_642_FUNCTION_MSG_660_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginAr642FunctionReturn660 = getStartOffset() + 38;	// set offset for serialization
  
  
             beginAr642FunctionReason660 = getStartOffset() + 62;	// set offset for serialization
  
  
             beginAr642FunctionAbend660 = getStartOffset() + 85;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localAr642FunctionReturn660Counter = -1;
     public boolean isAr642FunctionReturn660Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAr642FunctionReturn660Counter != sharedCounter;
         localAr642FunctionReturn660Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ar642FunctionReturn660
	 *	@return ar642FunctionReturn660
	 */
	public char[]  getAr642FunctionReturn660String() {
	     return getCharArray(beginAr642FunctionReturn660,AR_642_FUNCTION_RETURN_660_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ar642FunctionReturn660IsNumeric() {
	    return isNumeric(beginAr642FunctionReturn660
	                    ,beginAr642FunctionReturn660 + AR_642_FUNCTION_RETURN_660_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int AR_642_FUNCTION_RETURN_660_LEN = 9;
  	/**
	 * serializeAr642FunctionReturn660
	 */
	protected void serializeAr642FunctionReturn660(long ar642FunctionReturn660) {
		 putNumber(beginAr642FunctionReturn660,ar642FunctionReturn660,AR_642_FUNCTION_RETURN_660_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localAr642FunctionReturn660Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeAr642FunctionReturn660
	 */
   	protected  long serializeAr642FunctionReturn660(char[] value) {
	    long  ar642FunctionReturn660;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ar642FunctionReturn660 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginAr642FunctionReturn660
		       ,9
		      );
		 localAr642FunctionReturn660Counter = shareString.getSerializedField().getModifiedCounter();
		return  ar642FunctionReturn660;
    }

   protected long checkAr642FunctionReturn660MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshAr642FunctionReturn660 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshAr642FunctionReturn660() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginAr642FunctionReturn660
			                 ,AR_642_FUNCTION_RETURN_660_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ar642FunctionReturn660", beginAr642FunctionReturn660,AR_642_FUNCTION_RETURN_660_LEN);
    }
   	}
     int localAr642FunctionReason660Counter = -1;
     public boolean isAr642FunctionReason660Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAr642FunctionReason660Counter != sharedCounter;
         localAr642FunctionReason660Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ar642FunctionReason660
	 *	@return ar642FunctionReason660
	 */
	public char[]  getAr642FunctionReason660String() {
	     return getCharArray(beginAr642FunctionReason660,AR_642_FUNCTION_REASON_660_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ar642FunctionReason660IsNumeric() {
	    return isNumeric(beginAr642FunctionReason660
	                    ,beginAr642FunctionReason660 + AR_642_FUNCTION_REASON_660_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int AR_642_FUNCTION_REASON_660_LEN = 9;
  	/**
	 * serializeAr642FunctionReason660
	 */
	protected void serializeAr642FunctionReason660(long ar642FunctionReason660) {
		 putNumber(beginAr642FunctionReason660,ar642FunctionReason660,AR_642_FUNCTION_REASON_660_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localAr642FunctionReason660Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeAr642FunctionReason660
	 */
   	protected  long serializeAr642FunctionReason660(char[] value) {
	    long  ar642FunctionReason660;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ar642FunctionReason660 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginAr642FunctionReason660
		       ,9
		      );
		 localAr642FunctionReason660Counter = shareString.getSerializedField().getModifiedCounter();
		return  ar642FunctionReason660;
    }

   protected long checkAr642FunctionReason660MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshAr642FunctionReason660 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshAr642FunctionReason660() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginAr642FunctionReason660
			                 ,AR_642_FUNCTION_REASON_660_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ar642FunctionReason660", beginAr642FunctionReason660,AR_642_FUNCTION_REASON_660_LEN);
    }
   	}
     int localAr642FunctionAbend660Counter = -1;
     public boolean isAr642FunctionAbend660Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAr642FunctionAbend660Counter != sharedCounter;
         localAr642FunctionAbend660Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ar642FunctionAbend660
	 *	@return ar642FunctionAbend660
	 */
	public char[]  getAr642FunctionAbend660String() {
	     return getCharArray(beginAr642FunctionAbend660,AR_642_FUNCTION_ABEND_660_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ar642FunctionAbend660IsNumeric() {
	    return isNumeric(beginAr642FunctionAbend660
	                    ,beginAr642FunctionAbend660 + AR_642_FUNCTION_ABEND_660_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int AR_642_FUNCTION_ABEND_660_LEN = 9;
  	/**
	 * serializeAr642FunctionAbend660
	 */
	protected void serializeAr642FunctionAbend660(long ar642FunctionAbend660) {
		 putNumber(beginAr642FunctionAbend660,ar642FunctionAbend660,AR_642_FUNCTION_ABEND_660_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localAr642FunctionAbend660Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeAr642FunctionAbend660
	 */
   	protected  long serializeAr642FunctionAbend660(char[] value) {
	    long  ar642FunctionAbend660;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ar642FunctionAbend660 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginAr642FunctionAbend660
		       ,9
		      );
		 localAr642FunctionAbend660Counter = shareString.getSerializedField().getModifiedCounter();
		return  ar642FunctionAbend660;
    }

   protected long checkAr642FunctionAbend660MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshAr642FunctionAbend660 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshAr642FunctionAbend660() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginAr642FunctionAbend660
			                 ,AR_642_FUNCTION_ABEND_660_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ar642FunctionAbend660", beginAr642FunctionAbend660,AR_642_FUNCTION_ABEND_660_LEN);
    }
   	}




}
  
