package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class BSGrp216Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:00. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BSGrp216Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BSGrp216Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_SGRP_216_LENGTH = 73;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBS216;
	
	/**
	* Constructor for BSGrp216Serialized
	**/
    public BSGrp216Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in BSGrp216Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_SGRP_216_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBS216 = getStartOffset() + 3;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBS216Counter = -1;
     public boolean isBS216Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBS216Counter != sharedCounter;
         localBS216Counter = sharedCounter; return hasModified;
     }
	protected static final int B_S_216_LEN = 70;
	/**
	 * 	serialize this BS216
	 */
   protected void serializeBS216(char[] bS216) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bS216,0,getStringValue(),beginBS216,B_S_216_LEN);
       localBS216Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBS216Constraints(char[] value) {
   			return super.checkConstraints(value , 70 ,false, false);
   }
    /**
	 *	refreshBS216 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBS216() {	 
   		return (substring(getStringValue(),beginBS216,beginBS216 + B_S_216_LEN));
   	}




}
  
