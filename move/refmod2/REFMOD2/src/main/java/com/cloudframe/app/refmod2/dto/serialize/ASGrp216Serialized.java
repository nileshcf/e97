package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class ASGrp216Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:05. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ASGrp216Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ASGrp216Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_SGRP_216_LENGTH = 73;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAS216;
	
	/**
	* Constructor for ASGrp216Serialized
	**/
    public ASGrp216Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ASGrp216Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_SGRP_216_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginAS216 = getStartOffset() + 3;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localAS216Counter = -1;
     public boolean isAS216Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAS216Counter != sharedCounter;
         localAS216Counter = sharedCounter; return hasModified;
     }
	protected static final int A_S_216_LEN = 70;
	/**
	 * 	serialize this AS216
	 */
   protected void serializeAS216(char[] aS216) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aS216,0,getStringValue(),beginAS216,A_S_216_LEN);
       localAS216Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAS216Constraints(char[] value) {
   			return super.checkConstraints(value , 70 ,false, false);
   }
    /**
	 *	refreshAS216 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAS216() {	 
   		return (substring(getStringValue(),beginAS216,beginAS216 + A_S_216_LEN));
   	}




}
  
