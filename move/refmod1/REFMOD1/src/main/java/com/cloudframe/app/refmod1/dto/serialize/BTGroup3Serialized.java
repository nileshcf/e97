package com.cloudframe.app.refmod1.dto.serialize;

/**
*  The class BTGroup3Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BTGroup3Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BTGroup3Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_TGROUP_3_LENGTH = 90;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBTR3;
	
	/**
	* Constructor for BTGroup3Serialized
	**/
    public BTGroup3Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in BTGroup3Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_TGROUP_3_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginBTR3 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBTR3Counter = -1;
     public boolean isBTR3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTR3Counter != sharedCounter;
         localBTR3Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TR_3_LEN = 60;
	/**
	 * 	serialize this BTR3
	 */
   protected void serializeBTR3(char[] bTR3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTR3,0,getStringValue(),beginBTR3,B_TR_3_LEN);
       localBTR3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTR3Constraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshBTR3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTR3() {	 
   		return (substring(getStringValue(),beginBTR3,beginBTR3 + B_TR_3_LEN));
   	}




}
  
