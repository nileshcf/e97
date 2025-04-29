package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse14aTGrpGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse14aTGrpGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse14aTGrpGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_14A_TGRP_GROUP_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse14aTGrpR;
	
	/**
	* Constructor for Wse14aTGrpGroupSerialized
	**/
    public Wse14aTGrpGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Wse14aTGrpGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_14A_TGRP_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginWse14aTGrpR = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse14aTGrpRCounter = -1;
     public boolean isWse14aTGrpRModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse14aTGrpRCounter != sharedCounter;
         localWse14aTGrpRCounter = sharedCounter; return hasModified;
     }
	protected static final int WSE_14A_TGRP_R_LEN = 60;
	/**
	 * 	serialize this Wse14aTGrpR
	 */
   protected void serializeWse14aTGrpR(char[] wse14aTGrpR) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse14aTGrpR,0,getStringValue(),beginWse14aTGrpR,WSE_14A_TGRP_R_LEN);
       localWse14aTGrpRCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse14aTGrpRConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshWse14aTGrpR is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse14aTGrpR() {	 
   		return (substring(getStringValue(),beginWse14aTGrpR,beginWse14aTGrpR + WSE_14A_TGRP_R_LEN));
   	}




}
  
