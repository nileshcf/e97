package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class IsDebugSwOnGroup100Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:09. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class IsDebugSwOnGroup100Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(IsDebugSwOnGroup100Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IS_DEBUG_SW_ON_GROUP_100_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIsDebugSwOn100;
	
	/**
	* Constructor for IsDebugSwOnGroup100Serialized
	**/
    public IsDebugSwOnGroup100Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in IsDebugSwOnGroup100Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IS_DEBUG_SW_ON_GROUP_100_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIsDebugSwOn100 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIsDebugSwOn100Counter = -1;
     public boolean isIsDebugSwOn100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIsDebugSwOn100Counter != sharedCounter;
         localIsDebugSwOn100Counter = sharedCounter; return hasModified;
     }
	protected static final int IS_DEBUG_SW_ON_100_LEN = 1;
	/**
	 * 	serialize this IsDebugSwOn100
	 */
   protected void serializeIsDebugSwOn100(char[] isDebugSwOn100) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(isDebugSwOn100,0,getStringValue(),beginIsDebugSwOn100,IS_DEBUG_SW_ON_100_LEN);
       localIsDebugSwOn100Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIsDebugSwOn100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIsDebugSwOn100 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIsDebugSwOn100() {	 
   		return (substring(getStringValue(),beginIsDebugSwOn100,beginIsDebugSwOn100 + IS_DEBUG_SW_ON_100_LEN));
   	}




}
  
