package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class Wse26aSGrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:00. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse26aSGrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse26aSGrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_26A_SGRP_LENGTH = 63;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse26aS;
	
	/**
	* Constructor for Wse26aSGrpSerialized
	**/
    public Wse26aSGrpSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Wse26aSGrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_26A_SGRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse26aS = getStartOffset() + 3;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse26aSCounter = -1;
     public boolean isWse26aSModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse26aSCounter != sharedCounter;
         localWse26aSCounter = sharedCounter; return hasModified;
     }
	protected static final int WSE_26A_S_LEN = 60;
	/**
	 * 	serialize this Wse26aS
	 */
   protected void serializeWse26aS(char[] wse26aS) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse26aS,0,getStringValue(),beginWse26aS,WSE_26A_S_LEN);
       localWse26aSCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse26aSConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshWse26aS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse26aS() {	 
   		return (substring(getStringValue(),beginWse26aS,beginWse26aS + WSE_26A_S_LEN));
   	}




}
  
