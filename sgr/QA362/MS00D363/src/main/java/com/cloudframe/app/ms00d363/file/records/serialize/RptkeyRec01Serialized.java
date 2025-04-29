package com.cloudframe.app.ms00d363.file.records.serialize;

/**
*  The class RptkeyRec01Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RptkeyRec01Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RptkeyRec01Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RPTKEY_REC_01_LENGTH = 80;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRptkeyRecString;
	
	/**
	* Constructor for RptkeyRec01Serialized
	**/
    public RptkeyRec01Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in RptkeyRec01Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RPTKEY_REC_01_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRptkeyRecString = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRptkeyRecStringCounter = -1;
     public boolean isRptkeyRecStringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRptkeyRecStringCounter != sharedCounter;
         localRptkeyRecStringCounter = sharedCounter; return hasModified;
     }
	protected static final int RPTKEY_REC_STRING_LEN = 80;
	/**
	 * 	serialize this RptkeyRecString
	 */
   protected void serializeRptkeyRecString(char[] rptkeyRecString) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rptkeyRecString,0,getStringValue(),beginRptkeyRecString,RPTKEY_REC_STRING_LEN);
       localRptkeyRecStringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRptkeyRecStringConstraints(char[] value) {
   			return super.checkConstraints(value , 80 ,false, false);
   }
    /**
	 *	refreshRptkeyRecString is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRptkeyRecString() {	 
   		return (substring(getStringValue(),beginRptkeyRecString,beginRptkeyRecString + RPTKEY_REC_STRING_LEN));
   	}




}
  
