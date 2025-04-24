package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class BTGrp11Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BTGrp11Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BTGrp11Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_TGRP_11_LENGTH = 95;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFillerWs017;
	
	/**
	* Constructor for BTGrp11Serialized
	**/
    public BTGrp11Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for BTGrp11Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BTGrp11Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this BTGrp11Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this BTGrp11Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in BTGrp11Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_TGRP_11_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFillerWs017 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localFillerWs017Counter = -1;
     public boolean isFillerWs017Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFillerWs017Counter != sharedCounter;
         localFillerWs017Counter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_WS_017_LEN = 5;
	/**
	 * 	serialize this FillerWs017
	 */
   protected void serializeFillerWs017(char[] fillerWs017) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fillerWs017,0,getStringValue(),beginFillerWs017,FILLER_WS_017_LEN);
       localFillerWs017Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFillerWs017Constraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshFillerWs017 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFillerWs017() {	 
   		return (substring(getStringValue(),beginFillerWs017,beginFillerWs017 + FILLER_WS_017_LEN));
   	}




}
  
