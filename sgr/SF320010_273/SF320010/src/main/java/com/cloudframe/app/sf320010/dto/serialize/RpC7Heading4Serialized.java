package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class RpC7Heading4Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:37. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RpC7Heading4Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RpC7Heading4Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RP_C_7_HEADING_4_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRpC7H4MipId;
            protected  int beginRpC7H4DtStamp;
	
	/**
	* Constructor for RpC7Heading4Serialized
	**/
    public RpC7Heading4Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in RpC7Heading4Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RP_C_7_HEADING_4_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
             beginRpC7H4MipId = getStartOffset() + 25;	// set offset for serialization
  
  
             beginRpC7H4DtStamp = getStartOffset() + 52;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRpC7H4MipIdCounter = -1;
     public boolean isRpC7H4MipIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC7H4MipIdCounter != sharedCounter;
         localRpC7H4MipIdCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_C_7_H_4_MIP_ID_LEN = 3;
	/**
	 * 	serialize this RpC7H4MipId
	 */
   protected void serializeRpC7H4MipId(char[] rpC7H4MipId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpC7H4MipId,0,getStringValue(),beginRpC7H4MipId,RP_C_7_H_4_MIP_ID_LEN);
       localRpC7H4MipIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpC7H4MipIdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshRpC7H4MipId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpC7H4MipId() {	 
   		return (substring(getStringValue(),beginRpC7H4MipId,beginRpC7H4MipId + RP_C_7_H_4_MIP_ID_LEN));
   	}
     int localRpC7H4DtStampCounter = -1;
     public boolean isRpC7H4DtStampModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC7H4DtStampCounter != sharedCounter;
         localRpC7H4DtStampCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_C_7_H_4_DT_STAMP_LEN = 8;
	/**
	 * 	serialize this RpC7H4DtStamp
	 */
   protected void serializeRpC7H4DtStamp(char[] rpC7H4DtStamp) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpC7H4DtStamp,0,getStringValue(),beginRpC7H4DtStamp,RP_C_7_H_4_DT_STAMP_LEN);
       localRpC7H4DtStampCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpC7H4DtStampConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshRpC7H4DtStamp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpC7H4DtStamp() {	 
   		return (substring(getStringValue(),beginRpC7H4DtStamp,beginRpC7H4DtStamp + RP_C_7_H_4_DT_STAMP_LEN));
   	}




}
  
