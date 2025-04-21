package com.cloudframe.app.sf327010.file.records.serialize;

/**
*  The class Group1Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:04. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Group1Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Group1Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int GROUP_1_LENGTH = 75;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFillerString;
	
	/**
	* Constructor for Group1Serialized
	**/
    public Group1Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Group1Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(GROUP_1_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFillerString = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFillerStringCounter = -1;
     public boolean isFillerStringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFillerStringCounter != sharedCounter;
         localFillerStringCounter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_STRING_LEN = 75;
	/**
	 * 	serialize this FillerString
	 */
   protected void serializeFillerString(char[] fillerString) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fillerString,0,getStringValue(),beginFillerString,FILLER_STRING_LEN);
       localFillerStringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFillerStringConstraints(char[] value) {
   			return super.checkConstraints(value , 75 ,false, false);
   }
    /**
	 *	refreshFillerString is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFillerString() {	 
   		return (substring(getStringValue(),beginFillerString,beginFillerString + FILLER_STRING_LEN));
   	}




}
  
