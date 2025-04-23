package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse9bSGrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse9bSGrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse9bSGrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_9B_SGRP_LENGTH = 63;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWseFiller010;
	
	/**
	* Constructor for Wse9bSGrpSerialized
	**/
    public Wse9bSGrpSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Wse9bSGrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_9B_SGRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWseFiller010 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localWseFiller010Counter = -1;
     public boolean isWseFiller010Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWseFiller010Counter != sharedCounter;
         localWseFiller010Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_FILLER_010_LEN = 3;
	/**
	 * 	serialize this WseFiller010
	 */
   protected void serializeWseFiller010(char[] wseFiller010) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wseFiller010,0,getStringValue(),beginWseFiller010,WSE_FILLER_010_LEN);
       localWseFiller010Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWseFiller010Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshWseFiller010 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWseFiller010() {	 
   		return (substring(getStringValue(),beginWseFiller010,beginWseFiller010 + WSE_FILLER_010_LEN));
   	}




}
  
