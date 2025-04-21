package com.cloudframe.app.ip650010.dto.serialize;

/**
*  The class FileReadError620Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FileReadError620Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FileReadError620Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FILE_READ_ERROR_620_LENGTH = 58;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBadStatusCode620;
	
	/**
	* Constructor for FileReadError620Serialized
	**/
    public FileReadError620Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in FileReadError620Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FILE_READ_ERROR_620_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
             beginBadStatusCode620 = getStartOffset() + 54;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localBadStatusCode620Counter = -1;
     public boolean isBadStatusCode620Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBadStatusCode620Counter != sharedCounter;
         localBadStatusCode620Counter = sharedCounter; return hasModified;
     }
	protected static final int BAD_STATUS_CODE_620_LEN = 2;
	/**
	 * 	serialize this BadStatusCode620
	 */
   protected void serializeBadStatusCode620(char[] badStatusCode620) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(badStatusCode620,0,getStringValue(),beginBadStatusCode620,BAD_STATUS_CODE_620_LEN);
       localBadStatusCode620Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBadStatusCode620Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBadStatusCode620 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBadStatusCode620() {	 
   		return (substring(getStringValue(),beginBadStatusCode620,beginBadStatusCode620 + BAD_STATUS_CODE_620_LEN));
   	}




}
  
