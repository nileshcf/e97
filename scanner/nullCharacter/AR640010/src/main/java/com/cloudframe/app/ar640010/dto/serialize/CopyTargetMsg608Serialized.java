package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class CopyTargetMsg608Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:11. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CopyTargetMsg608Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CopyTargetMsg608Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int COPY_TARGET_MSG_608_LENGTH = 68;
   /*  offset of each of Child Fields when serialized as a String */
            protected int beginCopyTargetMsg608ConditionGroup2;
            protected  int beginCopyTargetRecords608;
            protected  int beginCopyTargetBytes608;
	
	/**
	* Constructor for CopyTargetMsg608Serialized
	**/
    public CopyTargetMsg608Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in CopyTargetMsg608Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(COPY_TARGET_MSG_608_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
                beginCopyTargetMsg608ConditionGroup2 = getStartOffset() + 12;	// filler with 88
  
  
             beginCopyTargetRecords608 = getStartOffset() + 33;	// set offset for serialization
  
  
             beginCopyTargetBytes608 = getStartOffset() + 55;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCopyTargetMsg608ConditionGroup2Counter = -1;
     public boolean isCopyTargetMsg608ConditionGroup2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCopyTargetMsg608ConditionGroup2Counter != sharedCounter;
         localCopyTargetMsg608ConditionGroup2Counter = sharedCounter; return hasModified;
     }
	protected static final int COPY_TARGET_MSG_608_CONDITION_GROUP_2_LEN = 11;
	/**
	 * 	serialize this CopyTargetMsg608ConditionGroup2
	 */
   protected void serializeCopyTargetMsg608ConditionGroup2(char[] copyTargetMsg608ConditionGroup2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(copyTargetMsg608ConditionGroup2,0,getStringValue(),beginCopyTargetMsg608ConditionGroup2,COPY_TARGET_MSG_608_CONDITION_GROUP_2_LEN);
       localCopyTargetMsg608ConditionGroup2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCopyTargetMsg608ConditionGroup2Constraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshCopyTargetMsg608ConditionGroup2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCopyTargetMsg608ConditionGroup2() {	 
   		return (substring(getStringValue(),beginCopyTargetMsg608ConditionGroup2,beginCopyTargetMsg608ConditionGroup2 + COPY_TARGET_MSG_608_CONDITION_GROUP_2_LEN));
   	}
     int localCopyTargetRecords608Counter = -1;
     public boolean isCopyTargetRecords608Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCopyTargetRecords608Counter != sharedCounter;
         localCopyTargetRecords608Counter = sharedCounter; return hasModified;
     }
	protected static final int COPY_TARGET_RECORDS_608_LEN = 13;
	/**
	 * 	serialize this CopyTargetRecords608
	 */
   protected void serializeCopyTargetRecords608(char[] copyTargetRecords608) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(copyTargetRecords608,0,getStringValue(),beginCopyTargetRecords608,COPY_TARGET_RECORDS_608_LEN);
       localCopyTargetRecords608Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCopyTargetRecords608Constraints(char[] value) {
   			return super.checkConstraints(value , 13 ,false, false);
   }
    /**
	 *	refreshCopyTargetRecords608 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCopyTargetRecords608() {	 
   		return (substring(getStringValue(),beginCopyTargetRecords608,beginCopyTargetRecords608 + COPY_TARGET_RECORDS_608_LEN));
   	}
     int localCopyTargetBytes608Counter = -1;
     public boolean isCopyTargetBytes608Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCopyTargetBytes608Counter != sharedCounter;
         localCopyTargetBytes608Counter = sharedCounter; return hasModified;
     }
	protected static final int COPY_TARGET_BYTES_608_LEN = 13;
	/**
	 * 	serialize this CopyTargetBytes608
	 */
   protected void serializeCopyTargetBytes608(char[] copyTargetBytes608) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(copyTargetBytes608,0,getStringValue(),beginCopyTargetBytes608,COPY_TARGET_BYTES_608_LEN);
       localCopyTargetBytes608Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCopyTargetBytes608Constraints(char[] value) {
   			return super.checkConstraints(value , 13 ,false, false);
   }
    /**
	 *	refreshCopyTargetBytes608 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCopyTargetBytes608() {	 
   		return (substring(getStringValue(),beginCopyTargetBytes608,beginCopyTargetBytes608 + COPY_TARGET_BYTES_608_LEN));
   	}




}
  
