package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse11aTGrpGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse11aTGrpGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse11aTGrpGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_11A_TGRP_GROUP_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse11aTGrpR;
	
	/**
	* Constructor for Wse11aTGrpGroupSerialized
	**/
    public Wse11aTGrpGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Wse11aTGrpGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_11A_TGRP_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginWse11aTGrpR = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse11aTGrpRCounter = -1;
     public boolean isWse11aTGrpRModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse11aTGrpRCounter != sharedCounter;
         localWse11aTGrpRCounter = sharedCounter; return hasModified;
     }
	protected static final int WSE_11A_TGRP_R_LEN = 60;
	/**
	 * 	serialize this Wse11aTGrpR
	 */
   protected void serializeWse11aTGrpR(char[] wse11aTGrpR) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse11aTGrpR,0,getStringValue(),beginWse11aTGrpR,WSE_11A_TGRP_R_LEN);
       localWse11aTGrpRCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse11aTGrpRConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshWse11aTGrpR is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse11aTGrpR() {	 
   		return (substring(getStringValue(),beginWse11aTGrpR,beginWse11aTGrpR + WSE_11A_TGRP_R_LEN));
   	}




}
  
