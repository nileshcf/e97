package com.cloudframe.app.vsammon7.dto.serialize;

/**
*  The class MonitorFileStatusSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:31. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MonitorFileStatusSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MonitorFileStatusSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MONITOR_FILE_STATUS_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginStaInStat1;
	
	/**
	* Constructor for MonitorFileStatusSerialized
	**/
    public MonitorFileStatusSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in MonitorFileStatusSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MONITOR_FILE_STATUS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginStaInStat1 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localStaInStat1Counter = -1;
     public boolean isStaInStat1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localStaInStat1Counter != sharedCounter;
         localStaInStat1Counter = sharedCounter; return hasModified;
     }
	protected static final int STA_IN_STAT_1_LEN = 1;
	/**
	 * 	serialize this StaInStat1
	 */
   protected void serializeStaInStat1(char[] staInStat1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(staInStat1,0,getStringValue(),beginStaInStat1,STA_IN_STAT_1_LEN);
       localStaInStat1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkStaInStat1Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshStaInStat1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshStaInStat1() {	 
   		return (substring(getStringValue(),beginStaInStat1,beginStaInStat1 + STA_IN_STAT_1_LEN));
   	}




}
  
