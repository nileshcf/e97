package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class EndOfFileIndicator800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:06. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class EndOfFileIndicator800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(EndOfFileIndicator800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int END_OF_FILE_INDICATOR_800_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginEofIndicator800;
	
	/**
	* Constructor for EndOfFileIndicator800Serialized
	**/
    public EndOfFileIndicator800Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in EndOfFileIndicator800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(END_OF_FILE_INDICATOR_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginEofIndicator800 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localEofIndicator800Counter = -1;
     public boolean isEofIndicator800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEofIndicator800Counter != sharedCounter;
         localEofIndicator800Counter = sharedCounter; return hasModified;
     }
	protected static final int EOF_INDICATOR_800_LEN = 2;
	/**
	 * 	serialize this EofIndicator800
	 */
   protected void serializeEofIndicator800(char[] eofIndicator800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(eofIndicator800,0,getStringValue(),beginEofIndicator800,EOF_INDICATOR_800_LEN);
       localEofIndicator800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEofIndicator800Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshEofIndicator800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEofIndicator800() {	 
   		return (substring(getStringValue(),beginEofIndicator800,beginEofIndicator800 + EOF_INDICATOR_800_LEN));
   	}




}
  
