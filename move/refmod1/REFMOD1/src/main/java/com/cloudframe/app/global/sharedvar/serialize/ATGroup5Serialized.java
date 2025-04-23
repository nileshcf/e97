package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class ATGroup5Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ATGroup5Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ATGroup5Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_TGROUP_5_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginATR5;
	
	/**
	* Constructor for ATGroup5Serialized
	**/
    public ATGroup5Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in ATGroup5Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_TGROUP_5_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginATR5 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localATR5Counter = -1;
     public boolean isATR5Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATR5Counter != sharedCounter;
         localATR5Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TR_5_LEN = 60;
	/**
	 * 	serialize this ATR5
	 */
   protected void serializeATR5(char[] aTR5) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTR5,0,getStringValue(),beginATR5,A_TR_5_LEN);
       localATR5Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATR5Constraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshATR5 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATR5() {	 
   		return (substring(getStringValue(),beginATR5,beginATR5 + A_TR_5_LEN));
   	}




}
  
