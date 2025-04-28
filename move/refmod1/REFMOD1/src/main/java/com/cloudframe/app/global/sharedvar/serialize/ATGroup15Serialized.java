package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class ATGroup15Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ATGroup15Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ATGroup15Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_TGROUP_15_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginATR15;
	
	/**
	* Constructor for ATGroup15Serialized
	**/
    public ATGroup15Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in ATGroup15Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_TGROUP_15_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginATR15 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localATR15Counter = -1;
     public boolean isATR15Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATR15Counter != sharedCounter;
         localATR15Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TR_15_LEN = 60;
	/**
	 * 	serialize this ATR15
	 */
   protected void serializeATR15(char[] aTR15) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTR15,0,getStringValue(),beginATR15,A_TR_15_LEN);
       localATR15Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATR15Constraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshATR15 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATR15() {	 
   		return (substring(getStringValue(),beginATR15,beginATR15 + A_TR_15_LEN));
   	}




}
  
