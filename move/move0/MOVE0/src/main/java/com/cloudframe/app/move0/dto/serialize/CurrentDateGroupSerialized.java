package com.cloudframe.app.move0.dto.serialize;

/**
*  The class CurrentDateGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CurrentDateGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CurrentDateGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CURRENT_DATE_GROUP_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRunDate;
	
	/**
	* Constructor for CurrentDateGroupSerialized
	**/
    public CurrentDateGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in CurrentDateGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CURRENT_DATE_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginRunDate = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRunDateCounter = -1;
     public boolean isRunDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRunDateCounter != sharedCounter;
         localRunDateCounter = sharedCounter; return hasModified;
     }
	protected static final int RUN_DATE_LEN = 10;
	/**
	 * 	serialize this RunDate
	 */
   protected void serializeRunDate(char[] runDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(runDate,0,getStringValue(),beginRunDate,RUN_DATE_LEN);
       localRunDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRunDateConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshRunDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRunDate() {	 
   		return (substring(getStringValue(),beginRunDate,beginRunDate + RUN_DATE_LEN));
   	}




}
  
