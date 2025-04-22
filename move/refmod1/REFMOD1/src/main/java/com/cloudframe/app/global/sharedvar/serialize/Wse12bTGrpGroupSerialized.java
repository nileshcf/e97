package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse12bTGrpGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse12bTGrpGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse12bTGrpGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_12B_TGRP_GROUP_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse12bTGrpR;
	
	/**
	* Constructor for Wse12bTGrpGroupSerialized
	**/
    public Wse12bTGrpGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Wse12bTGrpGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_12B_TGRP_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginWse12bTGrpR = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse12bTGrpRCounter = -1;
     public boolean isWse12bTGrpRModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse12bTGrpRCounter != sharedCounter;
         localWse12bTGrpRCounter = sharedCounter; return hasModified;
     }
	protected static final int WSE_12B_TGRP_R_LEN = 60;
	/**
	 * 	serialize this Wse12bTGrpR
	 */
   protected void serializeWse12bTGrpR(char[] wse12bTGrpR) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse12bTGrpR,0,getStringValue(),beginWse12bTGrpR,WSE_12B_TGRP_R_LEN);
       localWse12bTGrpRCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse12bTGrpRConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshWse12bTGrpR is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse12bTGrpR() {	 
   		return (substring(getStringValue(),beginWse12bTGrpR,beginWse12bTGrpR + WSE_12B_TGRP_R_LEN));
   	}




}
  
