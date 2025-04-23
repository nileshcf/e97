package com.cloudframe.app.ip809050.file.records.serialize;

/**
*  The class Sys202OutputIpmOtbndRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:07. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sys202OutputIpmOtbndRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sys202OutputIpmOtbndRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_202_OUTPUT_IPM_OTBND_REC_LENGTH = 600;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSys202OutputIpmOtbndRecString;
	
	/**
	* Constructor for Sys202OutputIpmOtbndRecSerialized
	**/
    public Sys202OutputIpmOtbndRecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Sys202OutputIpmOtbndRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_202_OUTPUT_IPM_OTBND_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSys202OutputIpmOtbndRecString = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSys202OutputIpmOtbndRecStringCounter = -1;
     public boolean isSys202OutputIpmOtbndRecStringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys202OutputIpmOtbndRecStringCounter != sharedCounter;
         localSys202OutputIpmOtbndRecStringCounter = sharedCounter; return hasModified;
     }
	protected static final int SYS_202_OUTPUT_IPM_OTBND_REC_STRING_LEN = 600;
	/**
	 * 	serialize this Sys202OutputIpmOtbndRecString
	 */
   protected void serializeSys202OutputIpmOtbndRecString(char[] sys202OutputIpmOtbndRecString) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys202OutputIpmOtbndRecString,0,getStringValue(),beginSys202OutputIpmOtbndRecString,SYS_202_OUTPUT_IPM_OTBND_REC_STRING_LEN);
       localSys202OutputIpmOtbndRecStringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys202OutputIpmOtbndRecStringConstraints(char[] value) {
   			return super.checkConstraints(value , 600 ,false, false);
   }
    /**
	 *	refreshSys202OutputIpmOtbndRecString is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys202OutputIpmOtbndRecString() {	 
   		return (substring(getStringValue(),beginSys202OutputIpmOtbndRecString,beginSys202OutputIpmOtbndRecString + SYS_202_OUTPUT_IPM_OTBND_REC_STRING_LEN));
   	}




}
  
