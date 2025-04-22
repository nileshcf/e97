package com.cloudframe.app.cfdate02.file.records.serialize;

/**
*  The class RldusInEocRefBlMsgSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RldusInEocRefBlMsgSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RldusInEocRefBlMsgSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RLDUS_IN_EOC_REF_BL_MSG_LENGTH = 162;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRldusBillMessageRec;
	
	/**
	* Constructor for RldusInEocRefBlMsgSerialized
	**/
    public RldusInEocRefBlMsgSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for RldusInEocRefBlMsgSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RldusInEocRefBlMsgSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this RldusInEocRefBlMsgSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this RldusInEocRefBlMsgSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in RldusInEocRefBlMsgSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RLDUS_IN_EOC_REF_BL_MSG_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRldusBillMessageRec = getStartOffset() + 1;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRldusBillMessageRecCounter = -1;
     public boolean isRldusBillMessageRecModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRldusBillMessageRecCounter != sharedCounter;
         localRldusBillMessageRecCounter = sharedCounter; return hasModified;
     }
	protected static final int RLDUS_BILL_MESSAGE_REC_LEN = 161;
	/**
	 * 	serialize this RldusBillMessageRec
	 */
   protected void serializeRldusBillMessageRec(char[] rldusBillMessageRec) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rldusBillMessageRec,0,getStringValue(),beginRldusBillMessageRec,RLDUS_BILL_MESSAGE_REC_LEN);
       localRldusBillMessageRecCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRldusBillMessageRecConstraints(char[] value) {
   			return super.checkConstraints(value , 161 ,false, false);
   }
    /**
	 *	refreshRldusBillMessageRec is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRldusBillMessageRec() {	 
   		return (substring(getStringValue(),beginRldusBillMessageRec,beginRldusBillMessageRec + RLDUS_BILL_MESSAGE_REC_LEN));
   	}




}
  
