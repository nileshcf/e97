package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class Wse210aSGrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:03. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse210aSGrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse210aSGrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_210A_SGRP_LENGTH = 63;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse210aS;
	
	/**
	* Constructor for Wse210aSGrpSerialized
	**/
    public Wse210aSGrpSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Wse210aSGrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_210A_SGRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse210aS = getStartOffset() + 3;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse210aSCounter = -1;
     public boolean isWse210aSModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse210aSCounter != sharedCounter;
         localWse210aSCounter = sharedCounter; return hasModified;
     }
	protected static final int WSE_210A_S_LEN = 60;
	/**
	 * 	serialize this Wse210aS
	 */
   protected void serializeWse210aS(char[] wse210aS) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse210aS,0,getStringValue(),beginWse210aS,WSE_210A_S_LEN);
       localWse210aSCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse210aSConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshWse210aS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse210aS() {	 
   		return (substring(getStringValue(),beginWse210aS,beginWse210aS + WSE_210A_S_LEN));
   	}




}
  
