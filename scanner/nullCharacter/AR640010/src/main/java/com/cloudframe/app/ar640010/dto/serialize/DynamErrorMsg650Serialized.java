package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class DynamErrorMsg650Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DynamErrorMsg650Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DynamErrorMsg650Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DYNAM_ERROR_MSG_650_LENGTH = 78;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDynamErrorRc650;
            protected  int beginDynamFunction650;
            protected int beginDynamErrorMsg650ConditionGroup4;
	
	/**
	* Constructor for DynamErrorMsg650Serialized
	**/
    public DynamErrorMsg650Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DynamErrorMsg650Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DYNAM_ERROR_MSG_650_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginDynamErrorRc650 = getStartOffset() + 34;	// set offset for serialization
  
  
             beginDynamFunction650 = getStartOffset() + 55;	// set offset for serialization
  
  
                beginDynamErrorMsg650ConditionGroup4 = getStartOffset() + 66;	// filler with 88
  
	   /*  end of offset */
	}
     int localDynamErrorRc650Counter = -1;
     public boolean isDynamErrorRc650Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDynamErrorRc650Counter != sharedCounter;
         localDynamErrorRc650Counter = sharedCounter; return hasModified;
     }
	protected static final int DYNAM_ERROR_RC_650_LEN = 9;
	/**
	 * 	serialize this DynamErrorRc650
	 */
   protected void serializeDynamErrorRc650(char[] dynamErrorRc650) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dynamErrorRc650,0,getStringValue(),beginDynamErrorRc650,DYNAM_ERROR_RC_650_LEN);
       localDynamErrorRc650Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDynamErrorRc650Constraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshDynamErrorRc650 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDynamErrorRc650() {	 
   		return (substring(getStringValue(),beginDynamErrorRc650,beginDynamErrorRc650 + DYNAM_ERROR_RC_650_LEN));
   	}
     int localDynamFunction650Counter = -1;
     public boolean isDynamFunction650Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDynamFunction650Counter != sharedCounter;
         localDynamFunction650Counter = sharedCounter; return hasModified;
     }
	protected static final int DYNAM_FUNCTION_650_LEN = 8;
	/**
	 * 	serialize this DynamFunction650
	 */
   protected void serializeDynamFunction650(char[] dynamFunction650) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dynamFunction650,0,getStringValue(),beginDynamFunction650,DYNAM_FUNCTION_650_LEN);
       localDynamFunction650Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDynamFunction650Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshDynamFunction650 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDynamFunction650() {	 
   		return (substring(getStringValue(),beginDynamFunction650,beginDynamFunction650 + DYNAM_FUNCTION_650_LEN));
   	}
     int localDynamErrorMsg650ConditionGroup4Counter = -1;
     public boolean isDynamErrorMsg650ConditionGroup4Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDynamErrorMsg650ConditionGroup4Counter != sharedCounter;
         localDynamErrorMsg650ConditionGroup4Counter = sharedCounter; return hasModified;
     }
	protected static final int DYNAM_ERROR_MSG_650_CONDITION_GROUP_4_LEN = 12;
	/**
	 * 	serialize this DynamErrorMsg650ConditionGroup4
	 */
   protected void serializeDynamErrorMsg650ConditionGroup4(char[] dynamErrorMsg650ConditionGroup4) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dynamErrorMsg650ConditionGroup4,0,getStringValue(),beginDynamErrorMsg650ConditionGroup4,DYNAM_ERROR_MSG_650_CONDITION_GROUP_4_LEN);
       localDynamErrorMsg650ConditionGroup4Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDynamErrorMsg650ConditionGroup4Constraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshDynamErrorMsg650ConditionGroup4 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDynamErrorMsg650ConditionGroup4() {	 
   		return (substring(getStringValue(),beginDynamErrorMsg650ConditionGroup4,beginDynamErrorMsg650ConditionGroup4 + DYNAM_ERROR_MSG_650_CONDITION_GROUP_4_LEN));
   	}




}
  
