package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse5aSGrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse5aSGrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse5aSGrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_5A_SGRP_LENGTH = 63;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWseFiller;
	
	/**
	* Constructor for Wse5aSGrpSerialized
	**/
    public Wse5aSGrpSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Wse5aSGrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_5A_SGRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWseFiller = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localWseFillerCounter = -1;
     public boolean isWseFillerModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWseFillerCounter != sharedCounter;
         localWseFillerCounter = sharedCounter; return hasModified;
     }
	protected static final int WSE_FILLER_LEN = 3;
	/**
	 * 	serialize this WseFiller
	 */
   protected void serializeWseFiller(char[] wseFiller) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wseFiller,0,getStringValue(),beginWseFiller,WSE_FILLER_LEN);
       localWseFillerCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWseFillerConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshWseFiller is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWseFiller() {	 
   		return (substring(getStringValue(),beginWseFiller,beginWseFiller + WSE_FILLER_LEN));
   	}




}
  
