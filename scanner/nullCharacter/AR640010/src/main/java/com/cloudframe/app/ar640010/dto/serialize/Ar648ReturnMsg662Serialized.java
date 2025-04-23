package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class Ar648ReturnMsg662Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:33. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ar648ReturnMsg662Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ar648ReturnMsg662Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int AR_648_RETURN_MSG_662_LENGTH = 71;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAr648ReturnCode662;
            protected int beginAr648ReturnMsg662ConditionGroup2;
	
	/**
	* Constructor for Ar648ReturnMsg662Serialized
	**/
    public Ar648ReturnMsg662Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ar648ReturnMsg662Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(AR_648_RETURN_MSG_662_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginAr648ReturnCode662 = getStartOffset() + 19;	// set offset for serialization
  
                beginAr648ReturnMsg662ConditionGroup2 = getStartOffset() + 24;	// filler with 88
  
	   /*  end of offset */
	}
     int localAr648ReturnCode662Counter = -1;
     public boolean isAr648ReturnCode662Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAr648ReturnCode662Counter != sharedCounter;
         localAr648ReturnCode662Counter = sharedCounter; return hasModified;
     }
	protected static final int AR_648_RETURN_CODE_662_LEN = 5;
	/**
	 * 	serialize this Ar648ReturnCode662
	 */
   protected void serializeAr648ReturnCode662(char[] ar648ReturnCode662) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ar648ReturnCode662,0,getStringValue(),beginAr648ReturnCode662,AR_648_RETURN_CODE_662_LEN);
       localAr648ReturnCode662Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAr648ReturnCode662Constraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshAr648ReturnCode662 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAr648ReturnCode662() {	 
   		return (substring(getStringValue(),beginAr648ReturnCode662,beginAr648ReturnCode662 + AR_648_RETURN_CODE_662_LEN));
   	}
     int localAr648ReturnMsg662ConditionGroup2Counter = -1;
     public boolean isAr648ReturnMsg662ConditionGroup2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAr648ReturnMsg662ConditionGroup2Counter != sharedCounter;
         localAr648ReturnMsg662ConditionGroup2Counter = sharedCounter; return hasModified;
     }
	protected static final int AR_648_RETURN_MSG_662_CONDITION_GROUP_2_LEN = 47;
	/**
	 * 	serialize this Ar648ReturnMsg662ConditionGroup2
	 */
   protected void serializeAr648ReturnMsg662ConditionGroup2(char[] ar648ReturnMsg662ConditionGroup2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ar648ReturnMsg662ConditionGroup2,0,getStringValue(),beginAr648ReturnMsg662ConditionGroup2,AR_648_RETURN_MSG_662_CONDITION_GROUP_2_LEN);
       localAr648ReturnMsg662ConditionGroup2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAr648ReturnMsg662ConditionGroup2Constraints(char[] value) {
   			return super.checkConstraints(value , 47 ,false, false);
   }
    /**
	 *	refreshAr648ReturnMsg662ConditionGroup2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAr648ReturnMsg662ConditionGroup2() {	 
   		return (substring(getStringValue(),beginAr648ReturnMsg662ConditionGroup2,beginAr648ReturnMsg662ConditionGroup2 + AR_648_RETURN_MSG_662_CONDITION_GROUP_2_LEN));
   	}




}
  
