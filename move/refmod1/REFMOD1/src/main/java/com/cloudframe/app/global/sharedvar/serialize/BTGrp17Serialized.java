package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class BTGrp17Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BTGrp17Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BTGrp17Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_TGRP_17_LENGTH = 95;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFillerWs033;
	
	/**
	* Constructor for BTGrp17Serialized
	**/
    public BTGrp17Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for BTGrp17Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BTGrp17Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this BTGrp17Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this BTGrp17Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in BTGrp17Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_TGRP_17_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFillerWs033 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localFillerWs033Counter = -1;
     public boolean isFillerWs033Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFillerWs033Counter != sharedCounter;
         localFillerWs033Counter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_WS_033_LEN = 5;
	/**
	 * 	serialize this FillerWs033
	 */
   protected void serializeFillerWs033(char[] fillerWs033) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fillerWs033,0,getStringValue(),beginFillerWs033,FILLER_WS_033_LEN);
       localFillerWs033Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFillerWs033Constraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshFillerWs033 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFillerWs033() {	 
   		return (substring(getStringValue(),beginFillerWs033,beginFillerWs033 + FILLER_WS_033_LEN));
   	}




}
  
