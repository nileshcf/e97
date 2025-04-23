package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class RpCoEoj14Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:12. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RpCoEoj14Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RpCoEoj14Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RP_CO_EOJ_14_LENGTH = 134;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRpCoEoj14TtlBulk32;
	
	/**
	* Constructor for RpCoEoj14Serialized
	**/
    public RpCoEoj14Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in RpCoEoj14Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RP_CO_EOJ_14_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
             beginRpCoEoj14TtlBulk32 = getStartOffset() + 44;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localRpCoEoj14TtlBulk32Counter = -1;
     public boolean isRpCoEoj14TtlBulk32Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpCoEoj14TtlBulk32Counter != sharedCounter;
         localRpCoEoj14TtlBulk32Counter = sharedCounter; return hasModified;
     }
	protected static final int RP_CO_EOJ_14_TTL_BULK_32_LEN = 6;
	/**
	 * 	serialize this RpCoEoj14TtlBulk32
	 */
   protected void serializeRpCoEoj14TtlBulk32(char[] rpCoEoj14TtlBulk32) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpCoEoj14TtlBulk32,0,getStringValue(),beginRpCoEoj14TtlBulk32,RP_CO_EOJ_14_TTL_BULK_32_LEN);
       localRpCoEoj14TtlBulk32Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpCoEoj14TtlBulk32Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshRpCoEoj14TtlBulk32 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpCoEoj14TtlBulk32() {	 
   		return (substring(getStringValue(),beginRpCoEoj14TtlBulk32,beginRpCoEoj14TtlBulk32 + RP_CO_EOJ_14_TTL_BULK_32_LEN));
   	}




}
  
