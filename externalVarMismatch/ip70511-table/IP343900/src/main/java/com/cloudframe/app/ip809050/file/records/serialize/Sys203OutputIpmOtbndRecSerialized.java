package com.cloudframe.app.ip809050.file.records.serialize;

/**
*  The class Sys203OutputIpmOtbndRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sys203OutputIpmOtbndRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sys203OutputIpmOtbndRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_203_OUTPUT_IPM_OTBND_REC_LENGTH = 600;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSys203OutputIpmOtbndRecString;
	
	/**
	* Constructor for Sys203OutputIpmOtbndRecSerialized
	**/
    public Sys203OutputIpmOtbndRecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Sys203OutputIpmOtbndRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_203_OUTPUT_IPM_OTBND_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSys203OutputIpmOtbndRecString = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSys203OutputIpmOtbndRecStringCounter = -1;
     public boolean isSys203OutputIpmOtbndRecStringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys203OutputIpmOtbndRecStringCounter != sharedCounter;
         localSys203OutputIpmOtbndRecStringCounter = sharedCounter; return hasModified;
     }
	protected static final int SYS_203_OUTPUT_IPM_OTBND_REC_STRING_LEN = 600;
	/**
	 * 	serialize this Sys203OutputIpmOtbndRecString
	 */
   protected void serializeSys203OutputIpmOtbndRecString(char[] sys203OutputIpmOtbndRecString) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys203OutputIpmOtbndRecString,0,getStringValue(),beginSys203OutputIpmOtbndRecString,SYS_203_OUTPUT_IPM_OTBND_REC_STRING_LEN);
       localSys203OutputIpmOtbndRecStringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys203OutputIpmOtbndRecStringConstraints(char[] value) {
   			return super.checkConstraints(value , 600 ,false, false);
   }
    /**
	 *	refreshSys203OutputIpmOtbndRecString is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys203OutputIpmOtbndRecString() {	 
   		return (substring(getStringValue(),beginSys203OutputIpmOtbndRecString,beginSys203OutputIpmOtbndRecString + SYS_203_OUTPUT_IPM_OTBND_REC_STRING_LEN));
   	}




}
  
