package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class WaDateSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WaDateSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WaDateSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WA_DATE_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWaDateMonth;
            protected  int beginWaDateDay;
            protected  int beginWaDateYear;
	
	/**
	* Constructor for WaDateSerialized
	**/
    public WaDateSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WaDateSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WA_DATE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWaDateMonth = getStartOffset() + 0;	// set offset for serialization
  
  
             beginWaDateDay = getStartOffset() + 3;	// set offset for serialization
  
  
             beginWaDateYear = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWaDateMonthCounter = -1;
     public boolean isWaDateMonthModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWaDateMonthCounter != sharedCounter;
         localWaDateMonthCounter = sharedCounter; return hasModified;
     }
	protected static final int WA_DATE_MONTH_LEN = 2;
	/**
	 * 	serialize this WaDateMonth
	 */
   protected void serializeWaDateMonth(char[] waDateMonth) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(waDateMonth,0,getStringValue(),beginWaDateMonth,WA_DATE_MONTH_LEN);
       localWaDateMonthCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWaDateMonthConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshWaDateMonth is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWaDateMonth() {	 
   		return (substring(getStringValue(),beginWaDateMonth,beginWaDateMonth + WA_DATE_MONTH_LEN));
   	}
     int localWaDateDayCounter = -1;
     public boolean isWaDateDayModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWaDateDayCounter != sharedCounter;
         localWaDateDayCounter = sharedCounter; return hasModified;
     }
	protected static final int WA_DATE_DAY_LEN = 2;
	/**
	 * 	serialize this WaDateDay
	 */
   protected void serializeWaDateDay(char[] waDateDay) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(waDateDay,0,getStringValue(),beginWaDateDay,WA_DATE_DAY_LEN);
       localWaDateDayCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWaDateDayConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshWaDateDay is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWaDateDay() {	 
   		return (substring(getStringValue(),beginWaDateDay,beginWaDateDay + WA_DATE_DAY_LEN));
   	}
     int localWaDateYearCounter = -1;
     public boolean isWaDateYearModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWaDateYearCounter != sharedCounter;
         localWaDateYearCounter = sharedCounter; return hasModified;
     }
	protected static final int WA_DATE_YEAR_LEN = 2;
	/**
	 * 	serialize this WaDateYear
	 */
   protected void serializeWaDateYear(char[] waDateYear) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(waDateYear,0,getStringValue(),beginWaDateYear,WA_DATE_YEAR_LEN);
       localWaDateYearCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWaDateYearConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshWaDateYear is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWaDateYear() {	 
   		return (substring(getStringValue(),beginWaDateYear,beginWaDateYear + WA_DATE_YEAR_LEN));
   	}




}
  
