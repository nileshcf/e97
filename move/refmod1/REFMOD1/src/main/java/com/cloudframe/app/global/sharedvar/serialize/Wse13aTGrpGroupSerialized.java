package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse13aTGrpGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse13aTGrpGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse13aTGrpGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_13A_TGRP_GROUP_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse13aTGrpR;
	
	/**
	* Constructor for Wse13aTGrpGroupSerialized
	**/
    public Wse13aTGrpGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Wse13aTGrpGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_13A_TGRP_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginWse13aTGrpR = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse13aTGrpRCounter = -1;
     public boolean isWse13aTGrpRModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse13aTGrpRCounter != sharedCounter;
         localWse13aTGrpRCounter = sharedCounter; return hasModified;
     }
	protected static final int WSE_13A_TGRP_R_LEN = 60;
	/**
	 * 	serialize this Wse13aTGrpR
	 */
   protected void serializeWse13aTGrpR(char[] wse13aTGrpR) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse13aTGrpR,0,getStringValue(),beginWse13aTGrpR,WSE_13A_TGRP_R_LEN);
       localWse13aTGrpRCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse13aTGrpRConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshWse13aTGrpR is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse13aTGrpR() {	 
   		return (substring(getStringValue(),beginWse13aTGrpR,beginWse13aTGrpR + WSE_13A_TGRP_R_LEN));
   	}




}
  
