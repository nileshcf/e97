package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class ATGrpGroup11Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ATGrpGroup11Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ATGrpGroup11Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_TGRP_GROUP_11_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginATGrpR11;
	
	/**
	* Constructor for ATGrpGroup11Serialized
	**/
    public ATGrpGroup11Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in ATGrpGroup11Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_TGRP_GROUP_11_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginATGrpR11 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localATGrpR11Counter = -1;
     public boolean isATGrpR11Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATGrpR11Counter != sharedCounter;
         localATGrpR11Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TGRP_R_11_LEN = 60;
	/**
	 * 	serialize this ATGrpR11
	 */
   protected void serializeATGrpR11(char[] aTGrpR11) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTGrpR11,0,getStringValue(),beginATGrpR11,A_TGRP_R_11_LEN);
       localATGrpR11Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATGrpR11Constraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshATGrpR11 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATGrpR11() {	 
   		return (substring(getStringValue(),beginATGrpR11,beginATGrpR11 + A_TGRP_R_11_LEN));
   	}




}
  
