package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse10aSGrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse10aSGrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse10aSGrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_10A_SGRP_LENGTH = 63;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWseFiller012;
            protected  int beginWse10aS;
	
	/**
	* Constructor for Wse10aSGrpSerialized
	**/
    public Wse10aSGrpSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Wse10aSGrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_10A_SGRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWseFiller012 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse10aS = getStartOffset() + 3;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWseFiller012Counter = -1;
     public boolean isWseFiller012Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWseFiller012Counter != sharedCounter;
         localWseFiller012Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_FILLER_012_LEN = 3;
	/**
	 * 	serialize this WseFiller012
	 */
   protected void serializeWseFiller012(char[] wseFiller012) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wseFiller012,0,getStringValue(),beginWseFiller012,WSE_FILLER_012_LEN);
       localWseFiller012Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWseFiller012Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshWseFiller012 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWseFiller012() {	 
   		return (substring(getStringValue(),beginWseFiller012,beginWseFiller012 + WSE_FILLER_012_LEN));
   	}
     int localWse10aSCounter = -1;
     public boolean isWse10aSModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse10aSCounter != sharedCounter;
         localWse10aSCounter = sharedCounter; return hasModified;
     }
	protected static final int WSE_10A_S_LEN = 60;
	/**
	 * 	serialize this Wse10aS
	 */
   protected void serializeWse10aS(char[] wse10aS) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse10aS,0,getStringValue(),beginWse10aS,WSE_10A_S_LEN);
       localWse10aSCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse10aSConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshWse10aS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse10aS() {	 
   		return (substring(getStringValue(),beginWse10aS,beginWse10aS + WSE_10A_S_LEN));
   	}




}
  
