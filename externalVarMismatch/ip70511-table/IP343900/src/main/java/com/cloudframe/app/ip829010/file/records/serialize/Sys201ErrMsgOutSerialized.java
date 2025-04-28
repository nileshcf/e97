package com.cloudframe.app.ip829010.file.records.serialize;

/**
*  The class Sys201ErrMsgOutSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sys201ErrMsgOutSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sys201ErrMsgOutSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_201_ERR_MSG_OUT_LENGTH = 280;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSys201ErrMsgOutString;
	
	/**
	* Constructor for Sys201ErrMsgOutSerialized
	**/
    public Sys201ErrMsgOutSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Sys201ErrMsgOutSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_201_ERR_MSG_OUT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSys201ErrMsgOutString = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSys201ErrMsgOutStringCounter = -1;
     public boolean isSys201ErrMsgOutStringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys201ErrMsgOutStringCounter != sharedCounter;
         localSys201ErrMsgOutStringCounter = sharedCounter; return hasModified;
     }
	protected static final int SYS_201_ERR_MSG_OUT_STRING_LEN = 280;
	/**
	 * 	serialize this Sys201ErrMsgOutString
	 */
   protected void serializeSys201ErrMsgOutString(char[] sys201ErrMsgOutString) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys201ErrMsgOutString,0,getStringValue(),beginSys201ErrMsgOutString,SYS_201_ERR_MSG_OUT_STRING_LEN);
       localSys201ErrMsgOutStringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys201ErrMsgOutStringConstraints(char[] value) {
   			return super.checkConstraints(value , 280 ,false, false);
   }
    /**
	 *	refreshSys201ErrMsgOutString is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys201ErrMsgOutString() {	 
   		return (substring(getStringValue(),beginSys201ErrMsgOutString,beginSys201ErrMsgOutString + SYS_201_ERR_MSG_OUT_STRING_LEN));
   	}




}
  
