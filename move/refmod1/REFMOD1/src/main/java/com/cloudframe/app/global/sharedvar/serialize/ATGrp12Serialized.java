package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class ATGrp12Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ATGrp12Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ATGrp12Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_TGRP_12_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFillerWs018;
	
	/**
	* Constructor for ATGrp12Serialized
	**/
    public ATGrp12Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ATGrp12Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ATGrp12Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ATGrp12Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this ATGrp12Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in ATGrp12Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_TGRP_12_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFillerWs018 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localFillerWs018Counter = -1;
     public boolean isFillerWs018Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFillerWs018Counter != sharedCounter;
         localFillerWs018Counter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_WS_018_LEN = 5;
	/**
	 * 	serialize this FillerWs018
	 */
   protected void serializeFillerWs018(char[] fillerWs018) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fillerWs018,0,getStringValue(),beginFillerWs018,FILLER_WS_018_LEN);
       localFillerWs018Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFillerWs018Constraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshFillerWs018 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFillerWs018() {	 
   		return (substring(getStringValue(),beginFillerWs018,beginFillerWs018 + FILLER_WS_018_LEN));
   	}




}
  
