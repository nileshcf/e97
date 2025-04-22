package com.cloudframe.app.ip299010.dto.serialize;

/**
*  The class RecordsLoadedMessage630Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:07. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RecordsLoadedMessage630Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RecordsLoadedMessage630Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RECORDS_LOADED_MESSAGE_630_LENGTH = 69;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRecLoadedCnt630;
	
	/**
	* Constructor for RecordsLoadedMessage630Serialized
	**/
    public RecordsLoadedMessage630Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in RecordsLoadedMessage630Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RECORDS_LOADED_MESSAGE_630_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
             beginRecLoadedCnt630 = getStartOffset() + 36;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localRecLoadedCnt630Counter = -1;
     public boolean isRecLoadedCnt630Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRecLoadedCnt630Counter != sharedCounter;
         localRecLoadedCnt630Counter = sharedCounter; return hasModified;
     }
	protected static final int REC_LOADED_CNT_630_LEN = 4;
	/**
	 * 	serialize this RecLoadedCnt630
	 */
   protected void serializeRecLoadedCnt630(char[] recLoadedCnt630) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(recLoadedCnt630,0,getStringValue(),beginRecLoadedCnt630,REC_LOADED_CNT_630_LEN);
       localRecLoadedCnt630Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRecLoadedCnt630Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshRecLoadedCnt630 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRecLoadedCnt630() {	 
   		return (substring(getStringValue(),beginRecLoadedCnt630,beginRecLoadedCnt630 + REC_LOADED_CNT_630_LEN));
   	}




}
  
