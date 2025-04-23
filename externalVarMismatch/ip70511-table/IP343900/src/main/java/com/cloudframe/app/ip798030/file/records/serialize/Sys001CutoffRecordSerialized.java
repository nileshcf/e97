package com.cloudframe.app.ip798030.file.records.serialize;

/**
*  The class Sys001CutoffRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:06. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sys001CutoffRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sys001CutoffRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_001_CUTOFF_RECORD_LENGTH = 182;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSys001CutoffRecordString;
	
	/**
	* Constructor for Sys001CutoffRecordSerialized
	**/
    public Sys001CutoffRecordSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Sys001CutoffRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_001_CUTOFF_RECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSys001CutoffRecordString = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSys001CutoffRecordStringCounter = -1;
     public boolean isSys001CutoffRecordStringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys001CutoffRecordStringCounter != sharedCounter;
         localSys001CutoffRecordStringCounter = sharedCounter; return hasModified;
     }
	protected static final int SYS_001_CUTOFF_RECORD_STRING_LEN = 182;
	/**
	 * 	serialize this Sys001CutoffRecordString
	 */
   protected void serializeSys001CutoffRecordString(char[] sys001CutoffRecordString) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys001CutoffRecordString,0,getStringValue(),beginSys001CutoffRecordString,SYS_001_CUTOFF_RECORD_STRING_LEN);
       localSys001CutoffRecordStringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys001CutoffRecordStringConstraints(char[] value) {
   			return super.checkConstraints(value , 182 ,false, false);
   }
    /**
	 *	refreshSys001CutoffRecordString is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys001CutoffRecordString() {	 
   		return (substring(getStringValue(),beginSys001CutoffRecordString,beginSys001CutoffRecordString + SYS_001_CUTOFF_RECORD_STRING_LEN));
   	}




}
  
