package com.cloudframe.app.refmod1.dto.serialize;

/**
*  The class BTGroup4Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BTGroup4Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BTGroup4Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_TGROUP_4_LENGTH = 90;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBTR4;
	
	/**
	* Constructor for BTGroup4Serialized
	**/
    public BTGroup4Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in BTGroup4Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_TGROUP_4_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginBTR4 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBTR4Counter = -1;
     public boolean isBTR4Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTR4Counter != sharedCounter;
         localBTR4Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TR_4_LEN = 60;
	/**
	 * 	serialize this BTR4
	 */
   protected void serializeBTR4(char[] bTR4) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTR4,0,getStringValue(),beginBTR4,B_TR_4_LEN);
       localBTR4Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTR4Constraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshBTR4 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTR4() {	 
   		return (substring(getStringValue(),beginBTR4,beginBTR4 + B_TR_4_LEN));
   	}




}
  
