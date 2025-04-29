package com.cloudframe.app.refmod1.dto.serialize;

/**
*  The class ATGroup2Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ATGroup2Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ATGroup2Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_TGROUP_2_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginATR2;
	
	/**
	* Constructor for ATGroup2Serialized
	**/
    public ATGroup2Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ATGroup2Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_TGROUP_2_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginATR2 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localATR2Counter = -1;
     public boolean isATR2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATR2Counter != sharedCounter;
         localATR2Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TR_2_LEN = 60;
	/**
	 * 	serialize this ATR2
	 */
   protected void serializeATR2(char[] aTR2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTR2,0,getStringValue(),beginATR2,A_TR_2_LEN);
       localATR2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATR2Constraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshATR2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATR2() {	 
   		return (substring(getStringValue(),beginATR2,beginATR2 + A_TR_2_LEN));
   	}




}
  
