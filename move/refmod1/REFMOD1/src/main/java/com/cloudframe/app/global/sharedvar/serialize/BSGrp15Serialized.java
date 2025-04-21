package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class BSGrp15Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BSGrp15Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BSGrp15Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_SGRP_15_LENGTH = 73;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFillerWs029;
	
	/**
	* Constructor for BSGrp15Serialized
	**/
    public BSGrp15Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in BSGrp15Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_SGRP_15_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFillerWs029 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localFillerWs029Counter = -1;
     public boolean isFillerWs029Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFillerWs029Counter != sharedCounter;
         localFillerWs029Counter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_WS_029_LEN = 3;
	/**
	 * 	serialize this FillerWs029
	 */
   protected void serializeFillerWs029(char[] fillerWs029) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fillerWs029,0,getStringValue(),beginFillerWs029,FILLER_WS_029_LEN);
       localFillerWs029Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFillerWs029Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshFillerWs029 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFillerWs029() {	 
   		return (substring(getStringValue(),beginFillerWs029,beginFillerWs029 + FILLER_WS_029_LEN));
   	}




}
  
