package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse20cSGrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse20cSGrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse20cSGrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_20C_SGRP_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWseFiller040;
	
	/**
	* Constructor for Wse20cSGrpSerialized
	**/
    public Wse20cSGrpSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Wse20cSGrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_20C_SGRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWseFiller040 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localWseFiller040Counter = -1;
     public boolean isWseFiller040Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWseFiller040Counter != sharedCounter;
         localWseFiller040Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_FILLER_040_LEN = 5;
	/**
	 * 	serialize this WseFiller040
	 */
   protected void serializeWseFiller040(char[] wseFiller040) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wseFiller040,0,getStringValue(),beginWseFiller040,WSE_FILLER_040_LEN);
       localWseFiller040Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWseFiller040Constraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshWseFiller040 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWseFiller040() {	 
   		return (substring(getStringValue(),beginWseFiller040,beginWseFiller040 + WSE_FILLER_040_LEN));
   	}




}
  
