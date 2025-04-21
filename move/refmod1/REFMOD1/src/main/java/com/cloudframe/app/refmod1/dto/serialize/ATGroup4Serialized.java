package com.cloudframe.app.refmod1.dto.serialize;

/**
*  The class ATGroup4Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ATGroup4Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ATGroup4Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_TGROUP_4_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginATR4;
	
	/**
	* Constructor for ATGroup4Serialized
	**/
    public ATGroup4Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ATGroup4Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_TGROUP_4_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginATR4 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localATR4Counter = -1;
     public boolean isATR4Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATR4Counter != sharedCounter;
         localATR4Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TR_4_LEN = 60;
	/**
	 * 	serialize this ATR4
	 */
   protected void serializeATR4(char[] aTR4) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTR4,0,getStringValue(),beginATR4,A_TR_4_LEN);
       localATR4Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATR4Constraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshATR4 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATR4() {	 
   		return (substring(getStringValue(),beginATR4,beginATR4 + A_TR_4_LEN));
   	}




}
  
