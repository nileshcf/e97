package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class ErrorConsMsgEndpt692Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:33. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ErrorConsMsgEndpt692Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ErrorConsMsgEndpt692Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ERROR_CONS_MSG_ENDPT_692_LENGTH = 17;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginErrEndpoint692;
	
	/**
	* Constructor for ErrorConsMsgEndpt692Serialized
	**/
    public ErrorConsMsgEndpt692Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ErrorConsMsgEndpt692Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ERROR_CONS_MSG_ENDPT_692_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginErrEndpoint692 = getStartOffset() + 10;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localErrEndpoint692Counter = -1;
     public boolean isErrEndpoint692Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrEndpoint692Counter != sharedCounter;
         localErrEndpoint692Counter = sharedCounter; return hasModified;
     }
	protected static final int ERR_ENDPOINT_692_LEN = 7;
	/**
	 * 	serialize this ErrEndpoint692
	 */
   protected void serializeErrEndpoint692(char[] errEndpoint692) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(errEndpoint692,0,getStringValue(),beginErrEndpoint692,ERR_ENDPOINT_692_LEN);
       localErrEndpoint692Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkErrEndpoint692Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshErrEndpoint692 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshErrEndpoint692() {	 
   		return (substring(getStringValue(),beginErrEndpoint692,beginErrEndpoint692 + ERR_ENDPOINT_692_LEN));
   	}




}
  
