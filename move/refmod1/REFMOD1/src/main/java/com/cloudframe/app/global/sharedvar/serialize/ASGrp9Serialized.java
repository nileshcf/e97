package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class ASGrp9Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ASGrp9Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ASGrp9Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_SGRP_9_LENGTH = 73;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFillerWs08;
	
	/**
	* Constructor for ASGrp9Serialized
	**/
    public ASGrp9Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ASGrp9Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_SGRP_9_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFillerWs08 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localFillerWs08Counter = -1;
     public boolean isFillerWs08Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFillerWs08Counter != sharedCounter;
         localFillerWs08Counter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_WS_08_LEN = 3;
	/**
	 * 	serialize this FillerWs08
	 */
   protected void serializeFillerWs08(char[] fillerWs08) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fillerWs08,0,getStringValue(),beginFillerWs08,FILLER_WS_08_LEN);
       localFillerWs08Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFillerWs08Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshFillerWs08 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFillerWs08() {	 
   		return (substring(getStringValue(),beginFillerWs08,beginFillerWs08 + FILLER_WS_08_LEN));
   	}




}
  
