package com.cloudframe.app.ip809050.dto.serialize;

/**
*  The class DateCcyymmdd800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DateCcyymmdd800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DateCcyymmdd800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DATE_CCYYMMDD_800_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDateYymmdd800;
	
	/**
	* Constructor for DateCcyymmdd800Serialized
	**/
    public DateCcyymmdd800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DateCcyymmdd800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DATE_CCYYMMDD_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDateYymmdd800 = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localDateYymmdd800Counter = -1;
     public boolean isDateYymmdd800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDateYymmdd800Counter != sharedCounter;
         localDateYymmdd800Counter = sharedCounter; return hasModified;
     }
	protected static final int DATE_YYMMDD_800_LEN = 6;
	/**
	 * 	serialize this DateYymmdd800
	 */
   protected void serializeDateYymmdd800(char[] dateYymmdd800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dateYymmdd800,0,getStringValue(),beginDateYymmdd800,DATE_YYMMDD_800_LEN);
       localDateYymmdd800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDateYymmdd800Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshDateYymmdd800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDateYymmdd800() {	 
   		return (substring(getStringValue(),beginDateYymmdd800,beginDateYymmdd800 + DATE_YYMMDD_800_LEN));
   	}




}
  
