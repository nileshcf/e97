package com.cloudframe.app.ip989010.file.records.serialize;

/**
*  The class Sys205OutRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:31. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sys205OutRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sys205OutRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_205_OUT_REC_LENGTH = 200;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSys205OutRecString;
	
	/**
	* Constructor for Sys205OutRecSerialized
	**/
    public Sys205OutRecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Sys205OutRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_205_OUT_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSys205OutRecString = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSys205OutRecStringCounter = -1;
     public boolean isSys205OutRecStringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys205OutRecStringCounter != sharedCounter;
         localSys205OutRecStringCounter = sharedCounter; return hasModified;
     }
	protected static final int SYS_205_OUT_REC_STRING_LEN = 200;
	/**
	 * 	serialize this Sys205OutRecString
	 */
   protected void serializeSys205OutRecString(char[] sys205OutRecString) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys205OutRecString,0,getStringValue(),beginSys205OutRecString,SYS_205_OUT_REC_STRING_LEN);
       localSys205OutRecStringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys205OutRecStringConstraints(char[] value) {
   			return super.checkConstraints(value , 200 ,false, false);
   }
    /**
	 *	refreshSys205OutRecString is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys205OutRecString() {	 
   		return (substring(getStringValue(),beginSys205OutRecString,beginSys205OutRecString + SYS_205_OUT_REC_STRING_LEN));
   	}




}
  
