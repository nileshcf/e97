package com.cloudframe.app.ip809050.file.records.serialize;

/**
*  The class Sys012RunControlRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sys012RunControlRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sys012RunControlRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_012_RUN_CONTROL_REC_LENGTH = 80;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSys012RunControlRecString;
	
	/**
	* Constructor for Sys012RunControlRecSerialized
	**/
    public Sys012RunControlRecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Sys012RunControlRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_012_RUN_CONTROL_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSys012RunControlRecString = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSys012RunControlRecStringCounter = -1;
     public boolean isSys012RunControlRecStringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys012RunControlRecStringCounter != sharedCounter;
         localSys012RunControlRecStringCounter = sharedCounter; return hasModified;
     }
	protected static final int SYS_012_RUN_CONTROL_REC_STRING_LEN = 80;
	/**
	 * 	serialize this Sys012RunControlRecString
	 */
   protected void serializeSys012RunControlRecString(char[] sys012RunControlRecString) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys012RunControlRecString,0,getStringValue(),beginSys012RunControlRecString,SYS_012_RUN_CONTROL_REC_STRING_LEN);
       localSys012RunControlRecStringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys012RunControlRecStringConstraints(char[] value) {
   			return super.checkConstraints(value , 80 ,false, false);
   }
    /**
	 *	refreshSys012RunControlRecString is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys012RunControlRecString() {	 
   		return (substring(getStringValue(),beginSys012RunControlRecString,beginSys012RunControlRecString + SYS_012_RUN_CONTROL_REC_STRING_LEN));
   	}




}
  
