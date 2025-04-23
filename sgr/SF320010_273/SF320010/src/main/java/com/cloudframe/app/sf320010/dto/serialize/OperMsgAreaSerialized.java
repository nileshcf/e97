package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class OperMsgAreaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:12. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class OperMsgAreaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(OperMsgAreaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int OPER_MSG_AREA_LENGTH = 74;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMsgPos216;
	
	/**
	* Constructor for OperMsgAreaSerialized
	**/
    public OperMsgAreaSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in OperMsgAreaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(OPER_MSG_AREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMsgPos216 = getStartOffset() + 1;	// set offset for serialization
  
  
  
	   /*  end of offset */
	}
     int localMsgPos216Counter = -1;
     public boolean isMsgPos216Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsgPos216Counter != sharedCounter;
         localMsgPos216Counter = sharedCounter; return hasModified;
     }
	protected static final int MSG_POS_216_LEN = 15;
	/**
	 * 	serialize this MsgPos216
	 */
   protected void serializeMsgPos216(char[] msgPos216) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msgPos216,0,getStringValue(),beginMsgPos216,MSG_POS_216_LEN);
       localMsgPos216Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsgPos216Constraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
    /**
	 *	refreshMsgPos216 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsgPos216() {	 
   		return (substring(getStringValue(),beginMsgPos216,beginMsgPos216 + MSG_POS_216_LEN));
   	}




}
  
