package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class ASGrp210Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ASGrp210Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ASGrp210Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_SGRP_210_LENGTH = 73;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAS210;
	
	/**
	* Constructor for ASGrp210Serialized
	**/
    public ASGrp210Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ASGrp210Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_SGRP_210_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginAS210 = getStartOffset() + 3;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localAS210Counter = -1;
     public boolean isAS210Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAS210Counter != sharedCounter;
         localAS210Counter = sharedCounter; return hasModified;
     }
	protected static final int A_S_210_LEN = 70;
	/**
	 * 	serialize this AS210
	 */
   protected void serializeAS210(char[] aS210) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aS210,0,getStringValue(),beginAS210,A_S_210_LEN);
       localAS210Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAS210Constraints(char[] value) {
   			return super.checkConstraints(value , 70 ,false, false);
   }
    /**
	 *	refreshAS210 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAS210() {	 
   		return (substring(getStringValue(),beginAS210,beginAS210 + A_S_210_LEN));
   	}




}
  
