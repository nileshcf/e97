package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class A01PassedParmSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:05. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class A01PassedParmSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(A01PassedParmSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_01_PASSED_PARM_LENGTH = 9;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginA01PassedParmLength;
            protected  int beginA01PassedCycleId;
            protected  int beginA01PassedVoiceIca;
	
	/**
	* Constructor for A01PassedParmSerialized
	**/
    public A01PassedParmSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in A01PassedParmSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_01_PASSED_PARM_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginA01PassedParmLength = getStartOffset() + 0;	// set offset for serialization
  
             beginA01PassedCycleId = getStartOffset() + 2;	// set offset for serialization
  
             beginA01PassedVoiceIca = getStartOffset() + 3;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localA01PassedParmLengthCounter = -1;
         public boolean isA01PassedParmLengthModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localA01PassedParmLengthCounter != sharedCounter;
            localA01PassedParmLengthCounter = sharedCounter; return hasModified; 
         }
   protected static final int A_01_PASSED_PARM_LENGTH_LEN = 2;
  	/**
	 * serializeA01PassedParmLength
	 */
	protected void serializeA01PassedParmLength(short a01PassedParmLength) {
           replaceValue( //  save the value as string
                   getBinaryString( a01PassedParmLength,A_01_PASSED_PARM_LENGTH_LEN)
                  ,beginA01PassedParmLength
                  ,A_01_PASSED_PARM_LENGTH_LEN
                 );
            localA01PassedParmLengthCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkA01PassedParmLengthMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshA01PassedParmLength is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshA01PassedParmLength() {	 
			return (getShort(beginA01PassedParmLength));
   	}
     int localA01PassedCycleIdCounter = -1;
     public boolean isA01PassedCycleIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localA01PassedCycleIdCounter != sharedCounter;
         localA01PassedCycleIdCounter = sharedCounter; return hasModified;
     }
	protected static final int A_01_PASSED_CYCLE_ID_LEN = 1;
	/**
	 * 	serialize this A01PassedCycleId
	 */
   protected void serializeA01PassedCycleId(char[] a01PassedCycleId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(a01PassedCycleId,0,getStringValue(),beginA01PassedCycleId,A_01_PASSED_CYCLE_ID_LEN);
       localA01PassedCycleIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkA01PassedCycleIdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshA01PassedCycleId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshA01PassedCycleId() {	 
   		return (substring(getStringValue(),beginA01PassedCycleId,beginA01PassedCycleId + A_01_PASSED_CYCLE_ID_LEN));
   	}
     int localA01PassedVoiceIcaCounter = -1;
     public boolean isA01PassedVoiceIcaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localA01PassedVoiceIcaCounter != sharedCounter;
         localA01PassedVoiceIcaCounter = sharedCounter; return hasModified;
     }
	protected static final int A_01_PASSED_VOICE_ICA_LEN = 6;
	/**
	 * 	serialize this A01PassedVoiceIca
	 */
   protected void serializeA01PassedVoiceIca(char[] a01PassedVoiceIca) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(a01PassedVoiceIca,0,getStringValue(),beginA01PassedVoiceIca,A_01_PASSED_VOICE_ICA_LEN);
       localA01PassedVoiceIcaCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkA01PassedVoiceIcaConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshA01PassedVoiceIca is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshA01PassedVoiceIca() {	 
   		return (substring(getStringValue(),beginA01PassedVoiceIca,beginA01PassedVoiceIca + A_01_PASSED_VOICE_ICA_LEN));
   	}




}
  
