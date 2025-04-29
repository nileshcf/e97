package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class RpCoEoj5Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:29. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RpCoEoj5Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RpCoEoj5Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RP_CO_EOJ_5_LENGTH = 134;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRpCoEoj5TotalOper;
	
	/**
	* Constructor for RpCoEoj5Serialized
	**/
    public RpCoEoj5Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in RpCoEoj5Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RP_CO_EOJ_5_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
             beginRpCoEoj5TotalOper = getStartOffset() + 44;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localRpCoEoj5TotalOperCounter = -1;
     public boolean isRpCoEoj5TotalOperModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpCoEoj5TotalOperCounter != sharedCounter;
         localRpCoEoj5TotalOperCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_CO_EOJ_5_TOTAL_OPER_LEN = 6;
	/**
	 * 	serialize this RpCoEoj5TotalOper
	 */
   protected void serializeRpCoEoj5TotalOper(char[] rpCoEoj5TotalOper) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpCoEoj5TotalOper,0,getStringValue(),beginRpCoEoj5TotalOper,RP_CO_EOJ_5_TOTAL_OPER_LEN);
       localRpCoEoj5TotalOperCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpCoEoj5TotalOperConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshRpCoEoj5TotalOper is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpCoEoj5TotalOper() {	 
   		return (substring(getStringValue(),beginRpCoEoj5TotalOper,beginRpCoEoj5TotalOper + RP_CO_EOJ_5_TOTAL_OPER_LEN));
   	}




}
  
