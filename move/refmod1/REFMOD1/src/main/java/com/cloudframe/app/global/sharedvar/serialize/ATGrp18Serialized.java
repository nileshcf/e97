package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class ATGrp18Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ATGrp18Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ATGrp18Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_TGRP_18_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFillerWs034;
	
	/**
	* Constructor for ATGrp18Serialized
	**/
    public ATGrp18Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ATGrp18Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ATGrp18Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ATGrp18Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this ATGrp18Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in ATGrp18Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_TGRP_18_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFillerWs034 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localFillerWs034Counter = -1;
     public boolean isFillerWs034Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFillerWs034Counter != sharedCounter;
         localFillerWs034Counter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_WS_034_LEN = 5;
	/**
	 * 	serialize this FillerWs034
	 */
   protected void serializeFillerWs034(char[] fillerWs034) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fillerWs034,0,getStringValue(),beginFillerWs034,FILLER_WS_034_LEN);
       localFillerWs034Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFillerWs034Constraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshFillerWs034 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFillerWs034() {	 
   		return (substring(getStringValue(),beginFillerWs034,beginFillerWs034 + FILLER_WS_034_LEN));
   	}




}
  
