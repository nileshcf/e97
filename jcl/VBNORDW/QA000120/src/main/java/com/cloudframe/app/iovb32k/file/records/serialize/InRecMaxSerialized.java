package com.cloudframe.app.iovb32k.file.records.serialize;

/**
*  The class InRecMaxSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class InRecMaxSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(InRecMaxSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IN_REC_MAX_LENGTH = 32752;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginInRecMaxString;
	
	/**
	* Constructor for InRecMaxSerialized
	**/
    public InRecMaxSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in InRecMaxSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IN_REC_MAX_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginInRecMaxString = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localInRecMaxStringCounter = -1;
     public boolean isInRecMaxStringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localInRecMaxStringCounter != sharedCounter;
         localInRecMaxStringCounter = sharedCounter; return hasModified;
     }
	protected static final int IN_REC_MAX_STRING_LEN = 32752;
	/**
	 * 	serialize this InRecMaxString
	 */
   protected void serializeInRecMaxString(char[] inRecMaxString) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(inRecMaxString,0,getStringValue(),beginInRecMaxString,IN_REC_MAX_STRING_LEN);
       localInRecMaxStringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkInRecMaxStringConstraints(char[] value) {
   			return super.checkConstraints(value , 32752 ,false, false);
   }
    /**
	 *	refreshInRecMaxString is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshInRecMaxString() {	 
   		return (substring(getStringValue(),beginInRecMaxString,beginInRecMaxString + IN_REC_MAX_STRING_LEN));
   	}




}
  
