package com.cloudframe.app.mcsort01.file.records.serialize;

/**
*  The class InRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:23. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class InRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(InRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IN_RECORD_LENGTH = 32752;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginInRecordString;
	
	/**
	* Constructor for InRecordSerialized
	**/
    public InRecordSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in InRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IN_RECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginInRecordString = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localInRecordStringCounter = -1;
     public boolean isInRecordStringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localInRecordStringCounter != sharedCounter;
         localInRecordStringCounter = sharedCounter; return hasModified;
     }
	protected static final int IN_RECORD_STRING_LEN = 32752;
	/**
	 * 	serialize this InRecordString
	 */
   protected void serializeInRecordString(char[] inRecordString) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(inRecordString,0,getStringValue(),beginInRecordString,IN_RECORD_STRING_LEN);
       localInRecordStringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkInRecordStringConstraints(char[] value) {
   			return super.checkConstraints(value , 32752 ,false, false);
   }
    /**
	 *	refreshInRecordString is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshInRecordString() {	 
   		return (substring(getStringValue(),beginInRecordString,beginInRecordString + IN_RECORD_STRING_LEN));
   	}




}
  
