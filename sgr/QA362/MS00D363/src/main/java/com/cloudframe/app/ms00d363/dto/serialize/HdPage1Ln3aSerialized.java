package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class HdPage1Ln3aSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:12. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class HdPage1Ln3aSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(HdPage1Ln3aSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HD_PAGE_1_LN_3A_LENGTH = 132;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginHd13aCc;
	
	/**
	* Constructor for HdPage1Ln3aSerialized
	**/
    public HdPage1Ln3aSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in HdPage1Ln3aSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HD_PAGE_1_LN_3A_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginHd13aCc = getStartOffset() + 0;	// set offset for serialization
  
  
  
  
  
  
	   /*  end of offset */
	}
     int localHd13aCcCounter = -1;
     public boolean isHd13aCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHd13aCcCounter != sharedCounter;
         localHd13aCcCounter = sharedCounter; return hasModified;
     }
	protected static final int HD_13A_CC_LEN = 1;
	/**
	 * 	serialize this Hd13aCc
	 */
   protected void serializeHd13aCc(char[] hd13aCc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hd13aCc,0,getStringValue(),beginHd13aCc,HD_13A_CC_LEN);
       localHd13aCcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHd13aCcConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshHd13aCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHd13aCc() {	 
   		return (substring(getStringValue(),beginHd13aCc,beginHd13aCc + HD_13A_CC_LEN));
   	}




}
  
