package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class ATGrpGroup18Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ATGrpGroup18Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ATGrpGroup18Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_TGRP_GROUP_18_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginATGrpR18;
	
	/**
	* Constructor for ATGrpGroup18Serialized
	**/
    public ATGrpGroup18Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in ATGrpGroup18Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_TGRP_GROUP_18_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginATGrpR18 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localATGrpR18Counter = -1;
     public boolean isATGrpR18Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATGrpR18Counter != sharedCounter;
         localATGrpR18Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TGRP_R_18_LEN = 60;
	/**
	 * 	serialize this ATGrpR18
	 */
   protected void serializeATGrpR18(char[] aTGrpR18) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTGrpR18,0,getStringValue(),beginATGrpR18,A_TGRP_R_18_LEN);
       localATGrpR18Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATGrpR18Constraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshATGrpR18 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATGrpR18() {	 
   		return (substring(getStringValue(),beginATGrpR18,beginATGrpR18 + A_TGRP_R_18_LEN));
   	}




}
  
