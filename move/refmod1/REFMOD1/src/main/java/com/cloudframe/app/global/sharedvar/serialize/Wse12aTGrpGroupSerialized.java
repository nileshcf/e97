package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse12aTGrpGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse12aTGrpGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse12aTGrpGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_12A_TGRP_GROUP_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse12aTGrpR;
	
	/**
	* Constructor for Wse12aTGrpGroupSerialized
	**/
    public Wse12aTGrpGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Wse12aTGrpGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_12A_TGRP_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginWse12aTGrpR = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse12aTGrpRCounter = -1;
     public boolean isWse12aTGrpRModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse12aTGrpRCounter != sharedCounter;
         localWse12aTGrpRCounter = sharedCounter; return hasModified;
     }
	protected static final int WSE_12A_TGRP_R_LEN = 60;
	/**
	 * 	serialize this Wse12aTGrpR
	 */
   protected void serializeWse12aTGrpR(char[] wse12aTGrpR) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse12aTGrpR,0,getStringValue(),beginWse12aTGrpR,WSE_12A_TGRP_R_LEN);
       localWse12aTGrpRCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse12aTGrpRConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshWse12aTGrpR is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse12aTGrpR() {	 
   		return (substring(getStringValue(),beginWse12aTGrpR,beginWse12aTGrpR + WSE_12A_TGRP_R_LEN));
   	}




}
  
