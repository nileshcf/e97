package com.cloudframe.app.sf327010.dto.serialize;

/**
*  The class Sf535ZlogServiceTableSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:02. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sf535ZlogServiceTableSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sf535ZlogServiceTableSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SF_535_ZLOG_SERVICE_TABLE_LENGTH = 11456;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginSf535ZlogServiceEntry;
           protected static final int SF_535_ZLOG_SERVICE_ENTRY_SIZE = 179;
	
	/**
	* Constructor for Sf535ZlogServiceTableSerialized
	**/
    public Sf535ZlogServiceTableSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Sf535ZlogServiceTableSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf535ZlogServiceTableSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Sf535ZlogServiceTableSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Sf535ZlogServiceTableSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Sf535ZlogServiceTableSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SF_535_ZLOG_SERVICE_TABLE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginSf535ZlogServiceEntry = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int sf535ZlogServiceEntrySize() {
			return SF_535_ZLOG_SERVICE_ENTRY_SIZE;
		}



}
  
