package com.cloudframe.app.cfdate02.file.records.serialize;

/**
*  The class FlgusInEocRefBlMsgSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:35. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FlgusInEocRefBlMsgSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FlgusInEocRefBlMsgSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FLGUS_IN_EOC_REF_BL_MSG_LENGTH = 162;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFlgusBillMessageRec;
	
	/**
	* Constructor for FlgusInEocRefBlMsgSerialized
	**/
    public FlgusInEocRefBlMsgSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for FlgusInEocRefBlMsgSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FlgusInEocRefBlMsgSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this FlgusInEocRefBlMsgSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this FlgusInEocRefBlMsgSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in FlgusInEocRefBlMsgSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FLGUS_IN_EOC_REF_BL_MSG_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFlgusBillMessageRec = getStartOffset() + 1;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFlgusBillMessageRecCounter = -1;
     public boolean isFlgusBillMessageRecModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFlgusBillMessageRecCounter != sharedCounter;
         localFlgusBillMessageRecCounter = sharedCounter; return hasModified;
     }
	protected static final int FLGUS_BILL_MESSAGE_REC_LEN = 161;
	/**
	 * 	serialize this FlgusBillMessageRec
	 */
   protected void serializeFlgusBillMessageRec(char[] flgusBillMessageRec) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(flgusBillMessageRec,0,getStringValue(),beginFlgusBillMessageRec,FLGUS_BILL_MESSAGE_REC_LEN);
       localFlgusBillMessageRecCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFlgusBillMessageRecConstraints(char[] value) {
   			return super.checkConstraints(value , 161 ,false, false);
   }
    /**
	 *	refreshFlgusBillMessageRec is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFlgusBillMessageRec() {	 
   		return (substring(getStringValue(),beginFlgusBillMessageRec,beginFlgusBillMessageRec + FLGUS_BILL_MESSAGE_REC_LEN));
   	}




}
  
