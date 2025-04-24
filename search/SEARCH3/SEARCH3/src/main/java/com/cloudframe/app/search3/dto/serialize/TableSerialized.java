package com.cloudframe.app.search3.dto.serialize;

/**
*  The class TableSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:43. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TableSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TableSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TABLE_LENGTH = 600;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginTableEntry;
           protected static final int TABLE_ENTRY_SIZE = 100;
	
	/**
	* Constructor for TableSerialized
	**/
    public TableSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for TableSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TableSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this TableSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this TableSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in TableSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TABLE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginTableEntry = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int tableEntrySize() {
			return TABLE_ENTRY_SIZE;
		}



}
  
