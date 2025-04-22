package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse15aSGrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse15aSGrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse15aSGrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_15A_SGRP_LENGTH = 63;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWseFiller028;
	
	/**
	* Constructor for Wse15aSGrpSerialized
	**/
    public Wse15aSGrpSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Wse15aSGrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_15A_SGRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWseFiller028 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localWseFiller028Counter = -1;
     public boolean isWseFiller028Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWseFiller028Counter != sharedCounter;
         localWseFiller028Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_FILLER_028_LEN = 3;
	/**
	 * 	serialize this WseFiller028
	 */
   protected void serializeWseFiller028(char[] wseFiller028) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wseFiller028,0,getStringValue(),beginWseFiller028,WSE_FILLER_028_LEN);
       localWseFiller028Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWseFiller028Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshWseFiller028 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWseFiller028() {	 
   		return (substring(getStringValue(),beginWseFiller028,beginWseFiller028 + WSE_FILLER_028_LEN));
   	}




}
  
