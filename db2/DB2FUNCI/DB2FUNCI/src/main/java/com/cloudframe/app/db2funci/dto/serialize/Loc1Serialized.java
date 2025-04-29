package com.cloudframe.app.db2funci.dto.serialize;

/**
*  The class Loc1Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:25. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Loc1Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Loc1Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int LOC_1_LENGTH = 0;
	
	/**
	* Constructor for Loc1Serialized
	**/
    public Loc1Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Loc1Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Loc1Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Loc1Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,55); // serialize this field at offset 55 by default 
    }
    
	/**
	* sets parent for this Loc1Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 55 by default
    }    
	/**
	* initializes the field in Loc1Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(LOC_1_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	   /*  end of offset */
	}




}
  
