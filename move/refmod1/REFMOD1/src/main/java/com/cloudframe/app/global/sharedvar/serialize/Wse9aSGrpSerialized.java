package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse9aSGrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse9aSGrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse9aSGrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_9A_SGRP_LENGTH = 63;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWseFiller08;
	
	/**
	* Constructor for Wse9aSGrpSerialized
	**/
    public Wse9aSGrpSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Wse9aSGrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_9A_SGRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWseFiller08 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localWseFiller08Counter = -1;
     public boolean isWseFiller08Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWseFiller08Counter != sharedCounter;
         localWseFiller08Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_FILLER_08_LEN = 3;
	/**
	 * 	serialize this WseFiller08
	 */
   protected void serializeWseFiller08(char[] wseFiller08) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wseFiller08,0,getStringValue(),beginWseFiller08,WSE_FILLER_08_LEN);
       localWseFiller08Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWseFiller08Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshWseFiller08 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWseFiller08() {	 
   		return (substring(getStringValue(),beginWseFiller08,beginWseFiller08 + WSE_FILLER_08_LEN));
   	}




}
  
