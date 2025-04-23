package com.cloudframe.app.ip650010.dto.serialize;

/**
*  The class FileCloseError630Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:21. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FileCloseError630Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FileCloseError630Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FILE_CLOSE_ERROR_630_LENGTH = 58;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBadStatusCode630;
	
	/**
	* Constructor for FileCloseError630Serialized
	**/
    public FileCloseError630Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in FileCloseError630Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FILE_CLOSE_ERROR_630_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
             beginBadStatusCode630 = getStartOffset() + 54;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localBadStatusCode630Counter = -1;
     public boolean isBadStatusCode630Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBadStatusCode630Counter != sharedCounter;
         localBadStatusCode630Counter = sharedCounter; return hasModified;
     }
	protected static final int BAD_STATUS_CODE_630_LEN = 2;
	/**
	 * 	serialize this BadStatusCode630
	 */
   protected void serializeBadStatusCode630(char[] badStatusCode630) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(badStatusCode630,0,getStringValue(),beginBadStatusCode630,BAD_STATUS_CODE_630_LEN);
       localBadStatusCode630Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBadStatusCode630Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBadStatusCode630 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBadStatusCode630() {	 
   		return (substring(getStringValue(),beginBadStatusCode630,beginBadStatusCode630 + BAD_STATUS_CODE_630_LEN));
   	}




}
  
