package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class FunctionMsg601Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:49. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FunctionMsg601Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FunctionMsg601Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FUNCTION_MSG_601_LENGTH = 69;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFunctionRequest601;
            protected  int beginFunctionDesc601;
	
	/**
	* Constructor for FunctionMsg601Serialized
	**/
    public FunctionMsg601Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in FunctionMsg601Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FUNCTION_MSG_601_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginFunctionRequest601 = getStartOffset() + 18;	// set offset for serialization
  
  
             beginFunctionDesc601 = getStartOffset() + 22;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFunctionRequest601Counter = -1;
     public boolean isFunctionRequest601Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFunctionRequest601Counter != sharedCounter;
         localFunctionRequest601Counter = sharedCounter; return hasModified;
     }
	protected static final int FUNCTION_REQUEST_601_LEN = 1;
	/**
	 * 	serialize this FunctionRequest601
	 */
   protected void serializeFunctionRequest601(char[] functionRequest601) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(functionRequest601,0,getStringValue(),beginFunctionRequest601,FUNCTION_REQUEST_601_LEN);
       localFunctionRequest601Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFunctionRequest601Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshFunctionRequest601 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFunctionRequest601() {	 
   		return (substring(getStringValue(),beginFunctionRequest601,beginFunctionRequest601 + FUNCTION_REQUEST_601_LEN));
   	}
     int localFunctionDesc601Counter = -1;
     public boolean isFunctionDesc601Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFunctionDesc601Counter != sharedCounter;
         localFunctionDesc601Counter = sharedCounter; return hasModified;
     }
	protected static final int FUNCTION_DESC_601_LEN = 47;
	/**
	 * 	serialize this FunctionDesc601
	 */
   protected void serializeFunctionDesc601(char[] functionDesc601) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(functionDesc601,0,getStringValue(),beginFunctionDesc601,FUNCTION_DESC_601_LEN);
       localFunctionDesc601Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFunctionDesc601Constraints(char[] value) {
   			return super.checkConstraints(value , 47 ,false, false);
   }
    /**
	 *	refreshFunctionDesc601 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFunctionDesc601() {	 
   		return (substring(getStringValue(),beginFunctionDesc601,beginFunctionDesc601 + FUNCTION_DESC_601_LEN));
   	}




}
  
