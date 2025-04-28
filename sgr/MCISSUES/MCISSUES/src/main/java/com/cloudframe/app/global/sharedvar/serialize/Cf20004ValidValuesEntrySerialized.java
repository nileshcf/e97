package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Cf20004ValidValuesEntrySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Cf20004ValidValuesEntrySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Cf20004ValidValuesEntrySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CF_20004_VALID_VALUES_ENTRY_LENGTH = 460;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for Cf20004ValidValuesEntrySerialized
	**/
    public Cf20004ValidValuesEntrySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Cf20004ValidValuesEntrySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Cf20004ValidValuesEntrySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Cf20004ValidValuesEntrySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Cf20004ValidValuesEntrySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Cf20004ValidValuesEntrySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CF_20004_VALID_VALUES_ENTRY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
	   /*  end of offset */
	}




}
  
