package com.cloudframe.app.cfdate02.dto.serialize;

/**
*  The class Dfhcommarea17Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Dfhcommarea17Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Dfhcommarea17Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DFHCOMMAREA_17_LENGTH = 76;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for Dfhcommarea17Serialized
	**/
    public Dfhcommarea17Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Dfhcommarea17Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Dfhcommarea17Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Dfhcommarea17Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1024); // serialize this field at offset 1024 by default 
    }
    
	/**
	* sets parent for this Dfhcommarea17Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1024 by default
    }    
	/**
	* initializes the field in Dfhcommarea17Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DFHCOMMAREA_17_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
