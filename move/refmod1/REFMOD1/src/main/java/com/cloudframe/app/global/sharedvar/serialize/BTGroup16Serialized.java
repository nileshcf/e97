package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class BTGroup16Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BTGroup16Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BTGroup16Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_TGROUP_16_LENGTH = 90;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBTR16;
	
	/**
	* Constructor for BTGroup16Serialized
	**/
    public BTGroup16Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in BTGroup16Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_TGROUP_16_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginBTR16 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBTR16Counter = -1;
     public boolean isBTR16Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTR16Counter != sharedCounter;
         localBTR16Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TR_16_LEN = 60;
	/**
	 * 	serialize this BTR16
	 */
   protected void serializeBTR16(char[] bTR16) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTR16,0,getStringValue(),beginBTR16,B_TR_16_LEN);
       localBTR16Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTR16Constraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshBTR16 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTR16() {	 
   		return (substring(getStringValue(),beginBTR16,beginBTR16 + B_TR_16_LEN));
   	}




}
  
