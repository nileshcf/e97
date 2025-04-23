package com.cloudframe.app.ip741010.dto.serialize;

/**
*  The class TableOverflowError600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:21. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TableOverflowError600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TableOverflowError600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TABLE_OVERFLOW_ERROR_600_LENGTH = 37;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTableId600;
            protected  int beginTimestamp600;
	
	/**
	* Constructor for TableOverflowError600Serialized
	**/
    public TableOverflowError600Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in TableOverflowError600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TABLE_OVERFLOW_ERROR_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTableId600 = getStartOffset() + 0;	// set offset for serialization
  
  
             beginTimestamp600 = getStartOffset() + 10;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localTableId600Counter = -1;
     public boolean isTableId600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTableId600Counter != sharedCounter;
         localTableId600Counter = sharedCounter; return hasModified;
     }
	protected static final int TABLE_ID_600_LEN = 8;
	/**
	 * 	serialize this TableId600
	 */
   protected void serializeTableId600(char[] tableId600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tableId600,0,getStringValue(),beginTableId600,TABLE_ID_600_LEN);
       localTableId600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTableId600Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshTableId600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTableId600() {	 
   		return (substring(getStringValue(),beginTableId600,beginTableId600 + TABLE_ID_600_LEN));
   	}
     int localTimestamp600Counter = -1;
     public boolean isTimestamp600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTimestamp600Counter != sharedCounter;
         localTimestamp600Counter = sharedCounter; return hasModified;
     }
	protected static final int TIMESTAMP_600_LEN = 10;
	/**
	 * 	serialize this Timestamp600
	 */
   protected void serializeTimestamp600(char[] timestamp600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(timestamp600,0,getStringValue(),beginTimestamp600,TIMESTAMP_600_LEN);
       localTimestamp600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTimestamp600Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshTimestamp600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTimestamp600() {	 
   		return (substring(getStringValue(),beginTimestamp600,beginTimestamp600 + TIMESTAMP_600_LEN));
   	}




}
  
