package com.cloudframe.app.mcsort05.file.records.serialize;

/**
*  The class Sys001GroupStatRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:28. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sys001GroupStatRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sys001GroupStatRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_001_GROUP_STAT_REC_LENGTH = 2000;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSys001GroupStatRecString;
	
	/**
	* Constructor for Sys001GroupStatRecSerialized
	**/
    public Sys001GroupStatRecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Sys001GroupStatRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_001_GROUP_STAT_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSys001GroupStatRecString = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSys001GroupStatRecStringCounter = -1;
     public boolean isSys001GroupStatRecStringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys001GroupStatRecStringCounter != sharedCounter;
         localSys001GroupStatRecStringCounter = sharedCounter; return hasModified;
     }
	protected static final int SYS_001_GROUP_STAT_REC_STRING_LEN = 2000;
	/**
	 * 	serialize this Sys001GroupStatRecString
	 */
   protected void serializeSys001GroupStatRecString(char[] sys001GroupStatRecString) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys001GroupStatRecString,0,getStringValue(),beginSys001GroupStatRecString,SYS_001_GROUP_STAT_REC_STRING_LEN);
       localSys001GroupStatRecStringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys001GroupStatRecStringConstraints(char[] value) {
   			return super.checkConstraints(value , 2000 ,false, false);
   }
    /**
	 *	refreshSys001GroupStatRecString is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys001GroupStatRecString() {	 
   		return (substring(getStringValue(),beginSys001GroupStatRecString,beginSys001GroupStatRecString + SYS_001_GROUP_STAT_REC_STRING_LEN));
   	}




}
  
