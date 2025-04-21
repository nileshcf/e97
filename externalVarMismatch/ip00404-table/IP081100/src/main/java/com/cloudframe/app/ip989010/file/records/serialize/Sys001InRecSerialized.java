package com.cloudframe.app.ip989010.file.records.serialize;

/**
*  The class Sys001InRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sys001InRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sys001InRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_001_IN_REC_LENGTH = 200;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSys001InRecString;
	
	/**
	* Constructor for Sys001InRecSerialized
	**/
    public Sys001InRecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Sys001InRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_001_IN_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSys001InRecString = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSys001InRecStringCounter = -1;
     public boolean isSys001InRecStringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys001InRecStringCounter != sharedCounter;
         localSys001InRecStringCounter = sharedCounter; return hasModified;
     }
	protected static final int SYS_001_IN_REC_STRING_LEN = 200;
	/**
	 * 	serialize this Sys001InRecString
	 */
   protected void serializeSys001InRecString(char[] sys001InRecString) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys001InRecString,0,getStringValue(),beginSys001InRecString,SYS_001_IN_REC_STRING_LEN);
       localSys001InRecStringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys001InRecStringConstraints(char[] value) {
   			return super.checkConstraints(value , 200 ,false, false);
   }
    /**
	 *	refreshSys001InRecString is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys001InRecString() {	 
   		return (substring(getStringValue(),beginSys001InRecString,beginSys001InRecString + SYS_001_IN_REC_STRING_LEN));
   	}




}
  
