package com.cloudframe.app.ip343900.file.records.serialize;

/**
*  The class Sys067EnvrmentRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sys067EnvrmentRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sys067EnvrmentRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_067_ENVRMENT_RECORD_LENGTH = 80;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSys067EnvrmentRecordString;
	
	/**
	* Constructor for Sys067EnvrmentRecordSerialized
	**/
    public Sys067EnvrmentRecordSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Sys067EnvrmentRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_067_ENVRMENT_RECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSys067EnvrmentRecordString = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSys067EnvrmentRecordStringCounter = -1;
     public boolean isSys067EnvrmentRecordStringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys067EnvrmentRecordStringCounter != sharedCounter;
         localSys067EnvrmentRecordStringCounter = sharedCounter; return hasModified;
     }
	protected static final int SYS_067_ENVRMENT_RECORD_STRING_LEN = 80;
	/**
	 * 	serialize this Sys067EnvrmentRecordString
	 */
   protected void serializeSys067EnvrmentRecordString(char[] sys067EnvrmentRecordString) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys067EnvrmentRecordString,0,getStringValue(),beginSys067EnvrmentRecordString,SYS_067_ENVRMENT_RECORD_STRING_LEN);
       localSys067EnvrmentRecordStringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys067EnvrmentRecordStringConstraints(char[] value) {
   			return super.checkConstraints(value , 80 ,false, false);
   }
    /**
	 *	refreshSys067EnvrmentRecordString is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys067EnvrmentRecordString() {	 
   		return (substring(getStringValue(),beginSys067EnvrmentRecordString,beginSys067EnvrmentRecordString + SYS_067_ENVRMENT_RECORD_STRING_LEN));
   	}




}
  
