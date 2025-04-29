package com.cloudframe.app.usbaeext.file.records.serialize;

/**
*  The class TmRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:22. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TmRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TmRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TM_RECORD_LENGTH = 3996;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTmRecordString;
	
	/**
	* Constructor for TmRecordSerialized
	**/
    public TmRecordSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in TmRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TM_RECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTmRecordString = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localTmRecordStringCounter = -1;
     public boolean isTmRecordStringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTmRecordStringCounter != sharedCounter;
         localTmRecordStringCounter = sharedCounter; return hasModified;
     }
	protected static final int TM_RECORD_STRING_LEN = 3996;
	/**
	 * 	serialize this TmRecordString
	 */
   protected void serializeTmRecordString(char[] tmRecordString) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tmRecordString,0,getStringValue(),beginTmRecordString,TM_RECORD_STRING_LEN);
       localTmRecordStringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTmRecordStringConstraints(char[] value) {
   			return super.checkConstraints(value , 3996 ,false, false);
   }
    /**
	 *	refreshTmRecordString is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTmRecordString() {	 
   		return (substring(getStringValue(),beginTmRecordString,beginTmRecordString + TM_RECORD_STRING_LEN));
   	}




}
  
