package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class HdPage1Ln5Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class HdPage1Ln5Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(HdPage1Ln5Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HD_PAGE_1_LN_5_LENGTH = 133;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginHd15Cc;
            protected  int beginHd15ProcId;
	
	/**
	* Constructor for HdPage1Ln5Serialized
	**/
    public HdPage1Ln5Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in HdPage1Ln5Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HD_PAGE_1_LN_5_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginHd15Cc = getStartOffset() + 0;	// set offset for serialization
  
  
  
  
             beginHd15ProcId = getStartOffset() + 23;	// set offset for serialization
  
  
  
  
  
  
  
	   /*  end of offset */
	}
     int localHd15CcCounter = -1;
     public boolean isHd15CcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHd15CcCounter != sharedCounter;
         localHd15CcCounter = sharedCounter; return hasModified;
     }
	protected static final int HD_15_CC_LEN = 1;
	/**
	 * 	serialize this Hd15Cc
	 */
   protected void serializeHd15Cc(char[] hd15Cc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hd15Cc,0,getStringValue(),beginHd15Cc,HD_15_CC_LEN);
       localHd15CcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHd15CcConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshHd15Cc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHd15Cc() {	 
   		return (substring(getStringValue(),beginHd15Cc,beginHd15Cc + HD_15_CC_LEN));
   	}
     int localHd15ProcIdCounter = -1;
     public boolean isHd15ProcIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHd15ProcIdCounter != sharedCounter;
         localHd15ProcIdCounter = sharedCounter; return hasModified;
     }
	protected static final int HD_15_PROC_ID_LEN = 10;
	/**
	 * 	serialize this Hd15ProcId
	 */
   protected void serializeHd15ProcId(char[] hd15ProcId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hd15ProcId,0,getStringValue(),beginHd15ProcId,HD_15_PROC_ID_LEN);
       localHd15ProcIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHd15ProcIdConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshHd15ProcId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHd15ProcId() {	 
   		return (substring(getStringValue(),beginHd15ProcId,beginHd15ProcId + HD_15_PROC_ID_LEN));
   	}




}
  
