package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class BTGrpGroup13Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BTGrpGroup13Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BTGrpGroup13Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_TGRP_GROUP_13_LENGTH = 95;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBTGrpR13;
	
	/**
	* Constructor for BTGrpGroup13Serialized
	**/
    public BTGrpGroup13Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in BTGrpGroup13Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_TGRP_GROUP_13_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginBTGrpR13 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBTGrpR13Counter = -1;
     public boolean isBTGrpR13Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTGrpR13Counter != sharedCounter;
         localBTGrpR13Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TGRP_R_13_LEN = 60;
	/**
	 * 	serialize this BTGrpR13
	 */
   protected void serializeBTGrpR13(char[] bTGrpR13) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTGrpR13,0,getStringValue(),beginBTGrpR13,B_TGRP_R_13_LEN);
       localBTGrpR13Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTGrpR13Constraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshBTGrpR13 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTGrpR13() {	 
   		return (substring(getStringValue(),beginBTGrpR13,beginBTGrpR13 + B_TGRP_R_13_LEN));
   	}




}
  
