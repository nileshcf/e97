package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class MciseqioCodesSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:49. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MciseqioCodesSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MciseqioCodesSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MCISEQIO_CODES_LENGTH = 38;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for MciseqioCodesSerialized
	**/
    public MciseqioCodesSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MciseqioCodesSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MciseqioCodesSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MciseqioCodesSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,125); // serialize this field at offset 125 by default 
    }
    
	/**
	* sets parent for this MciseqioCodesSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 125 by default
    }    
	/**
	* initializes the field in MciseqioCodesSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MCISEQIO_CODES_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
	   /*  end of offset */
	}




}
  
