package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class RpCoEoj7Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RpCoEoj7Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RpCoEoj7Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RP_CO_EOJ_7_LENGTH = 134;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRpCoEoj7TotalMip;
	
	/**
	* Constructor for RpCoEoj7Serialized
	**/
    public RpCoEoj7Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in RpCoEoj7Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RP_CO_EOJ_7_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
             beginRpCoEoj7TotalMip = getStartOffset() + 44;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localRpCoEoj7TotalMipCounter = -1;
     public boolean isRpCoEoj7TotalMipModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpCoEoj7TotalMipCounter != sharedCounter;
         localRpCoEoj7TotalMipCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_CO_EOJ_7_TOTAL_MIP_LEN = 6;
	/**
	 * 	serialize this RpCoEoj7TotalMip
	 */
   protected void serializeRpCoEoj7TotalMip(char[] rpCoEoj7TotalMip) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpCoEoj7TotalMip,0,getStringValue(),beginRpCoEoj7TotalMip,RP_CO_EOJ_7_TOTAL_MIP_LEN);
       localRpCoEoj7TotalMipCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpCoEoj7TotalMipConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshRpCoEoj7TotalMip is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpCoEoj7TotalMip() {	 
   		return (substring(getStringValue(),beginRpCoEoj7TotalMip,beginRpCoEoj7TotalMip + RP_CO_EOJ_7_TOTAL_MIP_LEN));
   	}




}
  
