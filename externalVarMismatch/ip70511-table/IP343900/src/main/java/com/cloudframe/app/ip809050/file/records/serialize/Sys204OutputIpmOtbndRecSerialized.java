package com.cloudframe.app.ip809050.file.records.serialize;

/**
*  The class Sys204OutputIpmOtbndRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sys204OutputIpmOtbndRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sys204OutputIpmOtbndRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_204_OUTPUT_IPM_OTBND_REC_LENGTH = 600;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSys204OutputIpmOtbndRecString;
	
	/**
	* Constructor for Sys204OutputIpmOtbndRecSerialized
	**/
    public Sys204OutputIpmOtbndRecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Sys204OutputIpmOtbndRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_204_OUTPUT_IPM_OTBND_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSys204OutputIpmOtbndRecString = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSys204OutputIpmOtbndRecStringCounter = -1;
     public boolean isSys204OutputIpmOtbndRecStringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys204OutputIpmOtbndRecStringCounter != sharedCounter;
         localSys204OutputIpmOtbndRecStringCounter = sharedCounter; return hasModified;
     }
	protected static final int SYS_204_OUTPUT_IPM_OTBND_REC_STRING_LEN = 600;
	/**
	 * 	serialize this Sys204OutputIpmOtbndRecString
	 */
   protected void serializeSys204OutputIpmOtbndRecString(char[] sys204OutputIpmOtbndRecString) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys204OutputIpmOtbndRecString,0,getStringValue(),beginSys204OutputIpmOtbndRecString,SYS_204_OUTPUT_IPM_OTBND_REC_STRING_LEN);
       localSys204OutputIpmOtbndRecStringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys204OutputIpmOtbndRecStringConstraints(char[] value) {
   			return super.checkConstraints(value , 600 ,false, false);
   }
    /**
	 *	refreshSys204OutputIpmOtbndRecString is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys204OutputIpmOtbndRecString() {	 
   		return (substring(getStringValue(),beginSys204OutputIpmOtbndRecString,beginSys204OutputIpmOtbndRecString + SYS_204_OUTPUT_IPM_OTBND_REC_STRING_LEN));
   	}




}
  
