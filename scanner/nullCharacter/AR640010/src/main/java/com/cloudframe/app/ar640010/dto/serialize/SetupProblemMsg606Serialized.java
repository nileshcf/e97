package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class SetupProblemMsg606Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:11. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SetupProblemMsg606Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SetupProblemMsg606Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SETUP_PROBLEM_MSG_606_LENGTH = 70;
   /*  offset of each of Child Fields when serialized as a String */
            protected int beginSetupProblemMsg606ConditionGroup2;
	
	/**
	* Constructor for SetupProblemMsg606Serialized
	**/
    public SetupProblemMsg606Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in SetupProblemMsg606Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SETUP_PROBLEM_MSG_606_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
                beginSetupProblemMsg606ConditionGroup2 = getStartOffset() + 30;	// filler with 88
  
	   /*  end of offset */
	}
     int localSetupProblemMsg606ConditionGroup2Counter = -1;
     public boolean isSetupProblemMsg606ConditionGroup2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSetupProblemMsg606ConditionGroup2Counter != sharedCounter;
         localSetupProblemMsg606ConditionGroup2Counter = sharedCounter; return hasModified;
     }
	protected static final int SETUP_PROBLEM_MSG_606_CONDITION_GROUP_2_LEN = 40;
	/**
	 * 	serialize this SetupProblemMsg606ConditionGroup2
	 */
   protected void serializeSetupProblemMsg606ConditionGroup2(char[] setupProblemMsg606ConditionGroup2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(setupProblemMsg606ConditionGroup2,0,getStringValue(),beginSetupProblemMsg606ConditionGroup2,SETUP_PROBLEM_MSG_606_CONDITION_GROUP_2_LEN);
       localSetupProblemMsg606ConditionGroup2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSetupProblemMsg606ConditionGroup2Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshSetupProblemMsg606ConditionGroup2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSetupProblemMsg606ConditionGroup2() {	 
   		return (substring(getStringValue(),beginSetupProblemMsg606ConditionGroup2,beginSetupProblemMsg606ConditionGroup2 + SETUP_PROBLEM_MSG_606_CONDITION_GROUP_2_LEN));
   	}




}
  
