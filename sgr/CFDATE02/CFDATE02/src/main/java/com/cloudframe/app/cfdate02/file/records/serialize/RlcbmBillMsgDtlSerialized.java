package com.cloudframe.app.cfdate02.file.records.serialize;

/**
*  The class RlcbmBillMsgDtlSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RlcbmBillMsgDtlSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RlcbmBillMsgDtlSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RLCBM_BILL_MSG_DTL_LENGTH = 162;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRlcbmBillMessageRec;
	
	/**
	* Constructor for RlcbmBillMsgDtlSerialized
	**/
    public RlcbmBillMsgDtlSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for RlcbmBillMsgDtlSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RlcbmBillMsgDtlSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this RlcbmBillMsgDtlSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this RlcbmBillMsgDtlSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in RlcbmBillMsgDtlSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RLCBM_BILL_MSG_DTL_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRlcbmBillMessageRec = getStartOffset() + 1;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRlcbmBillMessageRecCounter = -1;
     public boolean isRlcbmBillMessageRecModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlcbmBillMessageRecCounter != sharedCounter;
         localRlcbmBillMessageRecCounter = sharedCounter; return hasModified;
     }
	protected static final int RLCBM_BILL_MESSAGE_REC_LEN = 161;
	/**
	 * 	serialize this RlcbmBillMessageRec
	 */
   protected void serializeRlcbmBillMessageRec(char[] rlcbmBillMessageRec) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlcbmBillMessageRec,0,getStringValue(),beginRlcbmBillMessageRec,RLCBM_BILL_MESSAGE_REC_LEN);
       localRlcbmBillMessageRecCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlcbmBillMessageRecConstraints(char[] value) {
   			return super.checkConstraints(value , 161 ,false, false);
   }
    /**
	 *	refreshRlcbmBillMessageRec is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlcbmBillMessageRec() {	 
   		return (substring(getStringValue(),beginRlcbmBillMessageRec,beginRlcbmBillMessageRec + RLCBM_BILL_MESSAGE_REC_LEN));
   	}




}
  
