package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse8aTGrpGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse8aTGrpGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse8aTGrpGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_8A_TGRP_GROUP_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse8aTGrpR;
	
	/**
	* Constructor for Wse8aTGrpGroupSerialized
	**/
    public Wse8aTGrpGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Wse8aTGrpGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_8A_TGRP_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginWse8aTGrpR = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse8aTGrpRCounter = -1;
     public boolean isWse8aTGrpRModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse8aTGrpRCounter != sharedCounter;
         localWse8aTGrpRCounter = sharedCounter; return hasModified;
     }
	protected static final int WSE_8A_TGRP_R_LEN = 60;
	/**
	 * 	serialize this Wse8aTGrpR
	 */
   protected void serializeWse8aTGrpR(char[] wse8aTGrpR) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse8aTGrpR,0,getStringValue(),beginWse8aTGrpR,WSE_8A_TGRP_R_LEN);
       localWse8aTGrpRCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse8aTGrpRConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshWse8aTGrpR is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse8aTGrpR() {	 
   		return (substring(getStringValue(),beginWse8aTGrpR,beginWse8aTGrpR + WSE_8A_TGRP_R_LEN));
   	}




}
  
