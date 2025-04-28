package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class BTGrpGroup8Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BTGrpGroup8Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BTGrpGroup8Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_TGRP_GROUP_8_LENGTH = 95;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBTGrpR8;
	
	/**
	* Constructor for BTGrpGroup8Serialized
	**/
    public BTGrpGroup8Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in BTGrpGroup8Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_TGRP_GROUP_8_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginBTGrpR8 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBTGrpR8Counter = -1;
     public boolean isBTGrpR8Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTGrpR8Counter != sharedCounter;
         localBTGrpR8Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TGRP_R_8_LEN = 60;
	/**
	 * 	serialize this BTGrpR8
	 */
   protected void serializeBTGrpR8(char[] bTGrpR8) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTGrpR8,0,getStringValue(),beginBTGrpR8,B_TGRP_R_8_LEN);
       localBTGrpR8Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTGrpR8Constraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshBTGrpR8 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTGrpR8() {	 
   		return (substring(getStringValue(),beginBTGrpR8,beginBTGrpR8 + B_TGRP_R_8_LEN));
   	}




}
  
