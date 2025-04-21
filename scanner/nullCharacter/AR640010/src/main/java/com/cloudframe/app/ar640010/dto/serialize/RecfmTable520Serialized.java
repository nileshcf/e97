package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class RecfmTable520Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RecfmTable520Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RecfmTable520Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RECFM_TABLE_520_LENGTH = 25;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginRecfmEntry520;
           protected static final int RECFM_ENTRY_520_SIZE = 5;
	
	/**
	* Constructor for RecfmTable520Serialized
	**/
    public RecfmTable520Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for RecfmTable520Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RecfmTable520Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this RecfmTable520Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2); // serialize this field at offset 2 by default 
    }
    
	/**
	* sets parent for this RecfmTable520Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2 by default
    }    
	/**
	* initializes the field in RecfmTable520Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RECFM_TABLE_520_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginRecfmEntry520 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int recfmEntry520Size() {
			return RECFM_ENTRY_520_SIZE;
		}



}
  
