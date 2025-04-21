package com.cloudframe.app.refmod1.dto.serialize;

/**
*  The class ATGroup1Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ATGroup1Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ATGroup1Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_TGROUP_1_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginATR1;
	
	/**
	* Constructor for ATGroup1Serialized
	**/
    public ATGroup1Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ATGroup1Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_TGROUP_1_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginATR1 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localATR1Counter = -1;
     public boolean isATR1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATR1Counter != sharedCounter;
         localATR1Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TR_1_LEN = 60;
	/**
	 * 	serialize this ATR1
	 */
   protected void serializeATR1(char[] aTR1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTR1,0,getStringValue(),beginATR1,A_TR_1_LEN);
       localATR1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATR1Constraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshATR1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATR1() {	 
   		return (substring(getStringValue(),beginATR1,beginATR1 + A_TR_1_LEN));
   	}




}
  
