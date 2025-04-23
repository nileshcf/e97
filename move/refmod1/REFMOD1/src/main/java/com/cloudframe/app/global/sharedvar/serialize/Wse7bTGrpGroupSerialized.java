package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse7bTGrpGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse7bTGrpGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse7bTGrpGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_7B_TGRP_GROUP_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse7bTGrpR;
	
	/**
	* Constructor for Wse7bTGrpGroupSerialized
	**/
    public Wse7bTGrpGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Wse7bTGrpGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_7B_TGRP_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginWse7bTGrpR = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse7bTGrpRCounter = -1;
     public boolean isWse7bTGrpRModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse7bTGrpRCounter != sharedCounter;
         localWse7bTGrpRCounter = sharedCounter; return hasModified;
     }
	protected static final int WSE_7B_TGRP_R_LEN = 60;
	/**
	 * 	serialize this Wse7bTGrpR
	 */
   protected void serializeWse7bTGrpR(char[] wse7bTGrpR) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse7bTGrpR,0,getStringValue(),beginWse7bTGrpR,WSE_7B_TGRP_R_LEN);
       localWse7bTGrpRCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse7bTGrpRConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshWse7bTGrpR is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse7bTGrpR() {	 
   		return (substring(getStringValue(),beginWse7bTGrpR,beginWse7bTGrpR + WSE_7B_TGRP_R_LEN));
   	}




}
  
