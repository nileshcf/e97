package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class CopySourceMsg608Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CopySourceMsg608Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CopySourceMsg608Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int COPY_SOURCE_MSG_608_LENGTH = 68;
   /*  offset of each of Child Fields when serialized as a String */
            protected int beginCopySourceMsg608ConditionGroup2;
            protected  int beginCopySourceRecords608;
            protected  int beginCopySourceBytes608;
	
	/**
	* Constructor for CopySourceMsg608Serialized
	**/
    public CopySourceMsg608Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in CopySourceMsg608Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(COPY_SOURCE_MSG_608_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
                beginCopySourceMsg608ConditionGroup2 = getStartOffset() + 12;	// filler with 88
  
  
             beginCopySourceRecords608 = getStartOffset() + 33;	// set offset for serialization
  
  
             beginCopySourceBytes608 = getStartOffset() + 55;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCopySourceMsg608ConditionGroup2Counter = -1;
     public boolean isCopySourceMsg608ConditionGroup2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCopySourceMsg608ConditionGroup2Counter != sharedCounter;
         localCopySourceMsg608ConditionGroup2Counter = sharedCounter; return hasModified;
     }
	protected static final int COPY_SOURCE_MSG_608_CONDITION_GROUP_2_LEN = 11;
	/**
	 * 	serialize this CopySourceMsg608ConditionGroup2
	 */
   protected void serializeCopySourceMsg608ConditionGroup2(char[] copySourceMsg608ConditionGroup2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(copySourceMsg608ConditionGroup2,0,getStringValue(),beginCopySourceMsg608ConditionGroup2,COPY_SOURCE_MSG_608_CONDITION_GROUP_2_LEN);
       localCopySourceMsg608ConditionGroup2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCopySourceMsg608ConditionGroup2Constraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshCopySourceMsg608ConditionGroup2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCopySourceMsg608ConditionGroup2() {	 
   		return (substring(getStringValue(),beginCopySourceMsg608ConditionGroup2,beginCopySourceMsg608ConditionGroup2 + COPY_SOURCE_MSG_608_CONDITION_GROUP_2_LEN));
   	}
     int localCopySourceRecords608Counter = -1;
     public boolean isCopySourceRecords608Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCopySourceRecords608Counter != sharedCounter;
         localCopySourceRecords608Counter = sharedCounter; return hasModified;
     }
	protected static final int COPY_SOURCE_RECORDS_608_LEN = 13;
	/**
	 * 	serialize this CopySourceRecords608
	 */
   protected void serializeCopySourceRecords608(char[] copySourceRecords608) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(copySourceRecords608,0,getStringValue(),beginCopySourceRecords608,COPY_SOURCE_RECORDS_608_LEN);
       localCopySourceRecords608Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCopySourceRecords608Constraints(char[] value) {
   			return super.checkConstraints(value , 13 ,false, false);
   }
    /**
	 *	refreshCopySourceRecords608 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCopySourceRecords608() {	 
   		return (substring(getStringValue(),beginCopySourceRecords608,beginCopySourceRecords608 + COPY_SOURCE_RECORDS_608_LEN));
   	}
     int localCopySourceBytes608Counter = -1;
     public boolean isCopySourceBytes608Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCopySourceBytes608Counter != sharedCounter;
         localCopySourceBytes608Counter = sharedCounter; return hasModified;
     }
	protected static final int COPY_SOURCE_BYTES_608_LEN = 13;
	/**
	 * 	serialize this CopySourceBytes608
	 */
   protected void serializeCopySourceBytes608(char[] copySourceBytes608) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(copySourceBytes608,0,getStringValue(),beginCopySourceBytes608,COPY_SOURCE_BYTES_608_LEN);
       localCopySourceBytes608Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCopySourceBytes608Constraints(char[] value) {
   			return super.checkConstraints(value , 13 ,false, false);
   }
    /**
	 *	refreshCopySourceBytes608 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCopySourceBytes608() {	 
   		return (substring(getStringValue(),beginCopySourceBytes608,beginCopySourceBytes608 + COPY_SOURCE_BYTES_608_LEN));
   	}




}
  
