package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class SuccessMsg609Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SuccessMsg609Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SuccessMsg609Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SUCCESS_MSG_609_LENGTH = 49;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSuccessRequest609;
            protected int beginSuccessMsg609ConditionGroup3;
	
	/**
	* Constructor for SuccessMsg609Serialized
	**/
    public SuccessMsg609Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in SuccessMsg609Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SUCCESS_MSG_609_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginSuccessRequest609 = getStartOffset() + 18;	// set offset for serialization
  
  
                beginSuccessMsg609ConditionGroup3 = getStartOffset() + 39;	// filler with 88
  
	   /*  end of offset */
	}
     int localSuccessRequest609Counter = -1;
     public boolean isSuccessRequest609Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSuccessRequest609Counter != sharedCounter;
         localSuccessRequest609Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of successRequest609
	 *	@return successRequest609
	 */
	public char[]  getSuccessRequest609String() {
	     return getCharArray(beginSuccessRequest609,SUCCESS_REQUEST_609_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean successRequest609IsNumeric() {
	    return isNumeric(beginSuccessRequest609
	                    ,beginSuccessRequest609 + SUCCESS_REQUEST_609_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SUCCESS_REQUEST_609_LEN = 9;
  	/**
	 * serializeSuccessRequest609
	 */
	protected void serializeSuccessRequest609(long successRequest609) {
		 putNumber(beginSuccessRequest609,successRequest609,SUCCESS_REQUEST_609_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSuccessRequest609Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSuccessRequest609
	 */
   	protected  long serializeSuccessRequest609(char[] value) {
	    long  successRequest609;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    successRequest609 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginSuccessRequest609
		       ,9
		      );
		 localSuccessRequest609Counter = shareString.getSerializedField().getModifiedCounter();
		return  successRequest609;
    }

   protected long checkSuccessRequest609MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSuccessRequest609 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSuccessRequest609() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSuccessRequest609
			                 ,SUCCESS_REQUEST_609_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("successRequest609", beginSuccessRequest609,SUCCESS_REQUEST_609_LEN);
    }
   	}
     int localSuccessMsg609ConditionGroup3Counter = -1;
     public boolean isSuccessMsg609ConditionGroup3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSuccessMsg609ConditionGroup3Counter != sharedCounter;
         localSuccessMsg609ConditionGroup3Counter = sharedCounter; return hasModified;
     }
	protected static final int SUCCESS_MSG_609_CONDITION_GROUP_3_LEN = 10;
	/**
	 * 	serialize this SuccessMsg609ConditionGroup3
	 */
   protected void serializeSuccessMsg609ConditionGroup3(char[] successMsg609ConditionGroup3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(successMsg609ConditionGroup3,0,getStringValue(),beginSuccessMsg609ConditionGroup3,SUCCESS_MSG_609_CONDITION_GROUP_3_LEN);
       localSuccessMsg609ConditionGroup3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSuccessMsg609ConditionGroup3Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshSuccessMsg609ConditionGroup3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSuccessMsg609ConditionGroup3() {	 
   		return (substring(getStringValue(),beginSuccessMsg609ConditionGroup3,beginSuccessMsg609ConditionGroup3 + SUCCESS_MSG_609_CONDITION_GROUP_3_LEN));
   	}




}
  
