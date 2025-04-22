package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse13bTGrpGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse13bTGrpGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse13bTGrpGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_13B_TGRP_GROUP_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse13bTGrpR;
	
	/**
	* Constructor for Wse13bTGrpGroupSerialized
	**/
    public Wse13bTGrpGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Wse13bTGrpGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_13B_TGRP_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginWse13bTGrpR = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse13bTGrpRCounter = -1;
     public boolean isWse13bTGrpRModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse13bTGrpRCounter != sharedCounter;
         localWse13bTGrpRCounter = sharedCounter; return hasModified;
     }
	protected static final int WSE_13B_TGRP_R_LEN = 60;
	/**
	 * 	serialize this Wse13bTGrpR
	 */
   protected void serializeWse13bTGrpR(char[] wse13bTGrpR) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse13bTGrpR,0,getStringValue(),beginWse13bTGrpR,WSE_13B_TGRP_R_LEN);
       localWse13bTGrpRCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse13bTGrpRConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshWse13bTGrpR is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse13bTGrpR() {	 
   		return (substring(getStringValue(),beginWse13bTGrpR,beginWse13bTGrpR + WSE_13B_TGRP_R_LEN));
   	}




}
  
