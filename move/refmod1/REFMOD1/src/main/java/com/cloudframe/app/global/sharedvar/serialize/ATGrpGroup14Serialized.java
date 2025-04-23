package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class ATGrpGroup14Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ATGrpGroup14Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ATGrpGroup14Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_TGRP_GROUP_14_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginATGrpR14;
	
	/**
	* Constructor for ATGrpGroup14Serialized
	**/
    public ATGrpGroup14Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in ATGrpGroup14Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_TGRP_GROUP_14_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginATGrpR14 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localATGrpR14Counter = -1;
     public boolean isATGrpR14Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATGrpR14Counter != sharedCounter;
         localATGrpR14Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TGRP_R_14_LEN = 60;
	/**
	 * 	serialize this ATGrpR14
	 */
   protected void serializeATGrpR14(char[] aTGrpR14) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTGrpR14,0,getStringValue(),beginATGrpR14,A_TGRP_R_14_LEN);
       localATGrpR14Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATGrpR14Constraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshATGrpR14 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATGrpR14() {	 
   		return (substring(getStringValue(),beginATGrpR14,beginATGrpR14 + A_TGRP_R_14_LEN));
   	}




}
  
