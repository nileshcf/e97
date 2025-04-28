package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class BTGrpGroup20Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BTGrpGroup20Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BTGrpGroup20Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_TGRP_GROUP_20_LENGTH = 95;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBTGrpR20;
	
	/**
	* Constructor for BTGrpGroup20Serialized
	**/
    public BTGrpGroup20Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in BTGrpGroup20Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_TGRP_GROUP_20_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginBTGrpR20 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBTGrpR20Counter = -1;
     public boolean isBTGrpR20Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTGrpR20Counter != sharedCounter;
         localBTGrpR20Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TGRP_R_20_LEN = 60;
	/**
	 * 	serialize this BTGrpR20
	 */
   protected void serializeBTGrpR20(char[] bTGrpR20) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTGrpR20,0,getStringValue(),beginBTGrpR20,B_TGRP_R_20_LEN);
       localBTGrpR20Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTGrpR20Constraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshBTGrpR20 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTGrpR20() {	 
   		return (substring(getStringValue(),beginBTGrpR20,beginBTGrpR20 + B_TGRP_R_20_LEN));
   	}




}
  
