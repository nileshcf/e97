package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class HdPage1Ln6aSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class HdPage1Ln6aSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(HdPage1Ln6aSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HD_PAGE_1_LN_6A_LENGTH = 133;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginHd16aCc;
            protected  int beginHd16aSsc;
	
	/**
	* Constructor for HdPage1Ln6aSerialized
	**/
    public HdPage1Ln6aSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in HdPage1Ln6aSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HD_PAGE_1_LN_6A_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginHd16aCc = getStartOffset() + 0;	// set offset for serialization
  
  
  
  
             beginHd16aSsc = getStartOffset() + 23;	// set offset for serialization
  
  
  
	   /*  end of offset */
	}
     int localHd16aCcCounter = -1;
     public boolean isHd16aCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHd16aCcCounter != sharedCounter;
         localHd16aCcCounter = sharedCounter; return hasModified;
     }
	protected static final int HD_16A_CC_LEN = 1;
	/**
	 * 	serialize this Hd16aCc
	 */
   protected void serializeHd16aCc(char[] hd16aCc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hd16aCc,0,getStringValue(),beginHd16aCc,HD_16A_CC_LEN);
       localHd16aCcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHd16aCcConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshHd16aCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHd16aCc() {	 
   		return (substring(getStringValue(),beginHd16aCc,beginHd16aCc + HD_16A_CC_LEN));
   	}
     int localHd16aSscCounter = -1;
     public boolean isHd16aSscModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHd16aSscCounter != sharedCounter;
         localHd16aSscCounter = sharedCounter; return hasModified;
     }
	protected static final int HD_16A_SSC_LEN = 3;
	/**
	 * 	serialize this Hd16aSsc
	 */
   protected void serializeHd16aSsc(char[] hd16aSsc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hd16aSsc,0,getStringValue(),beginHd16aSsc,HD_16A_SSC_LEN);
       localHd16aSscCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHd16aSscConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshHd16aSsc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHd16aSsc() {	 
   		return (substring(getStringValue(),beginHd16aSsc,beginHd16aSsc + HD_16A_SSC_LEN));
   	}




}
  
