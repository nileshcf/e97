package com.cloudframe.app.casecb00.dto.serialize;

/**
*  The class InputRequestSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:05. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class InputRequestSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(InputRequestSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int INPUT_REQUEST_LENGTH = 14862;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for InputRequestSerialized
	**/
    public InputRequestSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for InputRequestSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public InputRequestSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this InputRequestSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this InputRequestSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in InputRequestSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(INPUT_REQUEST_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
