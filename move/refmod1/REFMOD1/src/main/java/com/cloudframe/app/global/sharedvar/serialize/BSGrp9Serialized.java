package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class BSGrp9Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BSGrp9Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BSGrp9Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_SGRP_9_LENGTH = 73;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFillerWs010;
	
	/**
	* Constructor for BSGrp9Serialized
	**/
    public BSGrp9Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in BSGrp9Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_SGRP_9_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFillerWs010 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localFillerWs010Counter = -1;
     public boolean isFillerWs010Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFillerWs010Counter != sharedCounter;
         localFillerWs010Counter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_WS_010_LEN = 3;
	/**
	 * 	serialize this FillerWs010
	 */
   protected void serializeFillerWs010(char[] fillerWs010) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fillerWs010,0,getStringValue(),beginFillerWs010,FILLER_WS_010_LEN);
       localFillerWs010Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFillerWs010Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshFillerWs010 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFillerWs010() {	 
   		return (substring(getStringValue(),beginFillerWs010,beginFillerWs010 + FILLER_WS_010_LEN));
   	}




}
  
