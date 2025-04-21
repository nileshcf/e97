package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class ATGrpGroup12Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ATGrpGroup12Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ATGrpGroup12Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_TGRP_GROUP_12_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginATGrpR12;
	
	/**
	* Constructor for ATGrpGroup12Serialized
	**/
    public ATGrpGroup12Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in ATGrpGroup12Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_TGRP_GROUP_12_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginATGrpR12 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localATGrpR12Counter = -1;
     public boolean isATGrpR12Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATGrpR12Counter != sharedCounter;
         localATGrpR12Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TGRP_R_12_LEN = 60;
	/**
	 * 	serialize this ATGrpR12
	 */
   protected void serializeATGrpR12(char[] aTGrpR12) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTGrpR12,0,getStringValue(),beginATGrpR12,A_TGRP_R_12_LEN);
       localATGrpR12Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATGrpR12Constraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshATGrpR12 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATGrpR12() {	 
   		return (substring(getStringValue(),beginATGrpR12,beginATGrpR12 + A_TGRP_R_12_LEN));
   	}




}
  
