package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class RpCoEoj6Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:37. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RpCoEoj6Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RpCoEoj6Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RP_CO_EOJ_6_LENGTH = 134;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRpCoEoj6TotalPos;
	
	/**
	* Constructor for RpCoEoj6Serialized
	**/
    public RpCoEoj6Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in RpCoEoj6Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RP_CO_EOJ_6_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
             beginRpCoEoj6TotalPos = getStartOffset() + 44;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localRpCoEoj6TotalPosCounter = -1;
     public boolean isRpCoEoj6TotalPosModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpCoEoj6TotalPosCounter != sharedCounter;
         localRpCoEoj6TotalPosCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_CO_EOJ_6_TOTAL_POS_LEN = 6;
	/**
	 * 	serialize this RpCoEoj6TotalPos
	 */
   protected void serializeRpCoEoj6TotalPos(char[] rpCoEoj6TotalPos) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpCoEoj6TotalPos,0,getStringValue(),beginRpCoEoj6TotalPos,RP_CO_EOJ_6_TOTAL_POS_LEN);
       localRpCoEoj6TotalPosCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpCoEoj6TotalPosConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshRpCoEoj6TotalPos is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpCoEoj6TotalPos() {	 
   		return (substring(getStringValue(),beginRpCoEoj6TotalPos,beginRpCoEoj6TotalPos + RP_CO_EOJ_6_TOTAL_POS_LEN));
   	}




}
  
