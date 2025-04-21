package com.cloudframe.app.ip989010.dto.serialize;

/**
*  The class TotalRecsWrittenMsg600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TotalRecsWrittenMsg600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TotalRecsWrittenMsg600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TOTAL_RECS_WRITTEN_MSG_600_LENGTH = 58;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRecsWritDd600;
            protected  int beginRecsWritCount600;
	
	/**
	* Constructor for TotalRecsWrittenMsg600Serialized
	**/
    public TotalRecsWrittenMsg600Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in TotalRecsWrittenMsg600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TOTAL_RECS_WRITTEN_MSG_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
             beginRecsWritDd600 = getStartOffset() + 39;	// set offset for serialization
  
  
             beginRecsWritCount600 = getStartOffset() + 47;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRecsWritDd600Counter = -1;
     public boolean isRecsWritDd600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRecsWritDd600Counter != sharedCounter;
         localRecsWritDd600Counter = sharedCounter; return hasModified;
     }
	protected static final int RECS_WRIT_DD_600_LEN = 6;
	/**
	 * 	serialize this RecsWritDd600
	 */
   protected void serializeRecsWritDd600(char[] recsWritDd600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(recsWritDd600,0,getStringValue(),beginRecsWritDd600,RECS_WRIT_DD_600_LEN);
       localRecsWritDd600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRecsWritDd600Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshRecsWritDd600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRecsWritDd600() {	 
   		return (substring(getStringValue(),beginRecsWritDd600,beginRecsWritDd600 + RECS_WRIT_DD_600_LEN));
   	}
     int localRecsWritCount600Counter = -1;
     public boolean isRecsWritCount600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRecsWritCount600Counter != sharedCounter;
         localRecsWritCount600Counter = sharedCounter; return hasModified;
     }
	protected static final int RECS_WRIT_COUNT_600_LEN = 11;
	/**
	 * 	serialize this RecsWritCount600
	 */
   protected void serializeRecsWritCount600(char[] recsWritCount600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(recsWritCount600,0,getStringValue(),beginRecsWritCount600,RECS_WRIT_COUNT_600_LEN);
       localRecsWritCount600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRecsWritCount600Constraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshRecsWritCount600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRecsWritCount600() {	 
   		return (substring(getStringValue(),beginRecsWritCount600,beginRecsWritCount600 + RECS_WRIT_COUNT_600_LEN));
   	}




}
  
