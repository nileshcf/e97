package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class XtkAssignMsg600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:11. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class XtkAssignMsg600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(XtkAssignMsg600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int XTK_ASSIGN_MSG_600_LENGTH = 57;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for XtkAssignMsg600Serialized
	**/
    public XtkAssignMsg600Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for XtkAssignMsg600Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public XtkAssignMsg600Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this XtkAssignMsg600Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,66); // serialize this field at offset 66 by default 
    }
    
	/**
	* sets parent for this XtkAssignMsg600Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 66 by default
    }    
	/**
	* initializes the field in XtkAssignMsg600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(XTK_ASSIGN_MSG_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
	   /*  end of offset */
	}




}
  
