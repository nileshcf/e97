package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class BTGrpGroup11Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BTGrpGroup11Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BTGrpGroup11Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_TGRP_GROUP_11_LENGTH = 95;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBTGrpR11;
	
	/**
	* Constructor for BTGrpGroup11Serialized
	**/
    public BTGrpGroup11Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in BTGrpGroup11Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_TGRP_GROUP_11_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginBTGrpR11 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBTGrpR11Counter = -1;
     public boolean isBTGrpR11Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTGrpR11Counter != sharedCounter;
         localBTGrpR11Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TGRP_R_11_LEN = 60;
	/**
	 * 	serialize this BTGrpR11
	 */
   protected void serializeBTGrpR11(char[] bTGrpR11) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTGrpR11,0,getStringValue(),beginBTGrpR11,B_TGRP_R_11_LEN);
       localBTGrpR11Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTGrpR11Constraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshBTGrpR11 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTGrpR11() {	 
   		return (substring(getStringValue(),beginBTGrpR11,beginBTGrpR11 + B_TGRP_R_11_LEN));
   	}




}
  
