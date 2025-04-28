package com.cloudframe.app.oldnew.file.records.serialize;

/**
*  The class FsRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:02. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FsRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FsRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FS_RECORD_LENGTH = 80;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFsRecordString;
	
	/**
	* Constructor for FsRecordSerialized
	**/
    public FsRecordSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in FsRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FS_RECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFsRecordString = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFsRecordStringCounter = -1;
     public boolean isFsRecordStringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFsRecordStringCounter != sharedCounter;
         localFsRecordStringCounter = sharedCounter; return hasModified;
     }
	protected static final int FS_RECORD_STRING_LEN = 80;
	/**
	 * 	serialize this FsRecordString
	 */
   protected void serializeFsRecordString(char[] fsRecordString) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fsRecordString,0,getStringValue(),beginFsRecordString,FS_RECORD_STRING_LEN);
       localFsRecordStringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFsRecordStringConstraints(char[] value) {
   			return super.checkConstraints(value , 80 ,false, false);
   }
    /**
	 *	refreshFsRecordString is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFsRecordString() {	 
   		return (substring(getStringValue(),beginFsRecordString,beginFsRecordString + FS_RECORD_STRING_LEN));
   	}




}
  
