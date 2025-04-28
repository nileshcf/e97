package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class ATGrpGroup20Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ATGrpGroup20Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ATGrpGroup20Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_TGRP_GROUP_20_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginATGrpR20;
	
	/**
	* Constructor for ATGrpGroup20Serialized
	**/
    public ATGrpGroup20Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in ATGrpGroup20Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_TGRP_GROUP_20_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginATGrpR20 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localATGrpR20Counter = -1;
     public boolean isATGrpR20Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATGrpR20Counter != sharedCounter;
         localATGrpR20Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TGRP_R_20_LEN = 60;
	/**
	 * 	serialize this ATGrpR20
	 */
   protected void serializeATGrpR20(char[] aTGrpR20) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTGrpR20,0,getStringValue(),beginATGrpR20,A_TGRP_R_20_LEN);
       localATGrpR20Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATGrpR20Constraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshATGrpR20 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATGrpR20() {	 
   		return (substring(getStringValue(),beginATGrpR20,beginATGrpR20 + A_TGRP_R_20_LEN));
   	}




}
  
