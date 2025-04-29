package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class ATGrpGroup9Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ATGrpGroup9Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ATGrpGroup9Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_TGRP_GROUP_9_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginATGrpR9;
	
	/**
	* Constructor for ATGrpGroup9Serialized
	**/
    public ATGrpGroup9Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in ATGrpGroup9Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_TGRP_GROUP_9_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginATGrpR9 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localATGrpR9Counter = -1;
     public boolean isATGrpR9Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATGrpR9Counter != sharedCounter;
         localATGrpR9Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TGRP_R_9_LEN = 60;
	/**
	 * 	serialize this ATGrpR9
	 */
   protected void serializeATGrpR9(char[] aTGrpR9) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTGrpR9,0,getStringValue(),beginATGrpR9,A_TGRP_R_9_LEN);
       localATGrpR9Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATGrpR9Constraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshATGrpR9 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATGrpR9() {	 
   		return (substring(getStringValue(),beginATGrpR9,beginATGrpR9 + A_TGRP_R_9_LEN));
   	}




}
  
