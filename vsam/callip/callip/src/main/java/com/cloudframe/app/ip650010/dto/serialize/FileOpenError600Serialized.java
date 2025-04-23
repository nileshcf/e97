package com.cloudframe.app.ip650010.dto.serialize;

/**
*  The class FileOpenError600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:59. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FileOpenError600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FileOpenError600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FILE_OPEN_ERROR_600_LENGTH = 58;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBadStatusCode600;
	
	/**
	* Constructor for FileOpenError600Serialized
	**/
    public FileOpenError600Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in FileOpenError600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FILE_OPEN_ERROR_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
             beginBadStatusCode600 = getStartOffset() + 54;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localBadStatusCode600Counter = -1;
     public boolean isBadStatusCode600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBadStatusCode600Counter != sharedCounter;
         localBadStatusCode600Counter = sharedCounter; return hasModified;
     }
	protected static final int BAD_STATUS_CODE_600_LEN = 2;
	/**
	 * 	serialize this BadStatusCode600
	 */
   protected void serializeBadStatusCode600(char[] badStatusCode600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(badStatusCode600,0,getStringValue(),beginBadStatusCode600,BAD_STATUS_CODE_600_LEN);
       localBadStatusCode600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBadStatusCode600Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBadStatusCode600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBadStatusCode600() {	 
   		return (substring(getStringValue(),beginBadStatusCode600,beginBadStatusCode600 + BAD_STATUS_CODE_600_LEN));
   	}




}
  
