package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse13bSGrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse13bSGrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse13bSGrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_13B_SGRP_LENGTH = 63;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWseFiller022;
	
	/**
	* Constructor for Wse13bSGrpSerialized
	**/
    public Wse13bSGrpSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Wse13bSGrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_13B_SGRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWseFiller022 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localWseFiller022Counter = -1;
     public boolean isWseFiller022Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWseFiller022Counter != sharedCounter;
         localWseFiller022Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_FILLER_022_LEN = 3;
	/**
	 * 	serialize this WseFiller022
	 */
   protected void serializeWseFiller022(char[] wseFiller022) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wseFiller022,0,getStringValue(),beginWseFiller022,WSE_FILLER_022_LEN);
       localWseFiller022Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWseFiller022Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshWseFiller022 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWseFiller022() {	 
   		return (substring(getStringValue(),beginWseFiller022,beginWseFiller022 + WSE_FILLER_022_LEN));
   	}




}
  
