package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse6aSGrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse6aSGrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse6aSGrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_6A_SGRP_LENGTH = 63;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWseFiller02;
            protected  int beginWse6aS;
	
	/**
	* Constructor for Wse6aSGrpSerialized
	**/
    public Wse6aSGrpSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Wse6aSGrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_6A_SGRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWseFiller02 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse6aS = getStartOffset() + 3;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWseFiller02Counter = -1;
     public boolean isWseFiller02Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWseFiller02Counter != sharedCounter;
         localWseFiller02Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_FILLER_02_LEN = 3;
	/**
	 * 	serialize this WseFiller02
	 */
   protected void serializeWseFiller02(char[] wseFiller02) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wseFiller02,0,getStringValue(),beginWseFiller02,WSE_FILLER_02_LEN);
       localWseFiller02Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWseFiller02Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshWseFiller02 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWseFiller02() {	 
   		return (substring(getStringValue(),beginWseFiller02,beginWseFiller02 + WSE_FILLER_02_LEN));
   	}
     int localWse6aSCounter = -1;
     public boolean isWse6aSModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse6aSCounter != sharedCounter;
         localWse6aSCounter = sharedCounter; return hasModified;
     }
	protected static final int WSE_6A_S_LEN = 60;
	/**
	 * 	serialize this Wse6aS
	 */
   protected void serializeWse6aS(char[] wse6aS) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse6aS,0,getStringValue(),beginWse6aS,WSE_6A_S_LEN);
       localWse6aSCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse6aSConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshWse6aS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse6aS() {	 
   		return (substring(getStringValue(),beginWse6aS,beginWse6aS + WSE_6A_S_LEN));
   	}




}
  
