package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class RpCoEoj15Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:34. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RpCoEoj15Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RpCoEoj15Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RP_CO_EOJ_15_LENGTH = 134;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRpCoEoj15TtlOther;
	
	/**
	* Constructor for RpCoEoj15Serialized
	**/
    public RpCoEoj15Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in RpCoEoj15Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RP_CO_EOJ_15_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
             beginRpCoEoj15TtlOther = getStartOffset() + 44;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localRpCoEoj15TtlOtherCounter = -1;
     public boolean isRpCoEoj15TtlOtherModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpCoEoj15TtlOtherCounter != sharedCounter;
         localRpCoEoj15TtlOtherCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_CO_EOJ_15_TTL_OTHER_LEN = 6;
	/**
	 * 	serialize this RpCoEoj15TtlOther
	 */
   protected void serializeRpCoEoj15TtlOther(char[] rpCoEoj15TtlOther) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpCoEoj15TtlOther,0,getStringValue(),beginRpCoEoj15TtlOther,RP_CO_EOJ_15_TTL_OTHER_LEN);
       localRpCoEoj15TtlOtherCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpCoEoj15TtlOtherConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshRpCoEoj15TtlOther is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpCoEoj15TtlOther() {	 
   		return (substring(getStringValue(),beginRpCoEoj15TtlOther,beginRpCoEoj15TtlOther + RP_CO_EOJ_15_TTL_OTHER_LEN));
   	}




}
  
