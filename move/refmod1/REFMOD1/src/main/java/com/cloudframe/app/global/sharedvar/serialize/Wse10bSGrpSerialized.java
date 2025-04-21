package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse10bSGrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse10bSGrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse10bSGrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_10B_SGRP_LENGTH = 63;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWseFiller014;
            protected  int beginWse10bS;
	
	/**
	* Constructor for Wse10bSGrpSerialized
	**/
    public Wse10bSGrpSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Wse10bSGrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_10B_SGRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWseFiller014 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse10bS = getStartOffset() + 3;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWseFiller014Counter = -1;
     public boolean isWseFiller014Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWseFiller014Counter != sharedCounter;
         localWseFiller014Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_FILLER_014_LEN = 3;
	/**
	 * 	serialize this WseFiller014
	 */
   protected void serializeWseFiller014(char[] wseFiller014) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wseFiller014,0,getStringValue(),beginWseFiller014,WSE_FILLER_014_LEN);
       localWseFiller014Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWseFiller014Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshWseFiller014 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWseFiller014() {	 
   		return (substring(getStringValue(),beginWseFiller014,beginWseFiller014 + WSE_FILLER_014_LEN));
   	}
     int localWse10bSCounter = -1;
     public boolean isWse10bSModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse10bSCounter != sharedCounter;
         localWse10bSCounter = sharedCounter; return hasModified;
     }
	protected static final int WSE_10B_S_LEN = 60;
	/**
	 * 	serialize this Wse10bS
	 */
   protected void serializeWse10bS(char[] wse10bS) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse10bS,0,getStringValue(),beginWse10bS,WSE_10B_S_LEN);
       localWse10bSCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse10bSConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshWse10bS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse10bS() {	 
   		return (substring(getStringValue(),beginWse10bS,beginWse10bS + WSE_10B_S_LEN));
   	}




}
  
