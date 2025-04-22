package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse5bSGrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse5bSGrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse5bSGrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_5B_SGRP_LENGTH = 63;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWseFiller01;
	
	/**
	* Constructor for Wse5bSGrpSerialized
	**/
    public Wse5bSGrpSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Wse5bSGrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_5B_SGRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWseFiller01 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localWseFiller01Counter = -1;
     public boolean isWseFiller01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWseFiller01Counter != sharedCounter;
         localWseFiller01Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_FILLER_01_LEN = 3;
	/**
	 * 	serialize this WseFiller01
	 */
   protected void serializeWseFiller01(char[] wseFiller01) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wseFiller01,0,getStringValue(),beginWseFiller01,WSE_FILLER_01_LEN);
       localWseFiller01Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWseFiller01Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshWseFiller01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWseFiller01() {	 
   		return (substring(getStringValue(),beginWseFiller01,beginWseFiller01 + WSE_FILLER_01_LEN));
   	}




}
  
