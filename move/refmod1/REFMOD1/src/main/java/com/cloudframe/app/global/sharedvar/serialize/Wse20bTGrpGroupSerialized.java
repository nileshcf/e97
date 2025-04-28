package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse20bTGrpGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse20bTGrpGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse20bTGrpGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_20B_TGRP_GROUP_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse20bTGrpR;
	
	/**
	* Constructor for Wse20bTGrpGroupSerialized
	**/
    public Wse20bTGrpGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Wse20bTGrpGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_20B_TGRP_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginWse20bTGrpR = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse20bTGrpRCounter = -1;
     public boolean isWse20bTGrpRModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse20bTGrpRCounter != sharedCounter;
         localWse20bTGrpRCounter = sharedCounter; return hasModified;
     }
	protected static final int WSE_20B_TGRP_R_LEN = 60;
	/**
	 * 	serialize this Wse20bTGrpR
	 */
   protected void serializeWse20bTGrpR(char[] wse20bTGrpR) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse20bTGrpR,0,getStringValue(),beginWse20bTGrpR,WSE_20B_TGRP_R_LEN);
       localWse20bTGrpRCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse20bTGrpRConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshWse20bTGrpR is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse20bTGrpR() {	 
   		return (substring(getStringValue(),beginWse20bTGrpR,beginWse20bTGrpR + WSE_20B_TGRP_R_LEN));
   	}




}
  
