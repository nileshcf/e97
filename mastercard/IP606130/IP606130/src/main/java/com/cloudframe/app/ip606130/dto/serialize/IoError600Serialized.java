package com.cloudframe.app.ip606130.dto.serialize;

/**
*  The class IoError600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class IoError600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(IoError600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IO_ERROR_600_LENGTH = 68;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFileName600;
            protected  int beginBadIoStatusCode600;
	
	/**
	* Constructor for IoError600Serialized
	**/
    public IoError600Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in IoError600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IO_ERROR_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginFileName600 = getStartOffset() + 25;	// set offset for serialization
  
  
             beginBadIoStatusCode600 = getStartOffset() + 62;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localFileName600Counter = -1;
     public boolean isFileName600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFileName600Counter != sharedCounter;
         localFileName600Counter = sharedCounter; return hasModified;
     }
	protected static final int FILE_NAME_600_LEN = 21;
	/**
	 * 	serialize this FileName600
	 */
   protected void serializeFileName600(char[] fileName600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fileName600,0,getStringValue(),beginFileName600,FILE_NAME_600_LEN);
       localFileName600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFileName600Constraints(char[] value) {
   			return super.checkConstraints(value , 21 ,false, false);
   }
    /**
	 *	refreshFileName600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFileName600() {	 
   		return (substring(getStringValue(),beginFileName600,beginFileName600 + FILE_NAME_600_LEN));
   	}
     int localBadIoStatusCode600Counter = -1;
     public boolean isBadIoStatusCode600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBadIoStatusCode600Counter != sharedCounter;
         localBadIoStatusCode600Counter = sharedCounter; return hasModified;
     }
	protected static final int BAD_IO_STATUS_CODE_600_LEN = 4;
	/**
	 * 	serialize this BadIoStatusCode600
	 */
   protected void serializeBadIoStatusCode600(char[] badIoStatusCode600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(badIoStatusCode600,0,getStringValue(),beginBadIoStatusCode600,BAD_IO_STATUS_CODE_600_LEN);
       localBadIoStatusCode600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBadIoStatusCode600Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshBadIoStatusCode600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBadIoStatusCode600() {	 
   		return (substring(getStringValue(),beginBadIoStatusCode600,beginBadIoStatusCode600 + BAD_IO_STATUS_CODE_600_LEN));
   	}




}
  
