package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class BSGrp14Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BSGrp14Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BSGrp14Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_SGRP_14_LENGTH = 73;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFillerWs026;
            protected  int beginBS14;
	
	/**
	* Constructor for BSGrp14Serialized
	**/
    public BSGrp14Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in BSGrp14Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_SGRP_14_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFillerWs026 = getStartOffset() + 0;	// set offset for serialization
  
             beginBS14 = getStartOffset() + 3;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFillerWs026Counter = -1;
     public boolean isFillerWs026Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFillerWs026Counter != sharedCounter;
         localFillerWs026Counter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_WS_026_LEN = 3;
	/**
	 * 	serialize this FillerWs026
	 */
   protected void serializeFillerWs026(char[] fillerWs026) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fillerWs026,0,getStringValue(),beginFillerWs026,FILLER_WS_026_LEN);
       localFillerWs026Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFillerWs026Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshFillerWs026 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFillerWs026() {	 
   		return (substring(getStringValue(),beginFillerWs026,beginFillerWs026 + FILLER_WS_026_LEN));
   	}
     int localBS14Counter = -1;
     public boolean isBS14Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBS14Counter != sharedCounter;
         localBS14Counter = sharedCounter; return hasModified;
     }
	protected static final int B_S_14_LEN = 70;
	/**
	 * 	serialize this BS14
	 */
   protected void serializeBS14(char[] bS14) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bS14,0,getStringValue(),beginBS14,B_S_14_LEN);
       localBS14Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBS14Constraints(char[] value) {
   			return super.checkConstraints(value , 70 ,false, false);
   }
    /**
	 *	refreshBS14 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBS14() {	 
   		return (substring(getStringValue(),beginBS14,beginBS14 + B_S_14_LEN));
   	}




}
  
