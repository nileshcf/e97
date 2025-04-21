package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class ASGrp15Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ASGrp15Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ASGrp15Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_SGRP_15_LENGTH = 73;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFillerWs028;
	
	/**
	* Constructor for ASGrp15Serialized
	**/
    public ASGrp15Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in ASGrp15Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_SGRP_15_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFillerWs028 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localFillerWs028Counter = -1;
     public boolean isFillerWs028Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFillerWs028Counter != sharedCounter;
         localFillerWs028Counter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_WS_028_LEN = 3;
	/**
	 * 	serialize this FillerWs028
	 */
   protected void serializeFillerWs028(char[] fillerWs028) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fillerWs028,0,getStringValue(),beginFillerWs028,FILLER_WS_028_LEN);
       localFillerWs028Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFillerWs028Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshFillerWs028 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFillerWs028() {	 
   		return (substring(getStringValue(),beginFillerWs028,beginFillerWs028 + FILLER_WS_028_LEN));
   	}




}
  
