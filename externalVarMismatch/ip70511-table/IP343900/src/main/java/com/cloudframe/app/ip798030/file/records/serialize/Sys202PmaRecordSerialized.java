package com.cloudframe.app.ip798030.file.records.serialize;

/**
*  The class Sys202PmaRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:15. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sys202PmaRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sys202PmaRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_202_PMA_RECORD_LENGTH = 94;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSys202PmaRecordString;
	
	/**
	* Constructor for Sys202PmaRecordSerialized
	**/
    public Sys202PmaRecordSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Sys202PmaRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_202_PMA_RECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSys202PmaRecordString = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSys202PmaRecordStringCounter = -1;
     public boolean isSys202PmaRecordStringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys202PmaRecordStringCounter != sharedCounter;
         localSys202PmaRecordStringCounter = sharedCounter; return hasModified;
     }
	protected static final int SYS_202_PMA_RECORD_STRING_LEN = 94;
	/**
	 * 	serialize this Sys202PmaRecordString
	 */
   protected void serializeSys202PmaRecordString(char[] sys202PmaRecordString) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys202PmaRecordString,0,getStringValue(),beginSys202PmaRecordString,SYS_202_PMA_RECORD_STRING_LEN);
       localSys202PmaRecordStringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys202PmaRecordStringConstraints(char[] value) {
   			return super.checkConstraints(value , 94 ,false, false);
   }
    /**
	 *	refreshSys202PmaRecordString is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys202PmaRecordString() {	 
   		return (substring(getStringValue(),beginSys202PmaRecordString,beginSys202PmaRecordString + SYS_202_PMA_RECORD_STRING_LEN));
   	}




}
  
