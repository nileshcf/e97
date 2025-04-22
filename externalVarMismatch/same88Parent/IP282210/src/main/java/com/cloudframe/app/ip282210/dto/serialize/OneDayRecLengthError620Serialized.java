package com.cloudframe.app.ip282210.dto.serialize;

/**
*  The class OneDayRecLengthError620Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:17. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class OneDayRecLengthError620Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(OneDayRecLengthError620Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ONE_DAY_REC_LENGTH_ERROR_620_LENGTH = 52;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginErrorLength620;
	
	/**
	* Constructor for OneDayRecLengthError620Serialized
	**/
    public OneDayRecLengthError620Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in OneDayRecLengthError620Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ONE_DAY_REC_LENGTH_ERROR_620_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginErrorLength620 = getStartOffset() + 44;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localErrorLength620Counter = -1;
     public boolean isErrorLength620Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrorLength620Counter != sharedCounter;
         localErrorLength620Counter = sharedCounter; return hasModified;
     }
	protected static final int ERROR_LENGTH_620_LEN = 8;
	/**
	 * 	serialize this ErrorLength620
	 */
   protected void serializeErrorLength620(char[] errorLength620) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(errorLength620,0,getStringValue(),beginErrorLength620,ERROR_LENGTH_620_LEN);
       localErrorLength620Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkErrorLength620Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshErrorLength620 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshErrorLength620() {	 
   		return (substring(getStringValue(),beginErrorLength620,beginErrorLength620 + ERROR_LENGTH_620_LEN));
   	}




}
  
