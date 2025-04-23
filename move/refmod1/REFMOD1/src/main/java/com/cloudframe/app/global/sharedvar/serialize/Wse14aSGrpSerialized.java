package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse14aSGrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse14aSGrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse14aSGrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_14A_SGRP_LENGTH = 63;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWseFiller024;
            protected  int beginWse14aS;
	
	/**
	* Constructor for Wse14aSGrpSerialized
	**/
    public Wse14aSGrpSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Wse14aSGrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_14A_SGRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWseFiller024 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse14aS = getStartOffset() + 3;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWseFiller024Counter = -1;
     public boolean isWseFiller024Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWseFiller024Counter != sharedCounter;
         localWseFiller024Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_FILLER_024_LEN = 3;
	/**
	 * 	serialize this WseFiller024
	 */
   protected void serializeWseFiller024(char[] wseFiller024) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wseFiller024,0,getStringValue(),beginWseFiller024,WSE_FILLER_024_LEN);
       localWseFiller024Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWseFiller024Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshWseFiller024 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWseFiller024() {	 
   		return (substring(getStringValue(),beginWseFiller024,beginWseFiller024 + WSE_FILLER_024_LEN));
   	}
     int localWse14aSCounter = -1;
     public boolean isWse14aSModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse14aSCounter != sharedCounter;
         localWse14aSCounter = sharedCounter; return hasModified;
     }
	protected static final int WSE_14A_S_LEN = 60;
	/**
	 * 	serialize this Wse14aS
	 */
   protected void serializeWse14aS(char[] wse14aS) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse14aS,0,getStringValue(),beginWse14aS,WSE_14A_S_LEN);
       localWse14aSCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse14aSConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshWse14aS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse14aS() {	 
   		return (substring(getStringValue(),beginWse14aS,beginWse14aS + WSE_14A_S_LEN));
   	}




}
  
