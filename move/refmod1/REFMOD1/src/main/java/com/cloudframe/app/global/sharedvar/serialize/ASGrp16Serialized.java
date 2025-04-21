package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class ASGrp16Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ASGrp16Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ASGrp16Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_SGRP_16_LENGTH = 73;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFillerWs030;
            protected  int beginAS16;
	
	/**
	* Constructor for ASGrp16Serialized
	**/
    public ASGrp16Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in ASGrp16Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_SGRP_16_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFillerWs030 = getStartOffset() + 0;	// set offset for serialization
  
             beginAS16 = getStartOffset() + 3;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFillerWs030Counter = -1;
     public boolean isFillerWs030Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFillerWs030Counter != sharedCounter;
         localFillerWs030Counter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_WS_030_LEN = 3;
	/**
	 * 	serialize this FillerWs030
	 */
   protected void serializeFillerWs030(char[] fillerWs030) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fillerWs030,0,getStringValue(),beginFillerWs030,FILLER_WS_030_LEN);
       localFillerWs030Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFillerWs030Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshFillerWs030 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFillerWs030() {	 
   		return (substring(getStringValue(),beginFillerWs030,beginFillerWs030 + FILLER_WS_030_LEN));
   	}
     int localAS16Counter = -1;
     public boolean isAS16Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAS16Counter != sharedCounter;
         localAS16Counter = sharedCounter; return hasModified;
     }
	protected static final int A_S_16_LEN = 70;
	/**
	 * 	serialize this AS16
	 */
   protected void serializeAS16(char[] aS16) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aS16,0,getStringValue(),beginAS16,A_S_16_LEN);
       localAS16Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAS16Constraints(char[] value) {
   			return super.checkConstraints(value , 70 ,false, false);
   }
    /**
	 *	refreshAS16 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAS16() {	 
   		return (substring(getStringValue(),beginAS16,beginAS16 + A_S_16_LEN));
   	}




}
  
