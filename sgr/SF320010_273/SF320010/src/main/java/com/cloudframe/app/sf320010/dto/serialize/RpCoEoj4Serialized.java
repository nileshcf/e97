package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class RpCoEoj4Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:45. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RpCoEoj4Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RpCoEoj4Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RP_CO_EOJ_4_LENGTH = 134;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRpCoEoj4TotalBulk;
	
	/**
	* Constructor for RpCoEoj4Serialized
	**/
    public RpCoEoj4Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in RpCoEoj4Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RP_CO_EOJ_4_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
             beginRpCoEoj4TotalBulk = getStartOffset() + 44;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localRpCoEoj4TotalBulkCounter = -1;
     public boolean isRpCoEoj4TotalBulkModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpCoEoj4TotalBulkCounter != sharedCounter;
         localRpCoEoj4TotalBulkCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_CO_EOJ_4_TOTAL_BULK_LEN = 6;
	/**
	 * 	serialize this RpCoEoj4TotalBulk
	 */
   protected void serializeRpCoEoj4TotalBulk(char[] rpCoEoj4TotalBulk) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpCoEoj4TotalBulk,0,getStringValue(),beginRpCoEoj4TotalBulk,RP_CO_EOJ_4_TOTAL_BULK_LEN);
       localRpCoEoj4TotalBulkCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpCoEoj4TotalBulkConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshRpCoEoj4TotalBulk is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpCoEoj4TotalBulk() {	 
   		return (substring(getStringValue(),beginRpCoEoj4TotalBulk,beginRpCoEoj4TotalBulk + RP_CO_EOJ_4_TOTAL_BULK_LEN));
   	}




}
  
