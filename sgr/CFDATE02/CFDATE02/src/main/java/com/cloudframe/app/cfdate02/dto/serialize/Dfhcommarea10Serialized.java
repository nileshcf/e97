package com.cloudframe.app.cfdate02.dto.serialize;

/**
*  The class Dfhcommarea10Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Dfhcommarea10Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Dfhcommarea10Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DFHCOMMAREA_10_LENGTH = 76;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for Dfhcommarea10Serialized
	**/
    public Dfhcommarea10Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Dfhcommarea10Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Dfhcommarea10Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Dfhcommarea10Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1024); // serialize this field at offset 1024 by default 
    }
    
	/**
	* sets parent for this Dfhcommarea10Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1024 by default
    }    
	/**
	* initializes the field in Dfhcommarea10Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DFHCOMMAREA_10_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
