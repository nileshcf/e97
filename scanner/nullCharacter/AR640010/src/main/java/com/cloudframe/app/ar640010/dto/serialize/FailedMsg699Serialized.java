package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class FailedMsg699Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FailedMsg699Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FailedMsg699Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FAILED_MSG_699_LENGTH = 54;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFailedRequest699;
            protected  int beginFailedTotal699;
	
	/**
	* Constructor for FailedMsg699Serialized
	**/
    public FailedMsg699Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in FailedMsg699Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FAILED_MSG_699_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
             beginFailedRequest699 = getStartOffset() + 18;	// set offset for serialization
  
  
             beginFailedTotal699 = getStartOffset() + 51;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFailedRequest699Counter = -1;
     public boolean isFailedRequest699Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFailedRequest699Counter != sharedCounter;
         localFailedRequest699Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of failedRequest699
	 *	@return failedRequest699
	 */
	public char[]  getFailedRequest699String() {
	     return getCharArray(beginFailedRequest699,FAILED_REQUEST_699_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean failedRequest699IsNumeric() {
	    return isNumeric(beginFailedRequest699
	                    ,beginFailedRequest699 + FAILED_REQUEST_699_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int FAILED_REQUEST_699_LEN = 9;
  	/**
	 * serializeFailedRequest699
	 */
	protected void serializeFailedRequest699(long failedRequest699) {
		 putNumber(beginFailedRequest699,failedRequest699,FAILED_REQUEST_699_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localFailedRequest699Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeFailedRequest699
	 */
   	protected  long serializeFailedRequest699(char[] value) {
	    long  failedRequest699;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    failedRequest699 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginFailedRequest699
		       ,9
		      );
		 localFailedRequest699Counter = shareString.getSerializedField().getModifiedCounter();
		return  failedRequest699;
    }

   protected long checkFailedRequest699MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshFailedRequest699 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshFailedRequest699() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginFailedRequest699
			                 ,FAILED_REQUEST_699_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("failedRequest699", beginFailedRequest699,FAILED_REQUEST_699_LEN);
    }
   	}
     int localFailedTotal699Counter = -1;
     public boolean isFailedTotal699Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFailedTotal699Counter != sharedCounter;
         localFailedTotal699Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of failedTotal699
	 *	@return failedTotal699
	 */
	public char[]  getFailedTotal699String() {
	     return getCharArray(beginFailedTotal699,FAILED_TOTAL_699_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean failedTotal699IsNumeric() {
	    return isNumeric(beginFailedTotal699
	                    ,beginFailedTotal699 + FAILED_TOTAL_699_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int FAILED_TOTAL_699_LEN = 3;
  	/**
	 * serializeFailedTotal699
	 */
	protected void serializeFailedTotal699(int failedTotal699) {
		 putNumber(beginFailedTotal699,failedTotal699,FAILED_TOTAL_699_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localFailedTotal699Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeFailedTotal699
	 */
   	protected  int serializeFailedTotal699(char[] value) {
	    int  failedTotal699;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    failedTotal699 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginFailedTotal699
		       ,3
		      );
		 localFailedTotal699Counter = shareString.getSerializedField().getModifiedCounter();
		return  failedTotal699;
    }

   protected int checkFailedTotal699MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshFailedTotal699 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFailedTotal699() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginFailedTotal699
			                 ,FAILED_TOTAL_699_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("failedTotal699", beginFailedTotal699,FAILED_TOTAL_699_LEN);
    }
   	}




}
  
