package com.cloudframe.app.ip809050.file.records.serialize;

/**
*  The class Sys201OutputIpmOtbndRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:07. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sys201OutputIpmOtbndRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sys201OutputIpmOtbndRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_201_OUTPUT_IPM_OTBND_REC_LENGTH = 600;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSys201OutputIpmOtbndRecString;
	
	/**
	* Constructor for Sys201OutputIpmOtbndRecSerialized
	**/
    public Sys201OutputIpmOtbndRecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Sys201OutputIpmOtbndRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_201_OUTPUT_IPM_OTBND_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSys201OutputIpmOtbndRecString = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSys201OutputIpmOtbndRecStringCounter = -1;
     public boolean isSys201OutputIpmOtbndRecStringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys201OutputIpmOtbndRecStringCounter != sharedCounter;
         localSys201OutputIpmOtbndRecStringCounter = sharedCounter; return hasModified;
     }
	protected static final int SYS_201_OUTPUT_IPM_OTBND_REC_STRING_LEN = 600;
	/**
	 * 	serialize this Sys201OutputIpmOtbndRecString
	 */
   protected void serializeSys201OutputIpmOtbndRecString(char[] sys201OutputIpmOtbndRecString) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys201OutputIpmOtbndRecString,0,getStringValue(),beginSys201OutputIpmOtbndRecString,SYS_201_OUTPUT_IPM_OTBND_REC_STRING_LEN);
       localSys201OutputIpmOtbndRecStringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys201OutputIpmOtbndRecStringConstraints(char[] value) {
   			return super.checkConstraints(value , 600 ,false, false);
   }
    /**
	 *	refreshSys201OutputIpmOtbndRecString is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys201OutputIpmOtbndRecString() {	 
   		return (substring(getStringValue(),beginSys201OutputIpmOtbndRecString,beginSys201OutputIpmOtbndRecString + SYS_201_OUTPUT_IPM_OTBND_REC_STRING_LEN));
   	}




}
  
