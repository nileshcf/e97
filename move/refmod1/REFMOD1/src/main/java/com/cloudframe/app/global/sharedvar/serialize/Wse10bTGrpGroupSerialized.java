package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse10bTGrpGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse10bTGrpGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse10bTGrpGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_10B_TGRP_GROUP_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse10bTGrpR;
	
	/**
	* Constructor for Wse10bTGrpGroupSerialized
	**/
    public Wse10bTGrpGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Wse10bTGrpGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_10B_TGRP_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginWse10bTGrpR = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse10bTGrpRCounter = -1;
     public boolean isWse10bTGrpRModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse10bTGrpRCounter != sharedCounter;
         localWse10bTGrpRCounter = sharedCounter; return hasModified;
     }
	protected static final int WSE_10B_TGRP_R_LEN = 60;
	/**
	 * 	serialize this Wse10bTGrpR
	 */
   protected void serializeWse10bTGrpR(char[] wse10bTGrpR) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse10bTGrpR,0,getStringValue(),beginWse10bTGrpR,WSE_10B_TGRP_R_LEN);
       localWse10bTGrpRCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse10bTGrpRConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshWse10bTGrpR is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse10bTGrpR() {	 
   		return (substring(getStringValue(),beginWse10bTGrpR,beginWse10bTGrpR + WSE_10B_TGRP_R_LEN));
   	}




}
  
