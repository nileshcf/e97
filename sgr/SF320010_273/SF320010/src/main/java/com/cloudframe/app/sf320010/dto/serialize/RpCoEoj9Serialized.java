package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class RpCoEoj9Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:37. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RpCoEoj9Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RpCoEoj9Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RP_CO_EOJ_9_LENGTH = 134;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRpCoEoj9TotalRem;
	
	/**
	* Constructor for RpCoEoj9Serialized
	**/
    public RpCoEoj9Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in RpCoEoj9Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RP_CO_EOJ_9_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
             beginRpCoEoj9TotalRem = getStartOffset() + 44;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localRpCoEoj9TotalRemCounter = -1;
     public boolean isRpCoEoj9TotalRemModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpCoEoj9TotalRemCounter != sharedCounter;
         localRpCoEoj9TotalRemCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_CO_EOJ_9_TOTAL_REM_LEN = 6;
	/**
	 * 	serialize this RpCoEoj9TotalRem
	 */
   protected void serializeRpCoEoj9TotalRem(char[] rpCoEoj9TotalRem) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpCoEoj9TotalRem,0,getStringValue(),beginRpCoEoj9TotalRem,RP_CO_EOJ_9_TOTAL_REM_LEN);
       localRpCoEoj9TotalRemCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpCoEoj9TotalRemConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshRpCoEoj9TotalRem is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpCoEoj9TotalRem() {	 
   		return (substring(getStringValue(),beginRpCoEoj9TotalRem,beginRpCoEoj9TotalRem + RP_CO_EOJ_9_TOTAL_REM_LEN));
   	}




}
  
