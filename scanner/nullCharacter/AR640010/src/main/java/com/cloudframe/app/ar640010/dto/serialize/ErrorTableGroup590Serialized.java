package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class ErrorTableGroup590Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ErrorTableGroup590Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ErrorTableGroup590Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ERROR_TABLE_GROUP_590_LENGTH = 18684;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginErrorTable590;
	
	/**
	* Constructor for ErrorTableGroup590Serialized
	**/
    public ErrorTableGroup590Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ErrorTableGroup590Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ERROR_TABLE_GROUP_590_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginErrorTable590 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localErrorTable590Counter = -1;
     public boolean isErrorTable590Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrorTable590Counter != sharedCounter;
         localErrorTable590Counter = sharedCounter; return hasModified;
     }
	protected static final int ERROR_TABLE_590_LEN = 18684;
	/**
	 * 	serialize this ErrorTable590
	 */
   protected void serializeErrorTable590(char[] errorTable590) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(errorTable590,0,getStringValue(),beginErrorTable590,ERROR_TABLE_590_LEN);
       localErrorTable590Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkErrorTable590Constraints(char[] value) {
   			return super.checkConstraints(value , 18684 ,false, false);
   }
    /**
	 *	refreshErrorTable590 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshErrorTable590() {	 
   		return (substring(getStringValue(),beginErrorTable590,beginErrorTable590 + ERROR_TABLE_590_LEN));
   	}




}
  
