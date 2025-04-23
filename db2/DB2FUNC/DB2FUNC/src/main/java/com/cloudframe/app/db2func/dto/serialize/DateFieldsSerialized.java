package com.cloudframe.app.db2func.dto.serialize;

/**
*  The class DateFieldsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DateFieldsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DateFieldsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DATE_FIELDS_LENGTH = 30;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCurrentDate;
            protected  int beginMthsAgoDate18;
            protected  int beginLastDayDt;
	
	/**
	* Constructor for DateFieldsSerialized
	**/
    public DateFieldsSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DateFieldsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DATE_FIELDS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCurrentDate = getStartOffset() + 0;	// set offset for serialization
  
             beginMthsAgoDate18 = getStartOffset() + 10;	// set offset for serialization
  
             beginLastDayDt = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCurrentDateCounter = -1;
     public boolean isCurrentDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrentDateCounter != sharedCounter;
         localCurrentDateCounter = sharedCounter; return hasModified;
     }
	protected static final int CURRENT_DATE_LEN = 10;
	/**
	 * 	serialize this CurrentDate
	 */
   protected void serializeCurrentDate(char[] currentDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(currentDate,0,getStringValue(),beginCurrentDate,CURRENT_DATE_LEN);
       localCurrentDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCurrentDateConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshCurrentDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCurrentDate() {	 
   		return (substring(getStringValue(),beginCurrentDate,beginCurrentDate + CURRENT_DATE_LEN));
   	}
     int localMthsAgoDate18Counter = -1;
     public boolean isMthsAgoDate18Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMthsAgoDate18Counter != sharedCounter;
         localMthsAgoDate18Counter = sharedCounter; return hasModified;
     }
	protected static final int MTHS_AGO_DATE_18_LEN = 10;
	/**
	 * 	serialize this MthsAgoDate18
	 */
   protected void serializeMthsAgoDate18(char[] mthsAgoDate18) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mthsAgoDate18,0,getStringValue(),beginMthsAgoDate18,MTHS_AGO_DATE_18_LEN);
       localMthsAgoDate18Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMthsAgoDate18Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshMthsAgoDate18 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMthsAgoDate18() {	 
   		return (substring(getStringValue(),beginMthsAgoDate18,beginMthsAgoDate18 + MTHS_AGO_DATE_18_LEN));
   	}
     int localLastDayDtCounter = -1;
     public boolean isLastDayDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLastDayDtCounter != sharedCounter;
         localLastDayDtCounter = sharedCounter; return hasModified;
     }
	protected static final int LAST_DAY_DT_LEN = 10;
	/**
	 * 	serialize this LastDayDt
	 */
   protected void serializeLastDayDt(char[] lastDayDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lastDayDt,0,getStringValue(),beginLastDayDt,LAST_DAY_DT_LEN);
       localLastDayDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLastDayDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshLastDayDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLastDayDt() {	 
   		return (substring(getStringValue(),beginLastDayDt,beginLastDayDt + LAST_DAY_DT_LEN));
   	}




}
  
