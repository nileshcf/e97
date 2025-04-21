package com.cloudframe.app.cfsort09.file.records.serialize;

/**
*  The class DisplayRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DisplayRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DisplayRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DISPLAY_RECORD_LENGTH = 133;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDisplayStr;
	
	/**
	* Constructor for DisplayRecordSerialized
	**/
    public DisplayRecordSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DisplayRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DISPLAY_RECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDisplayStr = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localDisplayStrCounter = -1;
     public boolean isDisplayStrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDisplayStrCounter != sharedCounter;
         localDisplayStrCounter = sharedCounter; return hasModified;
     }
	protected static final int DISPLAY_STR_LEN = 133;
	/**
	 * 	serialize this DisplayStr
	 */
   protected void serializeDisplayStr(char[] displayStr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(displayStr,0,getStringValue(),beginDisplayStr,DISPLAY_STR_LEN);
       localDisplayStrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDisplayStrConstraints(char[] value) {
   			return super.checkConstraints(value , 133 ,false, false);
   }
    /**
	 *	refreshDisplayStr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDisplayStr() {	 
   		return (substring(getStringValue(),beginDisplayStr,beginDisplayStr + DISPLAY_STR_LEN));
   	}




}
  
