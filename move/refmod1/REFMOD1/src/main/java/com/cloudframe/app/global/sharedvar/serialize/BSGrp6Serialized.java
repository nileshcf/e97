package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class BSGrp6Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BSGrp6Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BSGrp6Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_SGRP_6_LENGTH = 73;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFillerWs03;
            protected  int beginBS6;
	
	/**
	* Constructor for BSGrp6Serialized
	**/
    public BSGrp6Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in BSGrp6Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_SGRP_6_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFillerWs03 = getStartOffset() + 0;	// set offset for serialization
  
             beginBS6 = getStartOffset() + 3;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFillerWs03Counter = -1;
     public boolean isFillerWs03Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFillerWs03Counter != sharedCounter;
         localFillerWs03Counter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_WS_03_LEN = 3;
	/**
	 * 	serialize this FillerWs03
	 */
   protected void serializeFillerWs03(char[] fillerWs03) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fillerWs03,0,getStringValue(),beginFillerWs03,FILLER_WS_03_LEN);
       localFillerWs03Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFillerWs03Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshFillerWs03 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFillerWs03() {	 
   		return (substring(getStringValue(),beginFillerWs03,beginFillerWs03 + FILLER_WS_03_LEN));
   	}
     int localBS6Counter = -1;
     public boolean isBS6Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBS6Counter != sharedCounter;
         localBS6Counter = sharedCounter; return hasModified;
     }
	protected static final int B_S_6_LEN = 70;
	/**
	 * 	serialize this BS6
	 */
   protected void serializeBS6(char[] bS6) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bS6,0,getStringValue(),beginBS6,B_S_6_LEN);
       localBS6Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBS6Constraints(char[] value) {
   			return super.checkConstraints(value , 70 ,false, false);
   }
    /**
	 *	refreshBS6 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBS6() {	 
   		return (substring(getStringValue(),beginBS6,beginBS6 + B_S_6_LEN));
   	}




}
  
