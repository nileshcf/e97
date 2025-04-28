package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class BTGrpGroup19Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BTGrpGroup19Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BTGrpGroup19Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_TGRP_GROUP_19_LENGTH = 95;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBTGrpR19;
	
	/**
	* Constructor for BTGrpGroup19Serialized
	**/
    public BTGrpGroup19Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in BTGrpGroup19Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_TGRP_GROUP_19_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginBTGrpR19 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBTGrpR19Counter = -1;
     public boolean isBTGrpR19Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTGrpR19Counter != sharedCounter;
         localBTGrpR19Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TGRP_R_19_LEN = 60;
	/**
	 * 	serialize this BTGrpR19
	 */
   protected void serializeBTGrpR19(char[] bTGrpR19) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTGrpR19,0,getStringValue(),beginBTGrpR19,B_TGRP_R_19_LEN);
       localBTGrpR19Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTGrpR19Constraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshBTGrpR19 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTGrpR19() {	 
   		return (substring(getStringValue(),beginBTGrpR19,beginBTGrpR19 + B_TGRP_R_19_LEN));
   	}




}
  
