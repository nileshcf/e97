package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class XtkDefaultMsg600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:49. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class XtkDefaultMsg600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(XtkDefaultMsg600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int XTK_DEFAULT_MSG_600_LENGTH = 57;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for XtkDefaultMsg600Serialized
	**/
    public XtkDefaultMsg600Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for XtkDefaultMsg600Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public XtkDefaultMsg600Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this XtkDefaultMsg600Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,9); // serialize this field at offset 9 by default 
    }
    
	/**
	* sets parent for this XtkDefaultMsg600Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 9 by default
    }    
	/**
	* initializes the field in XtkDefaultMsg600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(XTK_DEFAULT_MSG_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
	   /*  end of offset */
	}




}
  
