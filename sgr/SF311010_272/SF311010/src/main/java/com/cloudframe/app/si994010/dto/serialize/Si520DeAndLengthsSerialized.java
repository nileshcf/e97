package com.cloudframe.app.si994010.dto.serialize;

/**
*  The class Si520DeAndLengthsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:05. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Si520DeAndLengthsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Si520DeAndLengthsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SI_520_DE_AND_LENGTHS_LENGTH = 384;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for Si520DeAndLengthsSerialized
	**/
    public Si520DeAndLengthsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Si520DeAndLengthsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Si520DeAndLengthsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Si520DeAndLengthsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Si520DeAndLengthsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Si520DeAndLengthsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SI_520_DE_AND_LENGTHS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
