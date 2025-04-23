package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class Wse214aSGrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:25. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse214aSGrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse214aSGrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_214A_SGRP_LENGTH = 63;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse214aS;
	
	/**
	* Constructor for Wse214aSGrpSerialized
	**/
    public Wse214aSGrpSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Wse214aSGrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_214A_SGRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse214aS = getStartOffset() + 3;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse214aSCounter = -1;
     public boolean isWse214aSModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse214aSCounter != sharedCounter;
         localWse214aSCounter = sharedCounter; return hasModified;
     }
	protected static final int WSE_214A_S_LEN = 60;
	/**
	 * 	serialize this Wse214aS
	 */
   protected void serializeWse214aS(char[] wse214aS) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse214aS,0,getStringValue(),beginWse214aS,WSE_214A_S_LEN);
       localWse214aSCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse214aSConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshWse214aS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse214aS() {	 
   		return (substring(getStringValue(),beginWse214aS,beginWse214aS + WSE_214A_S_LEN));
   	}




}
  
