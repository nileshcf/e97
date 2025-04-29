package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class BTGrpGroup18Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BTGrpGroup18Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BTGrpGroup18Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_TGRP_GROUP_18_LENGTH = 95;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBTGrpR18;
	
	/**
	* Constructor for BTGrpGroup18Serialized
	**/
    public BTGrpGroup18Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in BTGrpGroup18Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_TGRP_GROUP_18_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginBTGrpR18 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBTGrpR18Counter = -1;
     public boolean isBTGrpR18Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTGrpR18Counter != sharedCounter;
         localBTGrpR18Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TGRP_R_18_LEN = 60;
	/**
	 * 	serialize this BTGrpR18
	 */
   protected void serializeBTGrpR18(char[] bTGrpR18) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTGrpR18,0,getStringValue(),beginBTGrpR18,B_TGRP_R_18_LEN);
       localBTGrpR18Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTGrpR18Constraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshBTGrpR18 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTGrpR18() {	 
   		return (substring(getStringValue(),beginBTGrpR18,beginBTGrpR18 + B_TGRP_R_18_LEN));
   	}




}
  
