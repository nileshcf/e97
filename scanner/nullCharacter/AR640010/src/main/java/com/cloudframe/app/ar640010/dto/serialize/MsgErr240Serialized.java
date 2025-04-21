package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class MsgErr240Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MsgErr240Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MsgErr240Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MSG_ERR_240_LENGTH = 80;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMsgErrDesc240;
	
	/**
	* Constructor for MsgErr240Serialized
	**/
    public MsgErr240Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MsgErr240Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsgErr240Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MsgErr240Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,220); // serialize this field at offset 220 by default 
    }
    
	/**
	* sets parent for this MsgErr240Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 220 by default
    }    
	/**
	* initializes the field in MsgErr240Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MSG_ERR_240_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMsgErrDesc240 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMsgErrDesc240Counter = -1;
     public boolean isMsgErrDesc240Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsgErrDesc240Counter != sharedCounter;
         localMsgErrDesc240Counter = sharedCounter; return hasModified;
     }
	protected static final int MSG_ERR_DESC_240_LEN = 80;
	/**
	 * 	serialize this MsgErrDesc240
	 */
   protected void serializeMsgErrDesc240(char[] msgErrDesc240) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msgErrDesc240,0,getStringValue(),beginMsgErrDesc240,MSG_ERR_DESC_240_LEN);
       localMsgErrDesc240Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsgErrDesc240Constraints(char[] value) {
   			return super.checkConstraints(value , 80 ,false, false);
   }
    /**
	 *	refreshMsgErrDesc240 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsgErrDesc240() {	 
   		return (substring(getStringValue(),beginMsgErrDesc240,beginMsgErrDesc240 + MSG_ERR_DESC_240_LEN));
   	}




}
  
