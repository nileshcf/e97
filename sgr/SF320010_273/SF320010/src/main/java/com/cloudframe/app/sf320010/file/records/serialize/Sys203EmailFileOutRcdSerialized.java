package com.cloudframe.app.sf320010.file.records.serialize;

/**
*  The class Sys203EmailFileOutRcdSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sys203EmailFileOutRcdSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sys203EmailFileOutRcdSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_203_EMAIL_FILE_OUT_RCD_LENGTH = 145;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSys203EmailFileOutRcdString;
	
	/**
	* Constructor for Sys203EmailFileOutRcdSerialized
	**/
    public Sys203EmailFileOutRcdSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Sys203EmailFileOutRcdSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_203_EMAIL_FILE_OUT_RCD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSys203EmailFileOutRcdString = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSys203EmailFileOutRcdStringCounter = -1;
     public boolean isSys203EmailFileOutRcdStringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys203EmailFileOutRcdStringCounter != sharedCounter;
         localSys203EmailFileOutRcdStringCounter = sharedCounter; return hasModified;
     }
	protected static final int SYS_203_EMAIL_FILE_OUT_RCD_STRING_LEN = 145;
	/**
	 * 	serialize this Sys203EmailFileOutRcdString
	 */
   protected void serializeSys203EmailFileOutRcdString(char[] sys203EmailFileOutRcdString) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys203EmailFileOutRcdString,0,getStringValue(),beginSys203EmailFileOutRcdString,SYS_203_EMAIL_FILE_OUT_RCD_STRING_LEN);
       localSys203EmailFileOutRcdStringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys203EmailFileOutRcdStringConstraints(char[] value) {
   			return super.checkConstraints(value , 145 ,false, false);
   }
    /**
	 *	refreshSys203EmailFileOutRcdString is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys203EmailFileOutRcdString() {	 
   		return (substring(getStringValue(),beginSys203EmailFileOutRcdString,beginSys203EmailFileOutRcdString + SYS_203_EMAIL_FILE_OUT_RCD_STRING_LEN));
   	}




}
  
