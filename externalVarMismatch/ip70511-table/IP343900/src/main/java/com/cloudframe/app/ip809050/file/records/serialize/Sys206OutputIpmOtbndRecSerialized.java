package com.cloudframe.app.ip809050.file.records.serialize;

/**
*  The class Sys206OutputIpmOtbndRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:16. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sys206OutputIpmOtbndRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sys206OutputIpmOtbndRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_206_OUTPUT_IPM_OTBND_REC_LENGTH = 600;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSys206OutputIpmOtbndRecString;
	
	/**
	* Constructor for Sys206OutputIpmOtbndRecSerialized
	**/
    public Sys206OutputIpmOtbndRecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Sys206OutputIpmOtbndRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_206_OUTPUT_IPM_OTBND_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSys206OutputIpmOtbndRecString = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSys206OutputIpmOtbndRecStringCounter = -1;
     public boolean isSys206OutputIpmOtbndRecStringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys206OutputIpmOtbndRecStringCounter != sharedCounter;
         localSys206OutputIpmOtbndRecStringCounter = sharedCounter; return hasModified;
     }
	protected static final int SYS_206_OUTPUT_IPM_OTBND_REC_STRING_LEN = 600;
	/**
	 * 	serialize this Sys206OutputIpmOtbndRecString
	 */
   protected void serializeSys206OutputIpmOtbndRecString(char[] sys206OutputIpmOtbndRecString) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys206OutputIpmOtbndRecString,0,getStringValue(),beginSys206OutputIpmOtbndRecString,SYS_206_OUTPUT_IPM_OTBND_REC_STRING_LEN);
       localSys206OutputIpmOtbndRecStringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys206OutputIpmOtbndRecStringConstraints(char[] value) {
   			return super.checkConstraints(value , 600 ,false, false);
   }
    /**
	 *	refreshSys206OutputIpmOtbndRecString is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys206OutputIpmOtbndRecString() {	 
   		return (substring(getStringValue(),beginSys206OutputIpmOtbndRecString,beginSys206OutputIpmOtbndRecString + SYS_206_OUTPUT_IPM_OTBND_REC_STRING_LEN));
   	}




}
  
