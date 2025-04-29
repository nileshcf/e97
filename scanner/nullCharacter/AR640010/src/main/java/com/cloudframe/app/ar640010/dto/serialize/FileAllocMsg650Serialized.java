package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class FileAllocMsg650Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FileAllocMsg650Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FileAllocMsg650Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FILE_ALLOC_MSG_650_LENGTH = 51;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFileAllocType650;
	
	/**
	* Constructor for FileAllocMsg650Serialized
	**/
    public FileAllocMsg650Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in FileAllocMsg650Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FILE_ALLOC_MSG_650_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginFileAllocType650 = getStartOffset() + 41;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localFileAllocType650Counter = -1;
     public boolean isFileAllocType650Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFileAllocType650Counter != sharedCounter;
         localFileAllocType650Counter = sharedCounter; return hasModified;
     }
	protected static final int FILE_ALLOC_TYPE_650_LEN = 3;
	/**
	 * 	serialize this FileAllocType650
	 */
   protected void serializeFileAllocType650(char[] fileAllocType650) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fileAllocType650,0,getStringValue(),beginFileAllocType650,FILE_ALLOC_TYPE_650_LEN);
       localFileAllocType650Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFileAllocType650Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshFileAllocType650 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFileAllocType650() {	 
   		return (substring(getStringValue(),beginFileAllocType650,beginFileAllocType650 + FILE_ALLOC_TYPE_650_LEN));
   	}




}
  
