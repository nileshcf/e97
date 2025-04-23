package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse16aSGrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse16aSGrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse16aSGrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_16A_SGRP_LENGTH = 63;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWseFiller030;
            protected  int beginWse16aS;
	
	/**
	* Constructor for Wse16aSGrpSerialized
	**/
    public Wse16aSGrpSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Wse16aSGrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_16A_SGRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWseFiller030 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse16aS = getStartOffset() + 3;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWseFiller030Counter = -1;
     public boolean isWseFiller030Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWseFiller030Counter != sharedCounter;
         localWseFiller030Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_FILLER_030_LEN = 3;
	/**
	 * 	serialize this WseFiller030
	 */
   protected void serializeWseFiller030(char[] wseFiller030) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wseFiller030,0,getStringValue(),beginWseFiller030,WSE_FILLER_030_LEN);
       localWseFiller030Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWseFiller030Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshWseFiller030 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWseFiller030() {	 
   		return (substring(getStringValue(),beginWseFiller030,beginWseFiller030 + WSE_FILLER_030_LEN));
   	}
     int localWse16aSCounter = -1;
     public boolean isWse16aSModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse16aSCounter != sharedCounter;
         localWse16aSCounter = sharedCounter; return hasModified;
     }
	protected static final int WSE_16A_S_LEN = 60;
	/**
	 * 	serialize this Wse16aS
	 */
   protected void serializeWse16aS(char[] wse16aS) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse16aS,0,getStringValue(),beginWse16aS,WSE_16A_S_LEN);
       localWse16aSCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse16aSConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshWse16aS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse16aS() {	 
   		return (substring(getStringValue(),beginWse16aS,beginWse16aS + WSE_16A_S_LEN));
   	}




}
  
