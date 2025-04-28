package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class HdPage3Ln5Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class HdPage3Ln5Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(HdPage3Ln5Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HD_PAGE_3_LN_5_LENGTH = 133;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginHd35Cc;
            protected  int beginHd3VatMsg;
	
	/**
	* Constructor for HdPage3Ln5Serialized
	**/
    public HdPage3Ln5Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in HdPage3Ln5Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HD_PAGE_3_LN_5_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginHd35Cc = getStartOffset() + 0;	// set offset for serialization
  
             beginHd3VatMsg = getStartOffset() + 1;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localHd35CcCounter = -1;
     public boolean isHd35CcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHd35CcCounter != sharedCounter;
         localHd35CcCounter = sharedCounter; return hasModified;
     }
	protected static final int HD_35_CC_LEN = 1;
	/**
	 * 	serialize this Hd35Cc
	 */
   protected void serializeHd35Cc(char[] hd35Cc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hd35Cc,0,getStringValue(),beginHd35Cc,HD_35_CC_LEN);
       localHd35CcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHd35CcConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshHd35Cc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHd35Cc() {	 
   		return (substring(getStringValue(),beginHd35Cc,beginHd35Cc + HD_35_CC_LEN));
   	}
     int localHd3VatMsgCounter = -1;
     public boolean isHd3VatMsgModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHd3VatMsgCounter != sharedCounter;
         localHd3VatMsgCounter = sharedCounter; return hasModified;
     }
	protected static final int HD_3_VAT_MSG_LEN = 17;
	/**
	 * 	serialize this Hd3VatMsg
	 */
   protected void serializeHd3VatMsg(char[] hd3VatMsg) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hd3VatMsg,0,getStringValue(),beginHd3VatMsg,HD_3_VAT_MSG_LEN);
       localHd3VatMsgCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHd3VatMsgConstraints(char[] value) {
   			return super.checkConstraints(value , 17 ,false, false);
   }
    /**
	 *	refreshHd3VatMsg is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHd3VatMsg() {	 
   		return (substring(getStringValue(),beginHd3VatMsg,beginHd3VatMsg + HD_3_VAT_MSG_LEN));
   	}




}
  
