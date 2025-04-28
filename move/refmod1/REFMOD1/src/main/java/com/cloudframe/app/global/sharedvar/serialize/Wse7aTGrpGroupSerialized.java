package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse7aTGrpGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse7aTGrpGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse7aTGrpGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_7A_TGRP_GROUP_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse7aTGrpR;
	
	/**
	* Constructor for Wse7aTGrpGroupSerialized
	**/
    public Wse7aTGrpGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Wse7aTGrpGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_7A_TGRP_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginWse7aTGrpR = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse7aTGrpRCounter = -1;
     public boolean isWse7aTGrpRModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse7aTGrpRCounter != sharedCounter;
         localWse7aTGrpRCounter = sharedCounter; return hasModified;
     }
	protected static final int WSE_7A_TGRP_R_LEN = 60;
	/**
	 * 	serialize this Wse7aTGrpR
	 */
   protected void serializeWse7aTGrpR(char[] wse7aTGrpR) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse7aTGrpR,0,getStringValue(),beginWse7aTGrpR,WSE_7A_TGRP_R_LEN);
       localWse7aTGrpRCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse7aTGrpRConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshWse7aTGrpR is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse7aTGrpR() {	 
   		return (substring(getStringValue(),beginWse7aTGrpR,beginWse7aTGrpR + WSE_7A_TGRP_R_LEN));
   	}




}
  
