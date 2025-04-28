package com.cloudframe.app.ip798030.file.records.serialize;

/**
*  The class Sys210MqDataRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sys210MqDataRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sys210MqDataRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_210_MQ_DATA_REC_LENGTH = 500;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSys210MqDataRecString;
	
	/**
	* Constructor for Sys210MqDataRecSerialized
	**/
    public Sys210MqDataRecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Sys210MqDataRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_210_MQ_DATA_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSys210MqDataRecString = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSys210MqDataRecStringCounter = -1;
     public boolean isSys210MqDataRecStringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys210MqDataRecStringCounter != sharedCounter;
         localSys210MqDataRecStringCounter = sharedCounter; return hasModified;
     }
	protected static final int SYS_210_MQ_DATA_REC_STRING_LEN = 500;
	/**
	 * 	serialize this Sys210MqDataRecString
	 */
   protected void serializeSys210MqDataRecString(char[] sys210MqDataRecString) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys210MqDataRecString,0,getStringValue(),beginSys210MqDataRecString,SYS_210_MQ_DATA_REC_STRING_LEN);
       localSys210MqDataRecStringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys210MqDataRecStringConstraints(char[] value) {
   			return super.checkConstraints(value , 500 ,false, false);
   }
    /**
	 *	refreshSys210MqDataRecString is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys210MqDataRecString() {	 
   		return (substring(getStringValue(),beginSys210MqDataRecString,beginSys210MqDataRecString + SYS_210_MQ_DATA_REC_STRING_LEN));
   	}




}
  
