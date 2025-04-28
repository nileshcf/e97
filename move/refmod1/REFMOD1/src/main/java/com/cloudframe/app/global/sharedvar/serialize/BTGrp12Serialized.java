package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class BTGrp12Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BTGrp12Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BTGrp12Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_TGRP_12_LENGTH = 95;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFillerWs019;
	
	/**
	* Constructor for BTGrp12Serialized
	**/
    public BTGrp12Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for BTGrp12Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BTGrp12Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this BTGrp12Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this BTGrp12Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in BTGrp12Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_TGRP_12_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFillerWs019 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localFillerWs019Counter = -1;
     public boolean isFillerWs019Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFillerWs019Counter != sharedCounter;
         localFillerWs019Counter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_WS_019_LEN = 5;
	/**
	 * 	serialize this FillerWs019
	 */
   protected void serializeFillerWs019(char[] fillerWs019) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fillerWs019,0,getStringValue(),beginFillerWs019,FILLER_WS_019_LEN);
       localFillerWs019Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFillerWs019Constraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshFillerWs019 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFillerWs019() {	 
   		return (substring(getStringValue(),beginFillerWs019,beginFillerWs019 + FILLER_WS_019_LEN));
   	}




}
  
