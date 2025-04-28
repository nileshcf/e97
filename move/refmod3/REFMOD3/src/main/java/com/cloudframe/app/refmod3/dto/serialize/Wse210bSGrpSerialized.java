package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class Wse210bSGrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:57. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse210bSGrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse210bSGrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_210B_SGRP_LENGTH = 63;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse210bS;
	
	/**
	* Constructor for Wse210bSGrpSerialized
	**/
    public Wse210bSGrpSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Wse210bSGrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_210B_SGRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse210bS = getStartOffset() + 3;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse210bSCounter = -1;
     public boolean isWse210bSModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse210bSCounter != sharedCounter;
         localWse210bSCounter = sharedCounter; return hasModified;
     }
	protected static final int WSE_210B_S_LEN = 60;
	/**
	 * 	serialize this Wse210bS
	 */
   protected void serializeWse210bS(char[] wse210bS) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse210bS,0,getStringValue(),beginWse210bS,WSE_210B_S_LEN);
       localWse210bSCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse210bSConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshWse210bS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse210bS() {	 
   		return (substring(getStringValue(),beginWse210bS,beginWse210bS + WSE_210B_S_LEN));
   	}




}
  
