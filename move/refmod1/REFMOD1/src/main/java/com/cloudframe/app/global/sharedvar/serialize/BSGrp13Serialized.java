package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class BSGrp13Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BSGrp13Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BSGrp13Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_SGRP_13_LENGTH = 73;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFillerWs022;
	
	/**
	* Constructor for BSGrp13Serialized
	**/
    public BSGrp13Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in BSGrp13Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_SGRP_13_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFillerWs022 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localFillerWs022Counter = -1;
     public boolean isFillerWs022Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFillerWs022Counter != sharedCounter;
         localFillerWs022Counter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_WS_022_LEN = 3;
	/**
	 * 	serialize this FillerWs022
	 */
   protected void serializeFillerWs022(char[] fillerWs022) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fillerWs022,0,getStringValue(),beginFillerWs022,FILLER_WS_022_LEN);
       localFillerWs022Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFillerWs022Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshFillerWs022 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFillerWs022() {	 
   		return (substring(getStringValue(),beginFillerWs022,beginFillerWs022 + FILLER_WS_022_LEN));
   	}




}
  
