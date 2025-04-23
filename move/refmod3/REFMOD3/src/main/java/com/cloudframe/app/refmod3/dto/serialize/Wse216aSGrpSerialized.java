package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class Wse216aSGrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:02. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse216aSGrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse216aSGrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_216A_SGRP_LENGTH = 63;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse216aS;
	
	/**
	* Constructor for Wse216aSGrpSerialized
	**/
    public Wse216aSGrpSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Wse216aSGrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_216A_SGRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse216aS = getStartOffset() + 3;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse216aSCounter = -1;
     public boolean isWse216aSModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse216aSCounter != sharedCounter;
         localWse216aSCounter = sharedCounter; return hasModified;
     }
	protected static final int WSE_216A_S_LEN = 60;
	/**
	 * 	serialize this Wse216aS
	 */
   protected void serializeWse216aS(char[] wse216aS) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse216aS,0,getStringValue(),beginWse216aS,WSE_216A_S_LEN);
       localWse216aSCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse216aSConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshWse216aS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse216aS() {	 
   		return (substring(getStringValue(),beginWse216aS,beginWse216aS + WSE_216A_S_LEN));
   	}




}
  
