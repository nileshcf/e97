package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class HdPage1Ln6bSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class HdPage1Ln6bSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(HdPage1Ln6bSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HD_PAGE_1_LN_6B_LENGTH = 133;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginHd16bCc;
            protected  int beginHd16bIsis;
	
	/**
	* Constructor for HdPage1Ln6bSerialized
	**/
    public HdPage1Ln6bSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in HdPage1Ln6bSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HD_PAGE_1_LN_6B_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginHd16bCc = getStartOffset() + 0;	// set offset for serialization
  
  
  
  
             beginHd16bIsis = getStartOffset() + 23;	// set offset for serialization
  
  
  
	   /*  end of offset */
	}
     int localHd16bCcCounter = -1;
     public boolean isHd16bCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHd16bCcCounter != sharedCounter;
         localHd16bCcCounter = sharedCounter; return hasModified;
     }
	protected static final int HD_16B_CC_LEN = 1;
	/**
	 * 	serialize this Hd16bCc
	 */
   protected void serializeHd16bCc(char[] hd16bCc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hd16bCc,0,getStringValue(),beginHd16bCc,HD_16B_CC_LEN);
       localHd16bCcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHd16bCcConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshHd16bCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHd16bCc() {	 
   		return (substring(getStringValue(),beginHd16bCc,beginHd16bCc + HD_16B_CC_LEN));
   	}
     int localHd16bIsisCounter = -1;
     public boolean isHd16bIsisModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHd16bIsisCounter != sharedCounter;
         localHd16bIsisCounter = sharedCounter; return hasModified;
     }
	protected static final int HD_16B_ISIS_LEN = 4;
	/**
	 * 	serialize this Hd16bIsis
	 */
   protected void serializeHd16bIsis(char[] hd16bIsis) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hd16bIsis,0,getStringValue(),beginHd16bIsis,HD_16B_ISIS_LEN);
       localHd16bIsisCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHd16bIsisConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshHd16bIsis is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHd16bIsis() {	 
   		return (substring(getStringValue(),beginHd16bIsis,beginHd16bIsis + HD_16B_ISIS_LEN));
   	}




}
  
