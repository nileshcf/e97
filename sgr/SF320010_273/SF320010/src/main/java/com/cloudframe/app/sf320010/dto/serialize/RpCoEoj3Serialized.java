package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class RpCoEoj3Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RpCoEoj3Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RpCoEoj3Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RP_CO_EOJ_3_LENGTH = 134;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRpCoEoj3TotalStats;
	
	/**
	* Constructor for RpCoEoj3Serialized
	**/
    public RpCoEoj3Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in RpCoEoj3Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RP_CO_EOJ_3_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
             beginRpCoEoj3TotalStats = getStartOffset() + 44;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localRpCoEoj3TotalStatsCounter = -1;
     public boolean isRpCoEoj3TotalStatsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpCoEoj3TotalStatsCounter != sharedCounter;
         localRpCoEoj3TotalStatsCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_CO_EOJ_3_TOTAL_STATS_LEN = 6;
	/**
	 * 	serialize this RpCoEoj3TotalStats
	 */
   protected void serializeRpCoEoj3TotalStats(char[] rpCoEoj3TotalStats) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpCoEoj3TotalStats,0,getStringValue(),beginRpCoEoj3TotalStats,RP_CO_EOJ_3_TOTAL_STATS_LEN);
       localRpCoEoj3TotalStatsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpCoEoj3TotalStatsConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshRpCoEoj3TotalStats is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpCoEoj3TotalStats() {	 
   		return (substring(getStringValue(),beginRpCoEoj3TotalStats,beginRpCoEoj3TotalStats + RP_CO_EOJ_3_TOTAL_STATS_LEN));
   	}




}
  
