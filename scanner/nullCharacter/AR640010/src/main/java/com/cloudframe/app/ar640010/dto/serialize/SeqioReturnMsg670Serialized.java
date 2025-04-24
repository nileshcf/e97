package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class SeqioReturnMsg670Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:49. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SeqioReturnMsg670Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SeqioReturnMsg670Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SEQIO_RETURN_MSG_670_LENGTH = 79;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSeqioReturnCode670;
            protected int beginSeqioReturnMsg670ConditionGroup3;
	
	/**
	* Constructor for SeqioReturnMsg670Serialized
	**/
    public SeqioReturnMsg670Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in SeqioReturnMsg670Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SEQIO_RETURN_MSG_670_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginSeqioReturnCode670 = getStartOffset() + 28;	// set offset for serialization
  
  
                beginSeqioReturnMsg670ConditionGroup3 = getStartOffset() + 56;	// filler with 88
  
	   /*  end of offset */
	}
     int localSeqioReturnCode670Counter = -1;
     public boolean isSeqioReturnCode670Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSeqioReturnCode670Counter != sharedCounter;
         localSeqioReturnCode670Counter = sharedCounter; return hasModified;
     }
	protected static final int SEQIO_RETURN_CODE_670_LEN = 4;
	/**
	 * 	serialize this SeqioReturnCode670
	 */
   protected void serializeSeqioReturnCode670(char[] seqioReturnCode670) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(seqioReturnCode670,0,getStringValue(),beginSeqioReturnCode670,SEQIO_RETURN_CODE_670_LEN);
       localSeqioReturnCode670Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSeqioReturnCode670Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshSeqioReturnCode670 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSeqioReturnCode670() {	 
   		return (substring(getStringValue(),beginSeqioReturnCode670,beginSeqioReturnCode670 + SEQIO_RETURN_CODE_670_LEN));
   	}
     int localSeqioReturnMsg670ConditionGroup3Counter = -1;
     public boolean isSeqioReturnMsg670ConditionGroup3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSeqioReturnMsg670ConditionGroup3Counter != sharedCounter;
         localSeqioReturnMsg670ConditionGroup3Counter = sharedCounter; return hasModified;
     }
	protected static final int SEQIO_RETURN_MSG_670_CONDITION_GROUP_3_LEN = 23;
	/**
	 * 	serialize this SeqioReturnMsg670ConditionGroup3
	 */
   protected void serializeSeqioReturnMsg670ConditionGroup3(char[] seqioReturnMsg670ConditionGroup3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(seqioReturnMsg670ConditionGroup3,0,getStringValue(),beginSeqioReturnMsg670ConditionGroup3,SEQIO_RETURN_MSG_670_CONDITION_GROUP_3_LEN);
       localSeqioReturnMsg670ConditionGroup3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSeqioReturnMsg670ConditionGroup3Constraints(char[] value) {
   			return super.checkConstraints(value , 23 ,false, false);
   }
    /**
	 *	refreshSeqioReturnMsg670ConditionGroup3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSeqioReturnMsg670ConditionGroup3() {	 
   		return (substring(getStringValue(),beginSeqioReturnMsg670ConditionGroup3,beginSeqioReturnMsg670ConditionGroup3 + SEQIO_RETURN_MSG_670_CONDITION_GROUP_3_LEN));
   	}




}
  
