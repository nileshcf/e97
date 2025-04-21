package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class RptkeyRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RptkeyRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RptkeyRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RPTKEY_REC_LENGTH = 80;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRptkeyId;
            protected  int beginRptkeyDesc;
	
	/**
	* Constructor for RptkeyRecSerialized
	**/
    public RptkeyRecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in RptkeyRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RPTKEY_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRptkeyId = getStartOffset() + 0;	// set offset for serialization
  
             beginRptkeyDesc = getStartOffset() + 3;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRptkeyIdCounter = -1;
     public boolean isRptkeyIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRptkeyIdCounter != sharedCounter;
         localRptkeyIdCounter = sharedCounter; return hasModified;
     }
	protected static final int RPTKEY_ID_LEN = 3;
	/**
	 * 	serialize this RptkeyId
	 */
   protected void serializeRptkeyId(char[] rptkeyId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rptkeyId,0,getStringValue(),beginRptkeyId,RPTKEY_ID_LEN);
       localRptkeyIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRptkeyIdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshRptkeyId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRptkeyId() {	 
   		return (substring(getStringValue(),beginRptkeyId,beginRptkeyId + RPTKEY_ID_LEN));
   	}
     int localRptkeyDescCounter = -1;
     public boolean isRptkeyDescModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRptkeyDescCounter != sharedCounter;
         localRptkeyDescCounter = sharedCounter; return hasModified;
     }
	protected static final int RPTKEY_DESC_LEN = 18;
	/**
	 * 	serialize this RptkeyDesc
	 */
   protected void serializeRptkeyDesc(char[] rptkeyDesc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rptkeyDesc,0,getStringValue(),beginRptkeyDesc,RPTKEY_DESC_LEN);
       localRptkeyDescCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRptkeyDescConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshRptkeyDesc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRptkeyDesc() {	 
   		return (substring(getStringValue(),beginRptkeyDesc,beginRptkeyDesc + RPTKEY_DESC_LEN));
   	}




}
  
