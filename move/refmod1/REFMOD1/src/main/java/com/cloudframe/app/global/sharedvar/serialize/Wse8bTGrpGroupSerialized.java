package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse8bTGrpGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse8bTGrpGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse8bTGrpGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_8B_TGRP_GROUP_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse8bTGrpR;
	
	/**
	* Constructor for Wse8bTGrpGroupSerialized
	**/
    public Wse8bTGrpGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Wse8bTGrpGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_8B_TGRP_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginWse8bTGrpR = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse8bTGrpRCounter = -1;
     public boolean isWse8bTGrpRModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse8bTGrpRCounter != sharedCounter;
         localWse8bTGrpRCounter = sharedCounter; return hasModified;
     }
	protected static final int WSE_8B_TGRP_R_LEN = 60;
	/**
	 * 	serialize this Wse8bTGrpR
	 */
   protected void serializeWse8bTGrpR(char[] wse8bTGrpR) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse8bTGrpR,0,getStringValue(),beginWse8bTGrpR,WSE_8B_TGRP_R_LEN);
       localWse8bTGrpRCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse8bTGrpRConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshWse8bTGrpR is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse8bTGrpR() {	 
   		return (substring(getStringValue(),beginWse8bTGrpR,beginWse8bTGrpR + WSE_8B_TGRP_R_LEN));
   	}




}
  
