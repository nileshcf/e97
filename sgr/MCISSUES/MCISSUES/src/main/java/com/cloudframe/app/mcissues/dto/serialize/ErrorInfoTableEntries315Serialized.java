package com.cloudframe.app.mcissues.dto.serialize;

/**
*  The class ErrorInfoTableEntries315Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:36. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ErrorInfoTableEntries315Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ErrorInfoTableEntries315Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ERROR_INFO_TABLE_ENTRIES_315_LENGTH = 171;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for ErrorInfoTableEntries315Serialized
	**/
    public ErrorInfoTableEntries315Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ErrorInfoTableEntries315Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ErrorInfoTableEntries315Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ErrorInfoTableEntries315Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this ErrorInfoTableEntries315Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in ErrorInfoTableEntries315Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ERROR_INFO_TABLE_ENTRIES_315_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
  
  
  
  
  
	   /*  end of offset */
	}




}
  
