package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class WarningMsg604Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:41. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WarningMsg604Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WarningMsg604Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WARNING_MSG_604_LENGTH = 25;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWarningResponse604;
	
	/**
	* Constructor for WarningMsg604Serialized
	**/
    public WarningMsg604Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WarningMsg604Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WARNING_MSG_604_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginWarningResponse604 = getStartOffset() + 18;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localWarningResponse604Counter = -1;
     public boolean isWarningResponse604Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWarningResponse604Counter != sharedCounter;
         localWarningResponse604Counter = sharedCounter; return hasModified;
     }
	protected static final int WARNING_RESPONSE_604_LEN = 4;
	/**
	 * 	serialize this WarningResponse604
	 */
   protected void serializeWarningResponse604(char[] warningResponse604) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(warningResponse604,0,getStringValue(),beginWarningResponse604,WARNING_RESPONSE_604_LEN);
       localWarningResponse604Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWarningResponse604Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshWarningResponse604 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWarningResponse604() {	 
   		return (substring(getStringValue(),beginWarningResponse604,beginWarningResponse604 + WARNING_RESPONSE_604_LEN));
   	}




}
  
