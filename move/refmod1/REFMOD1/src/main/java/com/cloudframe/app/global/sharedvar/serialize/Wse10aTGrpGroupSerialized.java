package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse10aTGrpGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse10aTGrpGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse10aTGrpGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_10A_TGRP_GROUP_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse10aTGrpR;
	
	/**
	* Constructor for Wse10aTGrpGroupSerialized
	**/
    public Wse10aTGrpGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Wse10aTGrpGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_10A_TGRP_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginWse10aTGrpR = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse10aTGrpRCounter = -1;
     public boolean isWse10aTGrpRModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse10aTGrpRCounter != sharedCounter;
         localWse10aTGrpRCounter = sharedCounter; return hasModified;
     }
	protected static final int WSE_10A_TGRP_R_LEN = 60;
	/**
	 * 	serialize this Wse10aTGrpR
	 */
   protected void serializeWse10aTGrpR(char[] wse10aTGrpR) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse10aTGrpR,0,getStringValue(),beginWse10aTGrpR,WSE_10A_TGRP_R_LEN);
       localWse10aTGrpRCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse10aTGrpRConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshWse10aTGrpR is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse10aTGrpR() {	 
   		return (substring(getStringValue(),beginWse10aTGrpR,beginWse10aTGrpR + WSE_10A_TGRP_R_LEN));
   	}




}
  
