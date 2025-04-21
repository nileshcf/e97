package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class ATGrp17Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ATGrp17Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ATGrp17Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_TGRP_17_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFillerWs032;
	
	/**
	* Constructor for ATGrp17Serialized
	**/
    public ATGrp17Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ATGrp17Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ATGrp17Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ATGrp17Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this ATGrp17Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in ATGrp17Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_TGRP_17_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFillerWs032 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localFillerWs032Counter = -1;
     public boolean isFillerWs032Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFillerWs032Counter != sharedCounter;
         localFillerWs032Counter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_WS_032_LEN = 5;
	/**
	 * 	serialize this FillerWs032
	 */
   protected void serializeFillerWs032(char[] fillerWs032) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fillerWs032,0,getStringValue(),beginFillerWs032,FILLER_WS_032_LEN);
       localFillerWs032Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFillerWs032Constraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshFillerWs032 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFillerWs032() {	 
   		return (substring(getStringValue(),beginFillerWs032,beginFillerWs032 + FILLER_WS_032_LEN));
   	}




}
  
