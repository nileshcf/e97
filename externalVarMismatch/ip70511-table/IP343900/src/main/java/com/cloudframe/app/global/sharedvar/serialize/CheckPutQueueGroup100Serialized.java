package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class CheckPutQueueGroup100Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:09. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CheckPutQueueGroup100Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CheckPutQueueGroup100Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CHECK_PUT_QUEUE_GROUP_100_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCheckPutQueue100;
	
	/**
	* Constructor for CheckPutQueueGroup100Serialized
	**/
    public CheckPutQueueGroup100Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in CheckPutQueueGroup100Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CHECK_PUT_QUEUE_GROUP_100_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCheckPutQueue100 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCheckPutQueue100Counter = -1;
     public boolean isCheckPutQueue100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCheckPutQueue100Counter != sharedCounter;
         localCheckPutQueue100Counter = sharedCounter; return hasModified;
     }
	protected static final int CHECK_PUT_QUEUE_100_LEN = 1;
	/**
	 * 	serialize this CheckPutQueue100
	 */
   protected void serializeCheckPutQueue100(char[] checkPutQueue100) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(checkPutQueue100,0,getStringValue(),beginCheckPutQueue100,CHECK_PUT_QUEUE_100_LEN);
       localCheckPutQueue100Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCheckPutQueue100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCheckPutQueue100 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCheckPutQueue100() {	 
   		return (substring(getStringValue(),beginCheckPutQueue100,beginCheckPutQueue100 + CHECK_PUT_QUEUE_100_LEN));
   	}




}
  
