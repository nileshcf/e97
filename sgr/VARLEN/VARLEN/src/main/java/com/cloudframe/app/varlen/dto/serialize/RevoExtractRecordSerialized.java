package com.cloudframe.app.varlen.dto.serialize;

/**
*  The class RevoExtractRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:05. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RevoExtractRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RevoExtractRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int REVO_EXTRACT_RECORD_LENGTH = 1676;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRevoFixedPartOfRecord;
	
	/**
	* Constructor for RevoExtractRecordSerialized
	**/
    public RevoExtractRecordSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in RevoExtractRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(REVO_EXTRACT_RECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRevoFixedPartOfRecord = getStartOffset() + 2;	// set offset for serialization
  
  
  
  
	   /*  end of offset */
	}
     int localRevoFixedPartOfRecordCounter = -1;
     public boolean isRevoFixedPartOfRecordModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRevoFixedPartOfRecordCounter != sharedCounter;
         localRevoFixedPartOfRecordCounter = sharedCounter; return hasModified;
     }
	protected static final int REVO_FIXED_PART_OF_RECORD_LEN = 674;
	/**
	 * 	serialize this RevoFixedPartOfRecord
	 */
   protected void serializeRevoFixedPartOfRecord(char[] revoFixedPartOfRecord) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(revoFixedPartOfRecord,0,getStringValue(),beginRevoFixedPartOfRecord,REVO_FIXED_PART_OF_RECORD_LEN);
       localRevoFixedPartOfRecordCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRevoFixedPartOfRecordConstraints(char[] value) {
   			return super.checkConstraints(value , 674 ,false, false);
   }
    /**
	 *	refreshRevoFixedPartOfRecord is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRevoFixedPartOfRecord() {	 
   		return (substring(getStringValue(),beginRevoFixedPartOfRecord,beginRevoFixedPartOfRecord + REVO_FIXED_PART_OF_RECORD_LEN));
   	}




     private int dependValue = 0;  
     
  	 public void setDependingValue(int dependValue) {
	   this.dependValue = dependValue;
  	 }

     public int getVariableLength() {
     	return 0 + (dependValue *  0);
     }
     
     public int getVariableLength(int idx) {
     	return 0 + (idx *  0);
     }
}
  
