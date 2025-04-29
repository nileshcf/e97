package com.cloudframe.app.ip606130.dto.serialize;

/**
*  The class InavalidDateMsg600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:24. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class InavalidDateMsg600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(InavalidDateMsg600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int INAVALID_DATE_MSG_600_LENGTH = 26;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginInvalidJulianDate600;
	
	/**
	* Constructor for InavalidDateMsg600Serialized
	**/
    public InavalidDateMsg600Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in InavalidDateMsg600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(INAVALID_DATE_MSG_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginInvalidJulianDate600 = getStartOffset() + 21;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localInvalidJulianDate600Counter = -1;
     public boolean isInvalidJulianDate600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localInvalidJulianDate600Counter != sharedCounter;
         localInvalidJulianDate600Counter = sharedCounter; return hasModified;
     }
	protected static final int INVALID_JULIAN_DATE_600_LEN = 5;
	/**
	 * 	serialize this InvalidJulianDate600
	 */
   protected void serializeInvalidJulianDate600(char[] invalidJulianDate600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(invalidJulianDate600,0,getStringValue(),beginInvalidJulianDate600,INVALID_JULIAN_DATE_600_LEN);
       localInvalidJulianDate600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkInvalidJulianDate600Constraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshInvalidJulianDate600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshInvalidJulianDate600() {	 
   		return (substring(getStringValue(),beginInvalidJulianDate600,beginInvalidJulianDate600 + INVALID_JULIAN_DATE_600_LEN));
   	}




}
  
