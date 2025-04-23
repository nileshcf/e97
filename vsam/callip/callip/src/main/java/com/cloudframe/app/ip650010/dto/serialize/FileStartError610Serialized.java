package com.cloudframe.app.ip650010.dto.serialize;

/**
*  The class FileStartError610Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:59. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FileStartError610Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FileStartError610Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FILE_START_ERROR_610_LENGTH = 62;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBadStatusCode610;
	
	/**
	* Constructor for FileStartError610Serialized
	**/
    public FileStartError610Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in FileStartError610Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FILE_START_ERROR_610_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
             beginBadStatusCode610 = getStartOffset() + 58;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localBadStatusCode610Counter = -1;
     public boolean isBadStatusCode610Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBadStatusCode610Counter != sharedCounter;
         localBadStatusCode610Counter = sharedCounter; return hasModified;
     }
	protected static final int BAD_STATUS_CODE_610_LEN = 2;
	/**
	 * 	serialize this BadStatusCode610
	 */
   protected void serializeBadStatusCode610(char[] badStatusCode610) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(badStatusCode610,0,getStringValue(),beginBadStatusCode610,BAD_STATUS_CODE_610_LEN);
       localBadStatusCode610Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBadStatusCode610Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBadStatusCode610 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBadStatusCode610() {	 
   		return (substring(getStringValue(),beginBadStatusCode610,beginBadStatusCode610 + BAD_STATUS_CODE_610_LEN));
   	}




}
  
