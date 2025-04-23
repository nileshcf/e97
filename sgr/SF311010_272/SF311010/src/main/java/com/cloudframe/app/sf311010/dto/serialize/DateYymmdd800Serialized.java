package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class DateYymmdd800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:27. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DateYymmdd800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DateYymmdd800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DATE_YYMMDD_800_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDateYy800;
            protected  int beginDateMm800;
            protected  int beginDateDd800;
	
	/**
	* Constructor for DateYymmdd800Serialized
	**/
    public DateYymmdd800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DateYymmdd800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DATE_YYMMDD_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDateYy800 = getStartOffset() + 0;	// set offset for serialization
  
             beginDateMm800 = getStartOffset() + 2;	// set offset for serialization
  
             beginDateDd800 = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localDateYy800Counter = -1;
     public boolean isDateYy800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDateYy800Counter != sharedCounter;
         localDateYy800Counter = sharedCounter; return hasModified;
     }
	protected static final int DATE_YY_800_LEN = 2;
	/**
	 * 	serialize this DateYy800
	 */
   protected void serializeDateYy800(char[] dateYy800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dateYy800,0,getStringValue(),beginDateYy800,DATE_YY_800_LEN);
       localDateYy800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDateYy800Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDateYy800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDateYy800() {	 
   		return (substring(getStringValue(),beginDateYy800,beginDateYy800 + DATE_YY_800_LEN));
   	}
     int localDateMm800Counter = -1;
     public boolean isDateMm800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDateMm800Counter != sharedCounter;
         localDateMm800Counter = sharedCounter; return hasModified;
     }
	protected static final int DATE_MM_800_LEN = 2;
	/**
	 * 	serialize this DateMm800
	 */
   protected void serializeDateMm800(char[] dateMm800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dateMm800,0,getStringValue(),beginDateMm800,DATE_MM_800_LEN);
       localDateMm800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDateMm800Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDateMm800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDateMm800() {	 
   		return (substring(getStringValue(),beginDateMm800,beginDateMm800 + DATE_MM_800_LEN));
   	}
     int localDateDd800Counter = -1;
     public boolean isDateDd800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDateDd800Counter != sharedCounter;
         localDateDd800Counter = sharedCounter; return hasModified;
     }
	protected static final int DATE_DD_800_LEN = 2;
	/**
	 * 	serialize this DateDd800
	 */
   protected void serializeDateDd800(char[] dateDd800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dateDd800,0,getStringValue(),beginDateDd800,DATE_DD_800_LEN);
       localDateDd800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDateDd800Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDateDd800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDateDd800() {	 
   		return (substring(getStringValue(),beginDateDd800,beginDateDd800 + DATE_DD_800_LEN));
   	}




}
  
