package com.cloudframe.app.comput5.dto.serialize;

/**
*  The class WvNumericInputGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:09. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WvNumericInputGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WvNumericInputGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WV_NUMERIC_INPUT_GROUP_LENGTH = 18;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWvNumericInput;
	
	/**
	* Constructor for WvNumericInputGroupSerialized
	**/
    public WvNumericInputGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WvNumericInputGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WV_NUMERIC_INPUT_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWvNumericInput = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localWvNumericInputCounter = -1;
     public boolean isWvNumericInputModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvNumericInputCounter != sharedCounter;
         localWvNumericInputCounter = sharedCounter; return hasModified;
     }
	protected static final int WV_NUMERIC_INPUT_LEN = 18;
	/**
	 * 	serialize this WvNumericInput
	 */
   protected void serializeWvNumericInput(char[] wvNumericInput) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvNumericInput,0,getStringValue(),beginWvNumericInput,WV_NUMERIC_INPUT_LEN);
       localWvNumericInputCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvNumericInputConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshWvNumericInput is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvNumericInput() {	 
   		return (substring(getStringValue(),beginWvNumericInput,beginWvNumericInput + WV_NUMERIC_INPUT_LEN));
   	}




}
  
