package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class FunctionEntry510Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FunctionEntry510Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FunctionEntry510Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FUNCTION_ENTRY_510_LENGTH = 49;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFunctionCode510;
            protected  int beginFunctionDesc510;
	
	/**
	* Constructor for FunctionEntry510Serialized
	**/
    public FunctionEntry510Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for FunctionEntry510Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FunctionEntry510Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this FunctionEntry510Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this FunctionEntry510Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in FunctionEntry510Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FUNCTION_ENTRY_510_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFunctionCode510 = getStartOffset() + 0;	// set offset for serialization
  
             beginFunctionDesc510 = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFunctionCode510Counter = -1;
     public boolean isFunctionCode510Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFunctionCode510Counter != sharedCounter;
         localFunctionCode510Counter = sharedCounter; return hasModified;
     }
	protected static final int FUNCTION_CODE_510_LEN = 1;
	/**
	 * 	serialize this FunctionCode510
	 */
   protected void serializeFunctionCode510(char[] functionCode510) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(functionCode510,0,getStringValue(),beginFunctionCode510,FUNCTION_CODE_510_LEN);
       localFunctionCode510Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFunctionCode510Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshFunctionCode510 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFunctionCode510() {	 
   		return (substring(getStringValue(),beginFunctionCode510,beginFunctionCode510 + FUNCTION_CODE_510_LEN));
   	}
     int localFunctionDesc510Counter = -1;
     public boolean isFunctionDesc510Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFunctionDesc510Counter != sharedCounter;
         localFunctionDesc510Counter = sharedCounter; return hasModified;
     }
	protected static final int FUNCTION_DESC_510_LEN = 47;
	/**
	 * 	serialize this FunctionDesc510
	 */
   protected void serializeFunctionDesc510(char[] functionDesc510) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(functionDesc510,0,getStringValue(),beginFunctionDesc510,FUNCTION_DESC_510_LEN);
       localFunctionDesc510Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFunctionDesc510Constraints(char[] value) {
   			return super.checkConstraints(value , 47 ,false, false);
   }
    /**
	 *	refreshFunctionDesc510 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFunctionDesc510() {	 
   		return (substring(getStringValue(),beginFunctionDesc510,beginFunctionDesc510 + FUNCTION_DESC_510_LEN));
   	}




}
  
