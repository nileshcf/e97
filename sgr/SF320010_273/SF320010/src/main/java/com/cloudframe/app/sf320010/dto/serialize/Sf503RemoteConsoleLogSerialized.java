package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class Sf503RemoteConsoleLogSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:37. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sf503RemoteConsoleLogSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sf503RemoteConsoleLogSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SF_503_REMOTE_CONSOLE_LOG_LENGTH = 32737;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSf503RcRecordType;
            protected  int beginSf503RcLocalMipId;
            protected  int beginSf503RcRemoteMipId;
            protected  int beginSf503RcOperatorId;
            protected  int beginSf503RcMessageArea;
	
	/**
	* Constructor for Sf503RemoteConsoleLogSerialized
	**/
    public Sf503RemoteConsoleLogSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Sf503RemoteConsoleLogSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf503RemoteConsoleLogSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Sf503RemoteConsoleLogSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,15); // serialize this field at offset 15 by default 
    }
    
	/**
	* sets parent for this Sf503RemoteConsoleLogSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 15 by default
    }    
	/**
	* initializes the field in Sf503RemoteConsoleLogSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SF_503_REMOTE_CONSOLE_LOG_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSf503RcRecordType = getStartOffset() + 1;	// set offset for serialization
  
             beginSf503RcLocalMipId = getStartOffset() + 2;	// set offset for serialization
  
             beginSf503RcRemoteMipId = getStartOffset() + 5;	// set offset for serialization
  
             beginSf503RcOperatorId = getStartOffset() + 8;	// set offset for serialization
  
  
  
             beginSf503RcMessageArea = getStartOffset() + 27;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSf503RcRecordTypeCounter = -1;
     public boolean isSf503RcRecordTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf503RcRecordTypeCounter != sharedCounter;
         localSf503RcRecordTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_503_RC_RECORD_TYPE_LEN = 1;
	/**
	 * 	serialize this Sf503RcRecordType
	 */
   protected void serializeSf503RcRecordType(char[] sf503RcRecordType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf503RcRecordType,0,getStringValue(),beginSf503RcRecordType,SF_503_RC_RECORD_TYPE_LEN);
       localSf503RcRecordTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf503RcRecordTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSf503RcRecordType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf503RcRecordType() {	 
   		return (substring(getStringValue(),beginSf503RcRecordType,beginSf503RcRecordType + SF_503_RC_RECORD_TYPE_LEN));
   	}
     int localSf503RcLocalMipIdCounter = -1;
     public boolean isSf503RcLocalMipIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf503RcLocalMipIdCounter != sharedCounter;
         localSf503RcLocalMipIdCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_503_RC_LOCAL_MIP_ID_LEN = 3;
	/**
	 * 	serialize this Sf503RcLocalMipId
	 */
   protected void serializeSf503RcLocalMipId(char[] sf503RcLocalMipId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf503RcLocalMipId,0,getStringValue(),beginSf503RcLocalMipId,SF_503_RC_LOCAL_MIP_ID_LEN);
       localSf503RcLocalMipIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf503RcLocalMipIdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshSf503RcLocalMipId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf503RcLocalMipId() {	 
   		return (substring(getStringValue(),beginSf503RcLocalMipId,beginSf503RcLocalMipId + SF_503_RC_LOCAL_MIP_ID_LEN));
   	}
     int localSf503RcRemoteMipIdCounter = -1;
     public boolean isSf503RcRemoteMipIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf503RcRemoteMipIdCounter != sharedCounter;
         localSf503RcRemoteMipIdCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_503_RC_REMOTE_MIP_ID_LEN = 3;
	/**
	 * 	serialize this Sf503RcRemoteMipId
	 */
   protected void serializeSf503RcRemoteMipId(char[] sf503RcRemoteMipId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf503RcRemoteMipId,0,getStringValue(),beginSf503RcRemoteMipId,SF_503_RC_REMOTE_MIP_ID_LEN);
       localSf503RcRemoteMipIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf503RcRemoteMipIdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshSf503RcRemoteMipId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf503RcRemoteMipId() {	 
   		return (substring(getStringValue(),beginSf503RcRemoteMipId,beginSf503RcRemoteMipId + SF_503_RC_REMOTE_MIP_ID_LEN));
   	}
     int localSf503RcOperatorIdCounter = -1;
     public boolean isSf503RcOperatorIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf503RcOperatorIdCounter != sharedCounter;
         localSf503RcOperatorIdCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_503_RC_OPERATOR_ID_LEN = 7;
	/**
	 * 	serialize this Sf503RcOperatorId
	 */
   protected void serializeSf503RcOperatorId(char[] sf503RcOperatorId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf503RcOperatorId,0,getStringValue(),beginSf503RcOperatorId,SF_503_RC_OPERATOR_ID_LEN);
       localSf503RcOperatorIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf503RcOperatorIdConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshSf503RcOperatorId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf503RcOperatorId() {	 
   		return (substring(getStringValue(),beginSf503RcOperatorId,beginSf503RcOperatorId + SF_503_RC_OPERATOR_ID_LEN));
   	}
     int localSf503RcMessageAreaCounter = -1;
     public boolean isSf503RcMessageAreaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf503RcMessageAreaCounter != sharedCounter;
         localSf503RcMessageAreaCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_503_RC_MESSAGE_AREA_LEN = 80;
	/**
	 * 	serialize this Sf503RcMessageArea
	 */
   protected void serializeSf503RcMessageArea(char[] sf503RcMessageArea) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf503RcMessageArea,0,getStringValue(),beginSf503RcMessageArea,SF_503_RC_MESSAGE_AREA_LEN);
       localSf503RcMessageAreaCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf503RcMessageAreaConstraints(char[] value) {
   			return super.checkConstraints(value , 80 ,false, false);
   }
    /**
	 *	refreshSf503RcMessageArea is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf503RcMessageArea() {	 
   		return (substring(getStringValue(),beginSf503RcMessageArea,beginSf503RcMessageArea + SF_503_RC_MESSAGE_AREA_LEN));
   	}




}
  
