package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class BTGrp19Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BTGrp19Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BTGrp19Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_TGRP_19_LENGTH = 95;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFillerWs037;
	
	/**
	* Constructor for BTGrp19Serialized
	**/
    public BTGrp19Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for BTGrp19Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BTGrp19Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this BTGrp19Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this BTGrp19Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in BTGrp19Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_TGRP_19_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFillerWs037 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localFillerWs037Counter = -1;
     public boolean isFillerWs037Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFillerWs037Counter != sharedCounter;
         localFillerWs037Counter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_WS_037_LEN = 5;
	/**
	 * 	serialize this FillerWs037
	 */
   protected void serializeFillerWs037(char[] fillerWs037) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fillerWs037,0,getStringValue(),beginFillerWs037,FILLER_WS_037_LEN);
       localFillerWs037Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFillerWs037Constraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshFillerWs037 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFillerWs037() {	 
   		return (substring(getStringValue(),beginFillerWs037,beginFillerWs037 + FILLER_WS_037_LEN));
   	}




}
  
