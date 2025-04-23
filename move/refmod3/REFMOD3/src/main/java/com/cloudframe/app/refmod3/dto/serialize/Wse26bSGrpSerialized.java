package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class Wse26bSGrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:24. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse26bSGrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse26bSGrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_26B_SGRP_LENGTH = 63;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse26bS;
	
	/**
	* Constructor for Wse26bSGrpSerialized
	**/
    public Wse26bSGrpSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Wse26bSGrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_26B_SGRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse26bS = getStartOffset() + 3;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse26bSCounter = -1;
     public boolean isWse26bSModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse26bSCounter != sharedCounter;
         localWse26bSCounter = sharedCounter; return hasModified;
     }
	protected static final int WSE_26B_S_LEN = 60;
	/**
	 * 	serialize this Wse26bS
	 */
   protected void serializeWse26bS(char[] wse26bS) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse26bS,0,getStringValue(),beginWse26bS,WSE_26B_S_LEN);
       localWse26bSCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse26bSConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshWse26bS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse26bS() {	 
   		return (substring(getStringValue(),beginWse26bS,beginWse26bS + WSE_26B_S_LEN));
   	}




}
  
