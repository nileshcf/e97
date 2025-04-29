package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class BTGrpGroup7Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BTGrpGroup7Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BTGrpGroup7Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_TGRP_GROUP_7_LENGTH = 95;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBTGrpR7;
	
	/**
	* Constructor for BTGrpGroup7Serialized
	**/
    public BTGrpGroup7Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in BTGrpGroup7Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_TGRP_GROUP_7_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginBTGrpR7 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBTGrpR7Counter = -1;
     public boolean isBTGrpR7Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTGrpR7Counter != sharedCounter;
         localBTGrpR7Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TGRP_R_7_LEN = 60;
	/**
	 * 	serialize this BTGrpR7
	 */
   protected void serializeBTGrpR7(char[] bTGrpR7) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTGrpR7,0,getStringValue(),beginBTGrpR7,B_TGRP_R_7_LEN);
       localBTGrpR7Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTGrpR7Constraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshBTGrpR7 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTGrpR7() {	 
   		return (substring(getStringValue(),beginBTGrpR7,beginBTGrpR7 + B_TGRP_R_7_LEN));
   	}




}
  
