package com.cloudframe.app.sf328010.dto.serialize;

/**
*  The class Message6008002Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:27. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Message6008002Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Message6008002Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MESSAGE_6008002_LENGTH = 61;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSys201Written6008002;
	
	/**
	* Constructor for Message6008002Serialized
	**/
    public Message6008002Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Message6008002Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MESSAGE_6008002_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginSys201Written6008002 = getStartOffset() + 50;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSys201Written6008002Counter = -1;
     public boolean isSys201Written6008002Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys201Written6008002Counter != sharedCounter;
         localSys201Written6008002Counter = sharedCounter; return hasModified;
     }
	protected static final int SYS_201_WRITTEN_6008002_LEN = 11;
	/**
	 * 	serialize this Sys201Written6008002
	 */
   protected void serializeSys201Written6008002(char[] sys201Written6008002) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys201Written6008002,0,getStringValue(),beginSys201Written6008002,SYS_201_WRITTEN_6008002_LEN);
       localSys201Written6008002Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys201Written6008002Constraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshSys201Written6008002 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys201Written6008002() {	 
   		return (substring(getStringValue(),beginSys201Written6008002,beginSys201Written6008002 + SYS_201_WRITTEN_6008002_LEN));
   	}




}
  
