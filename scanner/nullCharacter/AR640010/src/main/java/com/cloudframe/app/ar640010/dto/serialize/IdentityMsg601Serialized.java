package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class IdentityMsg601Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class IdentityMsg601Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(IdentityMsg601Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IDENTITY_MSG_601_LENGTH = 35;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIdentityRequest601;
	
	/**
	* Constructor for IdentityMsg601Serialized
	**/
    public IdentityMsg601Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in IdentityMsg601Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IDENTITY_MSG_601_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginIdentityRequest601 = getStartOffset() + 18;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localIdentityRequest601Counter = -1;
     public boolean isIdentityRequest601Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIdentityRequest601Counter != sharedCounter;
         localIdentityRequest601Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of identityRequest601
	 *	@return identityRequest601
	 */
	public char[]  getIdentityRequest601String() {
	     return getCharArray(beginIdentityRequest601,IDENTITY_REQUEST_601_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean identityRequest601IsNumeric() {
	    return isNumeric(beginIdentityRequest601
	                    ,beginIdentityRequest601 + IDENTITY_REQUEST_601_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IDENTITY_REQUEST_601_LEN = 9;
  	/**
	 * serializeIdentityRequest601
	 */
	protected void serializeIdentityRequest601(long identityRequest601) {
		 putNumber(beginIdentityRequest601,identityRequest601,IDENTITY_REQUEST_601_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIdentityRequest601Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIdentityRequest601
	 */
   	protected  long serializeIdentityRequest601(char[] value) {
	    long  identityRequest601;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    identityRequest601 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginIdentityRequest601
		       ,9
		      );
		 localIdentityRequest601Counter = shareString.getSerializedField().getModifiedCounter();
		return  identityRequest601;
    }

   protected long checkIdentityRequest601MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIdentityRequest601 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIdentityRequest601() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIdentityRequest601
			                 ,IDENTITY_REQUEST_601_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("identityRequest601", beginIdentityRequest601,IDENTITY_REQUEST_601_LEN);
    }
   	}




}
  
