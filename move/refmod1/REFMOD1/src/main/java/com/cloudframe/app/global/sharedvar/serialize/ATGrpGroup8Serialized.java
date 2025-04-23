package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class ATGrpGroup8Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ATGrpGroup8Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ATGrpGroup8Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_TGRP_GROUP_8_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginATGrpR8;
	
	/**
	* Constructor for ATGrpGroup8Serialized
	**/
    public ATGrpGroup8Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in ATGrpGroup8Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_TGRP_GROUP_8_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginATGrpR8 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localATGrpR8Counter = -1;
     public boolean isATGrpR8Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATGrpR8Counter != sharedCounter;
         localATGrpR8Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TGRP_R_8_LEN = 60;
	/**
	 * 	serialize this ATGrpR8
	 */
   protected void serializeATGrpR8(char[] aTGrpR8) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTGrpR8,0,getStringValue(),beginATGrpR8,A_TGRP_R_8_LEN);
       localATGrpR8Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATGrpR8Constraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshATGrpR8 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATGrpR8() {	 
   		return (substring(getStringValue(),beginATGrpR8,beginATGrpR8 + A_TGRP_R_8_LEN));
   	}




}
  
