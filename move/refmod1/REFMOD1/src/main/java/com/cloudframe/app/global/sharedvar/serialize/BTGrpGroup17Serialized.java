package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class BTGrpGroup17Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BTGrpGroup17Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BTGrpGroup17Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_TGRP_GROUP_17_LENGTH = 95;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBTGrpR17;
	
	/**
	* Constructor for BTGrpGroup17Serialized
	**/
    public BTGrpGroup17Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in BTGrpGroup17Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_TGRP_GROUP_17_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginBTGrpR17 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBTGrpR17Counter = -1;
     public boolean isBTGrpR17Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTGrpR17Counter != sharedCounter;
         localBTGrpR17Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TGRP_R_17_LEN = 60;
	/**
	 * 	serialize this BTGrpR17
	 */
   protected void serializeBTGrpR17(char[] bTGrpR17) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTGrpR17,0,getStringValue(),beginBTGrpR17,B_TGRP_R_17_LEN);
       localBTGrpR17Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTGrpR17Constraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshBTGrpR17 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTGrpR17() {	 
   		return (substring(getStringValue(),beginBTGrpR17,beginBTGrpR17 + B_TGRP_R_17_LEN));
   	}




}
  
