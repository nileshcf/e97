package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class ASGrp13Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ASGrp13Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ASGrp13Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_SGRP_13_LENGTH = 73;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFillerWs020;
	
	/**
	* Constructor for ASGrp13Serialized
	**/
    public ASGrp13Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in ASGrp13Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_SGRP_13_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFillerWs020 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localFillerWs020Counter = -1;
     public boolean isFillerWs020Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFillerWs020Counter != sharedCounter;
         localFillerWs020Counter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_WS_020_LEN = 3;
	/**
	 * 	serialize this FillerWs020
	 */
   protected void serializeFillerWs020(char[] fillerWs020) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fillerWs020,0,getStringValue(),beginFillerWs020,FILLER_WS_020_LEN);
       localFillerWs020Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFillerWs020Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshFillerWs020 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFillerWs020() {	 
   		return (substring(getStringValue(),beginFillerWs020,beginFillerWs020 + FILLER_WS_020_LEN));
   	}




}
  
