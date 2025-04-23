package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class SeprTableRedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:27. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SeprTableRedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SeprTableRedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SEPR_TABLE_REDEFINED_LENGTH = 600;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginSeprEntry;
           protected static final int SEPR_ENTRY_SIZE = 100;
	
	/**
	* Constructor for SeprTableRedefinedSerialized
	**/
    public SeprTableRedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for SeprTableRedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SeprTableRedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this SeprTableRedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this SeprTableRedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in SeprTableRedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SEPR_TABLE_REDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginSeprEntry = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int seprEntrySize() {
			return SEPR_ENTRY_SIZE;
		}



}
  
