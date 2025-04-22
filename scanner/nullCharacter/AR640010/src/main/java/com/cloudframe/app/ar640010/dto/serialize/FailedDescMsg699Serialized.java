package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class FailedDescMsg699Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FailedDescMsg699Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FailedDescMsg699Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FAILED_DESC_MSG_699_LENGTH = 25;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFailedResponse699;
	
	/**
	* Constructor for FailedDescMsg699Serialized
	**/
    public FailedDescMsg699Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in FailedDescMsg699Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FAILED_DESC_MSG_699_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginFailedResponse699 = getStartOffset() + 18;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localFailedResponse699Counter = -1;
     public boolean isFailedResponse699Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFailedResponse699Counter != sharedCounter;
         localFailedResponse699Counter = sharedCounter; return hasModified;
     }
	protected static final int FAILED_RESPONSE_699_LEN = 4;
	/**
	 * 	serialize this FailedResponse699
	 */
   protected void serializeFailedResponse699(char[] failedResponse699) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(failedResponse699,0,getStringValue(),beginFailedResponse699,FAILED_RESPONSE_699_LEN);
       localFailedResponse699Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFailedResponse699Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshFailedResponse699 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFailedResponse699() {	 
   		return (substring(getStringValue(),beginFailedResponse699,beginFailedResponse699 + FAILED_RESPONSE_699_LEN));
   	}




}
  
