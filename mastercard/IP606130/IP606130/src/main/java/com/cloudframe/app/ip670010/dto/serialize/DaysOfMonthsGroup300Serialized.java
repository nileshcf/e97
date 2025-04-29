package com.cloudframe.app.ip670010.dto.serialize;

/**
*  The class DaysOfMonthsGroup300Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:17. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DaysOfMonthsGroup300Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DaysOfMonthsGroup300Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DAYS_OF_MONTHS_GROUP_300_LENGTH = 24;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDaysOfMonths300;
	
	/**
	* Constructor for DaysOfMonthsGroup300Serialized
	**/
    public DaysOfMonthsGroup300Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DaysOfMonthsGroup300Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DAYS_OF_MONTHS_GROUP_300_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDaysOfMonths300 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localDaysOfMonths300Counter = -1;
     public boolean isDaysOfMonths300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDaysOfMonths300Counter != sharedCounter;
         localDaysOfMonths300Counter = sharedCounter; return hasModified;
     }
	protected static final int DAYS_OF_MONTHS_300_LEN = 24;
	/**
	 * 	serialize this DaysOfMonths300
	 */
   protected void serializeDaysOfMonths300(char[] daysOfMonths300) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(daysOfMonths300,0,getStringValue(),beginDaysOfMonths300,DAYS_OF_MONTHS_300_LEN);
       localDaysOfMonths300Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDaysOfMonths300Constraints(char[] value) {
   			return super.checkConstraints(value , 24 ,false, false);
   }
    /**
	 *	refreshDaysOfMonths300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDaysOfMonths300() {	 
   		return (substring(getStringValue(),beginDaysOfMonths300,beginDaysOfMonths300 + DAYS_OF_MONTHS_300_LEN));
   	}




}
  
