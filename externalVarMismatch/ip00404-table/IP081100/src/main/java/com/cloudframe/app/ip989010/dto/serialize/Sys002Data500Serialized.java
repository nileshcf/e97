package com.cloudframe.app.ip989010.dto.serialize;

/**
*  The class Sys002Data500Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:34. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sys002Data500Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sys002Data500Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_002_DATA_500_LENGTH = 200;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for Sys002Data500Serialized
	**/
    public Sys002Data500Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Sys002Data500Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sys002Data500Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Sys002Data500Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Sys002Data500Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Sys002Data500Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_002_DATA_500_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
