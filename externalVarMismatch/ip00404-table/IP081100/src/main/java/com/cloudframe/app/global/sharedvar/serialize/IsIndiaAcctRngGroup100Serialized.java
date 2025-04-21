package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class IsIndiaAcctRngGroup100Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:05. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class IsIndiaAcctRngGroup100Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(IsIndiaAcctRngGroup100Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IS_INDIA_ACCT_RNG_GROUP_100_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIsIndiaAcctRng100;
	
	/**
	* Constructor for IsIndiaAcctRngGroup100Serialized
	**/
    public IsIndiaAcctRngGroup100Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in IsIndiaAcctRngGroup100Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IS_INDIA_ACCT_RNG_GROUP_100_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIsIndiaAcctRng100 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIsIndiaAcctRng100Counter = -1;
     public boolean isIsIndiaAcctRng100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIsIndiaAcctRng100Counter != sharedCounter;
         localIsIndiaAcctRng100Counter = sharedCounter; return hasModified;
     }
	protected static final int IS_INDIA_ACCT_RNG_100_LEN = 1;
	/**
	 * 	serialize this IsIndiaAcctRng100
	 */
   protected void serializeIsIndiaAcctRng100(char[] isIndiaAcctRng100) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(isIndiaAcctRng100,0,getStringValue(),beginIsIndiaAcctRng100,IS_INDIA_ACCT_RNG_100_LEN);
       localIsIndiaAcctRng100Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIsIndiaAcctRng100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIsIndiaAcctRng100 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIsIndiaAcctRng100() {	 
   		return (substring(getStringValue(),beginIsIndiaAcctRng100,beginIsIndiaAcctRng100 + IS_INDIA_ACCT_RNG_100_LEN));
   	}




}
  
