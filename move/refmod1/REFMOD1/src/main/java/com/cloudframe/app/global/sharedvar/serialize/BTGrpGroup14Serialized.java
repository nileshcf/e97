package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class BTGrpGroup14Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BTGrpGroup14Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BTGrpGroup14Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_TGRP_GROUP_14_LENGTH = 95;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBTGrpR14;
	
	/**
	* Constructor for BTGrpGroup14Serialized
	**/
    public BTGrpGroup14Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in BTGrpGroup14Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_TGRP_GROUP_14_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginBTGrpR14 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBTGrpR14Counter = -1;
     public boolean isBTGrpR14Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTGrpR14Counter != sharedCounter;
         localBTGrpR14Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TGRP_R_14_LEN = 60;
	/**
	 * 	serialize this BTGrpR14
	 */
   protected void serializeBTGrpR14(char[] bTGrpR14) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTGrpR14,0,getStringValue(),beginBTGrpR14,B_TGRP_R_14_LEN);
       localBTGrpR14Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTGrpR14Constraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshBTGrpR14 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTGrpR14() {	 
   		return (substring(getStringValue(),beginBTGrpR14,beginBTGrpR14 + B_TGRP_R_14_LEN));
   	}




}
  
