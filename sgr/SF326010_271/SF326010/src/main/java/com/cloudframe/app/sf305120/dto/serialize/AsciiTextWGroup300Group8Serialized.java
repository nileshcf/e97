package com.cloudframe.app.sf305120.dto.serialize;

/**
*  The class AsciiTextWGroup300Group8Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AsciiTextWGroup300Group8Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AsciiTextWGroup300Group8Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ASCII_TEXT_WGROUP_300_GROUP_8_LENGTH = 26;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for AsciiTextWGroup300Group8Serialized
	**/
    public AsciiTextWGroup300Group8Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for AsciiTextWGroup300Group8Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AsciiTextWGroup300Group8Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this AsciiTextWGroup300Group8Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,60); // serialize this field at offset 60 by default 
    }
    
	/**
	* sets parent for this AsciiTextWGroup300Group8Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 60 by default
    }    
	/**
	* initializes the field in AsciiTextWGroup300Group8Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ASCII_TEXT_WGROUP_300_GROUP_8_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
	   /*  end of offset */
	}




}
  
