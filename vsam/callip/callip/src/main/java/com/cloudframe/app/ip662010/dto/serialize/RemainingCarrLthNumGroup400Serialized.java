package com.cloudframe.app.ip662010.dto.serialize;

/**
*  The class RemainingCarrLthNumGroup400Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RemainingCarrLthNumGroup400Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RemainingCarrLthNumGroup400Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int REMAINING_CARR_LTH_NUM_GROUP_400_LENGTH = 3;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRemainingCarrLthNum400;
            protected  int beginRemainingCarrLthNumX400;
	
	/**
	* Constructor for RemainingCarrLthNumGroup400Serialized
	**/
    public RemainingCarrLthNumGroup400Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in RemainingCarrLthNumGroup400Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(REMAINING_CARR_LTH_NUM_GROUP_400_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRemainingCarrLthNum400 = getStartOffset() + 0;	// set offset for serialization
  
             beginRemainingCarrLthNumX400 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRemainingCarrLthNum400Counter = -1;
     public boolean isRemainingCarrLthNum400Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRemainingCarrLthNum400Counter != sharedCounter;
         localRemainingCarrLthNum400Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of remainingCarrLthNum400
	 *	@return remainingCarrLthNum400
	 */
	public char[]  getRemainingCarrLthNum400String() {
	     return getCharArray(beginRemainingCarrLthNum400,REMAINING_CARR_LTH_NUM_400_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean remainingCarrLthNum400IsNumeric() {
	    return isNumeric(beginRemainingCarrLthNum400
	                    ,beginRemainingCarrLthNum400 + REMAINING_CARR_LTH_NUM_400_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int REMAINING_CARR_LTH_NUM_400_LEN = 3;
  	/**
	 * serializeRemainingCarrLthNum400
	 */
	protected void serializeRemainingCarrLthNum400(int remainingCarrLthNum400) {
		 putNumber(beginRemainingCarrLthNum400,remainingCarrLthNum400,REMAINING_CARR_LTH_NUM_400_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRemainingCarrLthNum400Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeRemainingCarrLthNum400
	 */
   	protected  int serializeRemainingCarrLthNum400(char[] value) {
	    int  remainingCarrLthNum400;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    remainingCarrLthNum400 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginRemainingCarrLthNum400
		       ,3
		      );
		 localRemainingCarrLthNum400Counter = shareString.getSerializedField().getModifiedCounter();
		return  remainingCarrLthNum400;
    }

   protected int checkRemainingCarrLthNum400MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshRemainingCarrLthNum400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshRemainingCarrLthNum400() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginRemainingCarrLthNum400
			                 ,REMAINING_CARR_LTH_NUM_400_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("remainingCarrLthNum400", beginRemainingCarrLthNum400,REMAINING_CARR_LTH_NUM_400_LEN);
    }
   	}
     int localRemainingCarrLthNumX400Counter = -1;
     public boolean isRemainingCarrLthNumX400Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRemainingCarrLthNumX400Counter != sharedCounter;
         localRemainingCarrLthNumX400Counter = sharedCounter; return hasModified;
     }
	protected static final int REMAINING_CARR_LTH_NUM_X_400_LEN = 3;
	/**
	 * 	serialize this RemainingCarrLthNumX400
	 */
   protected void serializeRemainingCarrLthNumX400(char[] remainingCarrLthNumX400) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(remainingCarrLthNumX400,0,getStringValue(),beginRemainingCarrLthNumX400,REMAINING_CARR_LTH_NUM_X_400_LEN);
       localRemainingCarrLthNumX400Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRemainingCarrLthNumX400Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshRemainingCarrLthNumX400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRemainingCarrLthNumX400() {	 
   		return (substring(getStringValue(),beginRemainingCarrLthNumX400,beginRemainingCarrLthNumX400 + REMAINING_CARR_LTH_NUM_X_400_LEN));
   	}




}
  
