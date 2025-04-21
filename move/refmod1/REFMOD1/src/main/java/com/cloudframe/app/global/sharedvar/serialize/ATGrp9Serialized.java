package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class ATGrp9Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ATGrp9Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ATGrp9Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_TGRP_9_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFillerWs09;
	
	/**
	* Constructor for ATGrp9Serialized
	**/
    public ATGrp9Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ATGrp9Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ATGrp9Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ATGrp9Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this ATGrp9Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in ATGrp9Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_TGRP_9_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFillerWs09 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localFillerWs09Counter = -1;
     public boolean isFillerWs09Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFillerWs09Counter != sharedCounter;
         localFillerWs09Counter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_WS_09_LEN = 5;
	/**
	 * 	serialize this FillerWs09
	 */
   protected void serializeFillerWs09(char[] fillerWs09) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fillerWs09,0,getStringValue(),beginFillerWs09,FILLER_WS_09_LEN);
       localFillerWs09Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFillerWs09Constraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshFillerWs09 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFillerWs09() {	 
   		return (substring(getStringValue(),beginFillerWs09,beginFillerWs09 + FILLER_WS_09_LEN));
   	}




}
  
