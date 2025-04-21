package com.cloudframe.app.ip739010.dto.serialize;

/**
*  The class TableIntegrityError640Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TableIntegrityError640Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TableIntegrityError640Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TABLE_INTEGRITY_ERROR_640_LENGTH = 63;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTableId640;
            protected  int beginTimestamp640;
	
	/**
	* Constructor for TableIntegrityError640Serialized
	**/
    public TableIntegrityError640Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in TableIntegrityError640Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TABLE_INTEGRITY_ERROR_640_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTableId640 = getStartOffset() + 0;	// set offset for serialization
  
  
             beginTimestamp640 = getStartOffset() + 10;	// set offset for serialization
  
  
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
     int localTimestamp640Counter = -1;
     public boolean isTimestamp640Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTimestamp640Counter != sharedCounter;
         localTimestamp640Counter = sharedCounter; return hasModified;
     }
	protected static final int TIMESTAMP_640_LEN = 10;
	/**
	 * 	serialize this Timestamp640
	 */
   protected void serializeTimestamp640(char[] timestamp640) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(timestamp640,0,getStringValue(),beginTimestamp640,TIMESTAMP_640_LEN);
       localTimestamp640Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTimestamp640Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshTimestamp640 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTimestamp640() {	 
   		return (substring(getStringValue(),beginTimestamp640,beginTimestamp640 + TIMESTAMP_640_LEN));
   	}




}
  
