package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class HdPage3Ln3Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class HdPage3Ln3Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(HdPage3Ln3Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HD_PAGE_3_LN_3_LENGTH = 133;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginHd33Cc;
            protected  int beginHd33GcmsOrSam;
	
	/**
	* Constructor for HdPage3Ln3Serialized
	**/
    public HdPage3Ln3Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in HdPage3Ln3Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HD_PAGE_3_LN_3_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginHd33Cc = getStartOffset() + 0;	// set offset for serialization
  
  
  
             beginHd33GcmsOrSam = getStartOffset() + 17;	// set offset for serialization
  
  
  
  
  
  
  
  
  
  
	   /*  end of offset */
	}
     int localHd33CcCounter = -1;
     public boolean isHd33CcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHd33CcCounter != sharedCounter;
         localHd33CcCounter = sharedCounter; return hasModified;
     }
	protected static final int HD_33_CC_LEN = 1;
	/**
	 * 	serialize this Hd33Cc
	 */
   protected void serializeHd33Cc(char[] hd33Cc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hd33Cc,0,getStringValue(),beginHd33Cc,HD_33_CC_LEN);
       localHd33CcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHd33CcConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshHd33Cc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHd33Cc() {	 
   		return (substring(getStringValue(),beginHd33Cc,beginHd33Cc + HD_33_CC_LEN));
   	}
     int localHd33GcmsOrSamCounter = -1;
     public boolean isHd33GcmsOrSamModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHd33GcmsOrSamCounter != sharedCounter;
         localHd33GcmsOrSamCounter = sharedCounter; return hasModified;
     }
	protected static final int HD_33_GCMS_OR_SAM_LEN = 6;
	/**
	 * 	serialize this Hd33GcmsOrSam
	 */
   protected void serializeHd33GcmsOrSam(char[] hd33GcmsOrSam) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hd33GcmsOrSam,0,getStringValue(),beginHd33GcmsOrSam,HD_33_GCMS_OR_SAM_LEN);
       localHd33GcmsOrSamCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHd33GcmsOrSamConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshHd33GcmsOrSam is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHd33GcmsOrSam() {	 
   		return (substring(getStringValue(),beginHd33GcmsOrSam,beginHd33GcmsOrSam + HD_33_GCMS_OR_SAM_LEN));
   	}




}
  
