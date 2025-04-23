package com.cloudframe.app.sf320010.file.records.serialize;

/**
*  The class SdSortKeySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:34. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SdSortKeySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SdSortKeySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SD_SORT_KEY_LENGTH = 17;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSdSortId;
            protected  int beginSdSortCc;
            protected  int beginSdSortDate;
            protected  int beginSdSortTime;
	
	/**
	* Constructor for SdSortKeySerialized
	**/
    public SdSortKeySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for SdSortKeySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SdSortKeySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this SdSortKeySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this SdSortKeySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in SdSortKeySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SD_SORT_KEY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSdSortId = getStartOffset() + 0;	// set offset for serialization
  
             beginSdSortCc = getStartOffset() + 3;	// set offset for serialization
  
             beginSdSortDate = getStartOffset() + 5;	// set offset for serialization
  
             beginSdSortTime = getStartOffset() + 11;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSdSortIdCounter = -1;
     public boolean isSdSortIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSdSortIdCounter != sharedCounter;
         localSdSortIdCounter = sharedCounter; return hasModified;
     }
	protected static final int SD_SORT_ID_LEN = 3;
	/**
	 * 	serialize this SdSortId
	 */
   protected void serializeSdSortId(char[] sdSortId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sdSortId,0,getStringValue(),beginSdSortId,SD_SORT_ID_LEN);
       localSdSortIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSdSortIdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshSdSortId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSdSortId() {	 
   		return (substring(getStringValue(),beginSdSortId,beginSdSortId + SD_SORT_ID_LEN));
   	}
     int localSdSortCcCounter = -1;
     public boolean isSdSortCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSdSortCcCounter != sharedCounter;
         localSdSortCcCounter = sharedCounter; return hasModified;
     }
	protected static final int SD_SORT_CC_LEN = 2;
	/**
	 * 	serialize this SdSortCc
	 */
   protected void serializeSdSortCc(char[] sdSortCc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sdSortCc,0,getStringValue(),beginSdSortCc,SD_SORT_CC_LEN);
       localSdSortCcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSdSortCcConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshSdSortCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSdSortCc() {	 
   		return (substring(getStringValue(),beginSdSortCc,beginSdSortCc + SD_SORT_CC_LEN));
   	}
     int localSdSortDateCounter = -1;
     public boolean isSdSortDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSdSortDateCounter != sharedCounter;
         localSdSortDateCounter = sharedCounter; return hasModified;
     }
	protected static final int SD_SORT_DATE_LEN = 6;
	/**
	 * 	serialize this SdSortDate
	 */
   protected void serializeSdSortDate(char[] sdSortDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sdSortDate,0,getStringValue(),beginSdSortDate,SD_SORT_DATE_LEN);
       localSdSortDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSdSortDateConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshSdSortDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSdSortDate() {	 
   		return (substring(getStringValue(),beginSdSortDate,beginSdSortDate + SD_SORT_DATE_LEN));
   	}
     int localSdSortTimeCounter = -1;
     public boolean isSdSortTimeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSdSortTimeCounter != sharedCounter;
         localSdSortTimeCounter = sharedCounter; return hasModified;
     }
	protected static final int SD_SORT_TIME_LEN = 6;
	/**
	 * 	serialize this SdSortTime
	 */
   protected void serializeSdSortTime(char[] sdSortTime) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sdSortTime,0,getStringValue(),beginSdSortTime,SD_SORT_TIME_LEN);
       localSdSortTimeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSdSortTimeConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshSdSortTime is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSdSortTime() {	 
   		return (substring(getStringValue(),beginSdSortTime,beginSdSortTime + SD_SORT_TIME_LEN));
   	}




}
  
