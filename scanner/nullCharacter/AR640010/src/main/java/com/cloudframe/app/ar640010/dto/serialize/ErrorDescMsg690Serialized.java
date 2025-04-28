package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class ErrorDescMsg690Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:11. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ErrorDescMsg690Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ErrorDescMsg690Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ERROR_DESC_MSG_690_LENGTH = 20;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginErrorResponse690;
	
	/**
	* Constructor for ErrorDescMsg690Serialized
	**/
    public ErrorDescMsg690Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ErrorDescMsg690Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ERROR_DESC_MSG_690_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginErrorResponse690 = getStartOffset() + 13;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localErrorResponse690Counter = -1;
     public boolean isErrorResponse690Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrorResponse690Counter != sharedCounter;
         localErrorResponse690Counter = sharedCounter; return hasModified;
     }
	protected static final int ERROR_RESPONSE_690_LEN = 4;
	/**
	 * 	serialize this ErrorResponse690
	 */
   protected void serializeErrorResponse690(char[] errorResponse690) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(errorResponse690,0,getStringValue(),beginErrorResponse690,ERROR_RESPONSE_690_LEN);
       localErrorResponse690Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkErrorResponse690Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshErrorResponse690 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshErrorResponse690() {	 
   		return (substring(getStringValue(),beginErrorResponse690,beginErrorResponse690 + ERROR_RESPONSE_690_LEN));
   	}




}
  
