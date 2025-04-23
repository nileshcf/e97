package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse9aTGrpGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse9aTGrpGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse9aTGrpGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_9A_TGRP_GROUP_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse9aTGrpR;
	
	/**
	* Constructor for Wse9aTGrpGroupSerialized
	**/
    public Wse9aTGrpGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Wse9aTGrpGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_9A_TGRP_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginWse9aTGrpR = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse9aTGrpRCounter = -1;
     public boolean isWse9aTGrpRModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse9aTGrpRCounter != sharedCounter;
         localWse9aTGrpRCounter = sharedCounter; return hasModified;
     }
	protected static final int WSE_9A_TGRP_R_LEN = 60;
	/**
	 * 	serialize this Wse9aTGrpR
	 */
   protected void serializeWse9aTGrpR(char[] wse9aTGrpR) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse9aTGrpR,0,getStringValue(),beginWse9aTGrpR,WSE_9A_TGRP_R_LEN);
       localWse9aTGrpRCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse9aTGrpRConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshWse9aTGrpR is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse9aTGrpR() {	 
   		return (substring(getStringValue(),beginWse9aTGrpR,beginWse9aTGrpR + WSE_9A_TGRP_R_LEN));
   	}




}
  
