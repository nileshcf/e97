package com.cloudframe.app.refmod1.dto.serialize;

/**
*  The class BTGroup2Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BTGroup2Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BTGroup2Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_TGROUP_2_LENGTH = 90;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBTR2;
	
	/**
	* Constructor for BTGroup2Serialized
	**/
    public BTGroup2Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in BTGroup2Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_TGROUP_2_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginBTR2 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBTR2Counter = -1;
     public boolean isBTR2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTR2Counter != sharedCounter;
         localBTR2Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TR_2_LEN = 60;
	/**
	 * 	serialize this BTR2
	 */
   protected void serializeBTR2(char[] bTR2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTR2,0,getStringValue(),beginBTR2,B_TR_2_LEN);
       localBTR2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTR2Constraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshBTR2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTR2() {	 
   		return (substring(getStringValue(),beginBTR2,beginBTR2 + B_TR_2_LEN));
   	}




}
  
