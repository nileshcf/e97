package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class ATGrpGroup19Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ATGrpGroup19Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ATGrpGroup19Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_TGRP_GROUP_19_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginATGrpR19;
	
	/**
	* Constructor for ATGrpGroup19Serialized
	**/
    public ATGrpGroup19Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in ATGrpGroup19Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_TGRP_GROUP_19_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginATGrpR19 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localATGrpR19Counter = -1;
     public boolean isATGrpR19Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATGrpR19Counter != sharedCounter;
         localATGrpR19Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TGRP_R_19_LEN = 60;
	/**
	 * 	serialize this ATGrpR19
	 */
   protected void serializeATGrpR19(char[] aTGrpR19) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTGrpR19,0,getStringValue(),beginATGrpR19,A_TGRP_R_19_LEN);
       localATGrpR19Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATGrpR19Constraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshATGrpR19 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATGrpR19() {	 
   		return (substring(getStringValue(),beginATGrpR19,beginATGrpR19 + A_TGRP_R_19_LEN));
   	}




}
  
