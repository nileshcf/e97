package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class ATGroup6Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ATGroup6Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ATGroup6Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_TGROUP_6_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginATR6;
	
	/**
	* Constructor for ATGroup6Serialized
	**/
    public ATGroup6Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in ATGroup6Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_TGROUP_6_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginATR6 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localATR6Counter = -1;
     public boolean isATR6Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATR6Counter != sharedCounter;
         localATR6Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TR_6_LEN = 60;
	/**
	 * 	serialize this ATR6
	 */
   protected void serializeATR6(char[] aTR6) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTR6,0,getStringValue(),beginATR6,A_TR_6_LEN);
       localATR6Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATR6Constraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshATR6 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATR6() {	 
   		return (substring(getStringValue(),beginATR6,beginATR6 + A_TR_6_LEN));
   	}




}
  
