package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class ErrorTable590RedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:49. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ErrorTable590RedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ErrorTable590RedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ERROR_TABLE_590_REDEFINED_LENGTH = 18684;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginErrorTableGroup590Array1;
           protected static final int ERROR_TABLE_GROUP_590_ARRAY_1_SIZE = 346;
	
	/**
	* Constructor for ErrorTable590RedefinedSerialized
	**/
    public ErrorTable590RedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ErrorTable590RedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ErrorTable590RedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ErrorTable590RedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this ErrorTable590RedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in ErrorTable590RedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ERROR_TABLE_590_REDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginErrorTableGroup590Array1 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int errorTableGroup590Array1Size() {
			return ERROR_TABLE_GROUP_590_ARRAY_1_SIZE;
		}



}
  
