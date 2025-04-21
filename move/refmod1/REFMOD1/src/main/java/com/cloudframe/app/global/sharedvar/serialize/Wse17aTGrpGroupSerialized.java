package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse17aTGrpGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse17aTGrpGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse17aTGrpGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_17A_TGRP_GROUP_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse17aTGrpR;
	
	/**
	* Constructor for Wse17aTGrpGroupSerialized
	**/
    public Wse17aTGrpGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Wse17aTGrpGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_17A_TGRP_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginWse17aTGrpR = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse17aTGrpRCounter = -1;
     public boolean isWse17aTGrpRModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse17aTGrpRCounter != sharedCounter;
         localWse17aTGrpRCounter = sharedCounter; return hasModified;
     }
	protected static final int WSE_17A_TGRP_R_LEN = 60;
	/**
	 * 	serialize this Wse17aTGrpR
	 */
   protected void serializeWse17aTGrpR(char[] wse17aTGrpR) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse17aTGrpR,0,getStringValue(),beginWse17aTGrpR,WSE_17A_TGRP_R_LEN);
       localWse17aTGrpRCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse17aTGrpRConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshWse17aTGrpR is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse17aTGrpR() {	 
   		return (substring(getStringValue(),beginWse17aTGrpR,beginWse17aTGrpR + WSE_17A_TGRP_R_LEN));
   	}




}
  
