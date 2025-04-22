package com.cloudframe.app.db2func.dto.serialize;

/**
*  The class AcceptInputSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AcceptInputSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AcceptInputSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ACCEPT_INPUT_LENGTH = 80;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginScalarFunction;
	
	/**
	* Constructor for AcceptInputSerialized
	**/
    public AcceptInputSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in AcceptInputSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ACCEPT_INPUT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginScalarFunction = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localScalarFunctionCounter = -1;
     public boolean isScalarFunctionModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localScalarFunctionCounter != sharedCounter;
         localScalarFunctionCounter = sharedCounter; return hasModified;
     }
	protected static final int SCALAR_FUNCTION_LEN = 20;
	/**
	 * 	serialize this ScalarFunction
	 */
   protected void serializeScalarFunction(char[] scalarFunction) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(scalarFunction,0,getStringValue(),beginScalarFunction,SCALAR_FUNCTION_LEN);
       localScalarFunctionCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkScalarFunctionConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshScalarFunction is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshScalarFunction() {	 
   		return (substring(getStringValue(),beginScalarFunction,beginScalarFunction + SCALAR_FUNCTION_LEN));
   	}




}
  
