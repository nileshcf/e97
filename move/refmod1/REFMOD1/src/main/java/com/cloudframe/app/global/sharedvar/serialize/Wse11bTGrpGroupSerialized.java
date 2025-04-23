package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse11bTGrpGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse11bTGrpGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse11bTGrpGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_11B_TGRP_GROUP_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse11bTGrpR;
	
	/**
	* Constructor for Wse11bTGrpGroupSerialized
	**/
    public Wse11bTGrpGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Wse11bTGrpGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_11B_TGRP_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginWse11bTGrpR = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse11bTGrpRCounter = -1;
     public boolean isWse11bTGrpRModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse11bTGrpRCounter != sharedCounter;
         localWse11bTGrpRCounter = sharedCounter; return hasModified;
     }
	protected static final int WSE_11B_TGRP_R_LEN = 60;
	/**
	 * 	serialize this Wse11bTGrpR
	 */
   protected void serializeWse11bTGrpR(char[] wse11bTGrpR) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse11bTGrpR,0,getStringValue(),beginWse11bTGrpR,WSE_11B_TGRP_R_LEN);
       localWse11bTGrpRCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse11bTGrpRConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshWse11bTGrpR is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse11bTGrpR() {	 
   		return (substring(getStringValue(),beginWse11bTGrpR,beginWse11bTGrpR + WSE_11B_TGRP_R_LEN));
   	}




}
  
