package com.cloudframe.app.init1.dto.serialize;

/**
*  The class IypInit7Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class IypInit7Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(IypInit7Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IYP_INIT_7_LENGTH = 72;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for IypInit7Serialized
	**/
    public IypInit7Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for IypInit7Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IypInit7Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this IypInit7Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this IypInit7Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in IypInit7Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IYP_INIT_7_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
	   /*  end of offset */
	}




}
  
