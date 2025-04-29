package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class ASGrp10Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ASGrp10Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ASGrp10Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_SGRP_10_LENGTH = 73;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFillerWs012;
            protected  int beginAS10;
	
	/**
	* Constructor for ASGrp10Serialized
	**/
    public ASGrp10Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in ASGrp10Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_SGRP_10_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFillerWs012 = getStartOffset() + 0;	// set offset for serialization
  
             beginAS10 = getStartOffset() + 3;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFillerWs012Counter = -1;
     public boolean isFillerWs012Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFillerWs012Counter != sharedCounter;
         localFillerWs012Counter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_WS_012_LEN = 3;
	/**
	 * 	serialize this FillerWs012
	 */
   protected void serializeFillerWs012(char[] fillerWs012) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fillerWs012,0,getStringValue(),beginFillerWs012,FILLER_WS_012_LEN);
       localFillerWs012Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFillerWs012Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshFillerWs012 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFillerWs012() {	 
   		return (substring(getStringValue(),beginFillerWs012,beginFillerWs012 + FILLER_WS_012_LEN));
   	}
     int localAS10Counter = -1;
     public boolean isAS10Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAS10Counter != sharedCounter;
         localAS10Counter = sharedCounter; return hasModified;
     }
	protected static final int A_S_10_LEN = 70;
	/**
	 * 	serialize this AS10
	 */
   protected void serializeAS10(char[] aS10) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aS10,0,getStringValue(),beginAS10,A_S_10_LEN);
       localAS10Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAS10Constraints(char[] value) {
   			return super.checkConstraints(value , 70 ,false, false);
   }
    /**
	 *	refreshAS10 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAS10() {	 
   		return (substring(getStringValue(),beginAS10,beginAS10 + A_S_10_LEN));
   	}




}
  
