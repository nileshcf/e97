package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class Sf503OpOperatorTranLogSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:45. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sf503OpOperatorTranLogSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sf503OpOperatorTranLogSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SF_503_OP_OPERATOR_TRAN_LOG_LENGTH = 32737;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSf503OpRecordType;
            protected  int beginSf503OpMsgHdr;
            protected  int beginSf503OpOperatorMessage;
	
	/**
	* Constructor for Sf503OpOperatorTranLogSerialized
	**/
    public Sf503OpOperatorTranLogSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Sf503OpOperatorTranLogSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf503OpOperatorTranLogSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Sf503OpOperatorTranLogSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,15); // serialize this field at offset 15 by default 
    }
    
	/**
	* sets parent for this Sf503OpOperatorTranLogSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 15 by default
    }    
	/**
	* initializes the field in Sf503OpOperatorTranLogSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SF_503_OP_OPERATOR_TRAN_LOG_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSf503OpRecordType = getStartOffset() + 1;	// set offset for serialization
  
             beginSf503OpMsgHdr = getStartOffset() + 17;	// set offset for serialization
  
             beginSf503OpOperatorMessage = getStartOffset() + 25;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSf503OpRecordTypeCounter = -1;
     public boolean isSf503OpRecordTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf503OpRecordTypeCounter != sharedCounter;
         localSf503OpRecordTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_503_OP_RECORD_TYPE_LEN = 1;
	/**
	 * 	serialize this Sf503OpRecordType
	 */
   protected void serializeSf503OpRecordType(char[] sf503OpRecordType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf503OpRecordType,0,getStringValue(),beginSf503OpRecordType,SF_503_OP_RECORD_TYPE_LEN);
       localSf503OpRecordTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf503OpRecordTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSf503OpRecordType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf503OpRecordType() {	 
   		return (substring(getStringValue(),beginSf503OpRecordType,beginSf503OpRecordType + SF_503_OP_RECORD_TYPE_LEN));
   	}
     int localSf503OpMsgHdrCounter = -1;
     public boolean isSf503OpMsgHdrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf503OpMsgHdrCounter != sharedCounter;
         localSf503OpMsgHdrCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_503_OP_MSG_HDR_LEN = 8;
	/**
	 * 	serialize this Sf503OpMsgHdr
	 */
   protected void serializeSf503OpMsgHdr(char[] sf503OpMsgHdr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf503OpMsgHdr,0,getStringValue(),beginSf503OpMsgHdr,SF_503_OP_MSG_HDR_LEN);
       localSf503OpMsgHdrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf503OpMsgHdrConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshSf503OpMsgHdr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf503OpMsgHdr() {	 
   		return (substring(getStringValue(),beginSf503OpMsgHdr,beginSf503OpMsgHdr + SF_503_OP_MSG_HDR_LEN));
   	}
     int localSf503OpOperatorMessageCounter = -1;
     public boolean isSf503OpOperatorMessageModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf503OpOperatorMessageCounter != sharedCounter;
         localSf503OpOperatorMessageCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_503_OP_OPERATOR_MESSAGE_LEN = 85;
	/**
	 * 	serialize this Sf503OpOperatorMessage
	 */
   protected void serializeSf503OpOperatorMessage(char[] sf503OpOperatorMessage) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf503OpOperatorMessage,0,getStringValue(),beginSf503OpOperatorMessage,SF_503_OP_OPERATOR_MESSAGE_LEN);
       localSf503OpOperatorMessageCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf503OpOperatorMessageConstraints(char[] value) {
   			return super.checkConstraints(value , 85 ,false, false);
   }
    /**
	 *	refreshSf503OpOperatorMessage is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf503OpOperatorMessage() {	 
   		return (substring(getStringValue(),beginSf503OpOperatorMessage,beginSf503OpOperatorMessage + SF_503_OP_OPERATOR_MESSAGE_LEN));
   	}




}
  
