package com.cloudframe.app.sf326010.dto.serialize;

/**
*  The class Sys001MiplogRecordGroup800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:05. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sys001MiplogRecordGroup800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sys001MiplogRecordGroup800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_001_MIPLOG_RECORD_GROUP_800_LENGTH = 32752;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSys001MiplogRecord800;
	
	/**
	* Constructor for Sys001MiplogRecordGroup800Serialized
	**/
    public Sys001MiplogRecordGroup800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Sys001MiplogRecordGroup800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_001_MIPLOG_RECORD_GROUP_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSys001MiplogRecord800 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localSys001MiplogRecord800Counter = -1;
     public boolean isSys001MiplogRecord800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys001MiplogRecord800Counter != sharedCounter;
         localSys001MiplogRecord800Counter = sharedCounter; return hasModified;
     }
	protected static final int SYS_001_MIPLOG_RECORD_800_LEN = 32752;
	/**
	 * 	serialize this Sys001MiplogRecord800
	 */
   protected void serializeSys001MiplogRecord800(char[] sys001MiplogRecord800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys001MiplogRecord800,0,getStringValue(),beginSys001MiplogRecord800,SYS_001_MIPLOG_RECORD_800_LEN);
       localSys001MiplogRecord800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys001MiplogRecord800Constraints(char[] value) {
   			return super.checkConstraints(value , 32752 ,false, false);
   }
    /**
	 *	refreshSys001MiplogRecord800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys001MiplogRecord800() {	 
   		return (substring(getStringValue(),beginSys001MiplogRecord800,beginSys001MiplogRecord800 + SYS_001_MIPLOG_RECORD_800_LEN));
   	}




}
  
