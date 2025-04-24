package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class ASGrp14Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ASGrp14Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ASGrp14Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_SGRP_14_LENGTH = 73;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFillerWs024;
            protected  int beginAS14;
	
	/**
	* Constructor for ASGrp14Serialized
	**/
    public ASGrp14Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ASGrp14Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_SGRP_14_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFillerWs024 = getStartOffset() + 0;	// set offset for serialization
  
             beginAS14 = getStartOffset() + 3;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFillerWs024Counter = -1;
     public boolean isFillerWs024Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFillerWs024Counter != sharedCounter;
         localFillerWs024Counter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_WS_024_LEN = 3;
	/**
	 * 	serialize this FillerWs024
	 */
   protected void serializeFillerWs024(char[] fillerWs024) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fillerWs024,0,getStringValue(),beginFillerWs024,FILLER_WS_024_LEN);
       localFillerWs024Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFillerWs024Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshFillerWs024 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFillerWs024() {	 
   		return (substring(getStringValue(),beginFillerWs024,beginFillerWs024 + FILLER_WS_024_LEN));
   	}
     int localAS14Counter = -1;
     public boolean isAS14Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAS14Counter != sharedCounter;
         localAS14Counter = sharedCounter; return hasModified;
     }
	protected static final int A_S_14_LEN = 70;
	/**
	 * 	serialize this AS14
	 */
   protected void serializeAS14(char[] aS14) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aS14,0,getStringValue(),beginAS14,A_S_14_LEN);
       localAS14Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAS14Constraints(char[] value) {
   			return super.checkConstraints(value , 70 ,false, false);
   }
    /**
	 *	refreshAS14 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAS14() {	 
   		return (substring(getStringValue(),beginAS14,beginAS14 + A_S_14_LEN));
   	}




}
  
