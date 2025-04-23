package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse9bTGrpGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse9bTGrpGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse9bTGrpGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_9B_TGRP_GROUP_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse9bTGrpR;
	
	/**
	* Constructor for Wse9bTGrpGroupSerialized
	**/
    public Wse9bTGrpGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Wse9bTGrpGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_9B_TGRP_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginWse9bTGrpR = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse9bTGrpRCounter = -1;
     public boolean isWse9bTGrpRModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse9bTGrpRCounter != sharedCounter;
         localWse9bTGrpRCounter = sharedCounter; return hasModified;
     }
	protected static final int WSE_9B_TGRP_R_LEN = 60;
	/**
	 * 	serialize this Wse9bTGrpR
	 */
   protected void serializeWse9bTGrpR(char[] wse9bTGrpR) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse9bTGrpR,0,getStringValue(),beginWse9bTGrpR,WSE_9B_TGRP_R_LEN);
       localWse9bTGrpRCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse9bTGrpRConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshWse9bTGrpR is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse9bTGrpR() {	 
   		return (substring(getStringValue(),beginWse9bTGrpR,beginWse9bTGrpR + WSE_9B_TGRP_R_LEN));
   	}




}
  
