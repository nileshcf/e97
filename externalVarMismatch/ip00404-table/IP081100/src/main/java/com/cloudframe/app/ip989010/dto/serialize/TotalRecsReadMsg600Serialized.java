package com.cloudframe.app.ip989010.dto.serialize;

/**
*  The class TotalRecsReadMsg600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:34. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TotalRecsReadMsg600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TotalRecsReadMsg600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TOTAL_RECS_READ_MSG_600_LENGTH = 58;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRecsReadDd600;
            protected  int beginRecsReadCount600;
	
	/**
	* Constructor for TotalRecsReadMsg600Serialized
	**/
    public TotalRecsReadMsg600Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in TotalRecsReadMsg600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TOTAL_RECS_READ_MSG_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
             beginRecsReadDd600 = getStartOffset() + 38;	// set offset for serialization
  
  
             beginRecsReadCount600 = getStartOffset() + 47;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRecsReadDd600Counter = -1;
     public boolean isRecsReadDd600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRecsReadDd600Counter != sharedCounter;
         localRecsReadDd600Counter = sharedCounter; return hasModified;
     }
	protected static final int RECS_READ_DD_600_LEN = 6;
	/**
	 * 	serialize this RecsReadDd600
	 */
   protected void serializeRecsReadDd600(char[] recsReadDd600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(recsReadDd600,0,getStringValue(),beginRecsReadDd600,RECS_READ_DD_600_LEN);
       localRecsReadDd600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRecsReadDd600Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshRecsReadDd600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRecsReadDd600() {	 
   		return (substring(getStringValue(),beginRecsReadDd600,beginRecsReadDd600 + RECS_READ_DD_600_LEN));
   	}
     int localRecsReadCount600Counter = -1;
     public boolean isRecsReadCount600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRecsReadCount600Counter != sharedCounter;
         localRecsReadCount600Counter = sharedCounter; return hasModified;
     }
	protected static final int RECS_READ_COUNT_600_LEN = 11;
	/**
	 * 	serialize this RecsReadCount600
	 */
   protected void serializeRecsReadCount600(char[] recsReadCount600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(recsReadCount600,0,getStringValue(),beginRecsReadCount600,RECS_READ_COUNT_600_LEN);
       localRecsReadCount600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRecsReadCount600Constraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshRecsReadCount600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRecsReadCount600() {	 
   		return (substring(getStringValue(),beginRecsReadCount600,beginRecsReadCount600 + RECS_READ_COUNT_600_LEN));
   	}




}
  
