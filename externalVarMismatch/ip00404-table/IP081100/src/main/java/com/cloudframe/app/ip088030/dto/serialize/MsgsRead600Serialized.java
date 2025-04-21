package com.cloudframe.app.ip088030.dto.serialize;

/**
*  The class MsgsRead600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:11. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MsgsRead600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MsgsRead600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MSGS_READ_600_LENGTH = 43;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginReadCnt600;
	
	/**
	* Constructor for MsgsRead600Serialized
	**/
    public MsgsRead600Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in MsgsRead600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MSGS_READ_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginReadCnt600 = getStartOffset() + 32;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localReadCnt600Counter = -1;
     public boolean isReadCnt600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localReadCnt600Counter != sharedCounter;
         localReadCnt600Counter = sharedCounter; return hasModified;
     }
	protected static final int READ_CNT_600_LEN = 11;
	/**
	 * 	serialize this ReadCnt600
	 */
   protected void serializeReadCnt600(char[] readCnt600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(readCnt600,0,getStringValue(),beginReadCnt600,READ_CNT_600_LEN);
       localReadCnt600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkReadCnt600Constraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshReadCnt600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshReadCnt600() {	 
   		return (substring(getStringValue(),beginReadCnt600,beginReadCnt600 + READ_CNT_600_LEN));
   	}




}
  
