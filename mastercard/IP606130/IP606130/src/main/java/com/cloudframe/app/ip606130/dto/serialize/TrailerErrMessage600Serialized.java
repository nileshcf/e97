package com.cloudframe.app.ip606130.dto.serialize;

/**
*  The class TrailerErrMessage600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:54. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TrailerErrMessage600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TrailerErrMessage600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TRAILER_ERR_MESSAGE_600_LENGTH = 92;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginErrorInpCount600;
            protected  int beginErrorTrlCount600;
            protected  int beginErrorTableNbr600;
	
	/**
	* Constructor for TrailerErrMessage600Serialized
	**/
    public TrailerErrMessage600Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in TrailerErrMessage600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TRAILER_ERR_MESSAGE_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginErrorInpCount600 = getStartOffset() + 19;	// set offset for serialization
  
  
             beginErrorTrlCount600 = getStartOffset() + 63;	// set offset for serialization
  
  
             beginErrorTableNbr600 = getStartOffset() + 84;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localErrorInpCount600Counter = -1;
     public boolean isErrorInpCount600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrorInpCount600Counter != sharedCounter;
         localErrorInpCount600Counter = sharedCounter; return hasModified;
     }
	protected static final int ERROR_INP_COUNT_600_LEN = 10;
	/**
	 * 	serialize this ErrorInpCount600
	 */
   protected void serializeErrorInpCount600(char[] errorInpCount600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(errorInpCount600,0,getStringValue(),beginErrorInpCount600,ERROR_INP_COUNT_600_LEN);
       localErrorInpCount600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkErrorInpCount600Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshErrorInpCount600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshErrorInpCount600() {	 
   		return (substring(getStringValue(),beginErrorInpCount600,beginErrorInpCount600 + ERROR_INP_COUNT_600_LEN));
   	}
     int localErrorTrlCount600Counter = -1;
     public boolean isErrorTrlCount600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrorTrlCount600Counter != sharedCounter;
         localErrorTrlCount600Counter = sharedCounter; return hasModified;
     }
	protected static final int ERROR_TRL_COUNT_600_LEN = 10;
	/**
	 * 	serialize this ErrorTrlCount600
	 */
   protected void serializeErrorTrlCount600(char[] errorTrlCount600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(errorTrlCount600,0,getStringValue(),beginErrorTrlCount600,ERROR_TRL_COUNT_600_LEN);
       localErrorTrlCount600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkErrorTrlCount600Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshErrorTrlCount600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshErrorTrlCount600() {	 
   		return (substring(getStringValue(),beginErrorTrlCount600,beginErrorTrlCount600 + ERROR_TRL_COUNT_600_LEN));
   	}
     int localErrorTableNbr600Counter = -1;
     public boolean isErrorTableNbr600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrorTableNbr600Counter != sharedCounter;
         localErrorTableNbr600Counter = sharedCounter; return hasModified;
     }
	protected static final int ERROR_TABLE_NBR_600_LEN = 8;
	/**
	 * 	serialize this ErrorTableNbr600
	 */
   protected void serializeErrorTableNbr600(char[] errorTableNbr600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(errorTableNbr600,0,getStringValue(),beginErrorTableNbr600,ERROR_TABLE_NBR_600_LEN);
       localErrorTableNbr600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkErrorTableNbr600Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshErrorTableNbr600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshErrorTableNbr600() {	 
   		return (substring(getStringValue(),beginErrorTableNbr600,beginErrorTableNbr600 + ERROR_TABLE_NBR_600_LEN));
   	}




}
  
