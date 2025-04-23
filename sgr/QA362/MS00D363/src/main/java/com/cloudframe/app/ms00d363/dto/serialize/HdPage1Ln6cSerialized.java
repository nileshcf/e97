package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class HdPage1Ln6cSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class HdPage1Ln6cSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(HdPage1Ln6cSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HD_PAGE_1_LN_6C_LENGTH = 133;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginHd16cCc;
            protected  int beginHd15SettIca;
	
	/**
	* Constructor for HdPage1Ln6cSerialized
	**/
    public HdPage1Ln6cSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in HdPage1Ln6cSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HD_PAGE_1_LN_6C_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginHd16cCc = getStartOffset() + 0;	// set offset for serialization
  
  
  
  
             beginHd15SettIca = getStartOffset() + 23;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localHd16cCcCounter = -1;
     public boolean isHd16cCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHd16cCcCounter != sharedCounter;
         localHd16cCcCounter = sharedCounter; return hasModified;
     }
	protected static final int HD_16C_CC_LEN = 1;
	/**
	 * 	serialize this Hd16cCc
	 */
   protected void serializeHd16cCc(char[] hd16cCc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hd16cCc,0,getStringValue(),beginHd16cCc,HD_16C_CC_LEN);
       localHd16cCcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHd16cCcConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshHd16cCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHd16cCc() {	 
   		return (substring(getStringValue(),beginHd16cCc,beginHd16cCc + HD_16C_CC_LEN));
   	}
     int localHd15SettIcaCounter = -1;
     public boolean isHd15SettIcaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHd15SettIcaCounter != sharedCounter;
         localHd15SettIcaCounter = sharedCounter; return hasModified;
     }
	protected static final int HD_15_SETT_ICA_LEN = 6;
	/**
	 * 	serialize this Hd15SettIca
	 */
   protected void serializeHd15SettIca(char[] hd15SettIca) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hd15SettIca,0,getStringValue(),beginHd15SettIca,HD_15_SETT_ICA_LEN);
       localHd15SettIcaCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHd15SettIcaConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshHd15SettIca is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHd15SettIca() {	 
   		return (substring(getStringValue(),beginHd15SettIca,beginHd15SettIca + HD_15_SETT_ICA_LEN));
   	}




}
  
