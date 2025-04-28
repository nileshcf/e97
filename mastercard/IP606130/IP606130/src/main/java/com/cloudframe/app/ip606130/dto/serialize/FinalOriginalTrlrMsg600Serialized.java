package com.cloudframe.app.ip606130.dto.serialize;

/**
*  The class FinalOriginalTrlrMsg600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:54. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FinalOriginalTrlrMsg600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FinalOriginalTrlrMsg600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FINAL_ORIGINAL_TRLR_MSG_600_LENGTH = 54;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFinalTrlrOriginalCnt600;
	
	/**
	* Constructor for FinalOriginalTrlrMsg600Serialized
	**/
    public FinalOriginalTrlrMsg600Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in FinalOriginalTrlrMsg600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FINAL_ORIGINAL_TRLR_MSG_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginFinalTrlrOriginalCnt600 = getStartOffset() + 44;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFinalTrlrOriginalCnt600Counter = -1;
     public boolean isFinalTrlrOriginalCnt600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFinalTrlrOriginalCnt600Counter != sharedCounter;
         localFinalTrlrOriginalCnt600Counter = sharedCounter; return hasModified;
     }
	protected static final int FINAL_TRLR_ORIGINAL_CNT_600_LEN = 10;
	/**
	 * 	serialize this FinalTrlrOriginalCnt600
	 */
   protected void serializeFinalTrlrOriginalCnt600(char[] finalTrlrOriginalCnt600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(finalTrlrOriginalCnt600,0,getStringValue(),beginFinalTrlrOriginalCnt600,FINAL_TRLR_ORIGINAL_CNT_600_LEN);
       localFinalTrlrOriginalCnt600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFinalTrlrOriginalCnt600Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshFinalTrlrOriginalCnt600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFinalTrlrOriginalCnt600() {	 
   		return (substring(getStringValue(),beginFinalTrlrOriginalCnt600,beginFinalTrlrOriginalCnt600 + FINAL_TRLR_ORIGINAL_CNT_600_LEN));
   	}




}
  
