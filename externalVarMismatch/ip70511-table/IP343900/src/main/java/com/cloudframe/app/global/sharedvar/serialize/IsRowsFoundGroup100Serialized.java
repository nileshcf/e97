package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class IsRowsFoundGroup100Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class IsRowsFoundGroup100Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(IsRowsFoundGroup100Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IS_ROWS_FOUND_GROUP_100_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIsRowsFound100;
	
	/**
	* Constructor for IsRowsFoundGroup100Serialized
	**/
    public IsRowsFoundGroup100Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in IsRowsFoundGroup100Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IS_ROWS_FOUND_GROUP_100_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIsRowsFound100 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIsRowsFound100Counter = -1;
     public boolean isIsRowsFound100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIsRowsFound100Counter != sharedCounter;
         localIsRowsFound100Counter = sharedCounter; return hasModified;
     }
	protected static final int IS_ROWS_FOUND_100_LEN = 1;
	/**
	 * 	serialize this IsRowsFound100
	 */
   protected void serializeIsRowsFound100(char[] isRowsFound100) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(isRowsFound100,0,getStringValue(),beginIsRowsFound100,IS_ROWS_FOUND_100_LEN);
       localIsRowsFound100Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIsRowsFound100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIsRowsFound100 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIsRowsFound100() {	 
   		return (substring(getStringValue(),beginIsRowsFound100,beginIsRowsFound100 + IS_ROWS_FOUND_100_LEN));
   	}




}
  
