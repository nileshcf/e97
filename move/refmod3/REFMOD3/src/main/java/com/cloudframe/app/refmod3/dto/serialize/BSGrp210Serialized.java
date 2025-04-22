package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class BSGrp210Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:10. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BSGrp210Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BSGrp210Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_SGRP_210_LENGTH = 73;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBS210;
	
	/**
	* Constructor for BSGrp210Serialized
	**/
    public BSGrp210Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in BSGrp210Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_SGRP_210_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBS210 = getStartOffset() + 3;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBS210Counter = -1;
     public boolean isBS210Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBS210Counter != sharedCounter;
         localBS210Counter = sharedCounter; return hasModified;
     }
	protected static final int B_S_210_LEN = 70;
	/**
	 * 	serialize this BS210
	 */
   protected void serializeBS210(char[] bS210) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bS210,0,getStringValue(),beginBS210,B_S_210_LEN);
       localBS210Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBS210Constraints(char[] value) {
   			return super.checkConstraints(value , 70 ,false, false);
   }
    /**
	 *	refreshBS210 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBS210() {	 
   		return (substring(getStringValue(),beginBS210,beginBS210 + B_S_210_LEN));
   	}




}
  
