package com.cloudframe.app.calldrvr.dto.serialize;

/**
*  The class ByReferenceSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:13. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ByReferenceSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ByReferenceSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BY_REFERENCE_LENGTH = 13;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for ByReferenceSerialized
	**/
    public ByReferenceSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ByReferenceSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ByReferenceSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ByReferenceSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,13); // serialize this field at offset 13 by default 
    }
    
	/**
	* sets parent for this ByReferenceSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 13 by default
    }    
	/**
	* initializes the field in ByReferenceSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BY_REFERENCE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
	   /*  end of offset */
	}




}
  
