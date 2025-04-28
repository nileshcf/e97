package com.cloudframe.app.refmod1.dto.serialize;

/**
*  The class BTGroup1Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BTGroup1Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BTGroup1Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_TGROUP_1_LENGTH = 90;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBTR1;
	
	/**
	* Constructor for BTGroup1Serialized
	**/
    public BTGroup1Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in BTGroup1Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_TGROUP_1_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginBTR1 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBTR1Counter = -1;
     public boolean isBTR1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTR1Counter != sharedCounter;
         localBTR1Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TR_1_LEN = 60;
	/**
	 * 	serialize this BTR1
	 */
   protected void serializeBTR1(char[] bTR1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTR1,0,getStringValue(),beginBTR1,B_TR_1_LEN);
       localBTR1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTR1Constraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshBTR1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTR1() {	 
   		return (substring(getStringValue(),beginBTR1,beginBTR1 + B_TR_1_LEN));
   	}




}
  
