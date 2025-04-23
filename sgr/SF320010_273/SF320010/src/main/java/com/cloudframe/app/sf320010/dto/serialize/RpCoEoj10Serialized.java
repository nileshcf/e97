package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class RpCoEoj10Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:34. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RpCoEoj10Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RpCoEoj10Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RP_CO_EOJ_10_LENGTH = 134;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRpCoEoj10TotalX92;
	
	/**
	* Constructor for RpCoEoj10Serialized
	**/
    public RpCoEoj10Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in RpCoEoj10Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RP_CO_EOJ_10_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
             beginRpCoEoj10TotalX92 = getStartOffset() + 44;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localRpCoEoj10TotalX92Counter = -1;
     public boolean isRpCoEoj10TotalX92Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpCoEoj10TotalX92Counter != sharedCounter;
         localRpCoEoj10TotalX92Counter = sharedCounter; return hasModified;
     }
	protected static final int RP_CO_EOJ_10_TOTAL_X_92_LEN = 6;
	/**
	 * 	serialize this RpCoEoj10TotalX92
	 */
   protected void serializeRpCoEoj10TotalX92(char[] rpCoEoj10TotalX92) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpCoEoj10TotalX92,0,getStringValue(),beginRpCoEoj10TotalX92,RP_CO_EOJ_10_TOTAL_X_92_LEN);
       localRpCoEoj10TotalX92Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpCoEoj10TotalX92Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshRpCoEoj10TotalX92 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpCoEoj10TotalX92() {	 
   		return (substring(getStringValue(),beginRpCoEoj10TotalX92,beginRpCoEoj10TotalX92 + RP_CO_EOJ_10_TOTAL_X_92_LEN));
   	}




}
  
