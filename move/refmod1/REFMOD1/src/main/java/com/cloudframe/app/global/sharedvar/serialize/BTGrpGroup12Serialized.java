package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class BTGrpGroup12Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BTGrpGroup12Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BTGrpGroup12Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_TGRP_GROUP_12_LENGTH = 95;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBTGrpR12;
	
	/**
	* Constructor for BTGrpGroup12Serialized
	**/
    public BTGrpGroup12Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in BTGrpGroup12Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_TGRP_GROUP_12_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginBTGrpR12 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBTGrpR12Counter = -1;
     public boolean isBTGrpR12Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTGrpR12Counter != sharedCounter;
         localBTGrpR12Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TGRP_R_12_LEN = 60;
	/**
	 * 	serialize this BTGrpR12
	 */
   protected void serializeBTGrpR12(char[] bTGrpR12) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTGrpR12,0,getStringValue(),beginBTGrpR12,B_TGRP_R_12_LEN);
       localBTGrpR12Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTGrpR12Constraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshBTGrpR12 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTGrpR12() {	 
   		return (substring(getStringValue(),beginBTGrpR12,beginBTGrpR12 + B_TGRP_R_12_LEN));
   	}




}
  
