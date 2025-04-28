package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse6bSGrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse6bSGrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse6bSGrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_6B_SGRP_LENGTH = 63;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWseFiller03;
            protected  int beginWse6bS;
	
	/**
	* Constructor for Wse6bSGrpSerialized
	**/
    public Wse6bSGrpSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Wse6bSGrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_6B_SGRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWseFiller03 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse6bS = getStartOffset() + 3;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWseFiller03Counter = -1;
     public boolean isWseFiller03Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWseFiller03Counter != sharedCounter;
         localWseFiller03Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_FILLER_03_LEN = 3;
	/**
	 * 	serialize this WseFiller03
	 */
   protected void serializeWseFiller03(char[] wseFiller03) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wseFiller03,0,getStringValue(),beginWseFiller03,WSE_FILLER_03_LEN);
       localWseFiller03Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWseFiller03Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshWseFiller03 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWseFiller03() {	 
   		return (substring(getStringValue(),beginWseFiller03,beginWseFiller03 + WSE_FILLER_03_LEN));
   	}
     int localWse6bSCounter = -1;
     public boolean isWse6bSModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse6bSCounter != sharedCounter;
         localWse6bSCounter = sharedCounter; return hasModified;
     }
	protected static final int WSE_6B_S_LEN = 60;
	/**
	 * 	serialize this Wse6bS
	 */
   protected void serializeWse6bS(char[] wse6bS) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse6bS,0,getStringValue(),beginWse6bS,WSE_6B_S_LEN);
       localWse6bSCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse6bSConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshWse6bS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse6bS() {	 
   		return (substring(getStringValue(),beginWse6bS,beginWse6bS + WSE_6B_S_LEN));
   	}




}
  
