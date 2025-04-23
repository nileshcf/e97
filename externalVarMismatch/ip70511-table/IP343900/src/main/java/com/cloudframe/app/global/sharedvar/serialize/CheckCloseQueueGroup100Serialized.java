package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class CheckCloseQueueGroup100Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CheckCloseQueueGroup100Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CheckCloseQueueGroup100Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CHECK_CLOSE_QUEUE_GROUP_100_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCheckCloseQueue100;
	
	/**
	* Constructor for CheckCloseQueueGroup100Serialized
	**/
    public CheckCloseQueueGroup100Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in CheckCloseQueueGroup100Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CHECK_CLOSE_QUEUE_GROUP_100_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCheckCloseQueue100 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCheckCloseQueue100Counter = -1;
     public boolean isCheckCloseQueue100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCheckCloseQueue100Counter != sharedCounter;
         localCheckCloseQueue100Counter = sharedCounter; return hasModified;
     }
	protected static final int CHECK_CLOSE_QUEUE_100_LEN = 1;
	/**
	 * 	serialize this CheckCloseQueue100
	 */
   protected void serializeCheckCloseQueue100(char[] checkCloseQueue100) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(checkCloseQueue100,0,getStringValue(),beginCheckCloseQueue100,CHECK_CLOSE_QUEUE_100_LEN);
       localCheckCloseQueue100Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCheckCloseQueue100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCheckCloseQueue100 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCheckCloseQueue100() {	 
   		return (substring(getStringValue(),beginCheckCloseQueue100,beginCheckCloseQueue100 + CHECK_CLOSE_QUEUE_100_LEN));
   	}




}
  
