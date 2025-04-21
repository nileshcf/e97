package com.cloudframe.app.ip662010.dto.serialize;

/**
*  The class MessageLengthMsg600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:55. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MessageLengthMsg600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MessageLengthMsg600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MESSAGE_LENGTH_MSG_600_LENGTH = 37;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMessageLengthErrCode600;
            protected  int beginMessageLength600;
	
	/**
	* Constructor for MessageLengthMsg600Serialized
	**/
    public MessageLengthMsg600Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in MessageLengthMsg600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MESSAGE_LENGTH_MSG_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginMessageLengthErrCode600 = getStartOffset() + 9;	// set offset for serialization
  
  
             beginMessageLength600 = getStartOffset() + 31;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMessageLengthErrCode600Counter = -1;
     public boolean isMessageLengthErrCode600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMessageLengthErrCode600Counter != sharedCounter;
         localMessageLengthErrCode600Counter = sharedCounter; return hasModified;
     }
	protected static final int MESSAGE_LENGTH_ERR_CODE_600_LEN = 5;
	/**
	 * 	serialize this MessageLengthErrCode600
	 */
   protected void serializeMessageLengthErrCode600(char[] messageLengthErrCode600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(messageLengthErrCode600,0,getStringValue(),beginMessageLengthErrCode600,MESSAGE_LENGTH_ERR_CODE_600_LEN);
       localMessageLengthErrCode600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMessageLengthErrCode600Constraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshMessageLengthErrCode600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMessageLengthErrCode600() {	 
   		return (substring(getStringValue(),beginMessageLengthErrCode600,beginMessageLengthErrCode600 + MESSAGE_LENGTH_ERR_CODE_600_LEN));
   	}
     int localMessageLength600Counter = -1;
     public boolean isMessageLength600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMessageLength600Counter != sharedCounter;
         localMessageLength600Counter = sharedCounter; return hasModified;
     }
	protected static final int MESSAGE_LENGTH_600_LEN = 6;
	/**
	 * 	serialize this MessageLength600
	 */
   protected void serializeMessageLength600(char[] messageLength600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(messageLength600,0,getStringValue(),beginMessageLength600,MESSAGE_LENGTH_600_LEN);
       localMessageLength600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMessageLength600Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshMessageLength600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMessageLength600() {	 
   		return (substring(getStringValue(),beginMessageLength600,beginMessageLength600 + MESSAGE_LENGTH_600_LEN));
   	}




}
  
