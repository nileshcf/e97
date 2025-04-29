package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class BSGrp214Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:27. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BSGrp214Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BSGrp214Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_SGRP_214_LENGTH = 73;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBS214;
	
	/**
	* Constructor for BSGrp214Serialized
	**/
    public BSGrp214Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in BSGrp214Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_SGRP_214_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBS214 = getStartOffset() + 3;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBS214Counter = -1;
     public boolean isBS214Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBS214Counter != sharedCounter;
         localBS214Counter = sharedCounter; return hasModified;
     }
	protected static final int B_S_214_LEN = 70;
	/**
	 * 	serialize this BS214
	 */
   protected void serializeBS214(char[] bS214) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bS214,0,getStringValue(),beginBS214,B_S_214_LEN);
       localBS214Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBS214Constraints(char[] value) {
   			return super.checkConstraints(value , 70 ,false, false);
   }
    /**
	 *	refreshBS214 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBS214() {	 
   		return (substring(getStringValue(),beginBS214,beginBS214 + B_S_214_LEN));
   	}




}
  
