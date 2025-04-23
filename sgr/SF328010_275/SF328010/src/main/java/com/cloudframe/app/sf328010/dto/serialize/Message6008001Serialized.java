package com.cloudframe.app.sf328010.dto.serialize;

/**
*  The class Message6008001Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:24. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Message6008001Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Message6008001Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MESSAGE_6008001_LENGTH = 61;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSys001Read6008001;
	
	/**
	* Constructor for Message6008001Serialized
	**/
    public Message6008001Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Message6008001Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MESSAGE_6008001_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginSys001Read6008001 = getStartOffset() + 50;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSys001Read6008001Counter = -1;
     public boolean isSys001Read6008001Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys001Read6008001Counter != sharedCounter;
         localSys001Read6008001Counter = sharedCounter; return hasModified;
     }
	protected static final int SYS_001_READ_6008001_LEN = 11;
	/**
	 * 	serialize this Sys001Read6008001
	 */
   protected void serializeSys001Read6008001(char[] sys001Read6008001) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys001Read6008001,0,getStringValue(),beginSys001Read6008001,SYS_001_READ_6008001_LEN);
       localSys001Read6008001Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys001Read6008001Constraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshSys001Read6008001 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys001Read6008001() {	 
   		return (substring(getStringValue(),beginSys001Read6008001,beginSys001Read6008001 + SYS_001_READ_6008001_LEN));
   	}




}
  
