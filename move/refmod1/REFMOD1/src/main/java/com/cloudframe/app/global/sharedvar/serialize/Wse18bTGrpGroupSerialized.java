package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse18bTGrpGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse18bTGrpGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse18bTGrpGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_18B_TGRP_GROUP_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse18bTGrpR;
	
	/**
	* Constructor for Wse18bTGrpGroupSerialized
	**/
    public Wse18bTGrpGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Wse18bTGrpGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_18B_TGRP_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginWse18bTGrpR = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse18bTGrpRCounter = -1;
     public boolean isWse18bTGrpRModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse18bTGrpRCounter != sharedCounter;
         localWse18bTGrpRCounter = sharedCounter; return hasModified;
     }
	protected static final int WSE_18B_TGRP_R_LEN = 60;
	/**
	 * 	serialize this Wse18bTGrpR
	 */
   protected void serializeWse18bTGrpR(char[] wse18bTGrpR) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse18bTGrpR,0,getStringValue(),beginWse18bTGrpR,WSE_18B_TGRP_R_LEN);
       localWse18bTGrpRCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse18bTGrpRConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshWse18bTGrpR is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse18bTGrpR() {	 
   		return (substring(getStringValue(),beginWse18bTGrpR,beginWse18bTGrpR + WSE_18B_TGRP_R_LEN));
   	}




}
  
