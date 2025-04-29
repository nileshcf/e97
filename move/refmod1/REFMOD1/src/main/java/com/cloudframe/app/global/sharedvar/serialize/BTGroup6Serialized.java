package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class BTGroup6Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BTGroup6Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BTGroup6Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_TGROUP_6_LENGTH = 90;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBTR6;
	
	/**
	* Constructor for BTGroup6Serialized
	**/
    public BTGroup6Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in BTGroup6Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_TGROUP_6_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginBTR6 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBTR6Counter = -1;
     public boolean isBTR6Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTR6Counter != sharedCounter;
         localBTR6Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TR_6_LEN = 60;
	/**
	 * 	serialize this BTR6
	 */
   protected void serializeBTR6(char[] bTR6) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTR6,0,getStringValue(),beginBTR6,B_TR_6_LEN);
       localBTR6Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTR6Constraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshBTR6 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTR6() {	 
   		return (substring(getStringValue(),beginBTR6,beginBTR6 + B_TR_6_LEN));
   	}




}
  
