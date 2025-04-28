package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class BTGrp13Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BTGrp13Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BTGrp13Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_TGRP_13_LENGTH = 95;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFillerWs023;
	
	/**
	* Constructor for BTGrp13Serialized
	**/
    public BTGrp13Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for BTGrp13Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BTGrp13Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this BTGrp13Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this BTGrp13Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in BTGrp13Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_TGRP_13_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFillerWs023 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localFillerWs023Counter = -1;
     public boolean isFillerWs023Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFillerWs023Counter != sharedCounter;
         localFillerWs023Counter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_WS_023_LEN = 5;
	/**
	 * 	serialize this FillerWs023
	 */
   protected void serializeFillerWs023(char[] fillerWs023) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fillerWs023,0,getStringValue(),beginFillerWs023,FILLER_WS_023_LEN);
       localFillerWs023Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFillerWs023Constraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshFillerWs023 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFillerWs023() {	 
   		return (substring(getStringValue(),beginFillerWs023,beginFillerWs023 + FILLER_WS_023_LEN));
   	}




}
  
