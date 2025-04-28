package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class BTGrpGroup10Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BTGrpGroup10Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BTGrpGroup10Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_TGRP_GROUP_10_LENGTH = 95;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBTGrpR10;
	
	/**
	* Constructor for BTGrpGroup10Serialized
	**/
    public BTGrpGroup10Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in BTGrpGroup10Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_TGRP_GROUP_10_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginBTGrpR10 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBTGrpR10Counter = -1;
     public boolean isBTGrpR10Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTGrpR10Counter != sharedCounter;
         localBTGrpR10Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TGRP_R_10_LEN = 60;
	/**
	 * 	serialize this BTGrpR10
	 */
   protected void serializeBTGrpR10(char[] bTGrpR10) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTGrpR10,0,getStringValue(),beginBTGrpR10,B_TGRP_R_10_LEN);
       localBTGrpR10Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTGrpR10Constraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshBTGrpR10 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTGrpR10() {	 
   		return (substring(getStringValue(),beginBTGrpR10,beginBTGrpR10 + B_TGRP_R_10_LEN));
   	}




}
  
