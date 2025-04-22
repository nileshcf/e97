package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class ATGrpGroup17Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ATGrpGroup17Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ATGrpGroup17Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_TGRP_GROUP_17_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginATGrpR17;
	
	/**
	* Constructor for ATGrpGroup17Serialized
	**/
    public ATGrpGroup17Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in ATGrpGroup17Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_TGRP_GROUP_17_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginATGrpR17 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localATGrpR17Counter = -1;
     public boolean isATGrpR17Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATGrpR17Counter != sharedCounter;
         localATGrpR17Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TGRP_R_17_LEN = 60;
	/**
	 * 	serialize this ATGrpR17
	 */
   protected void serializeATGrpR17(char[] aTGrpR17) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTGrpR17,0,getStringValue(),beginATGrpR17,A_TGRP_R_17_LEN);
       localATGrpR17Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATGrpR17Constraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshATGrpR17 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATGrpR17() {	 
   		return (substring(getStringValue(),beginATGrpR17,beginATGrpR17 + A_TGRP_R_17_LEN));
   	}




}
  
