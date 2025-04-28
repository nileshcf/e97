package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class BSGrp26Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:02. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BSGrp26Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BSGrp26Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_SGRP_26_LENGTH = 73;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBS26;
	
	/**
	* Constructor for BSGrp26Serialized
	**/
    public BSGrp26Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in BSGrp26Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_SGRP_26_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBS26 = getStartOffset() + 3;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBS26Counter = -1;
     public boolean isBS26Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBS26Counter != sharedCounter;
         localBS26Counter = sharedCounter; return hasModified;
     }
	protected static final int B_S_26_LEN = 70;
	/**
	 * 	serialize this BS26
	 */
   protected void serializeBS26(char[] bS26) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bS26,0,getStringValue(),beginBS26,B_S_26_LEN);
       localBS26Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBS26Constraints(char[] value) {
   			return super.checkConstraints(value , 70 ,false, false);
   }
    /**
	 *	refreshBS26 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBS26() {	 
   		return (substring(getStringValue(),beginBS26,beginBS26 + B_S_26_LEN));
   	}




}
  
