package com.cloudframe.app.ip343690.file.records.serialize;

/**
*  The class Sys001InputPmaUnldRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:31. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sys001InputPmaUnldRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sys001InputPmaUnldRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_001_INPUT_PMA_UNLD_REC_LENGTH = 116;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSys001InputPmaUnldRecString;
	
	/**
	* Constructor for Sys001InputPmaUnldRecSerialized
	**/
    public Sys001InputPmaUnldRecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Sys001InputPmaUnldRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_001_INPUT_PMA_UNLD_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSys001InputPmaUnldRecString = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSys001InputPmaUnldRecStringCounter = -1;
     public boolean isSys001InputPmaUnldRecStringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys001InputPmaUnldRecStringCounter != sharedCounter;
         localSys001InputPmaUnldRecStringCounter = sharedCounter; return hasModified;
     }
	protected static final int SYS_001_INPUT_PMA_UNLD_REC_STRING_LEN = 116;
	/**
	 * 	serialize this Sys001InputPmaUnldRecString
	 */
   protected void serializeSys001InputPmaUnldRecString(char[] sys001InputPmaUnldRecString) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys001InputPmaUnldRecString,0,getStringValue(),beginSys001InputPmaUnldRecString,SYS_001_INPUT_PMA_UNLD_REC_STRING_LEN);
       localSys001InputPmaUnldRecStringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys001InputPmaUnldRecStringConstraints(char[] value) {
   			return super.checkConstraints(value , 116 ,false, false);
   }
    /**
	 *	refreshSys001InputPmaUnldRecString is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys001InputPmaUnldRecString() {	 
   		return (substring(getStringValue(),beginSys001InputPmaUnldRecString,beginSys001InputPmaUnldRecString + SYS_001_INPUT_PMA_UNLD_REC_STRING_LEN));
   	}




}
  
