package com.cloudframe.app.ip739010.dto.serialize;

/**
*  The class RowsLoadedMessage630Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:08. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RowsLoadedMessage630Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RowsLoadedMessage630Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ROWS_LOADED_MESSAGE_630_LENGTH = 78;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTableId630;
            protected  int beginTableTimestamp630;
            protected  int beginRowsLoadedCnt630;
	
	/**
	* Constructor for RowsLoadedMessage630Serialized
	**/
    public RowsLoadedMessage630Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in RowsLoadedMessage630Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ROWS_LOADED_MESSAGE_630_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginTableId630 = getStartOffset() + 9;	// set offset for serialization
  
  
             beginTableTimestamp630 = getStartOffset() + 19;	// set offset for serialization
  
  
             beginRowsLoadedCnt630 = getStartOffset() + 45;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localTableId630Counter = -1;
     public boolean isTableId630Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTableId630Counter != sharedCounter;
         localTableId630Counter = sharedCounter; return hasModified;
     }
	protected static final int TABLE_ID_630_LEN = 8;
	/**
	 * 	serialize this TableId630
	 */
   protected void serializeTableId630(char[] tableId630) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tableId630,0,getStringValue(),beginTableId630,TABLE_ID_630_LEN);
       localTableId630Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTableId630Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshTableId630 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTableId630() {	 
   		return (substring(getStringValue(),beginTableId630,beginTableId630 + TABLE_ID_630_LEN));
   	}
     int localTableTimestamp630Counter = -1;
     public boolean isTableTimestamp630Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTableTimestamp630Counter != sharedCounter;
         localTableTimestamp630Counter = sharedCounter; return hasModified;
     }
	protected static final int TABLE_TIMESTAMP_630_LEN = 10;
	/**
	 * 	serialize this TableTimestamp630
	 */
   protected void serializeTableTimestamp630(char[] tableTimestamp630) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tableTimestamp630,0,getStringValue(),beginTableTimestamp630,TABLE_TIMESTAMP_630_LEN);
       localTableTimestamp630Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTableTimestamp630Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshTableTimestamp630 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTableTimestamp630() {	 
   		return (substring(getStringValue(),beginTableTimestamp630,beginTableTimestamp630 + TABLE_TIMESTAMP_630_LEN));
   	}
     int localRowsLoadedCnt630Counter = -1;
     public boolean isRowsLoadedCnt630Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRowsLoadedCnt630Counter != sharedCounter;
         localRowsLoadedCnt630Counter = sharedCounter; return hasModified;
     }
	protected static final int ROWS_LOADED_CNT_630_LEN = 4;
	/**
	 * 	serialize this RowsLoadedCnt630
	 */
   protected void serializeRowsLoadedCnt630(char[] rowsLoadedCnt630) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rowsLoadedCnt630,0,getStringValue(),beginRowsLoadedCnt630,ROWS_LOADED_CNT_630_LEN);
       localRowsLoadedCnt630Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRowsLoadedCnt630Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshRowsLoadedCnt630 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRowsLoadedCnt630() {	 
   		return (substring(getStringValue(),beginRowsLoadedCnt630,beginRowsLoadedCnt630 + ROWS_LOADED_CNT_630_LEN));
   	}




}
  
