package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse19aTGrpGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse19aTGrpGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse19aTGrpGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_19A_TGRP_GROUP_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse19aTGrpR;
	
	/**
	* Constructor for Wse19aTGrpGroupSerialized
	**/
    public Wse19aTGrpGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Wse19aTGrpGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_19A_TGRP_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginWse19aTGrpR = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse19aTGrpRCounter = -1;
     public boolean isWse19aTGrpRModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse19aTGrpRCounter != sharedCounter;
         localWse19aTGrpRCounter = sharedCounter; return hasModified;
     }
	protected static final int WSE_19A_TGRP_R_LEN = 60;
	/**
	 * 	serialize this Wse19aTGrpR
	 */
   protected void serializeWse19aTGrpR(char[] wse19aTGrpR) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse19aTGrpR,0,getStringValue(),beginWse19aTGrpR,WSE_19A_TGRP_R_LEN);
       localWse19aTGrpRCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse19aTGrpRConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshWse19aTGrpR is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse19aTGrpR() {	 
   		return (substring(getStringValue(),beginWse19aTGrpR,beginWse19aTGrpR + WSE_19A_TGRP_R_LEN));
   	}




}
  
