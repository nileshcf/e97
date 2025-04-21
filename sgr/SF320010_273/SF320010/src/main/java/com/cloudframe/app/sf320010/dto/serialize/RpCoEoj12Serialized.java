package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class RpCoEoj12Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:08. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RpCoEoj12Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RpCoEoj12Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RP_CO_EOJ_12_LENGTH = 134;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRpCoEoj12TotalEdc;
	
	/**
	* Constructor for RpCoEoj12Serialized
	**/
    public RpCoEoj12Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in RpCoEoj12Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RP_CO_EOJ_12_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
             beginRpCoEoj12TotalEdc = getStartOffset() + 44;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localRpCoEoj12TotalEdcCounter = -1;
     public boolean isRpCoEoj12TotalEdcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpCoEoj12TotalEdcCounter != sharedCounter;
         localRpCoEoj12TotalEdcCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_CO_EOJ_12_TOTAL_EDC_LEN = 6;
	/**
	 * 	serialize this RpCoEoj12TotalEdc
	 */
   protected void serializeRpCoEoj12TotalEdc(char[] rpCoEoj12TotalEdc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpCoEoj12TotalEdc,0,getStringValue(),beginRpCoEoj12TotalEdc,RP_CO_EOJ_12_TOTAL_EDC_LEN);
       localRpCoEoj12TotalEdcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpCoEoj12TotalEdcConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshRpCoEoj12TotalEdc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpCoEoj12TotalEdc() {	 
   		return (substring(getStringValue(),beginRpCoEoj12TotalEdc,beginRpCoEoj12TotalEdc + RP_CO_EOJ_12_TOTAL_EDC_LEN));
   	}




}
  
