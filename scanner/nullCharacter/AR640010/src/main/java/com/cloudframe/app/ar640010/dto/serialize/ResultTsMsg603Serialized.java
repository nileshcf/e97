package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class ResultTsMsg603Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:41. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ResultTsMsg603Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ResultTsMsg603Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RESULT_TS_MSG_603_LENGTH = 27;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginResultTs603;
	
	/**
	* Constructor for ResultTsMsg603Serialized
	**/
    public ResultTsMsg603Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ResultTsMsg603Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RESULT_TS_MSG_603_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginResultTs603 = getStartOffset() + 1;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localResultTs603Counter = -1;
     public boolean isResultTs603Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localResultTs603Counter != sharedCounter;
         localResultTs603Counter = sharedCounter; return hasModified;
     }
	protected static final int RESULT_TS_603_LEN = 26;
	/**
	 * 	serialize this ResultTs603
	 */
   protected void serializeResultTs603(char[] resultTs603) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(resultTs603,0,getStringValue(),beginResultTs603,RESULT_TS_603_LEN);
       localResultTs603Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkResultTs603Constraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshResultTs603 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshResultTs603() {	 
   		return (substring(getStringValue(),beginResultTs603,beginResultTs603 + RESULT_TS_603_LEN));
   	}




}
  
