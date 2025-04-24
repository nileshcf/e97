package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class ASGrp214Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ASGrp214Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ASGrp214Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_SGRP_214_LENGTH = 73;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAS214;
	
	/**
	* Constructor for ASGrp214Serialized
	**/
    public ASGrp214Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ASGrp214Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_SGRP_214_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginAS214 = getStartOffset() + 3;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localAS214Counter = -1;
     public boolean isAS214Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAS214Counter != sharedCounter;
         localAS214Counter = sharedCounter; return hasModified;
     }
	protected static final int A_S_214_LEN = 70;
	/**
	 * 	serialize this AS214
	 */
   protected void serializeAS214(char[] aS214) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aS214,0,getStringValue(),beginAS214,A_S_214_LEN);
       localAS214Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAS214Constraints(char[] value) {
   			return super.checkConstraints(value , 70 ,false, false);
   }
    /**
	 *	refreshAS214 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAS214() {	 
   		return (substring(getStringValue(),beginAS214,beginAS214 + A_S_214_LEN));
   	}




}
  
