package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class MsgPos1722Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MsgPos1722Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MsgPos1722Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MSG_POS_1722_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMsgPos17;
	
	/**
	* Constructor for MsgPos1722Serialized
	**/
    public MsgPos1722Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MsgPos1722Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsgPos1722Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MsgPos1722Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,16); // serialize this field at offset 16 by default 
    }
    
	/**
	* sets parent for this MsgPos1722Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 16 by default
    }    
	/**
	* initializes the field in MsgPos1722Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MSG_POS_1722_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMsgPos17 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMsgPos17Counter = -1;
     public boolean isMsgPos17Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsgPos17Counter != sharedCounter;
         localMsgPos17Counter = sharedCounter; return hasModified;
     }
	protected static final int MSG_POS_17_LEN = 1;
	/**
	 * 	serialize this MsgPos17
	 */
   protected void serializeMsgPos17(char[] msgPos17) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msgPos17,0,getStringValue(),beginMsgPos17,MSG_POS_17_LEN);
       localMsgPos17Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsgPos17Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMsgPos17 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsgPos17() {	 
   		return (substring(getStringValue(),beginMsgPos17,beginMsgPos17 + MSG_POS_17_LEN));
   	}




}
  
