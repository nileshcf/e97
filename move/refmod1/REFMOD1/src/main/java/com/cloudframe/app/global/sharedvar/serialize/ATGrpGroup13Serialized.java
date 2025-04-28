package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class ATGrpGroup13Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ATGrpGroup13Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ATGrpGroup13Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_TGRP_GROUP_13_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginATGrpR13;
	
	/**
	* Constructor for ATGrpGroup13Serialized
	**/
    public ATGrpGroup13Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ATGrpGroup13Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_TGRP_GROUP_13_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginATGrpR13 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localATGrpR13Counter = -1;
     public boolean isATGrpR13Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATGrpR13Counter != sharedCounter;
         localATGrpR13Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TGRP_R_13_LEN = 60;
	/**
	 * 	serialize this ATGrpR13
	 */
   protected void serializeATGrpR13(char[] aTGrpR13) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTGrpR13,0,getStringValue(),beginATGrpR13,A_TGRP_R_13_LEN);
       localATGrpR13Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATGrpR13Constraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshATGrpR13 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATGrpR13() {	 
   		return (substring(getStringValue(),beginATGrpR13,beginATGrpR13 + A_TGRP_R_13_LEN));
   	}




}
  
