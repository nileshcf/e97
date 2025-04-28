package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class BTGrpGroup9Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BTGrpGroup9Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BTGrpGroup9Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_TGRP_GROUP_9_LENGTH = 95;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBTGrpR9;
	
	/**
	* Constructor for BTGrpGroup9Serialized
	**/
    public BTGrpGroup9Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in BTGrpGroup9Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_TGRP_GROUP_9_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginBTGrpR9 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBTGrpR9Counter = -1;
     public boolean isBTGrpR9Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTGrpR9Counter != sharedCounter;
         localBTGrpR9Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TGRP_R_9_LEN = 60;
	/**
	 * 	serialize this BTGrpR9
	 */
   protected void serializeBTGrpR9(char[] bTGrpR9) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTGrpR9,0,getStringValue(),beginBTGrpR9,B_TGRP_R_9_LEN);
       localBTGrpR9Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTGrpR9Constraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshBTGrpR9 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTGrpR9() {	 
   		return (substring(getStringValue(),beginBTGrpR9,beginBTGrpR9 + B_TGRP_R_9_LEN));
   	}




}
  
