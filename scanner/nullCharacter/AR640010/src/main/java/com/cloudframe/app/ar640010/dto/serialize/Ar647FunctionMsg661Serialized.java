package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class Ar647FunctionMsg661Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ar647FunctionMsg661Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ar647FunctionMsg661Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int AR_647_FUNCTION_MSG_661_LENGTH = 97;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAr647FunctionReturn661;
            protected  int beginAr647FunctionReason661;
            protected  int beginAr647FunctionAbend661;
	
	/**
	* Constructor for Ar647FunctionMsg661Serialized
	**/
    public Ar647FunctionMsg661Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ar647FunctionMsg661Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(AR_647_FUNCTION_MSG_661_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginAr647FunctionReturn661 = getStartOffset() + 19;	// set offset for serialization
  
  
             beginAr647FunctionReason661 = getStartOffset() + 43;	// set offset for serialization
  
  
             beginAr647FunctionAbend661 = getStartOffset() + 66;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localAr647FunctionReturn661Counter = -1;
     public boolean isAr647FunctionReturn661Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAr647FunctionReturn661Counter != sharedCounter;
         localAr647FunctionReturn661Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ar647FunctionReturn661
	 *	@return ar647FunctionReturn661
	 */
	public char[]  getAr647FunctionReturn661String() {
	     return getCharArray(beginAr647FunctionReturn661,AR_647_FUNCTION_RETURN_661_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ar647FunctionReturn661IsNumeric() {
	    return isNumeric(beginAr647FunctionReturn661
	                    ,beginAr647FunctionReturn661 + AR_647_FUNCTION_RETURN_661_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int AR_647_FUNCTION_RETURN_661_LEN = 9;
  	/**
	 * serializeAr647FunctionReturn661
	 */
	protected void serializeAr647FunctionReturn661(long ar647FunctionReturn661) {
		 putNumber(beginAr647FunctionReturn661,ar647FunctionReturn661,AR_647_FUNCTION_RETURN_661_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localAr647FunctionReturn661Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeAr647FunctionReturn661
	 */
   	protected  long serializeAr647FunctionReturn661(char[] value) {
	    long  ar647FunctionReturn661;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ar647FunctionReturn661 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginAr647FunctionReturn661
		       ,9
		      );
		 localAr647FunctionReturn661Counter = shareString.getSerializedField().getModifiedCounter();
		return  ar647FunctionReturn661;
    }

   protected long checkAr647FunctionReturn661MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshAr647FunctionReturn661 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshAr647FunctionReturn661() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginAr647FunctionReturn661
			                 ,AR_647_FUNCTION_RETURN_661_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ar647FunctionReturn661", beginAr647FunctionReturn661,AR_647_FUNCTION_RETURN_661_LEN);
    }
   	}
     int localAr647FunctionReason661Counter = -1;
     public boolean isAr647FunctionReason661Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAr647FunctionReason661Counter != sharedCounter;
         localAr647FunctionReason661Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ar647FunctionReason661
	 *	@return ar647FunctionReason661
	 */
	public char[]  getAr647FunctionReason661String() {
	     return getCharArray(beginAr647FunctionReason661,AR_647_FUNCTION_REASON_661_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ar647FunctionReason661IsNumeric() {
	    return isNumeric(beginAr647FunctionReason661
	                    ,beginAr647FunctionReason661 + AR_647_FUNCTION_REASON_661_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int AR_647_FUNCTION_REASON_661_LEN = 9;
  	/**
	 * serializeAr647FunctionReason661
	 */
	protected void serializeAr647FunctionReason661(long ar647FunctionReason661) {
		 putNumber(beginAr647FunctionReason661,ar647FunctionReason661,AR_647_FUNCTION_REASON_661_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localAr647FunctionReason661Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeAr647FunctionReason661
	 */
   	protected  long serializeAr647FunctionReason661(char[] value) {
	    long  ar647FunctionReason661;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ar647FunctionReason661 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginAr647FunctionReason661
		       ,9
		      );
		 localAr647FunctionReason661Counter = shareString.getSerializedField().getModifiedCounter();
		return  ar647FunctionReason661;
    }

   protected long checkAr647FunctionReason661MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshAr647FunctionReason661 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshAr647FunctionReason661() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginAr647FunctionReason661
			                 ,AR_647_FUNCTION_REASON_661_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ar647FunctionReason661", beginAr647FunctionReason661,AR_647_FUNCTION_REASON_661_LEN);
    }
   	}
     int localAr647FunctionAbend661Counter = -1;
     public boolean isAr647FunctionAbend661Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAr647FunctionAbend661Counter != sharedCounter;
         localAr647FunctionAbend661Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ar647FunctionAbend661
	 *	@return ar647FunctionAbend661
	 */
	public char[]  getAr647FunctionAbend661String() {
	     return getCharArray(beginAr647FunctionAbend661,AR_647_FUNCTION_ABEND_661_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ar647FunctionAbend661IsNumeric() {
	    return isNumeric(beginAr647FunctionAbend661
	                    ,beginAr647FunctionAbend661 + AR_647_FUNCTION_ABEND_661_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int AR_647_FUNCTION_ABEND_661_LEN = 9;
  	/**
	 * serializeAr647FunctionAbend661
	 */
	protected void serializeAr647FunctionAbend661(long ar647FunctionAbend661) {
		 putNumber(beginAr647FunctionAbend661,ar647FunctionAbend661,AR_647_FUNCTION_ABEND_661_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localAr647FunctionAbend661Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeAr647FunctionAbend661
	 */
   	protected  long serializeAr647FunctionAbend661(char[] value) {
	    long  ar647FunctionAbend661;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ar647FunctionAbend661 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginAr647FunctionAbend661
		       ,9
		      );
		 localAr647FunctionAbend661Counter = shareString.getSerializedField().getModifiedCounter();
		return  ar647FunctionAbend661;
    }

   protected long checkAr647FunctionAbend661MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshAr647FunctionAbend661 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshAr647FunctionAbend661() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginAr647FunctionAbend661
			                 ,AR_647_FUNCTION_ABEND_661_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ar647FunctionAbend661", beginAr647FunctionAbend661,AR_647_FUNCTION_ABEND_661_LEN);
    }
   	}




}
  
