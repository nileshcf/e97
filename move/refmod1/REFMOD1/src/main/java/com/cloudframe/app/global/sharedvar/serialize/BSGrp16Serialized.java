package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class BSGrp16Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BSGrp16Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BSGrp16Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_SGRP_16_LENGTH = 73;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFillerWs031;
            protected  int beginBS16;
	
	/**
	* Constructor for BSGrp16Serialized
	**/
    public BSGrp16Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in BSGrp16Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_SGRP_16_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFillerWs031 = getStartOffset() + 0;	// set offset for serialization
  
             beginBS16 = getStartOffset() + 3;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFillerWs031Counter = -1;
     public boolean isFillerWs031Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFillerWs031Counter != sharedCounter;
         localFillerWs031Counter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_WS_031_LEN = 3;
	/**
	 * 	serialize this FillerWs031
	 */
   protected void serializeFillerWs031(char[] fillerWs031) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fillerWs031,0,getStringValue(),beginFillerWs031,FILLER_WS_031_LEN);
       localFillerWs031Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFillerWs031Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshFillerWs031 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFillerWs031() {	 
   		return (substring(getStringValue(),beginFillerWs031,beginFillerWs031 + FILLER_WS_031_LEN));
   	}
     int localBS16Counter = -1;
     public boolean isBS16Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBS16Counter != sharedCounter;
         localBS16Counter = sharedCounter; return hasModified;
     }
	protected static final int B_S_16_LEN = 70;
	/**
	 * 	serialize this BS16
	 */
   protected void serializeBS16(char[] bS16) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bS16,0,getStringValue(),beginBS16,B_S_16_LEN);
       localBS16Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBS16Constraints(char[] value) {
   			return super.checkConstraints(value , 70 ,false, false);
   }
    /**
	 *	refreshBS16 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBS16() {	 
   		return (substring(getStringValue(),beginBS16,beginBS16 + B_S_16_LEN));
   	}




}
  
