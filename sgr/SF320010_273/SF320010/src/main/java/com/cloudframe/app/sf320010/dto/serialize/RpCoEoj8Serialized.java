package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class RpCoEoj8Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:12. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RpCoEoj8Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RpCoEoj8Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RP_CO_EOJ_8_LENGTH = 134;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRpCoEoj8TotalTypeii;
	
	/**
	* Constructor for RpCoEoj8Serialized
	**/
    public RpCoEoj8Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in RpCoEoj8Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RP_CO_EOJ_8_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
             beginRpCoEoj8TotalTypeii = getStartOffset() + 44;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localRpCoEoj8TotalTypeiiCounter = -1;
     public boolean isRpCoEoj8TotalTypeiiModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpCoEoj8TotalTypeiiCounter != sharedCounter;
         localRpCoEoj8TotalTypeiiCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_CO_EOJ_8_TOTAL_TYPEII_LEN = 6;
	/**
	 * 	serialize this RpCoEoj8TotalTypeii
	 */
   protected void serializeRpCoEoj8TotalTypeii(char[] rpCoEoj8TotalTypeii) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpCoEoj8TotalTypeii,0,getStringValue(),beginRpCoEoj8TotalTypeii,RP_CO_EOJ_8_TOTAL_TYPEII_LEN);
       localRpCoEoj8TotalTypeiiCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpCoEoj8TotalTypeiiConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshRpCoEoj8TotalTypeii is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpCoEoj8TotalTypeii() {	 
   		return (substring(getStringValue(),beginRpCoEoj8TotalTypeii,beginRpCoEoj8TotalTypeii + RP_CO_EOJ_8_TOTAL_TYPEII_LEN));
   	}




}
  
