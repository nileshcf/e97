package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class WaTimeSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:45. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WaTimeSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WaTimeSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WA_TIME_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWaTimeHours;
            protected  int beginWaTimeMinutes;
            protected  int beginWaTimeSeconds;
	
	/**
	* Constructor for WaTimeSerialized
	**/
    public WaTimeSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WaTimeSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WA_TIME_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWaTimeHours = getStartOffset() + 0;	// set offset for serialization
  
  
             beginWaTimeMinutes = getStartOffset() + 3;	// set offset for serialization
  
  
             beginWaTimeSeconds = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWaTimeHoursCounter = -1;
     public boolean isWaTimeHoursModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWaTimeHoursCounter != sharedCounter;
         localWaTimeHoursCounter = sharedCounter; return hasModified;
     }
	protected static final int WA_TIME_HOURS_LEN = 2;
	/**
	 * 	serialize this WaTimeHours
	 */
   protected void serializeWaTimeHours(char[] waTimeHours) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(waTimeHours,0,getStringValue(),beginWaTimeHours,WA_TIME_HOURS_LEN);
       localWaTimeHoursCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWaTimeHoursConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshWaTimeHours is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWaTimeHours() {	 
   		return (substring(getStringValue(),beginWaTimeHours,beginWaTimeHours + WA_TIME_HOURS_LEN));
   	}
     int localWaTimeMinutesCounter = -1;
     public boolean isWaTimeMinutesModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWaTimeMinutesCounter != sharedCounter;
         localWaTimeMinutesCounter = sharedCounter; return hasModified;
     }
	protected static final int WA_TIME_MINUTES_LEN = 2;
	/**
	 * 	serialize this WaTimeMinutes
	 */
   protected void serializeWaTimeMinutes(char[] waTimeMinutes) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(waTimeMinutes,0,getStringValue(),beginWaTimeMinutes,WA_TIME_MINUTES_LEN);
       localWaTimeMinutesCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWaTimeMinutesConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshWaTimeMinutes is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWaTimeMinutes() {	 
   		return (substring(getStringValue(),beginWaTimeMinutes,beginWaTimeMinutes + WA_TIME_MINUTES_LEN));
   	}
     int localWaTimeSecondsCounter = -1;
     public boolean isWaTimeSecondsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWaTimeSecondsCounter != sharedCounter;
         localWaTimeSecondsCounter = sharedCounter; return hasModified;
     }
	protected static final int WA_TIME_SECONDS_LEN = 2;
	/**
	 * 	serialize this WaTimeSeconds
	 */
   protected void serializeWaTimeSeconds(char[] waTimeSeconds) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(waTimeSeconds,0,getStringValue(),beginWaTimeSeconds,WA_TIME_SECONDS_LEN);
       localWaTimeSecondsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWaTimeSecondsConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshWaTimeSeconds is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWaTimeSeconds() {	 
   		return (substring(getStringValue(),beginWaTimeSeconds,beginWaTimeSeconds + WA_TIME_SECONDS_LEN));
   	}




}
  
