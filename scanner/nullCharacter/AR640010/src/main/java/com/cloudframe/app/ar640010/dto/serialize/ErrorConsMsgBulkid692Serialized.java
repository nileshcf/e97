package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class ErrorConsMsgBulkid692Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:49. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ErrorConsMsgBulkid692Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ErrorConsMsgBulkid692Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ERROR_CONS_MSG_BULKID_692_LENGTH = 13;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginErrBulkid692;
	
	/**
	* Constructor for ErrorConsMsgBulkid692Serialized
	**/
    public ErrorConsMsgBulkid692Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ErrorConsMsgBulkid692Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ERROR_CONS_MSG_BULKID_692_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginErrBulkid692 = getStartOffset() + 9;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localErrBulkid692Counter = -1;
     public boolean isErrBulkid692Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrBulkid692Counter != sharedCounter;
         localErrBulkid692Counter = sharedCounter; return hasModified;
     }
	protected static final int ERR_BULKID_692_LEN = 4;
	/**
	 * 	serialize this ErrBulkid692
	 */
   protected void serializeErrBulkid692(char[] errBulkid692) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(errBulkid692,0,getStringValue(),beginErrBulkid692,ERR_BULKID_692_LEN);
       localErrBulkid692Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkErrBulkid692Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshErrBulkid692 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshErrBulkid692() {	 
   		return (substring(getStringValue(),beginErrBulkid692,beginErrBulkid692 + ERR_BULKID_692_LEN));
   	}




}
  
