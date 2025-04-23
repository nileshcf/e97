package com.cloudframe.app.ip829010.dto.serialize;

/**
*  The class QueueErrorMsg611Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:07. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class QueueErrorMsg611Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(QueueErrorMsg611Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int QUEUE_ERROR_MSG_611_LENGTH = 49;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAction611;
            protected  int beginBadReasonCode611;
	
	/**
	* Constructor for QueueErrorMsg611Serialized
	**/
    public QueueErrorMsg611Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in QueueErrorMsg611Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(QUEUE_ERROR_MSG_611_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginAction611 = getStartOffset() + 0;	// set offset for serialization
  
             beginBadReasonCode611 = getStartOffset() + 38;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localAction611Counter = -1;
     public boolean isAction611Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAction611Counter != sharedCounter;
         localAction611Counter = sharedCounter; return hasModified;
     }
	protected static final int ACTION_611_LEN = 38;
	/**
	 * 	serialize this Action611
	 */
   protected void serializeAction611(char[] action611) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(action611,0,getStringValue(),beginAction611,ACTION_611_LEN);
       localAction611Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAction611Constraints(char[] value) {
   			return super.checkConstraints(value , 38 ,false, false);
   }
    /**
	 *	refreshAction611 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAction611() {	 
   		return (substring(getStringValue(),beginAction611,beginAction611 + ACTION_611_LEN));
   	}
     int localBadReasonCode611Counter = -1;
     public boolean isBadReasonCode611Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBadReasonCode611Counter != sharedCounter;
         localBadReasonCode611Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of badReasonCode611
	 *	@return badReasonCode611
	 */
	public char[]  getBadReasonCode611String() {
	     return getCharArray(beginBadReasonCode611,BAD_REASON_CODE_611_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean badReasonCode611IsNumeric() {
	    return isNumeric(beginBadReasonCode611
	                    ,beginBadReasonCode611 + BAD_REASON_CODE_611_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BAD_REASON_CODE_611_LEN = 9;
  	/**
	 * serializeBadReasonCode611
	 */
	protected void serializeBadReasonCode611(long badReasonCode611) {
		 putNumber(beginBadReasonCode611,badReasonCode611,BAD_REASON_CODE_611_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBadReasonCode611Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBadReasonCode611
	 */
   	protected  long serializeBadReasonCode611(char[] value) {
	    long  badReasonCode611;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    badReasonCode611 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginBadReasonCode611
		       ,9
		      );
		 localBadReasonCode611Counter = shareString.getSerializedField().getModifiedCounter();
		return  badReasonCode611;
    }

   protected long checkBadReasonCode611MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBadReasonCode611 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshBadReasonCode611() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginBadReasonCode611
			                 ,BAD_REASON_CODE_611_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("badReasonCode611", beginBadReasonCode611,BAD_REASON_CODE_611_LEN);
    }
   	}




}
  
