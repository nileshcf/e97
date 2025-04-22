package com.cloudframe.app.ip606130.dto.serialize;

/**
*  The class Sys001Read300Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:08. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sys001Read300Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sys001Read300Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_001_READ_300_LENGTH = 55;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSys001Rec300;
	
	/**
	* Constructor for Sys001Read300Serialized
	**/
    public Sys001Read300Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Sys001Read300Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_001_READ_300_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginSys001Rec300 = getStartOffset() + 44;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSys001Rec300Counter = -1;
     public boolean isSys001Rec300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys001Rec300Counter != sharedCounter;
         localSys001Rec300Counter = sharedCounter; return hasModified;
     }
	protected static final int SYS_001_REC_300_LEN = 11;
	/**
	 * 	serialize this Sys001Rec300
	 */
   protected void serializeSys001Rec300(char[] sys001Rec300) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys001Rec300,0,getStringValue(),beginSys001Rec300,SYS_001_REC_300_LEN);
       localSys001Rec300Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys001Rec300Constraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshSys001Rec300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys001Rec300() {	 
   		return (substring(getStringValue(),beginSys001Rec300,beginSys001Rec300 + SYS_001_REC_300_LEN));
   	}




}
  
