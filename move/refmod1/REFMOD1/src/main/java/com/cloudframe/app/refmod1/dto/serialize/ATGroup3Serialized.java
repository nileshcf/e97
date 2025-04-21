package com.cloudframe.app.refmod1.dto.serialize;

/**
*  The class ATGroup3Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ATGroup3Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ATGroup3Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_TGROUP_3_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginATR3;
	
	/**
	* Constructor for ATGroup3Serialized
	**/
    public ATGroup3Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ATGroup3Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_TGROUP_3_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginATR3 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localATR3Counter = -1;
     public boolean isATR3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATR3Counter != sharedCounter;
         localATR3Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TR_3_LEN = 60;
	/**
	 * 	serialize this ATR3
	 */
   protected void serializeATR3(char[] aTR3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTR3,0,getStringValue(),beginATR3,A_TR_3_LEN);
       localATR3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATR3Constraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshATR3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATR3() {	 
   		return (substring(getStringValue(),beginATR3,beginATR3 + A_TR_3_LEN));
   	}




}
  
