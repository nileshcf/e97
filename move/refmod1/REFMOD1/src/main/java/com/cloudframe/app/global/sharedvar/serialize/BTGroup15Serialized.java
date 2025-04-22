package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class BTGroup15Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BTGroup15Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BTGroup15Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_TGROUP_15_LENGTH = 90;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBTR15;
	
	/**
	* Constructor for BTGroup15Serialized
	**/
    public BTGroup15Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in BTGroup15Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_TGROUP_15_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginBTR15 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBTR15Counter = -1;
     public boolean isBTR15Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTR15Counter != sharedCounter;
         localBTR15Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TR_15_LEN = 60;
	/**
	 * 	serialize this BTR15
	 */
   protected void serializeBTR15(char[] bTR15) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTR15,0,getStringValue(),beginBTR15,B_TR_15_LEN);
       localBTR15Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTR15Constraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshBTR15 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTR15() {	 
   		return (substring(getStringValue(),beginBTR15,beginBTR15 + B_TR_15_LEN));
   	}




}
  
