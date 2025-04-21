package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class HdPage1Ln4aSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class HdPage1Ln4aSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(HdPage1Ln4aSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HD_PAGE_1_LN_4A_LENGTH = 133;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginHd14aCc;
            protected  int beginHd15ProcDesc;
	
	/**
	* Constructor for HdPage1Ln4aSerialized
	**/
    public HdPage1Ln4aSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in HdPage1Ln4aSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HD_PAGE_1_LN_4A_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginHd14aCc = getStartOffset() + 0;	// set offset for serialization
  
  
  
  
             beginHd15ProcDesc = getStartOffset() + 23;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localHd14aCcCounter = -1;
     public boolean isHd14aCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHd14aCcCounter != sharedCounter;
         localHd14aCcCounter = sharedCounter; return hasModified;
     }
	protected static final int HD_14A_CC_LEN = 1;
	/**
	 * 	serialize this Hd14aCc
	 */
   protected void serializeHd14aCc(char[] hd14aCc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hd14aCc,0,getStringValue(),beginHd14aCc,HD_14A_CC_LEN);
       localHd14aCcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHd14aCcConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshHd14aCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHd14aCc() {	 
   		return (substring(getStringValue(),beginHd14aCc,beginHd14aCc + HD_14A_CC_LEN));
   	}
     int localHd15ProcDescCounter = -1;
     public boolean isHd15ProcDescModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHd15ProcDescCounter != sharedCounter;
         localHd15ProcDescCounter = sharedCounter; return hasModified;
     }
	protected static final int HD_15_PROC_DESC_LEN = 25;
	/**
	 * 	serialize this Hd15ProcDesc
	 */
   protected void serializeHd15ProcDesc(char[] hd15ProcDesc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hd15ProcDesc,0,getStringValue(),beginHd15ProcDesc,HD_15_PROC_DESC_LEN);
       localHd15ProcDescCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHd15ProcDescConstraints(char[] value) {
   			return super.checkConstraints(value , 25 ,false, false);
   }
    /**
	 *	refreshHd15ProcDesc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHd15ProcDesc() {	 
   		return (substring(getStringValue(),beginHd15ProcDesc,beginHd15ProcDesc + HD_15_PROC_DESC_LEN));
   	}




}
  
