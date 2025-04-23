package com.cloudframe.app.ip989010.file.records.serialize;

/**
*  The class Sys002InRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:08. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sys002InRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sys002InRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_002_IN_REC_LENGTH = 200;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSys002InRecString;
	
	/**
	* Constructor for Sys002InRecSerialized
	**/
    public Sys002InRecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Sys002InRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_002_IN_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSys002InRecString = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSys002InRecStringCounter = -1;
     public boolean isSys002InRecStringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys002InRecStringCounter != sharedCounter;
         localSys002InRecStringCounter = sharedCounter; return hasModified;
     }
	protected static final int SYS_002_IN_REC_STRING_LEN = 200;
	/**
	 * 	serialize this Sys002InRecString
	 */
   protected void serializeSys002InRecString(char[] sys002InRecString) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys002InRecString,0,getStringValue(),beginSys002InRecString,SYS_002_IN_REC_STRING_LEN);
       localSys002InRecStringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys002InRecStringConstraints(char[] value) {
   			return super.checkConstraints(value , 200 ,false, false);
   }
    /**
	 *	refreshSys002InRecString is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys002InRecString() {	 
   		return (substring(getStringValue(),beginSys002InRecString,beginSys002InRecString + SYS_002_IN_REC_STRING_LEN));
   	}




}
  
