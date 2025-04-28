package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class BTGrp8Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BTGrp8Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BTGrp8Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_TGRP_8_LENGTH = 95;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFillerWs07;
	
	/**
	* Constructor for BTGrp8Serialized
	**/
    public BTGrp8Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for BTGrp8Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BTGrp8Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this BTGrp8Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this BTGrp8Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in BTGrp8Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_TGRP_8_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFillerWs07 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localFillerWs07Counter = -1;
     public boolean isFillerWs07Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFillerWs07Counter != sharedCounter;
         localFillerWs07Counter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_WS_07_LEN = 5;
	/**
	 * 	serialize this FillerWs07
	 */
   protected void serializeFillerWs07(char[] fillerWs07) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fillerWs07,0,getStringValue(),beginFillerWs07,FILLER_WS_07_LEN);
       localFillerWs07Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFillerWs07Constraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshFillerWs07 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFillerWs07() {	 
   		return (substring(getStringValue(),beginFillerWs07,beginFillerWs07 + FILLER_WS_07_LEN));
   	}




}
  
