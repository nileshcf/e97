package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse15bSGrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse15bSGrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse15bSGrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_15B_SGRP_LENGTH = 63;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWseFiller029;
	
	/**
	* Constructor for Wse15bSGrpSerialized
	**/
    public Wse15bSGrpSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Wse15bSGrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_15B_SGRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWseFiller029 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localWseFiller029Counter = -1;
     public boolean isWseFiller029Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWseFiller029Counter != sharedCounter;
         localWseFiller029Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_FILLER_029_LEN = 3;
	/**
	 * 	serialize this WseFiller029
	 */
   protected void serializeWseFiller029(char[] wseFiller029) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wseFiller029,0,getStringValue(),beginWseFiller029,WSE_FILLER_029_LEN);
       localWseFiller029Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWseFiller029Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshWseFiller029 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWseFiller029() {	 
   		return (substring(getStringValue(),beginWseFiller029,beginWseFiller029 + WSE_FILLER_029_LEN));
   	}




}
  
