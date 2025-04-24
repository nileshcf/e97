package com.cloudframe.app.gdgpgm2.file.records.serialize;

/**
*  The class FsRecord1Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:40. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FsRecord1Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FsRecord1Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FS_RECORD_1_LENGTH = 80;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFsRecord1String;
	
	/**
	* Constructor for FsRecord1Serialized
	**/
    public FsRecord1Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in FsRecord1Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FS_RECORD_1_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFsRecord1String = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFsRecord1StringCounter = -1;
     public boolean isFsRecord1StringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFsRecord1StringCounter != sharedCounter;
         localFsRecord1StringCounter = sharedCounter; return hasModified;
     }
	protected static final int FS_RECORD_1_STRING_LEN = 80;
	/**
	 * 	serialize this FsRecord1String
	 */
   protected void serializeFsRecord1String(char[] fsRecord1String) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fsRecord1String,0,getStringValue(),beginFsRecord1String,FS_RECORD_1_STRING_LEN);
       localFsRecord1StringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFsRecord1StringConstraints(char[] value) {
   			return super.checkConstraints(value , 80 ,false, false);
   }
    /**
	 *	refreshFsRecord1String is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFsRecord1String() {	 
   		return (substring(getStringValue(),beginFsRecord1String,beginFsRecord1String + FS_RECORD_1_STRING_LEN));
   	}




}
  
