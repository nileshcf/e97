package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class Time801Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:05. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Time801Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Time801Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TIME_801_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTimeHours801;
            protected  int beginTimeMinutes801;
            protected  int beginTimeSeconds801;
	
	/**
	* Constructor for Time801Serialized
	**/
    public Time801Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Time801Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TIME_801_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTimeHours801 = getStartOffset() + 0;	// set offset for serialization
  
  
             beginTimeMinutes801 = getStartOffset() + 3;	// set offset for serialization
  
  
             beginTimeSeconds801 = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localTimeHours801Counter = -1;
     public boolean isTimeHours801Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTimeHours801Counter != sharedCounter;
         localTimeHours801Counter = sharedCounter; return hasModified;
     }
	protected static final int TIME_HOURS_801_LEN = 2;
	/**
	 * 	serialize this TimeHours801
	 */
   protected void serializeTimeHours801(char[] timeHours801) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(timeHours801,0,getStringValue(),beginTimeHours801,TIME_HOURS_801_LEN);
       localTimeHours801Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTimeHours801Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshTimeHours801 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTimeHours801() {	 
   		return (substring(getStringValue(),beginTimeHours801,beginTimeHours801 + TIME_HOURS_801_LEN));
   	}
     int localTimeMinutes801Counter = -1;
     public boolean isTimeMinutes801Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTimeMinutes801Counter != sharedCounter;
         localTimeMinutes801Counter = sharedCounter; return hasModified;
     }
	protected static final int TIME_MINUTES_801_LEN = 2;
	/**
	 * 	serialize this TimeMinutes801
	 */
   protected void serializeTimeMinutes801(char[] timeMinutes801) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(timeMinutes801,0,getStringValue(),beginTimeMinutes801,TIME_MINUTES_801_LEN);
       localTimeMinutes801Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTimeMinutes801Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshTimeMinutes801 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTimeMinutes801() {	 
   		return (substring(getStringValue(),beginTimeMinutes801,beginTimeMinutes801 + TIME_MINUTES_801_LEN));
   	}
     int localTimeSeconds801Counter = -1;
     public boolean isTimeSeconds801Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTimeSeconds801Counter != sharedCounter;
         localTimeSeconds801Counter = sharedCounter; return hasModified;
     }
	protected static final int TIME_SECONDS_801_LEN = 2;
	/**
	 * 	serialize this TimeSeconds801
	 */
   protected void serializeTimeSeconds801(char[] timeSeconds801) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(timeSeconds801,0,getStringValue(),beginTimeSeconds801,TIME_SECONDS_801_LEN);
       localTimeSeconds801Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTimeSeconds801Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshTimeSeconds801 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTimeSeconds801() {	 
   		return (substring(getStringValue(),beginTimeSeconds801,beginTimeSeconds801 + TIME_SECONDS_801_LEN));
   	}




}
  
