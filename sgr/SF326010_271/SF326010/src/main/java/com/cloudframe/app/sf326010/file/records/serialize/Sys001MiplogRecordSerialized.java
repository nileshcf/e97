package com.cloudframe.app.sf326010.file.records.serialize;

/**
*  The class Sys001MiplogRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:03. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sys001MiplogRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sys001MiplogRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_001_MIPLOG_RECORD_LENGTH = 32752;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSys001MiplogRecordString;
	
	/**
	* Constructor for Sys001MiplogRecordSerialized
	**/
    public Sys001MiplogRecordSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Sys001MiplogRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_001_MIPLOG_RECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSys001MiplogRecordString = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSys001MiplogRecordStringCounter = -1;
     public boolean isSys001MiplogRecordStringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys001MiplogRecordStringCounter != sharedCounter;
         localSys001MiplogRecordStringCounter = sharedCounter; return hasModified;
     }
	protected static final int SYS_001_MIPLOG_RECORD_STRING_LEN = 32752;
	/**
	 * 	serialize this Sys001MiplogRecordString
	 */
   protected void serializeSys001MiplogRecordString(char[] sys001MiplogRecordString) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys001MiplogRecordString,0,getStringValue(),beginSys001MiplogRecordString,SYS_001_MIPLOG_RECORD_STRING_LEN);
       localSys001MiplogRecordStringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys001MiplogRecordStringConstraints(char[] value) {
   			return super.checkConstraints(value , 32752 ,false, false);
   }
    /**
	 *	refreshSys001MiplogRecordString is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys001MiplogRecordString() {	 
   		return (substring(getStringValue(),beginSys001MiplogRecordString,beginSys001MiplogRecordString + SYS_001_MIPLOG_RECORD_STRING_LEN));
   	}




}
  
