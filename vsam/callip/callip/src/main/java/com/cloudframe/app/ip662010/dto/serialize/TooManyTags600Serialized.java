package com.cloudframe.app.ip662010.dto.serialize;

/**
*  The class TooManyTags600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TooManyTags600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TooManyTags600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TOO_MANY_TAGS_600_LENGTH = 35;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMaxTagNo600;
	
	/**
	* Constructor for TooManyTags600Serialized
	**/
    public TooManyTags600Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in TooManyTags600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TOO_MANY_TAGS_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginMaxTagNo600 = getStartOffset() + 10;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localMaxTagNo600Counter = -1;
     public boolean isMaxTagNo600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMaxTagNo600Counter != sharedCounter;
         localMaxTagNo600Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of maxTagNo600
	 *	@return maxTagNo600
	 */
	public char[]  getMaxTagNo600String() {
	     return getCharArray(beginMaxTagNo600,MAX_TAG_NO_600_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean maxTagNo600IsNumeric() {
	    return isNumeric(beginMaxTagNo600
	                    ,beginMaxTagNo600 + MAX_TAG_NO_600_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MAX_TAG_NO_600_LEN = 4;
  	/**
	 * serializeMaxTagNo600
	 */
	protected void serializeMaxTagNo600(int maxTagNo600) {
		 putNumber(beginMaxTagNo600,maxTagNo600,MAX_TAG_NO_600_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMaxTagNo600Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMaxTagNo600
	 */
   	protected  int serializeMaxTagNo600(char[] value) {
	    int  maxTagNo600;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    maxTagNo600 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginMaxTagNo600
		       ,4
		      );
		 localMaxTagNo600Counter = shareString.getSerializedField().getModifiedCounter();
		return  maxTagNo600;
    }

   protected int checkMaxTagNo600MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMaxTagNo600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMaxTagNo600() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMaxTagNo600
			                 ,MAX_TAG_NO_600_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("maxTagNo600", beginMaxTagNo600,MAX_TAG_NO_600_LEN);
    }
   	}




}
  
