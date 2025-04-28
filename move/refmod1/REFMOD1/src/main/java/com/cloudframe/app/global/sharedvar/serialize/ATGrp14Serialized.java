package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class ATGrp14Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ATGrp14Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ATGrp14Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_TGRP_14_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFillerWs025;
	
	/**
	* Constructor for ATGrp14Serialized
	**/
    public ATGrp14Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ATGrp14Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ATGrp14Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ATGrp14Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this ATGrp14Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in ATGrp14Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_TGRP_14_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFillerWs025 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localFillerWs025Counter = -1;
     public boolean isFillerWs025Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFillerWs025Counter != sharedCounter;
         localFillerWs025Counter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_WS_025_LEN = 5;
	/**
	 * 	serialize this FillerWs025
	 */
   protected void serializeFillerWs025(char[] fillerWs025) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fillerWs025,0,getStringValue(),beginFillerWs025,FILLER_WS_025_LEN);
       localFillerWs025Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFillerWs025Constraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshFillerWs025 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFillerWs025() {	 
   		return (substring(getStringValue(),beginFillerWs025,beginFillerWs025 + FILLER_WS_025_LEN));
   	}




}
  
