package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class ASGrp26Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:10. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ASGrp26Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ASGrp26Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_SGRP_26_LENGTH = 73;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAS26;
	
	/**
	* Constructor for ASGrp26Serialized
	**/
    public ASGrp26Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ASGrp26Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_SGRP_26_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginAS26 = getStartOffset() + 3;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localAS26Counter = -1;
     public boolean isAS26Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAS26Counter != sharedCounter;
         localAS26Counter = sharedCounter; return hasModified;
     }
	protected static final int A_S_26_LEN = 70;
	/**
	 * 	serialize this AS26
	 */
   protected void serializeAS26(char[] aS26) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aS26,0,getStringValue(),beginAS26,A_S_26_LEN);
       localAS26Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAS26Constraints(char[] value) {
   			return super.checkConstraints(value , 70 ,false, false);
   }
    /**
	 *	refreshAS26 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAS26() {	 
   		return (substring(getStringValue(),beginAS26,beginAS26 + A_S_26_LEN));
   	}




}
  
