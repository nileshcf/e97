package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class FirstTimeCallGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:57. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FirstTimeCallGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FirstTimeCallGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FIRST_TIME_CALL_GROUP_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFirstTimeCall;
	
	/**
	* Constructor for FirstTimeCallGroupSerialized
	**/
    public FirstTimeCallGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in FirstTimeCallGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FIRST_TIME_CALL_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFirstTimeCall = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFirstTimeCallCounter = -1;
     public boolean isFirstTimeCallModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFirstTimeCallCounter != sharedCounter;
         localFirstTimeCallCounter = sharedCounter; return hasModified;
     }
	protected static final int FIRST_TIME_CALL_LEN = 1;
	/**
	 * 	serialize this FirstTimeCall
	 */
   protected void serializeFirstTimeCall(char[] firstTimeCall) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(firstTimeCall,0,getStringValue(),beginFirstTimeCall,FIRST_TIME_CALL_LEN);
       localFirstTimeCallCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFirstTimeCallConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshFirstTimeCall is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFirstTimeCall() {	 
   		return (substring(getStringValue(),beginFirstTimeCall,beginFirstTimeCall + FIRST_TIME_CALL_LEN));
   	}




}
  
