package com.cloudframe.app.sf326010.file.records.serialize;

/**
*  The class Sys201ZLogRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sys201ZLogRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sys201ZLogRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_201_ZLOG_REC_LENGTH = 75;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSys201ZLogRecString;
	
	/**
	* Constructor for Sys201ZLogRecSerialized
	**/
    public Sys201ZLogRecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Sys201ZLogRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_201_ZLOG_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSys201ZLogRecString = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSys201ZLogRecStringCounter = -1;
     public boolean isSys201ZLogRecStringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys201ZLogRecStringCounter != sharedCounter;
         localSys201ZLogRecStringCounter = sharedCounter; return hasModified;
     }
	protected static final int SYS_201_ZLOG_REC_STRING_LEN = 75;
	/**
	 * 	serialize this Sys201ZLogRecString
	 */
   protected void serializeSys201ZLogRecString(char[] sys201ZLogRecString) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys201ZLogRecString,0,getStringValue(),beginSys201ZLogRecString,SYS_201_ZLOG_REC_STRING_LEN);
       localSys201ZLogRecStringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys201ZLogRecStringConstraints(char[] value) {
   			return super.checkConstraints(value , 75 ,false, false);
   }
    /**
	 *	refreshSys201ZLogRecString is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys201ZLogRecString() {	 
   		return (substring(getStringValue(),beginSys201ZLogRecString,beginSys201ZLogRecString + SYS_201_ZLOG_REC_STRING_LEN));
   	}




}
  
