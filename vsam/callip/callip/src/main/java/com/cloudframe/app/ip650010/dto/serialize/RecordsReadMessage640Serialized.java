package com.cloudframe.app.ip650010.dto.serialize;

/**
*  The class RecordsReadMessage640Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:07. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RecordsReadMessage640Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RecordsReadMessage640Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RECORDS_READ_MESSAGE_640_LENGTH = 76;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTableId640;
            protected  int beginEffDate640;
            protected  int beginRecReadCnt640;
	
	/**
	* Constructor for RecordsReadMessage640Serialized
	**/
    public RecordsReadMessage640Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in RecordsReadMessage640Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RECORDS_READ_MESSAGE_640_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginTableId640 = getStartOffset() + 15;	// set offset for serialization
  
  
             beginEffDate640 = getStartOffset() + 43;	// set offset for serialization
  
  
             beginRecReadCnt640 = getStartOffset() + 70;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localTableId640Counter = -1;
     public boolean isTableId640Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTableId640Counter != sharedCounter;
         localTableId640Counter = sharedCounter; return hasModified;
     }
	protected static final int TABLE_ID_640_LEN = 8;
	/**
	 * 	serialize this TableId640
	 */
   protected void serializeTableId640(char[] tableId640) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tableId640,0,getStringValue(),beginTableId640,TABLE_ID_640_LEN);
       localTableId640Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTableId640Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshTableId640 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTableId640() {	 
   		return (substring(getStringValue(),beginTableId640,beginTableId640 + TABLE_ID_640_LEN));
   	}
     int localEffDate640Counter = -1;
     public boolean isEffDate640Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEffDate640Counter != sharedCounter;
         localEffDate640Counter = sharedCounter; return hasModified;
     }
	protected static final int EFF_DATE_640_LEN = 10;
	/**
	 * 	serialize this EffDate640
	 */
   protected void serializeEffDate640(char[] effDate640) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(effDate640,0,getStringValue(),beginEffDate640,EFF_DATE_640_LEN);
       localEffDate640Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEffDate640Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshEffDate640 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEffDate640() {	 
   		return (substring(getStringValue(),beginEffDate640,beginEffDate640 + EFF_DATE_640_LEN));
   	}
     int localRecReadCnt640Counter = -1;
     public boolean isRecReadCnt640Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRecReadCnt640Counter != sharedCounter;
         localRecReadCnt640Counter = sharedCounter; return hasModified;
     }
	protected static final int REC_READ_CNT_640_LEN = 5;
	/**
	 * 	serialize this RecReadCnt640
	 */
   protected void serializeRecReadCnt640(char[] recReadCnt640) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(recReadCnt640,0,getStringValue(),beginRecReadCnt640,REC_READ_CNT_640_LEN);
       localRecReadCnt640Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRecReadCnt640Constraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshRecReadCnt640 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRecReadCnt640() {	 
   		return (substring(getStringValue(),beginRecReadCnt640,beginRecReadCnt640 + REC_READ_CNT_640_LEN));
   	}




}
  
