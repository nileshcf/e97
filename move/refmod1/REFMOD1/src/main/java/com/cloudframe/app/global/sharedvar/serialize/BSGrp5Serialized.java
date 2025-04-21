package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class BSGrp5Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BSGrp5Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BSGrp5Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_SGRP_5_LENGTH = 73;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFillerWs01;
	
	/**
	* Constructor for BSGrp5Serialized
	**/
    public BSGrp5Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in BSGrp5Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_SGRP_5_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFillerWs01 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localFillerWs01Counter = -1;
     public boolean isFillerWs01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFillerWs01Counter != sharedCounter;
         localFillerWs01Counter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_WS_01_LEN = 3;
	/**
	 * 	serialize this FillerWs01
	 */
   protected void serializeFillerWs01(char[] fillerWs01) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fillerWs01,0,getStringValue(),beginFillerWs01,FILLER_WS_01_LEN);
       localFillerWs01Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFillerWs01Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshFillerWs01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFillerWs01() {	 
   		return (substring(getStringValue(),beginFillerWs01,beginFillerWs01 + FILLER_WS_01_LEN));
   	}




}
  
