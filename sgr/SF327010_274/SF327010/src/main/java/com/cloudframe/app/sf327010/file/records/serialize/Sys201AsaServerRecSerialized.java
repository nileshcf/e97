package com.cloudframe.app.sf327010.file.records.serialize;

/**
*  The class Sys201AsaServerRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:04. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sys201AsaServerRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sys201AsaServerRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_201_ASA_SERVER_REC_LENGTH = 132;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSys201AsaServerRecString;
	
	/**
	* Constructor for Sys201AsaServerRecSerialized
	**/
    public Sys201AsaServerRecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Sys201AsaServerRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_201_ASA_SERVER_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSys201AsaServerRecString = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSys201AsaServerRecStringCounter = -1;
     public boolean isSys201AsaServerRecStringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys201AsaServerRecStringCounter != sharedCounter;
         localSys201AsaServerRecStringCounter = sharedCounter; return hasModified;
     }
	protected static final int SYS_201_ASA_SERVER_REC_STRING_LEN = 132;
	/**
	 * 	serialize this Sys201AsaServerRecString
	 */
   protected void serializeSys201AsaServerRecString(char[] sys201AsaServerRecString) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys201AsaServerRecString,0,getStringValue(),beginSys201AsaServerRecString,SYS_201_ASA_SERVER_REC_STRING_LEN);
       localSys201AsaServerRecStringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys201AsaServerRecStringConstraints(char[] value) {
   			return super.checkConstraints(value , 132 ,false, false);
   }
    /**
	 *	refreshSys201AsaServerRecString is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys201AsaServerRecString() {	 
   		return (substring(getStringValue(),beginSys201AsaServerRecString,beginSys201AsaServerRecString + SYS_201_ASA_SERVER_REC_STRING_LEN));
   	}




}
  
