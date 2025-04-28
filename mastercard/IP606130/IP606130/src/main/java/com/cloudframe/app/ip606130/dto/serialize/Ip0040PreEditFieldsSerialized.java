package com.cloudframe.app.ip606130.dto.serialize;

/**
*  The class Ip0040PreEditFieldsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:57. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip0040PreEditFieldsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip0040PreEditFieldsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_0040_PRE_EDIT_FIELDS_LENGTH = 173;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for Ip0040PreEditFieldsSerialized
	**/
    public Ip0040PreEditFieldsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip0040PreEditFieldsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0040PreEditFieldsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip0040PreEditFieldsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,19); // serialize this field at offset 19 by default 
    }
    
	/**
	* sets parent for this Ip0040PreEditFieldsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 19 by default
    }    
	/**
	* initializes the field in Ip0040PreEditFieldsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_0040_PRE_EDIT_FIELDS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
	   /*  end of offset */
	}




}
  
