package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse13aSGrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse13aSGrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse13aSGrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_13A_SGRP_LENGTH = 63;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWseFiller020;
	
	/**
	* Constructor for Wse13aSGrpSerialized
	**/
    public Wse13aSGrpSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Wse13aSGrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_13A_SGRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWseFiller020 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localWseFiller020Counter = -1;
     public boolean isWseFiller020Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWseFiller020Counter != sharedCounter;
         localWseFiller020Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_FILLER_020_LEN = 3;
	/**
	 * 	serialize this WseFiller020
	 */
   protected void serializeWseFiller020(char[] wseFiller020) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wseFiller020,0,getStringValue(),beginWseFiller020,WSE_FILLER_020_LEN);
       localWseFiller020Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWseFiller020Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshWseFiller020 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWseFiller020() {	 
   		return (substring(getStringValue(),beginWseFiller020,beginWseFiller020 + WSE_FILLER_020_LEN));
   	}




}
  
