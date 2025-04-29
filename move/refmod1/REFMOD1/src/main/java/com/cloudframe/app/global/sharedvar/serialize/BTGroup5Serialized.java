package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class BTGroup5Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BTGroup5Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BTGroup5Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_TGROUP_5_LENGTH = 90;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBTR5;
	
	/**
	* Constructor for BTGroup5Serialized
	**/
    public BTGroup5Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in BTGroup5Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_TGROUP_5_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginBTR5 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBTR5Counter = -1;
     public boolean isBTR5Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTR5Counter != sharedCounter;
         localBTR5Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TR_5_LEN = 60;
	/**
	 * 	serialize this BTR5
	 */
   protected void serializeBTR5(char[] bTR5) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTR5,0,getStringValue(),beginBTR5,B_TR_5_LEN);
       localBTR5Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTR5Constraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshBTR5 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTR5() {	 
   		return (substring(getStringValue(),beginBTR5,beginBTR5 + B_TR_5_LEN));
   	}




}
  
