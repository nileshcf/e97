package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class BSGrp10Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BSGrp10Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BSGrp10Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_SGRP_10_LENGTH = 73;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFillerWs014;
            protected  int beginBS10;
	
	/**
	* Constructor for BSGrp10Serialized
	**/
    public BSGrp10Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in BSGrp10Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_SGRP_10_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFillerWs014 = getStartOffset() + 0;	// set offset for serialization
  
             beginBS10 = getStartOffset() + 3;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFillerWs014Counter = -1;
     public boolean isFillerWs014Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFillerWs014Counter != sharedCounter;
         localFillerWs014Counter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_WS_014_LEN = 3;
	/**
	 * 	serialize this FillerWs014
	 */
   protected void serializeFillerWs014(char[] fillerWs014) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fillerWs014,0,getStringValue(),beginFillerWs014,FILLER_WS_014_LEN);
       localFillerWs014Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFillerWs014Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshFillerWs014 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFillerWs014() {	 
   		return (substring(getStringValue(),beginFillerWs014,beginFillerWs014 + FILLER_WS_014_LEN));
   	}
     int localBS10Counter = -1;
     public boolean isBS10Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBS10Counter != sharedCounter;
         localBS10Counter = sharedCounter; return hasModified;
     }
	protected static final int B_S_10_LEN = 70;
	/**
	 * 	serialize this BS10
	 */
   protected void serializeBS10(char[] bS10) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bS10,0,getStringValue(),beginBS10,B_S_10_LEN);
       localBS10Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBS10Constraints(char[] value) {
   			return super.checkConstraints(value , 70 ,false, false);
   }
    /**
	 *	refreshBS10 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBS10() {	 
   		return (substring(getStringValue(),beginBS10,beginBS10 + B_S_10_LEN));
   	}




}
  
