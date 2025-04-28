package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class Ar642ErrorMsg660Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:11. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ar642ErrorMsg660Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ar642ErrorMsg660Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int AR_642_ERROR_MSG_660_LENGTH = 93;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAr642ReturnCode660;
            protected int beginAr642ErrorMsg660ConditionGroup3;
	
	/**
	* Constructor for Ar642ErrorMsg660Serialized
	**/
    public Ar642ErrorMsg660Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ar642ErrorMsg660Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(AR_642_ERROR_MSG_660_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
             beginAr642ReturnCode660 = getStartOffset() + 49;	// set offset for serialization
  
                beginAr642ErrorMsg660ConditionGroup3 = getStartOffset() + 53;	// filler with 88
  
	   /*  end of offset */
	}
     int localAr642ReturnCode660Counter = -1;
     public boolean isAr642ReturnCode660Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAr642ReturnCode660Counter != sharedCounter;
         localAr642ReturnCode660Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ar642ReturnCode660
	 *	@return ar642ReturnCode660
	 */
	public char[]  getAr642ReturnCode660String() {
	     return getCharArray(beginAr642ReturnCode660,AR_642_RETURN_CODE_660_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ar642ReturnCode660IsNumeric() {
	    return isNumeric(beginAr642ReturnCode660
	                    ,beginAr642ReturnCode660 + AR_642_RETURN_CODE_660_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int AR_642_RETURN_CODE_660_LEN = 4;
  	/**
	 * serializeAr642ReturnCode660
	 */
	protected void serializeAr642ReturnCode660(int ar642ReturnCode660) {
		 putNumber(beginAr642ReturnCode660,ar642ReturnCode660,AR_642_RETURN_CODE_660_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localAr642ReturnCode660Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeAr642ReturnCode660
	 */
   	protected  int serializeAr642ReturnCode660(char[] value) {
	    int  ar642ReturnCode660;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ar642ReturnCode660 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginAr642ReturnCode660
		       ,4
		      );
		 localAr642ReturnCode660Counter = shareString.getSerializedField().getModifiedCounter();
		return  ar642ReturnCode660;
    }

   protected int checkAr642ReturnCode660MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshAr642ReturnCode660 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshAr642ReturnCode660() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginAr642ReturnCode660
			                 ,AR_642_RETURN_CODE_660_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ar642ReturnCode660", beginAr642ReturnCode660,AR_642_RETURN_CODE_660_LEN);
    }
   	}
     int localAr642ErrorMsg660ConditionGroup3Counter = -1;
     public boolean isAr642ErrorMsg660ConditionGroup3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAr642ErrorMsg660ConditionGroup3Counter != sharedCounter;
         localAr642ErrorMsg660ConditionGroup3Counter = sharedCounter; return hasModified;
     }
	protected static final int AR_642_ERROR_MSG_660_CONDITION_GROUP_3_LEN = 40;
	/**
	 * 	serialize this Ar642ErrorMsg660ConditionGroup3
	 */
   protected void serializeAr642ErrorMsg660ConditionGroup3(char[] ar642ErrorMsg660ConditionGroup3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ar642ErrorMsg660ConditionGroup3,0,getStringValue(),beginAr642ErrorMsg660ConditionGroup3,AR_642_ERROR_MSG_660_CONDITION_GROUP_3_LEN);
       localAr642ErrorMsg660ConditionGroup3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAr642ErrorMsg660ConditionGroup3Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshAr642ErrorMsg660ConditionGroup3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAr642ErrorMsg660ConditionGroup3() {	 
   		return (substring(getStringValue(),beginAr642ErrorMsg660ConditionGroup3,beginAr642ErrorMsg660ConditionGroup3 + AR_642_ERROR_MSG_660_CONDITION_GROUP_3_LEN));
   	}




}
  
