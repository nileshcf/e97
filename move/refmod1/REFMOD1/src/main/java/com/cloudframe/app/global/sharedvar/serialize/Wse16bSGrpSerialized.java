package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse16bSGrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse16bSGrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse16bSGrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_16B_SGRP_LENGTH = 63;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWseFiller031;
            protected  int beginWse16bS;
	
	/**
	* Constructor for Wse16bSGrpSerialized
	**/
    public Wse16bSGrpSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Wse16bSGrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_16B_SGRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWseFiller031 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse16bS = getStartOffset() + 3;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWseFiller031Counter = -1;
     public boolean isWseFiller031Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWseFiller031Counter != sharedCounter;
         localWseFiller031Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_FILLER_031_LEN = 3;
	/**
	 * 	serialize this WseFiller031
	 */
   protected void serializeWseFiller031(char[] wseFiller031) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wseFiller031,0,getStringValue(),beginWseFiller031,WSE_FILLER_031_LEN);
       localWseFiller031Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWseFiller031Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshWseFiller031 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWseFiller031() {	 
   		return (substring(getStringValue(),beginWseFiller031,beginWseFiller031 + WSE_FILLER_031_LEN));
   	}
     int localWse16bSCounter = -1;
     public boolean isWse16bSModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse16bSCounter != sharedCounter;
         localWse16bSCounter = sharedCounter; return hasModified;
     }
	protected static final int WSE_16B_S_LEN = 60;
	/**
	 * 	serialize this Wse16bS
	 */
   protected void serializeWse16bS(char[] wse16bS) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse16bS,0,getStringValue(),beginWse16bS,WSE_16B_S_LEN);
       localWse16bSCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse16bSConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshWse16bS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse16bS() {	 
   		return (substring(getStringValue(),beginWse16bS,beginWse16bS + WSE_16B_S_LEN));
   	}




}
  
