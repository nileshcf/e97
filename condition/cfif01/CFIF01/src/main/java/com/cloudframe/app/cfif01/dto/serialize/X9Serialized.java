package com.cloudframe.app.cfif01.dto.serialize;

/**
*  The class X9Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:58. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class X9Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(X9Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int X_9_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWS9;
            protected  int beginWS88;
	
	/**
	* Constructor for X9Serialized
	**/
    public X9Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in X9Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(X_9_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWS9 = getStartOffset() + 0;	// set offset for serialization
  
             beginWS88 = getStartOffset() + 1;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWS9Counter = -1;
     public boolean isWS9Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWS9Counter != sharedCounter;
         localWS9Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of wS9
	 *	@return wS9
	 */
	public char[]  getWS9String() {
	     return getCharArray(beginWS9,W_S_9_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wS9IsNumeric() {
	    return isNumeric(beginWS9
	                    ,beginWS9 + W_S_9_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int W_S_9_LEN = 1;
  	/**
	 * serializeWS9
	 */
	protected void serializeWS9(int wS9) {
		 putNumber(beginWS9,wS9,W_S_9_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWS9Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWS9
	 */
   	protected  int serializeWS9(char[] value) {
	    int  wS9;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    wS9 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginWS9
		       ,1
		      );
		 localWS9Counter = shareString.getSerializedField().getModifiedCounter();
		return  wS9;
    }

   protected int checkWS9MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWS9 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWS9() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginWS9
			                 ,W_S_9_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("wS9", beginWS9,W_S_9_LEN);
    }
   	}
     int localWS88Counter = -1;
     public boolean isWS88Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWS88Counter != sharedCounter;
         localWS88Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of wS88
	 *	@return wS88
	 */
	public char[]  getWS88String() {
	     return getCharArray(beginWS88,W_S_88_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wS88IsNumeric() {
	    return isNumeric(beginWS88
	                    ,beginWS88 + W_S_88_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int W_S_88_LEN = 1;
  	/**
	 * serializeWS88
	 */
	protected void serializeWS88(int wS88) {
		 putNumber(beginWS88,wS88,W_S_88_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWS88Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWS88
	 */
   	protected  int serializeWS88(char[] value) {
	    int  wS88;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    wS88 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginWS88
		       ,1
		      );
		 localWS88Counter = shareString.getSerializedField().getModifiedCounter();
		return  wS88;
    }

   protected int checkWS88MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWS88 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWS88() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginWS88
			                 ,W_S_88_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("wS88", beginWS88,W_S_88_LEN);
    }
   	}




}
  
