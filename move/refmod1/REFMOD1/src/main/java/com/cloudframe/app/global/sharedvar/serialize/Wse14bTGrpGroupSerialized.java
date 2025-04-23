package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse14bTGrpGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse14bTGrpGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse14bTGrpGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_14B_TGRP_GROUP_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse14bTGrpR;
	
	/**
	* Constructor for Wse14bTGrpGroupSerialized
	**/
    public Wse14bTGrpGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Wse14bTGrpGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_14B_TGRP_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginWse14bTGrpR = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse14bTGrpRCounter = -1;
     public boolean isWse14bTGrpRModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse14bTGrpRCounter != sharedCounter;
         localWse14bTGrpRCounter = sharedCounter; return hasModified;
     }
	protected static final int WSE_14B_TGRP_R_LEN = 60;
	/**
	 * 	serialize this Wse14bTGrpR
	 */
   protected void serializeWse14bTGrpR(char[] wse14bTGrpR) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse14bTGrpR,0,getStringValue(),beginWse14bTGrpR,WSE_14B_TGRP_R_LEN);
       localWse14bTGrpRCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse14bTGrpRConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshWse14bTGrpR is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse14bTGrpR() {	 
   		return (substring(getStringValue(),beginWse14bTGrpR,beginWse14bTGrpR + WSE_14B_TGRP_R_LEN));
   	}




}
  
