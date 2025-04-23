package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class ASGrp5Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ASGrp5Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ASGrp5Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_SGRP_5_LENGTH = 73;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFillerWs;
	
	/**
	* Constructor for ASGrp5Serialized
	**/
    public ASGrp5Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in ASGrp5Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_SGRP_5_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFillerWs = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localFillerWsCounter = -1;
     public boolean isFillerWsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFillerWsCounter != sharedCounter;
         localFillerWsCounter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_WS_LEN = 3;
	/**
	 * 	serialize this FillerWs
	 */
   protected void serializeFillerWs(char[] fillerWs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fillerWs,0,getStringValue(),beginFillerWs,FILLER_WS_LEN);
       localFillerWsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFillerWsConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshFillerWs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFillerWs() {	 
   		return (substring(getStringValue(),beginFillerWs,beginFillerWs + FILLER_WS_LEN));
   	}




}
  
