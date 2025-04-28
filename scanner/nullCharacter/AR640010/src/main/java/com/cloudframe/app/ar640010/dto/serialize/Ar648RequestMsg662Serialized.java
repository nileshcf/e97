package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class Ar648RequestMsg662Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:11. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ar648RequestMsg662Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ar648RequestMsg662Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int AR_648_REQUEST_MSG_662_LENGTH = 46;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAr648RequestCode662;
            protected int beginAr648RequestMsg662ConditionGroup2;
	
	/**
	* Constructor for Ar648RequestMsg662Serialized
	**/
    public Ar648RequestMsg662Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ar648RequestMsg662Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(AR_648_REQUEST_MSG_662_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginAr648RequestCode662 = getStartOffset() + 19;	// set offset for serialization
  
                beginAr648RequestMsg662ConditionGroup2 = getStartOffset() + 24;	// filler with 88
  
	   /*  end of offset */
	}
     int localAr648RequestCode662Counter = -1;
     public boolean isAr648RequestCode662Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAr648RequestCode662Counter != sharedCounter;
         localAr648RequestCode662Counter = sharedCounter; return hasModified;
     }
	protected static final int AR_648_REQUEST_CODE_662_LEN = 5;
	/**
	 * 	serialize this Ar648RequestCode662
	 */
   protected void serializeAr648RequestCode662(char[] ar648RequestCode662) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ar648RequestCode662,0,getStringValue(),beginAr648RequestCode662,AR_648_REQUEST_CODE_662_LEN);
       localAr648RequestCode662Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAr648RequestCode662Constraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshAr648RequestCode662 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAr648RequestCode662() {	 
   		return (substring(getStringValue(),beginAr648RequestCode662,beginAr648RequestCode662 + AR_648_REQUEST_CODE_662_LEN));
   	}
     int localAr648RequestMsg662ConditionGroup2Counter = -1;
     public boolean isAr648RequestMsg662ConditionGroup2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAr648RequestMsg662ConditionGroup2Counter != sharedCounter;
         localAr648RequestMsg662ConditionGroup2Counter = sharedCounter; return hasModified;
     }
	protected static final int AR_648_REQUEST_MSG_662_CONDITION_GROUP_2_LEN = 22;
	/**
	 * 	serialize this Ar648RequestMsg662ConditionGroup2
	 */
   protected void serializeAr648RequestMsg662ConditionGroup2(char[] ar648RequestMsg662ConditionGroup2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ar648RequestMsg662ConditionGroup2,0,getStringValue(),beginAr648RequestMsg662ConditionGroup2,AR_648_REQUEST_MSG_662_CONDITION_GROUP_2_LEN);
       localAr648RequestMsg662ConditionGroup2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAr648RequestMsg662ConditionGroup2Constraints(char[] value) {
   			return super.checkConstraints(value , 22 ,false, false);
   }
    /**
	 *	refreshAr648RequestMsg662ConditionGroup2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAr648RequestMsg662ConditionGroup2() {	 
   		return (substring(getStringValue(),beginAr648RequestMsg662ConditionGroup2,beginAr648RequestMsg662ConditionGroup2 + AR_648_REQUEST_MSG_662_CONDITION_GROUP_2_LEN));
   	}




}
  
