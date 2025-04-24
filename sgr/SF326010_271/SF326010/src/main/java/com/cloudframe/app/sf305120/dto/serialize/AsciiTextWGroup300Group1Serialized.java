package com.cloudframe.app.sf305120.dto.serialize;

/**
*  The class AsciiTextWGroup300Group1Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AsciiTextWGroup300Group1Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AsciiTextWGroup300Group1Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ASCII_TEXT_WGROUP_300_GROUP_1_LENGTH = 24;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for AsciiTextWGroup300Group1Serialized
	**/
    public AsciiTextWGroup300Group1Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for AsciiTextWGroup300Group1Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AsciiTextWGroup300Group1Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this AsciiTextWGroup300Group1Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this AsciiTextWGroup300Group1Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in AsciiTextWGroup300Group1Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ASCII_TEXT_WGROUP_300_GROUP_1_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
	   /*  end of offset */
	}




}
  
