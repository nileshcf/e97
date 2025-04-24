package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class BTGrp14Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BTGrp14Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BTGrp14Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_TGRP_14_LENGTH = 95;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFillerWs027;
	
	/**
	* Constructor for BTGrp14Serialized
	**/
    public BTGrp14Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for BTGrp14Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BTGrp14Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this BTGrp14Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this BTGrp14Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in BTGrp14Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_TGRP_14_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFillerWs027 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localFillerWs027Counter = -1;
     public boolean isFillerWs027Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFillerWs027Counter != sharedCounter;
         localFillerWs027Counter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_WS_027_LEN = 5;
	/**
	 * 	serialize this FillerWs027
	 */
   protected void serializeFillerWs027(char[] fillerWs027) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fillerWs027,0,getStringValue(),beginFillerWs027,FILLER_WS_027_LEN);
       localFillerWs027Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFillerWs027Constraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshFillerWs027 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFillerWs027() {	 
   		return (substring(getStringValue(),beginFillerWs027,beginFillerWs027 + FILLER_WS_027_LEN));
   	}




}
  
