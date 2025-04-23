package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class WarningMsg609Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WarningMsg609Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WarningMsg609Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WARNING_MSG_609_LENGTH = 25;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWarningResponse609;
	
	/**
	* Constructor for WarningMsg609Serialized
	**/
    public WarningMsg609Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WarningMsg609Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WARNING_MSG_609_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginWarningResponse609 = getStartOffset() + 18;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localWarningResponse609Counter = -1;
     public boolean isWarningResponse609Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWarningResponse609Counter != sharedCounter;
         localWarningResponse609Counter = sharedCounter; return hasModified;
     }
	protected static final int WARNING_RESPONSE_609_LEN = 4;
	/**
	 * 	serialize this WarningResponse609
	 */
   protected void serializeWarningResponse609(char[] warningResponse609) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(warningResponse609,0,getStringValue(),beginWarningResponse609,WARNING_RESPONSE_609_LEN);
       localWarningResponse609Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWarningResponse609Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshWarningResponse609 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWarningResponse609() {	 
   		return (substring(getStringValue(),beginWarningResponse609,beginWarningResponse609 + WARNING_RESPONSE_609_LEN));
   	}




}
  
