package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class ATGrpGroup10Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ATGrpGroup10Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ATGrpGroup10Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_TGRP_GROUP_10_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginATGrpR10;
	
	/**
	* Constructor for ATGrpGroup10Serialized
	**/
    public ATGrpGroup10Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in ATGrpGroup10Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_TGRP_GROUP_10_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginATGrpR10 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localATGrpR10Counter = -1;
     public boolean isATGrpR10Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATGrpR10Counter != sharedCounter;
         localATGrpR10Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TGRP_R_10_LEN = 60;
	/**
	 * 	serialize this ATGrpR10
	 */
   protected void serializeATGrpR10(char[] aTGrpR10) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTGrpR10,0,getStringValue(),beginATGrpR10,A_TGRP_R_10_LEN);
       localATGrpR10Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATGrpR10Constraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshATGrpR10 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATGrpR10() {	 
   		return (substring(getStringValue(),beginATGrpR10,beginATGrpR10 + A_TGRP_R_10_LEN));
   	}




}
  
