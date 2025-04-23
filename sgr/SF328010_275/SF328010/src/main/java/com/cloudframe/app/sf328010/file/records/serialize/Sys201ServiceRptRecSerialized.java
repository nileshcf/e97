package com.cloudframe.app.sf328010.file.records.serialize;

/**
*  The class Sys201ServiceRptRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:02. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sys201ServiceRptRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sys201ServiceRptRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_201_SERVICE_RPT_REC_LENGTH = 132;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSys201ServiceRptRecString;
	
	/**
	* Constructor for Sys201ServiceRptRecSerialized
	**/
    public Sys201ServiceRptRecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Sys201ServiceRptRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_201_SERVICE_RPT_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSys201ServiceRptRecString = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSys201ServiceRptRecStringCounter = -1;
     public boolean isSys201ServiceRptRecStringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys201ServiceRptRecStringCounter != sharedCounter;
         localSys201ServiceRptRecStringCounter = sharedCounter; return hasModified;
     }
	protected static final int SYS_201_SERVICE_RPT_REC_STRING_LEN = 132;
	/**
	 * 	serialize this Sys201ServiceRptRecString
	 */
   protected void serializeSys201ServiceRptRecString(char[] sys201ServiceRptRecString) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys201ServiceRptRecString,0,getStringValue(),beginSys201ServiceRptRecString,SYS_201_SERVICE_RPT_REC_STRING_LEN);
       localSys201ServiceRptRecStringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys201ServiceRptRecStringConstraints(char[] value) {
   			return super.checkConstraints(value , 132 ,false, false);
   }
    /**
	 *	refreshSys201ServiceRptRecString is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys201ServiceRptRecString() {	 
   		return (substring(getStringValue(),beginSys201ServiceRptRecString,beginSys201ServiceRptRecString + SYS_201_SERVICE_RPT_REC_STRING_LEN));
   	}




}
  
