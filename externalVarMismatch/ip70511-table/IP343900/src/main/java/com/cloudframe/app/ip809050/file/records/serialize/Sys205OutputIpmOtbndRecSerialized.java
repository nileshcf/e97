package com.cloudframe.app.ip809050.file.records.serialize;

/**
*  The class Sys205OutputIpmOtbndRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sys205OutputIpmOtbndRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sys205OutputIpmOtbndRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_205_OUTPUT_IPM_OTBND_REC_LENGTH = 600;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSys205OutputIpmOtbndRecString;
	
	/**
	* Constructor for Sys205OutputIpmOtbndRecSerialized
	**/
    public Sys205OutputIpmOtbndRecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Sys205OutputIpmOtbndRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_205_OUTPUT_IPM_OTBND_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSys205OutputIpmOtbndRecString = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSys205OutputIpmOtbndRecStringCounter = -1;
     public boolean isSys205OutputIpmOtbndRecStringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys205OutputIpmOtbndRecStringCounter != sharedCounter;
         localSys205OutputIpmOtbndRecStringCounter = sharedCounter; return hasModified;
     }
	protected static final int SYS_205_OUTPUT_IPM_OTBND_REC_STRING_LEN = 600;
	/**
	 * 	serialize this Sys205OutputIpmOtbndRecString
	 */
   protected void serializeSys205OutputIpmOtbndRecString(char[] sys205OutputIpmOtbndRecString) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys205OutputIpmOtbndRecString,0,getStringValue(),beginSys205OutputIpmOtbndRecString,SYS_205_OUTPUT_IPM_OTBND_REC_STRING_LEN);
       localSys205OutputIpmOtbndRecStringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys205OutputIpmOtbndRecStringConstraints(char[] value) {
   			return super.checkConstraints(value , 600 ,false, false);
   }
    /**
	 *	refreshSys205OutputIpmOtbndRecString is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys205OutputIpmOtbndRecString() {	 
   		return (substring(getStringValue(),beginSys205OutputIpmOtbndRecString,beginSys205OutputIpmOtbndRecString + SYS_205_OUTPUT_IPM_OTBND_REC_STRING_LEN));
   	}




}
  
