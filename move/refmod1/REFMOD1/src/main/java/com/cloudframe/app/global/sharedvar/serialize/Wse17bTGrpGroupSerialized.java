package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse17bTGrpGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse17bTGrpGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse17bTGrpGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_17B_TGRP_GROUP_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse17bTGrpR;
	
	/**
	* Constructor for Wse17bTGrpGroupSerialized
	**/
    public Wse17bTGrpGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Wse17bTGrpGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_17B_TGRP_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginWse17bTGrpR = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse17bTGrpRCounter = -1;
     public boolean isWse17bTGrpRModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse17bTGrpRCounter != sharedCounter;
         localWse17bTGrpRCounter = sharedCounter; return hasModified;
     }
	protected static final int WSE_17B_TGRP_R_LEN = 60;
	/**
	 * 	serialize this Wse17bTGrpR
	 */
   protected void serializeWse17bTGrpR(char[] wse17bTGrpR) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse17bTGrpR,0,getStringValue(),beginWse17bTGrpR,WSE_17B_TGRP_R_LEN);
       localWse17bTGrpRCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse17bTGrpRConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshWse17bTGrpR is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse17bTGrpR() {	 
   		return (substring(getStringValue(),beginWse17bTGrpR,beginWse17bTGrpR + WSE_17B_TGRP_R_LEN));
   	}




}
  
