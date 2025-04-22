package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class ATGroup16Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ATGroup16Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ATGroup16Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_TGROUP_16_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginATR16;
	
	/**
	* Constructor for ATGroup16Serialized
	**/
    public ATGroup16Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in ATGroup16Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_TGROUP_16_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginATR16 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localATR16Counter = -1;
     public boolean isATR16Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATR16Counter != sharedCounter;
         localATR16Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TR_16_LEN = 60;
	/**
	 * 	serialize this ATR16
	 */
   protected void serializeATR16(char[] aTR16) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTR16,0,getStringValue(),beginATR16,A_TR_16_LEN);
       localATR16Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATR16Constraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshATR16 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATR16() {	 
   		return (substring(getStringValue(),beginATR16,beginATR16 + A_TR_16_LEN));
   	}




}
  
