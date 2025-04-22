package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class RpCoEoj13Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:20. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RpCoEoj13Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RpCoEoj13Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RP_CO_EOJ_13_LENGTH = 134;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRpCoEoj13TotalChk;
	
	/**
	* Constructor for RpCoEoj13Serialized
	**/
    public RpCoEoj13Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in RpCoEoj13Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RP_CO_EOJ_13_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
             beginRpCoEoj13TotalChk = getStartOffset() + 44;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localRpCoEoj13TotalChkCounter = -1;
     public boolean isRpCoEoj13TotalChkModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpCoEoj13TotalChkCounter != sharedCounter;
         localRpCoEoj13TotalChkCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_CO_EOJ_13_TOTAL_CHK_LEN = 6;
	/**
	 * 	serialize this RpCoEoj13TotalChk
	 */
   protected void serializeRpCoEoj13TotalChk(char[] rpCoEoj13TotalChk) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpCoEoj13TotalChk,0,getStringValue(),beginRpCoEoj13TotalChk,RP_CO_EOJ_13_TOTAL_CHK_LEN);
       localRpCoEoj13TotalChkCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpCoEoj13TotalChkConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshRpCoEoj13TotalChk is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpCoEoj13TotalChk() {	 
   		return (substring(getStringValue(),beginRpCoEoj13TotalChk,beginRpCoEoj13TotalChk + RP_CO_EOJ_13_TOTAL_CHK_LEN));
   	}




}
  
