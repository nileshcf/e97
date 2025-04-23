package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class HdPage1Ln6Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class HdPage1Ln6Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(HdPage1Ln6Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HD_PAGE_1_LN_6_LENGTH = 133;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginHd16Cc;
            protected  int beginHd16Currency;
            protected  int beginHd16CurrDesc;
	
	/**
	* Constructor for HdPage1Ln6Serialized
	**/
    public HdPage1Ln6Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in HdPage1Ln6Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HD_PAGE_1_LN_6_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginHd16Cc = getStartOffset() + 0;	// set offset for serialization
  
  
  
  
             beginHd16Currency = getStartOffset() + 23;	// set offset for serialization
  
  
             beginHd16CurrDesc = getStartOffset() + 29;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localHd16CcCounter = -1;
     public boolean isHd16CcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHd16CcCounter != sharedCounter;
         localHd16CcCounter = sharedCounter; return hasModified;
     }
	protected static final int HD_16_CC_LEN = 1;
	/**
	 * 	serialize this Hd16Cc
	 */
   protected void serializeHd16Cc(char[] hd16Cc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hd16Cc,0,getStringValue(),beginHd16Cc,HD_16_CC_LEN);
       localHd16CcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHd16CcConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshHd16Cc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHd16Cc() {	 
   		return (substring(getStringValue(),beginHd16Cc,beginHd16Cc + HD_16_CC_LEN));
   	}
     int localHd16CurrencyCounter = -1;
     public boolean isHd16CurrencyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHd16CurrencyCounter != sharedCounter;
         localHd16CurrencyCounter = sharedCounter; return hasModified;
     }
	protected static final int HD_16_CURRENCY_LEN = 3;
	/**
	 * 	serialize this Hd16Currency
	 */
   protected void serializeHd16Currency(char[] hd16Currency) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hd16Currency,0,getStringValue(),beginHd16Currency,HD_16_CURRENCY_LEN);
       localHd16CurrencyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHd16CurrencyConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshHd16Currency is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHd16Currency() {	 
   		return (substring(getStringValue(),beginHd16Currency,beginHd16Currency + HD_16_CURRENCY_LEN));
   	}
     int localHd16CurrDescCounter = -1;
     public boolean isHd16CurrDescModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHd16CurrDescCounter != sharedCounter;
         localHd16CurrDescCounter = sharedCounter; return hasModified;
     }
	protected static final int HD_16_CURR_DESC_LEN = 30;
	/**
	 * 	serialize this Hd16CurrDesc
	 */
   protected void serializeHd16CurrDesc(char[] hd16CurrDesc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hd16CurrDesc,0,getStringValue(),beginHd16CurrDesc,HD_16_CURR_DESC_LEN);
       localHd16CurrDescCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHd16CurrDescConstraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshHd16CurrDesc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHd16CurrDesc() {	 
   		return (substring(getStringValue(),beginHd16CurrDesc,beginHd16CurrDesc + HD_16_CURR_DESC_LEN));
   	}




}
  
