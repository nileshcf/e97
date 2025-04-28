package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class Wse216bSGrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:58. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse216bSGrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse216bSGrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_216B_SGRP_LENGTH = 63;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse216bS;
	
	/**
	* Constructor for Wse216bSGrpSerialized
	**/
    public Wse216bSGrpSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Wse216bSGrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_216B_SGRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse216bS = getStartOffset() + 3;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse216bSCounter = -1;
     public boolean isWse216bSModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse216bSCounter != sharedCounter;
         localWse216bSCounter = sharedCounter; return hasModified;
     }
	protected static final int WSE_216B_S_LEN = 60;
	/**
	 * 	serialize this Wse216bS
	 */
   protected void serializeWse216bS(char[] wse216bS) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse216bS,0,getStringValue(),beginWse216bS,WSE_216B_S_LEN);
       localWse216bSCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse216bSConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshWse216bS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse216bS() {	 
   		return (substring(getStringValue(),beginWse216bS,beginWse216bS + WSE_216B_S_LEN));
   	}




}
  
