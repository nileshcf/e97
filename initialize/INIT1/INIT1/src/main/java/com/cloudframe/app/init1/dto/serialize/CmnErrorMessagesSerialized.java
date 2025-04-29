package com.cloudframe.app.init1.dto.serialize;

/**
*  The class CmnErrorMessagesSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:13. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CmnErrorMessagesSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CmnErrorMessagesSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CMN_ERROR_MESSAGES_LENGTH = 1320;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCmnErrMsg1;
           protected int beginCmnPrtErrMsg;
           protected static final int CMN_PRT_ERR_MSG_SIZE = 8;
	
	/**
	* Constructor for CmnErrorMessagesSerialized
	**/
    public CmnErrorMessagesSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in CmnErrorMessagesSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CMN_ERROR_MESSAGES_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCmnErrMsg1 = getStartOffset() + 0;	// set offset for serialization
  
  
  
  
	        beginCmnPrtErrMsg = getStartOffset() + 264; // set offset for serialization
  
	   /*  end of offset */
	}
     int localCmnErrMsg1Counter = -1;
     public boolean isCmnErrMsg1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnErrMsg1Counter != sharedCounter;
         localCmnErrMsg1Counter = sharedCounter; return hasModified;
     }
	protected static final int CMN_ERR_MSG_1_LEN = 80;
	/**
	 * 	serialize this CmnErrMsg1
	 */
   protected void serializeCmnErrMsg1(char[] cmnErrMsg1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnErrMsg1,0,getStringValue(),beginCmnErrMsg1,CMN_ERR_MSG_1_LEN);
       localCmnErrMsg1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnErrMsg1Constraints(char[] value) {
   			return super.checkConstraints(value , 80 ,false, false);
   }
    /**
	 *	refreshCmnErrMsg1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnErrMsg1() {	 
   		return (substring(getStringValue(),beginCmnErrMsg1,beginCmnErrMsg1 + CMN_ERR_MSG_1_LEN));
   	}

		public int cmnPrtErrMsgSize() {
			return CMN_PRT_ERR_MSG_SIZE;
		}



}
  
