package com.cloudframe.app.callvp77.file.records.serialize;

/**
*  The class OutputRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:21. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class OutputRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(OutputRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int OUTPUT_REC_LENGTH = 132;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginOutputRecString;
	
	/**
	* Constructor for OutputRecSerialized
	**/
    public OutputRecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in OutputRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(OUTPUT_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginOutputRecString = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localOutputRecStringCounter = -1;
     public boolean isOutputRecStringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOutputRecStringCounter != sharedCounter;
         localOutputRecStringCounter = sharedCounter; return hasModified;
     }
	protected static final int OUTPUT_REC_STRING_LEN = 132;
	/**
	 * 	serialize this OutputRecString
	 */
   protected void serializeOutputRecString(char[] outputRecString) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(outputRecString,0,getStringValue(),beginOutputRecString,OUTPUT_REC_STRING_LEN);
       localOutputRecStringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkOutputRecStringConstraints(char[] value) {
   			return super.checkConstraints(value , 132 ,false, false);
   }
    /**
	 *	refreshOutputRecString is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshOutputRecString() {	 
   		return (substring(getStringValue(),beginOutputRecString,beginOutputRecString + OUTPUT_REC_STRING_LEN));
   	}




}
  
