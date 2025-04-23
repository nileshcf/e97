package com.cloudframe.app.sf320010.file.records.serialize;

/**
*  The class SdSortKey2Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:12. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SdSortKey2Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SdSortKey2Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SD_SORT_KEY_2_LENGTH = 318;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSdSk2RemMipId;
            protected  int beginSdSk2OperatorId;
            protected  int beginSdSk2TimeStamp;
            protected  int beginSdSk2DateStamp;
	
	/**
	* Constructor for SdSortKey2Serialized
	**/
    public SdSortKey2Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for SdSortKey2Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SdSortKey2Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this SdSortKey2Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,18); // serialize this field at offset 18 by default 
    }
    
	/**
	* sets parent for this SdSortKey2Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 18 by default
    }    
	/**
	* initializes the field in SdSortKey2Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SD_SORT_KEY_2_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSdSk2RemMipId = getStartOffset() + 4;	// set offset for serialization
  
             beginSdSk2OperatorId = getStartOffset() + 7;	// set offset for serialization
  
             beginSdSk2TimeStamp = getStartOffset() + 14;	// set offset for serialization
  
             beginSdSk2DateStamp = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSdSk2RemMipIdCounter = -1;
     public boolean isSdSk2RemMipIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSdSk2RemMipIdCounter != sharedCounter;
         localSdSk2RemMipIdCounter = sharedCounter; return hasModified;
     }
	protected static final int SD_SK_2_REM_MIP_ID_LEN = 3;
	/**
	 * 	serialize this SdSk2RemMipId
	 */
   protected void serializeSdSk2RemMipId(char[] sdSk2RemMipId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sdSk2RemMipId,0,getStringValue(),beginSdSk2RemMipId,SD_SK_2_REM_MIP_ID_LEN);
       localSdSk2RemMipIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSdSk2RemMipIdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshSdSk2RemMipId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSdSk2RemMipId() {	 
   		return (substring(getStringValue(),beginSdSk2RemMipId,beginSdSk2RemMipId + SD_SK_2_REM_MIP_ID_LEN));
   	}
     int localSdSk2OperatorIdCounter = -1;
     public boolean isSdSk2OperatorIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSdSk2OperatorIdCounter != sharedCounter;
         localSdSk2OperatorIdCounter = sharedCounter; return hasModified;
     }
	protected static final int SD_SK_2_OPERATOR_ID_LEN = 7;
	/**
	 * 	serialize this SdSk2OperatorId
	 */
   protected void serializeSdSk2OperatorId(char[] sdSk2OperatorId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sdSk2OperatorId,0,getStringValue(),beginSdSk2OperatorId,SD_SK_2_OPERATOR_ID_LEN);
       localSdSk2OperatorIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSdSk2OperatorIdConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshSdSk2OperatorId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSdSk2OperatorId() {	 
   		return (substring(getStringValue(),beginSdSk2OperatorId,beginSdSk2OperatorId + SD_SK_2_OPERATOR_ID_LEN));
   	}
     int localSdSk2TimeStampCounter = -1;
     public boolean isSdSk2TimeStampModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSdSk2TimeStampCounter != sharedCounter;
         localSdSk2TimeStampCounter = sharedCounter; return hasModified;
     }
	protected static final int SD_SK_2_TIME_STAMP_LEN = 6;
	/**
	 * 	serialize this SdSk2TimeStamp
	 */
   protected void serializeSdSk2TimeStamp(char[] sdSk2TimeStamp) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sdSk2TimeStamp,0,getStringValue(),beginSdSk2TimeStamp,SD_SK_2_TIME_STAMP_LEN);
       localSdSk2TimeStampCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSdSk2TimeStampConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshSdSk2TimeStamp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSdSk2TimeStamp() {	 
   		return (substring(getStringValue(),beginSdSk2TimeStamp,beginSdSk2TimeStamp + SD_SK_2_TIME_STAMP_LEN));
   	}
     int localSdSk2DateStampCounter = -1;
     public boolean isSdSk2DateStampModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSdSk2DateStampCounter != sharedCounter;
         localSdSk2DateStampCounter = sharedCounter; return hasModified;
     }
	protected static final int SD_SK_2_DATE_STAMP_LEN = 6;
	/**
	 * 	serialize this SdSk2DateStamp
	 */
   protected void serializeSdSk2DateStamp(char[] sdSk2DateStamp) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sdSk2DateStamp,0,getStringValue(),beginSdSk2DateStamp,SD_SK_2_DATE_STAMP_LEN);
       localSdSk2DateStampCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSdSk2DateStampConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshSdSk2DateStamp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSdSk2DateStamp() {	 
   		return (substring(getStringValue(),beginSdSk2DateStamp,beginSdSk2DateStamp + SD_SK_2_DATE_STAMP_LEN));
   	}




}
  
