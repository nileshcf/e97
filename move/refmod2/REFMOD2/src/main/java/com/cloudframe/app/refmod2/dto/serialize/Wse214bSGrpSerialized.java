package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class Wse214bSGrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:22. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse214bSGrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse214bSGrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_214B_SGRP_LENGTH = 63;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse214bS;
	
	/**
	* Constructor for Wse214bSGrpSerialized
	**/
    public Wse214bSGrpSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Wse214bSGrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_214B_SGRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse214bS = getStartOffset() + 3;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse214bSCounter = -1;
     public boolean isWse214bSModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse214bSCounter != sharedCounter;
         localWse214bSCounter = sharedCounter; return hasModified;
     }
	protected static final int WSE_214B_S_LEN = 60;
	/**
	 * 	serialize this Wse214bS
	 */
   protected void serializeWse214bS(char[] wse214bS) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse214bS,0,getStringValue(),beginWse214bS,WSE_214B_S_LEN);
       localWse214bSCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse214bSConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshWse214bS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse214bS() {	 
   		return (substring(getStringValue(),beginWse214bS,beginWse214bS + WSE_214B_S_LEN));
   	}




}
  
