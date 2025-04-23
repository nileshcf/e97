package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class WarningTableGroup580Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:33. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WarningTableGroup580Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WarningTableGroup580Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WARNING_TABLE_GROUP_580_LENGTH = 648;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWarningTable580;
	
	/**
	* Constructor for WarningTableGroup580Serialized
	**/
    public WarningTableGroup580Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WarningTableGroup580Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WARNING_TABLE_GROUP_580_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWarningTable580 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localWarningTable580Counter = -1;
     public boolean isWarningTable580Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWarningTable580Counter != sharedCounter;
         localWarningTable580Counter = sharedCounter; return hasModified;
     }
	protected static final int WARNING_TABLE_580_LEN = 648;
	/**
	 * 	serialize this WarningTable580
	 */
   protected void serializeWarningTable580(char[] warningTable580) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(warningTable580,0,getStringValue(),beginWarningTable580,WARNING_TABLE_580_LEN);
       localWarningTable580Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWarningTable580Constraints(char[] value) {
   			return super.checkConstraints(value , 648 ,false, false);
   }
    /**
	 *	refreshWarningTable580 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWarningTable580() {	 
   		return (substring(getStringValue(),beginWarningTable580,beginWarningTable580 + WARNING_TABLE_580_LEN));
   	}




}
  
