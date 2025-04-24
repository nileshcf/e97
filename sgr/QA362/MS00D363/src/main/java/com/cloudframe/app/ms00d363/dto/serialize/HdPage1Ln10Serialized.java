package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class HdPage1Ln10Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class HdPage1Ln10Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(HdPage1Ln10Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HD_PAGE_1_LN_10_LENGTH = 51;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginHd110Cc;
            protected  int beginHd110Desc;
	
	/**
	* Constructor for HdPage1Ln10Serialized
	**/
    public HdPage1Ln10Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in HdPage1Ln10Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HD_PAGE_1_LN_10_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginHd110Cc = getStartOffset() + 0;	// set offset for serialization
  
  
             beginHd110Desc = getStartOffset() + 2;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localHd110CcCounter = -1;
     public boolean isHd110CcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHd110CcCounter != sharedCounter;
         localHd110CcCounter = sharedCounter; return hasModified;
     }
	protected static final int HD_110_CC_LEN = 1;
	/**
	 * 	serialize this Hd110Cc
	 */
   protected void serializeHd110Cc(char[] hd110Cc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hd110Cc,0,getStringValue(),beginHd110Cc,HD_110_CC_LEN);
       localHd110CcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHd110CcConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshHd110Cc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHd110Cc() {	 
   		return (substring(getStringValue(),beginHd110Cc,beginHd110Cc + HD_110_CC_LEN));
   	}
     int localHd110DescCounter = -1;
     public boolean isHd110DescModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHd110DescCounter != sharedCounter;
         localHd110DescCounter = sharedCounter; return hasModified;
     }
	protected static final int HD_110_DESC_LEN = 25;
	/**
	 * 	serialize this Hd110Desc
	 */
   protected void serializeHd110Desc(char[] hd110Desc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hd110Desc,0,getStringValue(),beginHd110Desc,HD_110_DESC_LEN);
       localHd110DescCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHd110DescConstraints(char[] value) {
   			return super.checkConstraints(value , 25 ,false, false);
   }
    /**
	 *	refreshHd110Desc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHd110Desc() {	 
   		return (substring(getStringValue(),beginHd110Desc,beginHd110Desc + HD_110_DESC_LEN));
   	}




}
  
