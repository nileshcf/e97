package com.cloudframe.app.mcsort02.file.records.serialize;

/**
*  The class OutRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:15. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class OutRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(OutRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int OUT_RECORD_LENGTH = 32752;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginOutRecordString;
	
	/**
	* Constructor for OutRecordSerialized
	**/
    public OutRecordSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in OutRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(OUT_RECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginOutRecordString = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localOutRecordStringCounter = -1;
     public boolean isOutRecordStringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOutRecordStringCounter != sharedCounter;
         localOutRecordStringCounter = sharedCounter; return hasModified;
     }
	protected static final int OUT_RECORD_STRING_LEN = 32752;
	/**
	 * 	serialize this OutRecordString
	 */
   protected void serializeOutRecordString(char[] outRecordString) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(outRecordString,0,getStringValue(),beginOutRecordString,OUT_RECORD_STRING_LEN);
       localOutRecordStringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkOutRecordStringConstraints(char[] value) {
   			return super.checkConstraints(value , 32752 ,false, false);
   }
    /**
	 *	refreshOutRecordString is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshOutRecordString() {	 
   		return (substring(getStringValue(),beginOutRecordString,beginOutRecordString + OUT_RECORD_STRING_LEN));
   	}




}
  
