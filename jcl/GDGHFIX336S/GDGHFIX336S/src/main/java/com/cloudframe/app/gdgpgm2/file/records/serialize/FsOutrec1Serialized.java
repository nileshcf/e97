package com.cloudframe.app.gdgpgm2.file.records.serialize;

/**
*  The class FsOutrec1Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:10. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FsOutrec1Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FsOutrec1Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FS_OUTREC_1_LENGTH = 80;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFsOutrec1String;
	
	/**
	* Constructor for FsOutrec1Serialized
	**/
    public FsOutrec1Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in FsOutrec1Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FS_OUTREC_1_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFsOutrec1String = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFsOutrec1StringCounter = -1;
     public boolean isFsOutrec1StringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFsOutrec1StringCounter != sharedCounter;
         localFsOutrec1StringCounter = sharedCounter; return hasModified;
     }
	protected static final int FS_OUTREC_1_STRING_LEN = 80;
	/**
	 * 	serialize this FsOutrec1String
	 */
   protected void serializeFsOutrec1String(char[] fsOutrec1String) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fsOutrec1String,0,getStringValue(),beginFsOutrec1String,FS_OUTREC_1_STRING_LEN);
       localFsOutrec1StringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFsOutrec1StringConstraints(char[] value) {
   			return super.checkConstraints(value , 80 ,false, false);
   }
    /**
	 *	refreshFsOutrec1String is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFsOutrec1String() {	 
   		return (substring(getStringValue(),beginFsOutrec1String,beginFsOutrec1String + FS_OUTREC_1_STRING_LEN));
   	}




}
  
