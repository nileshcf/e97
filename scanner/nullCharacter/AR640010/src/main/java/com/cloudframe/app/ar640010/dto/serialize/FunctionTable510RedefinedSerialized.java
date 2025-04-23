package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class FunctionTable510RedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FunctionTable510RedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FunctionTable510RedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FUNCTION_TABLE_510_REDEFINED_LENGTH = 490;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginFunctionEntry510;
           protected static final int FUNCTION_ENTRY_510_SIZE = 10;
	
	/**
	* Constructor for FunctionTable510RedefinedSerialized
	**/
    public FunctionTable510RedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for FunctionTable510RedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FunctionTable510RedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this FunctionTable510RedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this FunctionTable510RedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in FunctionTable510RedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FUNCTION_TABLE_510_REDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginFunctionEntry510 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int functionEntry510Size() {
			return FUNCTION_ENTRY_510_SIZE;
		}



}
  
