package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class RenameFileMsg608Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RenameFileMsg608Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RenameFileMsg608Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RENAME_FILE_MSG_608_LENGTH = 63;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRenameFileRecords608;
            protected  int beginRenameFileBytes608;
	
	/**
	* Constructor for RenameFileMsg608Serialized
	**/
    public RenameFileMsg608Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in RenameFileMsg608Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RENAME_FILE_MSG_608_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginRenameFileRecords608 = getStartOffset() + 28;	// set offset for serialization
  
  
             beginRenameFileBytes608 = getStartOffset() + 50;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRenameFileRecords608Counter = -1;
     public boolean isRenameFileRecords608Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRenameFileRecords608Counter != sharedCounter;
         localRenameFileRecords608Counter = sharedCounter; return hasModified;
     }
	protected static final int RENAME_FILE_RECORDS_608_LEN = 13;
	/**
	 * 	serialize this RenameFileRecords608
	 */
   protected void serializeRenameFileRecords608(char[] renameFileRecords608) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(renameFileRecords608,0,getStringValue(),beginRenameFileRecords608,RENAME_FILE_RECORDS_608_LEN);
       localRenameFileRecords608Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRenameFileRecords608Constraints(char[] value) {
   			return super.checkConstraints(value , 13 ,false, false);
   }
    /**
	 *	refreshRenameFileRecords608 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRenameFileRecords608() {	 
   		return (substring(getStringValue(),beginRenameFileRecords608,beginRenameFileRecords608 + RENAME_FILE_RECORDS_608_LEN));
   	}
     int localRenameFileBytes608Counter = -1;
     public boolean isRenameFileBytes608Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRenameFileBytes608Counter != sharedCounter;
         localRenameFileBytes608Counter = sharedCounter; return hasModified;
     }
	protected static final int RENAME_FILE_BYTES_608_LEN = 13;
	/**
	 * 	serialize this RenameFileBytes608
	 */
   protected void serializeRenameFileBytes608(char[] renameFileBytes608) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(renameFileBytes608,0,getStringValue(),beginRenameFileBytes608,RENAME_FILE_BYTES_608_LEN);
       localRenameFileBytes608Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRenameFileBytes608Constraints(char[] value) {
   			return super.checkConstraints(value , 13 ,false, false);
   }
    /**
	 *	refreshRenameFileBytes608 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRenameFileBytes608() {	 
   		return (substring(getStringValue(),beginRenameFileBytes608,beginRenameFileBytes608 + RENAME_FILE_BYTES_608_LEN));
   	}




}
  
