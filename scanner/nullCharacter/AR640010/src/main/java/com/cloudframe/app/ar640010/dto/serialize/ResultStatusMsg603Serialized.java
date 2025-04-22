package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class ResultStatusMsg603Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ResultStatusMsg603Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ResultStatusMsg603Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RESULT_STATUS_MSG_603_LENGTH = 43;
   /*  offset of each of Child Fields when serialized as a String */
            protected int beginResultStatusMsg603ConditionGroup2;
            protected  int beginResultEndptId603;
            protected  int beginResultStatus603;
	
	/**
	* Constructor for ResultStatusMsg603Serialized
	**/
    public ResultStatusMsg603Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ResultStatusMsg603Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RESULT_STATUS_MSG_603_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
                beginResultStatusMsg603ConditionGroup2 = getStartOffset() + 5;	// filler with 88
  
  
             beginResultEndptId603 = getStartOffset() + 29;	// set offset for serialization
  
  
             beginResultStatus603 = getStartOffset() + 37;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localResultStatusMsg603ConditionGroup2Counter = -1;
     public boolean isResultStatusMsg603ConditionGroup2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localResultStatusMsg603ConditionGroup2Counter != sharedCounter;
         localResultStatusMsg603ConditionGroup2Counter = sharedCounter; return hasModified;
     }
	protected static final int RESULT_STATUS_MSG_603_CONDITION_GROUP_2_LEN = 14;
	/**
	 * 	serialize this ResultStatusMsg603ConditionGroup2
	 */
   protected void serializeResultStatusMsg603ConditionGroup2(char[] resultStatusMsg603ConditionGroup2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(resultStatusMsg603ConditionGroup2,0,getStringValue(),beginResultStatusMsg603ConditionGroup2,RESULT_STATUS_MSG_603_CONDITION_GROUP_2_LEN);
       localResultStatusMsg603ConditionGroup2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkResultStatusMsg603ConditionGroup2Constraints(char[] value) {
   			return super.checkConstraints(value , 14 ,false, false);
   }
    /**
	 *	refreshResultStatusMsg603ConditionGroup2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshResultStatusMsg603ConditionGroup2() {	 
   		return (substring(getStringValue(),beginResultStatusMsg603ConditionGroup2,beginResultStatusMsg603ConditionGroup2 + RESULT_STATUS_MSG_603_CONDITION_GROUP_2_LEN));
   	}
     int localResultEndptId603Counter = -1;
     public boolean isResultEndptId603Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localResultEndptId603Counter != sharedCounter;
         localResultEndptId603Counter = sharedCounter; return hasModified;
     }
	protected static final int RESULT_ENDPT_ID_603_LEN = 7;
	/**
	 * 	serialize this ResultEndptId603
	 */
   protected void serializeResultEndptId603(char[] resultEndptId603) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(resultEndptId603,0,getStringValue(),beginResultEndptId603,RESULT_ENDPT_ID_603_LEN);
       localResultEndptId603Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkResultEndptId603Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshResultEndptId603 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshResultEndptId603() {	 
   		return (substring(getStringValue(),beginResultEndptId603,beginResultEndptId603 + RESULT_ENDPT_ID_603_LEN));
   	}
     int localResultStatus603Counter = -1;
     public boolean isResultStatus603Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localResultStatus603Counter != sharedCounter;
         localResultStatus603Counter = sharedCounter; return hasModified;
     }
	protected static final int RESULT_STATUS_603_LEN = 6;
	/**
	 * 	serialize this ResultStatus603
	 */
   protected void serializeResultStatus603(char[] resultStatus603) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(resultStatus603,0,getStringValue(),beginResultStatus603,RESULT_STATUS_603_LEN);
       localResultStatus603Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkResultStatus603Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshResultStatus603 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshResultStatus603() {	 
   		return (substring(getStringValue(),beginResultStatus603,beginResultStatus603 + RESULT_STATUS_603_LEN));
   	}




}
  
