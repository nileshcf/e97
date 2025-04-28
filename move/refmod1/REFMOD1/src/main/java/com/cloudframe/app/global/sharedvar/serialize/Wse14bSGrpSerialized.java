package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse14bSGrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse14bSGrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse14bSGrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_14B_SGRP_LENGTH = 63;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWseFiller026;
            protected  int beginWse14bS;
	
	/**
	* Constructor for Wse14bSGrpSerialized
	**/
    public Wse14bSGrpSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Wse14bSGrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_14B_SGRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWseFiller026 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse14bS = getStartOffset() + 3;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWseFiller026Counter = -1;
     public boolean isWseFiller026Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWseFiller026Counter != sharedCounter;
         localWseFiller026Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_FILLER_026_LEN = 3;
	/**
	 * 	serialize this WseFiller026
	 */
   protected void serializeWseFiller026(char[] wseFiller026) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wseFiller026,0,getStringValue(),beginWseFiller026,WSE_FILLER_026_LEN);
       localWseFiller026Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWseFiller026Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshWseFiller026 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWseFiller026() {	 
   		return (substring(getStringValue(),beginWseFiller026,beginWseFiller026 + WSE_FILLER_026_LEN));
   	}
     int localWse14bSCounter = -1;
     public boolean isWse14bSModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse14bSCounter != sharedCounter;
         localWse14bSCounter = sharedCounter; return hasModified;
     }
	protected static final int WSE_14B_S_LEN = 60;
	/**
	 * 	serialize this Wse14bS
	 */
   protected void serializeWse14bS(char[] wse14bS) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse14bS,0,getStringValue(),beginWse14bS,WSE_14B_S_LEN);
       localWse14bSCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse14bSConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshWse14bS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse14bS() {	 
   		return (substring(getStringValue(),beginWse14bS,beginWse14bS + WSE_14B_S_LEN));
   	}




}
  
