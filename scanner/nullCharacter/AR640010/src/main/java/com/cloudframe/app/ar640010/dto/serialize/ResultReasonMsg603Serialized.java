package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class ResultReasonMsg603Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ResultReasonMsg603Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ResultReasonMsg603Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RESULT_REASON_MSG_603_LENGTH = 38;
   /*  offset of each of Child Fields when serialized as a String */
            protected int beginResultReasonMsg603ConditionGroup1;
            protected  int beginResultReason603;
	
	/**
	* Constructor for ResultReasonMsg603Serialized
	**/
    public ResultReasonMsg603Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ResultReasonMsg603Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RESULT_REASON_MSG_603_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
                beginResultReasonMsg603ConditionGroup1 = getStartOffset() + 0;	// filler with 88
  
             beginResultReason603 = getStartOffset() + 9;	// set offset for serialization
  
  
  
	   /*  end of offset */
	}
     int localResultReasonMsg603ConditionGroup1Counter = -1;
     public boolean isResultReasonMsg603ConditionGroup1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localResultReasonMsg603ConditionGroup1Counter != sharedCounter;
         localResultReasonMsg603ConditionGroup1Counter = sharedCounter; return hasModified;
     }
	protected static final int RESULT_REASON_MSG_603_CONDITION_GROUP_1_LEN = 9;
	/**
	 * 	serialize this ResultReasonMsg603ConditionGroup1
	 */
   protected void serializeResultReasonMsg603ConditionGroup1(char[] resultReasonMsg603ConditionGroup1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(resultReasonMsg603ConditionGroup1,0,getStringValue(),beginResultReasonMsg603ConditionGroup1,RESULT_REASON_MSG_603_CONDITION_GROUP_1_LEN);
       localResultReasonMsg603ConditionGroup1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkResultReasonMsg603ConditionGroup1Constraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshResultReasonMsg603ConditionGroup1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshResultReasonMsg603ConditionGroup1() {	 
   		return (substring(getStringValue(),beginResultReasonMsg603ConditionGroup1,beginResultReasonMsg603ConditionGroup1 + RESULT_REASON_MSG_603_CONDITION_GROUP_1_LEN));
   	}
     int localResultReason603Counter = -1;
     public boolean isResultReason603Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localResultReason603Counter != sharedCounter;
         localResultReason603Counter = sharedCounter; return hasModified;
     }
	protected static final int RESULT_REASON_603_LEN = 29;
	/**
	 * 	serialize this ResultReason603
	 */
   protected void serializeResultReason603(char[] resultReason603) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(resultReason603,0,getStringValue(),beginResultReason603,RESULT_REASON_603_LEN);
       localResultReason603Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkResultReason603Constraints(char[] value) {
   			return super.checkConstraints(value , 29 ,false, false);
   }
    /**
	 *	refreshResultReason603 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshResultReason603() {	 
   		return (substring(getStringValue(),beginResultReason603,beginResultReason603 + RESULT_REASON_603_LEN));
   	}




}
  
