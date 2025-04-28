package com.cloudframe.app.sf305120.dto.serialize;

/**
*  The class AsciiTextW300Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AsciiTextW300Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AsciiTextW300Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ASCII_TEXT_W_300_LENGTH = 86;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for AsciiTextW300Serialized
	**/
    public AsciiTextW300Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for AsciiTextW300Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AsciiTextW300Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this AsciiTextW300Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this AsciiTextW300Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in AsciiTextW300Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ASCII_TEXT_W_300_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
  
	   /*  end of offset */
	}




}
  
