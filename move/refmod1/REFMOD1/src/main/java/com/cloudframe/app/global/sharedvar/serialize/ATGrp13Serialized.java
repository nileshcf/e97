package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class ATGrp13Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ATGrp13Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ATGrp13Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_TGRP_13_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFillerWs021;
	
	/**
	* Constructor for ATGrp13Serialized
	**/
    public ATGrp13Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ATGrp13Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ATGrp13Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ATGrp13Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this ATGrp13Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in ATGrp13Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_TGRP_13_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFillerWs021 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localFillerWs021Counter = -1;
     public boolean isFillerWs021Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFillerWs021Counter != sharedCounter;
         localFillerWs021Counter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_WS_021_LEN = 5;
	/**
	 * 	serialize this FillerWs021
	 */
   protected void serializeFillerWs021(char[] fillerWs021) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fillerWs021,0,getStringValue(),beginFillerWs021,FILLER_WS_021_LEN);
       localFillerWs021Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFillerWs021Constraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshFillerWs021 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFillerWs021() {	 
   		return (substring(getStringValue(),beginFillerWs021,beginFillerWs021 + FILLER_WS_021_LEN));
   	}




}
  
