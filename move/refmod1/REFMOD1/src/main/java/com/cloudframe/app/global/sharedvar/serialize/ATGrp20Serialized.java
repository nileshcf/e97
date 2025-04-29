package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class ATGrp20Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ATGrp20Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ATGrp20Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_TGRP_20_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFillerWs038;
	
	/**
	* Constructor for ATGrp20Serialized
	**/
    public ATGrp20Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ATGrp20Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ATGrp20Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ATGrp20Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this ATGrp20Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in ATGrp20Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_TGRP_20_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFillerWs038 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localFillerWs038Counter = -1;
     public boolean isFillerWs038Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFillerWs038Counter != sharedCounter;
         localFillerWs038Counter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_WS_038_LEN = 5;
	/**
	 * 	serialize this FillerWs038
	 */
   protected void serializeFillerWs038(char[] fillerWs038) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fillerWs038,0,getStringValue(),beginFillerWs038,FILLER_WS_038_LEN);
       localFillerWs038Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFillerWs038Constraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshFillerWs038 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFillerWs038() {	 
   		return (substring(getStringValue(),beginFillerWs038,beginFillerWs038 + FILLER_WS_038_LEN));
   	}




}
  
