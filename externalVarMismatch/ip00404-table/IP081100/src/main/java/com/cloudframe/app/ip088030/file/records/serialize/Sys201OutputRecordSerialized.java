package com.cloudframe.app.ip088030.file.records.serialize;

/**
*  The class Sys201OutputRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:30. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sys201OutputRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sys201OutputRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_201_OUTPUT_RECORD_LENGTH = 790;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSys201RecordPart1;
	
	/**
	* Constructor for Sys201OutputRecordSerialized
	**/
    public Sys201OutputRecordSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Sys201OutputRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_201_OUTPUT_RECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSys201RecordPart1 = getStartOffset() + 0;	// set offset for serialization
  
  
  
	   /*  end of offset */
	}
     int localSys201RecordPart1Counter = -1;
     public boolean isSys201RecordPart1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys201RecordPart1Counter != sharedCounter;
         localSys201RecordPart1Counter = sharedCounter; return hasModified;
     }
	protected static final int SYS_201_RECORD_PART_1_LEN = 255;
	/**
	 * 	serialize this Sys201RecordPart1
	 */
   protected void serializeSys201RecordPart1(char[] sys201RecordPart1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys201RecordPart1,0,getStringValue(),beginSys201RecordPart1,SYS_201_RECORD_PART_1_LEN);
       localSys201RecordPart1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys201RecordPart1Constraints(char[] value) {
   			return super.checkConstraints(value , 255 ,false, false);
   }
    /**
	 *	refreshSys201RecordPart1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys201RecordPart1() {	 
   		return (substring(getStringValue(),beginSys201RecordPart1,beginSys201RecordPart1 + SYS_201_RECORD_PART_1_LEN));
   	}




}
  
