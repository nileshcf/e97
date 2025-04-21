package com.cloudframe.app.init1.dto.serialize;

/**
*  The class Dfhcommarea14Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:53. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Dfhcommarea14Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Dfhcommarea14Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DFHCOMMAREA_14_LENGTH = 76;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for Dfhcommarea14Serialized
	**/
    public Dfhcommarea14Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Dfhcommarea14Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Dfhcommarea14Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Dfhcommarea14Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1024); // serialize this field at offset 1024 by default 
    }
    
	/**
	* sets parent for this Dfhcommarea14Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1024 by default
    }    
	/**
	* initializes the field in Dfhcommarea14Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DFHCOMMAREA_14_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
	   /*  end of offset */
	}




}
  
