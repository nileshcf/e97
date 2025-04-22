package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class MsgPos216XSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:20. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MsgPos216XSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MsgPos216XSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MSG_POS_216_X_LENGTH = 15;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMsgPos25;
	
	/**
	* Constructor for MsgPos216XSerialized
	**/
    public MsgPos216XSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MsgPos216XSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsgPos216XSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MsgPos216XSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1); // serialize this field at offset 1 by default 
    }
    
	/**
	* sets parent for this MsgPos216XSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1 by default
    }    
	/**
	* initializes the field in MsgPos216XSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MSG_POS_216_X_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMsgPos25 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMsgPos25Counter = -1;
     public boolean isMsgPos25Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsgPos25Counter != sharedCounter;
         localMsgPos25Counter = sharedCounter; return hasModified;
     }
	protected static final int MSG_POS_25_LEN = 4;
	/**
	 * 	serialize this MsgPos25
	 */
   protected void serializeMsgPos25(char[] msgPos25) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msgPos25,0,getStringValue(),beginMsgPos25,MSG_POS_25_LEN);
       localMsgPos25Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsgPos25Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshMsgPos25 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsgPos25() {	 
   		return (substring(getStringValue(),beginMsgPos25,beginMsgPos25 + MSG_POS_25_LEN));
   	}




}
  
