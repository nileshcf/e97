package com.cloudframe.app.dbrowset.dto.serialize;

/**
*  The class MiscSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MiscSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MiscSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MISC_LENGTH = 40;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTimestamp;
            protected  int beginMaxRows;
	
	/**
	* Constructor for MiscSerialized
	**/
    public MiscSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in MiscSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MISC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTimestamp = getStartOffset() + 0;	// set offset for serialization
  
             beginMaxRows = getStartOffset() + 36;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localTimestampCounter = -1;
     public boolean isTimestampModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTimestampCounter != sharedCounter;
         localTimestampCounter = sharedCounter; return hasModified;
     }
	protected static final int TIMESTAMP_LEN = 32;
	/**
	 * 	serialize this Timestamp
	 */
   protected void serializeTimestamp(char[] timestamp) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(timestamp,0,getStringValue(),beginTimestamp,TIMESTAMP_LEN);
       localTimestampCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTimestampConstraints(char[] value) {
   			return super.checkConstraints(value , 32 ,false, false);
   }
    /**
	 *	refreshTimestamp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTimestamp() {	 
   		return (substring(getStringValue(),beginTimestamp,beginTimestamp + TIMESTAMP_LEN));
   	}
         int localMaxRowsCounter = -1;
         public boolean isMaxRowsModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMaxRowsCounter != sharedCounter;
            localMaxRowsCounter = sharedCounter; return hasModified; 
         }
   protected static final int MAX_ROWS_LEN = 4;
  	/**
	 * serializeMaxRows
	 */
	protected void serializeMaxRows(int maxRows) {
           replaceValue( //  save the value as string
                   getBinaryString( maxRows,MAX_ROWS_LEN)
                  ,beginMaxRows
                  ,MAX_ROWS_LEN
                 );
            localMaxRowsCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkMaxRowsMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshMaxRows is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMaxRows() {	 
			return (getInt(beginMaxRows));
   	}




}
  
