package com.cloudframe.app.tmsmmcpy.dto.serialize;

/**
*  The class SmmKeySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:51. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SmmKeySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SmmKeySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SMM_KEY_LENGTH = 100;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSmmDdrKey;
            protected  int beginSmmBatchKey;
            protected  int beginSmmExtCapXptId;
            protected  int beginSmmDataserverId;
            protected  int beginSmmField3;
            protected  int beginSmmField1;
	
	/**
	* Constructor for SmmKeySerialized
	**/
    public SmmKeySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for SmmKeySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SmmKeySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this SmmKeySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this SmmKeySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in SmmKeySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SMM_KEY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSmmDdrKey = getStartOffset() + 0;	// set offset for serialization
  
             beginSmmBatchKey = getStartOffset() + 10;	// set offset for serialization
  
             beginSmmExtCapXptId = getStartOffset() + 20;	// set offset for serialization
  
             beginSmmDataserverId = getStartOffset() + 36;	// set offset for serialization
  
             beginSmmField3 = getStartOffset() + 40;	// set offset for serialization
  
             beginSmmField1 = getStartOffset() + 70;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSmmDdrKeyCounter = -1;
     public boolean isSmmDdrKeyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSmmDdrKeyCounter != sharedCounter;
         localSmmDdrKeyCounter = sharedCounter; return hasModified;
     }
	protected static final int SMM_DDR_KEY_LEN = 10;
	/**
	 * 	serialize this SmmDdrKey
	 */
   protected void serializeSmmDdrKey(char[] smmDdrKey) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(smmDdrKey,0,getStringValue(),beginSmmDdrKey,SMM_DDR_KEY_LEN);
       localSmmDdrKeyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSmmDdrKeyConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshSmmDdrKey is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSmmDdrKey() {	 
   		return (substring(getStringValue(),beginSmmDdrKey,beginSmmDdrKey + SMM_DDR_KEY_LEN));
   	}
     int localSmmBatchKeyCounter = -1;
     public boolean isSmmBatchKeyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSmmBatchKeyCounter != sharedCounter;
         localSmmBatchKeyCounter = sharedCounter; return hasModified;
     }
	protected static final int SMM_BATCH_KEY_LEN = 10;
	/**
	 * 	serialize this SmmBatchKey
	 */
   protected void serializeSmmBatchKey(char[] smmBatchKey) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(smmBatchKey,0,getStringValue(),beginSmmBatchKey,SMM_BATCH_KEY_LEN);
       localSmmBatchKeyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSmmBatchKeyConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshSmmBatchKey is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSmmBatchKey() {	 
   		return (substring(getStringValue(),beginSmmBatchKey,beginSmmBatchKey + SMM_BATCH_KEY_LEN));
   	}
     int localSmmExtCapXptIdCounter = -1;
     public boolean isSmmExtCapXptIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSmmExtCapXptIdCounter != sharedCounter;
         localSmmExtCapXptIdCounter = sharedCounter; return hasModified;
     }
	protected static final int SMM_EXT_CAP_XPT_ID_LEN = 16;
	/**
	 * 	serialize this SmmExtCapXptId
	 */
   protected void serializeSmmExtCapXptId(char[] smmExtCapXptId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(smmExtCapXptId,0,getStringValue(),beginSmmExtCapXptId,SMM_EXT_CAP_XPT_ID_LEN);
       localSmmExtCapXptIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSmmExtCapXptIdConstraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
    /**
	 *	refreshSmmExtCapXptId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSmmExtCapXptId() {	 
   		return (substring(getStringValue(),beginSmmExtCapXptId,beginSmmExtCapXptId + SMM_EXT_CAP_XPT_ID_LEN));
   	}
     int localSmmDataserverIdCounter = -1;
     public boolean isSmmDataserverIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSmmDataserverIdCounter != sharedCounter;
         localSmmDataserverIdCounter = sharedCounter; return hasModified;
     }
	protected static final int SMM_DATASERVER_ID_LEN = 4;
	/**
	 * 	serialize this SmmDataserverId
	 */
   protected void serializeSmmDataserverId(char[] smmDataserverId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(smmDataserverId,0,getStringValue(),beginSmmDataserverId,SMM_DATASERVER_ID_LEN);
       localSmmDataserverIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSmmDataserverIdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshSmmDataserverId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSmmDataserverId() {	 
   		return (substring(getStringValue(),beginSmmDataserverId,beginSmmDataserverId + SMM_DATASERVER_ID_LEN));
   	}
     int localSmmField3Counter = -1;
     public boolean isSmmField3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSmmField3Counter != sharedCounter;
         localSmmField3Counter = sharedCounter; return hasModified;
     }
	protected static final int SMM_FIELD_3_LEN = 30;
	/**
	 * 	serialize this SmmField3
	 */
   protected void serializeSmmField3(char[] smmField3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(smmField3,0,getStringValue(),beginSmmField3,SMM_FIELD_3_LEN);
       localSmmField3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSmmField3Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshSmmField3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSmmField3() {	 
   		return (substring(getStringValue(),beginSmmField3,beginSmmField3 + SMM_FIELD_3_LEN));
   	}
     int localSmmField1Counter = -1;
     public boolean isSmmField1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSmmField1Counter != sharedCounter;
         localSmmField1Counter = sharedCounter; return hasModified;
     }
	protected static final int SMM_FIELD_1_LEN = 30;
	/**
	 * 	serialize this SmmField1
	 */
   protected void serializeSmmField1(char[] smmField1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(smmField1,0,getStringValue(),beginSmmField1,SMM_FIELD_1_LEN);
       localSmmField1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSmmField1Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshSmmField1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSmmField1() {	 
   		return (substring(getStringValue(),beginSmmField1,beginSmmField1 + SMM_FIELD_1_LEN));
   	}




}
  
