package com.cloudframe.app.sf320010.file.records.serialize;

/**
*  The class FdTempWorkFileRcdSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:20. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FdTempWorkFileRcdSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FdTempWorkFileRcdSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FD_TEMP_WORK_FILE_RCD_LENGTH = 397;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFdTempWorkFileRcdString;
	
	/**
	* Constructor for FdTempWorkFileRcdSerialized
	**/
    public FdTempWorkFileRcdSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in FdTempWorkFileRcdSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FD_TEMP_WORK_FILE_RCD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFdTempWorkFileRcdString = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFdTempWorkFileRcdStringCounter = -1;
     public boolean isFdTempWorkFileRcdStringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFdTempWorkFileRcdStringCounter != sharedCounter;
         localFdTempWorkFileRcdStringCounter = sharedCounter; return hasModified;
     }
	protected static final int FD_TEMP_WORK_FILE_RCD_STRING_LEN = 397;
	/**
	 * 	serialize this FdTempWorkFileRcdString
	 */
   protected void serializeFdTempWorkFileRcdString(char[] fdTempWorkFileRcdString) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fdTempWorkFileRcdString,0,getStringValue(),beginFdTempWorkFileRcdString,FD_TEMP_WORK_FILE_RCD_STRING_LEN);
       localFdTempWorkFileRcdStringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFdTempWorkFileRcdStringConstraints(char[] value) {
   			return super.checkConstraints(value , 397 ,false, false);
   }
    /**
	 *	refreshFdTempWorkFileRcdString is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFdTempWorkFileRcdString() {	 
   		return (substring(getStringValue(),beginFdTempWorkFileRcdString,beginFdTempWorkFileRcdString + FD_TEMP_WORK_FILE_RCD_STRING_LEN));
   	}




}
  
