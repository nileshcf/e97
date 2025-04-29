package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class ASGrp6Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ASGrp6Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ASGrp6Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_SGRP_6_LENGTH = 73;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFillerWs02;
            protected  int beginAS6;
	
	/**
	* Constructor for ASGrp6Serialized
	**/
    public ASGrp6Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in ASGrp6Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_SGRP_6_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFillerWs02 = getStartOffset() + 0;	// set offset for serialization
  
             beginAS6 = getStartOffset() + 3;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFillerWs02Counter = -1;
     public boolean isFillerWs02Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFillerWs02Counter != sharedCounter;
         localFillerWs02Counter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_WS_02_LEN = 3;
	/**
	 * 	serialize this FillerWs02
	 */
   protected void serializeFillerWs02(char[] fillerWs02) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fillerWs02,0,getStringValue(),beginFillerWs02,FILLER_WS_02_LEN);
       localFillerWs02Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFillerWs02Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshFillerWs02 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFillerWs02() {	 
   		return (substring(getStringValue(),beginFillerWs02,beginFillerWs02 + FILLER_WS_02_LEN));
   	}
     int localAS6Counter = -1;
     public boolean isAS6Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAS6Counter != sharedCounter;
         localAS6Counter = sharedCounter; return hasModified;
     }
	protected static final int A_S_6_LEN = 70;
	/**
	 * 	serialize this AS6
	 */
   protected void serializeAS6(char[] aS6) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aS6,0,getStringValue(),beginAS6,A_S_6_LEN);
       localAS6Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAS6Constraints(char[] value) {
   			return super.checkConstraints(value , 70 ,false, false);
   }
    /**
	 *	refreshAS6 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAS6() {	 
   		return (substring(getStringValue(),beginAS6,beginAS6 + A_S_6_LEN));
   	}




}
  
