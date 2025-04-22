package com.cloudframe.app.oldnew.file.records.serialize;

/**
*  The class FsOutrecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:17. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FsOutrecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FsOutrecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FS_OUTREC_LENGTH = 80;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFsOutrecString;
	
	/**
	* Constructor for FsOutrecSerialized
	**/
    public FsOutrecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in FsOutrecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FS_OUTREC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFsOutrecString = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFsOutrecStringCounter = -1;
     public boolean isFsOutrecStringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFsOutrecStringCounter != sharedCounter;
         localFsOutrecStringCounter = sharedCounter; return hasModified;
     }
	protected static final int FS_OUTREC_STRING_LEN = 80;
	/**
	 * 	serialize this FsOutrecString
	 */
   protected void serializeFsOutrecString(char[] fsOutrecString) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fsOutrecString,0,getStringValue(),beginFsOutrecString,FS_OUTREC_STRING_LEN);
       localFsOutrecStringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFsOutrecStringConstraints(char[] value) {
   			return super.checkConstraints(value , 80 ,false, false);
   }
    /**
	 *	refreshFsOutrecString is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFsOutrecString() {	 
   		return (substring(getStringValue(),beginFsOutrecString,beginFsOutrecString + FS_OUTREC_STRING_LEN));
   	}




}
  
