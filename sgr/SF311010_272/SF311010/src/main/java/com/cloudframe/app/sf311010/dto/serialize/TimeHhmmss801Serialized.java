package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class TimeHhmmss801Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TimeHhmmss801Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TimeHhmmss801Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TIME_HHMMSS_801_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTimeHh801;
            protected  int beginTimeMm801;
            protected  int beginTimeSs801;
	
	/**
	* Constructor for TimeHhmmss801Serialized
	**/
    public TimeHhmmss801Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in TimeHhmmss801Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TIME_HHMMSS_801_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTimeHh801 = getStartOffset() + 0;	// set offset for serialization
  
             beginTimeMm801 = getStartOffset() + 2;	// set offset for serialization
  
             beginTimeSs801 = getStartOffset() + 4;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localTimeHh801Counter = -1;
     public boolean isTimeHh801Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTimeHh801Counter != sharedCounter;
         localTimeHh801Counter = sharedCounter; return hasModified;
     }
	protected static final int TIME_HH_801_LEN = 2;
	/**
	 * 	serialize this TimeHh801
	 */
   protected void serializeTimeHh801(char[] timeHh801) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(timeHh801,0,getStringValue(),beginTimeHh801,TIME_HH_801_LEN);
       localTimeHh801Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTimeHh801Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshTimeHh801 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTimeHh801() {	 
   		return (substring(getStringValue(),beginTimeHh801,beginTimeHh801 + TIME_HH_801_LEN));
   	}
     int localTimeMm801Counter = -1;
     public boolean isTimeMm801Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTimeMm801Counter != sharedCounter;
         localTimeMm801Counter = sharedCounter; return hasModified;
     }
	protected static final int TIME_MM_801_LEN = 2;
	/**
	 * 	serialize this TimeMm801
	 */
   protected void serializeTimeMm801(char[] timeMm801) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(timeMm801,0,getStringValue(),beginTimeMm801,TIME_MM_801_LEN);
       localTimeMm801Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTimeMm801Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshTimeMm801 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTimeMm801() {	 
   		return (substring(getStringValue(),beginTimeMm801,beginTimeMm801 + TIME_MM_801_LEN));
   	}
     int localTimeSs801Counter = -1;
     public boolean isTimeSs801Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTimeSs801Counter != sharedCounter;
         localTimeSs801Counter = sharedCounter; return hasModified;
     }
	protected static final int TIME_SS_801_LEN = 2;
	/**
	 * 	serialize this TimeSs801
	 */
   protected void serializeTimeSs801(char[] timeSs801) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(timeSs801,0,getStringValue(),beginTimeSs801,TIME_SS_801_LEN);
       localTimeSs801Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTimeSs801Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshTimeSs801 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTimeSs801() {	 
   		return (substring(getStringValue(),beginTimeSs801,beginTimeSs801 + TIME_SS_801_LEN));
   	}




}
  
