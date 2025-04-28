package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse18aTGrpGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse18aTGrpGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse18aTGrpGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_18A_TGRP_GROUP_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse18aTGrpR;
	
	/**
	* Constructor for Wse18aTGrpGroupSerialized
	**/
    public Wse18aTGrpGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Wse18aTGrpGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_18A_TGRP_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginWse18aTGrpR = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse18aTGrpRCounter = -1;
     public boolean isWse18aTGrpRModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse18aTGrpRCounter != sharedCounter;
         localWse18aTGrpRCounter = sharedCounter; return hasModified;
     }
	protected static final int WSE_18A_TGRP_R_LEN = 60;
	/**
	 * 	serialize this Wse18aTGrpR
	 */
   protected void serializeWse18aTGrpR(char[] wse18aTGrpR) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse18aTGrpR,0,getStringValue(),beginWse18aTGrpR,WSE_18A_TGRP_R_LEN);
       localWse18aTGrpRCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse18aTGrpRConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshWse18aTGrpR is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse18aTGrpR() {	 
   		return (substring(getStringValue(),beginWse18aTGrpR,beginWse18aTGrpR + WSE_18A_TGRP_R_LEN));
   	}




}
  
