package com.cloudframe.app.ip606130.dto.serialize;

/**
*  The class Sys200Written300Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:21. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sys200Written300Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sys200Written300Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_200_WRITTEN_300_LENGTH = 55;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSys200Rec300;
	
	/**
	* Constructor for Sys200Written300Serialized
	**/
    public Sys200Written300Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Sys200Written300Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_200_WRITTEN_300_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginSys200Rec300 = getStartOffset() + 44;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSys200Rec300Counter = -1;
     public boolean isSys200Rec300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys200Rec300Counter != sharedCounter;
         localSys200Rec300Counter = sharedCounter; return hasModified;
     }
	protected static final int SYS_200_REC_300_LEN = 11;
	/**
	 * 	serialize this Sys200Rec300
	 */
   protected void serializeSys200Rec300(char[] sys200Rec300) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys200Rec300,0,getStringValue(),beginSys200Rec300,SYS_200_REC_300_LEN);
       localSys200Rec300Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys200Rec300Constraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshSys200Rec300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys200Rec300() {	 
   		return (substring(getStringValue(),beginSys200Rec300,beginSys200Rec300 + SYS_200_REC_300_LEN));
   	}




}
  
