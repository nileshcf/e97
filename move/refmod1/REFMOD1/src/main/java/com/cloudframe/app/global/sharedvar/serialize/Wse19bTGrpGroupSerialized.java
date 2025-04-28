package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse19bTGrpGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse19bTGrpGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse19bTGrpGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_19B_TGRP_GROUP_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse19bTGrpR;
	
	/**
	* Constructor for Wse19bTGrpGroupSerialized
	**/
    public Wse19bTGrpGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Wse19bTGrpGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_19B_TGRP_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginWse19bTGrpR = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse19bTGrpRCounter = -1;
     public boolean isWse19bTGrpRModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse19bTGrpRCounter != sharedCounter;
         localWse19bTGrpRCounter = sharedCounter; return hasModified;
     }
	protected static final int WSE_19B_TGRP_R_LEN = 60;
	/**
	 * 	serialize this Wse19bTGrpR
	 */
   protected void serializeWse19bTGrpR(char[] wse19bTGrpR) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse19bTGrpR,0,getStringValue(),beginWse19bTGrpR,WSE_19B_TGRP_R_LEN);
       localWse19bTGrpRCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse19bTGrpRConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshWse19bTGrpR is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse19bTGrpR() {	 
   		return (substring(getStringValue(),beginWse19bTGrpR,beginWse19bTGrpR + WSE_19B_TGRP_R_LEN));
   	}




}
  
