package com.cloudframe.app.init1.dto.serialize;

/**
*  The class Rl001CycleInputDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:52. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Rl001CycleInputDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Rl001CycleInputDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RL_001_CYCLE_INPUT_DATA_LENGTH = 700;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRl001HdrRecord;
            protected  int beginRl001TlrRecord;
	
	/**
	* Constructor for Rl001CycleInputDataSerialized
	**/
    public Rl001CycleInputDataSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Rl001CycleInputDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RL_001_CYCLE_INPUT_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginRl001HdrRecord = getStartOffset() + 0;	// set offset for serialization
  
             beginRl001TlrRecord = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRl001HdrRecordCounter = -1;
     public boolean isRl001HdrRecordModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRl001HdrRecordCounter != sharedCounter;
         localRl001HdrRecordCounter = sharedCounter; return hasModified;
     }
	protected static final int RL_001_HDR_RECORD_LEN = 700;
	/**
	 * 	serialize this Rl001HdrRecord
	 */
   protected void serializeRl001HdrRecord(char[] rl001HdrRecord) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rl001HdrRecord,0,getStringValue(),beginRl001HdrRecord,RL_001_HDR_RECORD_LEN);
       localRl001HdrRecordCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRl001HdrRecordConstraints(char[] value) {
   			return super.checkConstraints(value , 700 ,false, false);
   }
    /**
	 *	refreshRl001HdrRecord is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRl001HdrRecord() {	 
   		return (substring(getStringValue(),beginRl001HdrRecord,beginRl001HdrRecord + RL_001_HDR_RECORD_LEN));
   	}
     int localRl001TlrRecordCounter = -1;
     public boolean isRl001TlrRecordModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRl001TlrRecordCounter != sharedCounter;
         localRl001TlrRecordCounter = sharedCounter; return hasModified;
     }
	protected static final int RL_001_TLR_RECORD_LEN = 700;
	/**
	 * 	serialize this Rl001TlrRecord
	 */
   protected void serializeRl001TlrRecord(char[] rl001TlrRecord) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rl001TlrRecord,0,getStringValue(),beginRl001TlrRecord,RL_001_TLR_RECORD_LEN);
       localRl001TlrRecordCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRl001TlrRecordConstraints(char[] value) {
   			return super.checkConstraints(value , 700 ,false, false);
   }
    /**
	 *	refreshRl001TlrRecord is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRl001TlrRecord() {	 
   		return (substring(getStringValue(),beginRl001TlrRecord,beginRl001TlrRecord + RL_001_TLR_RECORD_LEN));
   	}




}
  
