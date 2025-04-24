package com.cloudframe.app.sf305120.dto.serialize;

/**
*  The class AsciiTextWGroup300Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AsciiTextWGroup300Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AsciiTextWGroup300Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ASCII_TEXT_WGROUP_300_LENGTH = 86;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAsciiText300;
	
	/**
	* Constructor for AsciiTextWGroup300Serialized
	**/
    public AsciiTextWGroup300Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in AsciiTextWGroup300Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ASCII_TEXT_WGROUP_300_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginAsciiText300 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localAsciiText300Counter = -1;
     public boolean isAsciiText300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAsciiText300Counter != sharedCounter;
         localAsciiText300Counter = sharedCounter; return hasModified;
     }
	protected static final int ASCII_TEXT_300_LEN = 86;
	/**
	 * 	serialize this AsciiText300
	 */
   protected void serializeAsciiText300(char[] asciiText300) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(asciiText300,0,getStringValue(),beginAsciiText300,ASCII_TEXT_300_LEN);
       localAsciiText300Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAsciiText300Constraints(char[] value) {
   			return super.checkConstraints(value , 86 ,false, false);
   }
    /**
	 *	refreshAsciiText300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAsciiText300() {	 
   		return (substring(getStringValue(),beginAsciiText300,beginAsciiText300 + ASCII_TEXT_300_LEN));
   	}




}
  
