package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class WaCurrentDateGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WaCurrentDateGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WaCurrentDateGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WA_CURRENT_DATE_GROUP_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWaCurrentDate;
	
	/**
	* Constructor for WaCurrentDateGroupSerialized
	**/
    public WaCurrentDateGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WaCurrentDateGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WA_CURRENT_DATE_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWaCurrentDate = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localWaCurrentDateCounter = -1;
     public boolean isWaCurrentDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWaCurrentDateCounter != sharedCounter;
         localWaCurrentDateCounter = sharedCounter; return hasModified;
     }
	protected static final int WA_CURRENT_DATE_LEN = 6;
	/**
	 * 	serialize this WaCurrentDate
	 */
   protected void serializeWaCurrentDate(char[] waCurrentDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(waCurrentDate,0,getStringValue(),beginWaCurrentDate,WA_CURRENT_DATE_LEN);
       localWaCurrentDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWaCurrentDateConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshWaCurrentDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWaCurrentDate() {	 
   		return (substring(getStringValue(),beginWaCurrentDate,beginWaCurrentDate + WA_CURRENT_DATE_LEN));
   	}




}
  
