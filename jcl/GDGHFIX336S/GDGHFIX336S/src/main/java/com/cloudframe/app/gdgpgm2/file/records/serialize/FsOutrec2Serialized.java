package com.cloudframe.app.gdgpgm2.file.records.serialize;

/**
*  The class FsOutrec2Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:05. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FsOutrec2Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FsOutrec2Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FS_OUTREC_2_LENGTH = 80;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFsOutrec2String;
	
	/**
	* Constructor for FsOutrec2Serialized
	**/
    public FsOutrec2Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in FsOutrec2Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FS_OUTREC_2_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFsOutrec2String = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFsOutrec2StringCounter = -1;
     public boolean isFsOutrec2StringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFsOutrec2StringCounter != sharedCounter;
         localFsOutrec2StringCounter = sharedCounter; return hasModified;
     }
	protected static final int FS_OUTREC_2_STRING_LEN = 80;
	/**
	 * 	serialize this FsOutrec2String
	 */
   protected void serializeFsOutrec2String(char[] fsOutrec2String) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fsOutrec2String,0,getStringValue(),beginFsOutrec2String,FS_OUTREC_2_STRING_LEN);
       localFsOutrec2StringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFsOutrec2StringConstraints(char[] value) {
   			return super.checkConstraints(value , 80 ,false, false);
   }
    /**
	 *	refreshFsOutrec2String is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFsOutrec2String() {	 
   		return (substring(getStringValue(),beginFsOutrec2String,beginFsOutrec2String + FS_OUTREC_2_STRING_LEN));
   	}




}
  
