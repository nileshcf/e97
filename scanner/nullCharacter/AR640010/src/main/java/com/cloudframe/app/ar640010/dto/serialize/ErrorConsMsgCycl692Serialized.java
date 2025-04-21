package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class ErrorConsMsgCycl692Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ErrorConsMsgCycl692Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ErrorConsMsgCycl692Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ERROR_CONS_MSG_CYCL_692_LENGTH = 11;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginErrCycl692;
	
	/**
	* Constructor for ErrorConsMsgCycl692Serialized
	**/
    public ErrorConsMsgCycl692Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ErrorConsMsgCycl692Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ERROR_CONS_MSG_CYCL_692_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginErrCycl692 = getStartOffset() + 8;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localErrCycl692Counter = -1;
     public boolean isErrCycl692Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrCycl692Counter != sharedCounter;
         localErrCycl692Counter = sharedCounter; return hasModified;
     }
	protected static final int ERR_CYCL_692_LEN = 3;
	/**
	 * 	serialize this ErrCycl692
	 */
   protected void serializeErrCycl692(char[] errCycl692) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(errCycl692,0,getStringValue(),beginErrCycl692,ERR_CYCL_692_LEN);
       localErrCycl692Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkErrCycl692Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshErrCycl692 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshErrCycl692() {	 
   		return (substring(getStringValue(),beginErrCycl692,beginErrCycl692 + ERR_CYCL_692_LEN));
   	}




}
  
