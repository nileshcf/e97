package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class FunctionTableGroup510Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:41. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FunctionTableGroup510Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FunctionTableGroup510Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FUNCTION_TABLE_GROUP_510_LENGTH = 490;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFunctionTable510;
	
	/**
	* Constructor for FunctionTableGroup510Serialized
	**/
    public FunctionTableGroup510Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in FunctionTableGroup510Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FUNCTION_TABLE_GROUP_510_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFunctionTable510 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localFunctionTable510Counter = -1;
     public boolean isFunctionTable510Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFunctionTable510Counter != sharedCounter;
         localFunctionTable510Counter = sharedCounter; return hasModified;
     }
	protected static final int FUNCTION_TABLE_510_LEN = 490;
	/**
	 * 	serialize this FunctionTable510
	 */
   protected void serializeFunctionTable510(char[] functionTable510) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(functionTable510,0,getStringValue(),beginFunctionTable510,FUNCTION_TABLE_510_LEN);
       localFunctionTable510Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFunctionTable510Constraints(char[] value) {
   			return super.checkConstraints(value , 490 ,false, false);
   }
    /**
	 *	refreshFunctionTable510 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFunctionTable510() {	 
   		return (substring(getStringValue(),beginFunctionTable510,beginFunctionTable510 + FUNCTION_TABLE_510_LEN));
   	}




}
  
