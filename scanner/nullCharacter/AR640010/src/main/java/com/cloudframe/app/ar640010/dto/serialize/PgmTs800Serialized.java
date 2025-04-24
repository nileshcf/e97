package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class PgmTs800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:49. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class PgmTs800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(PgmTs800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PGM_TS_800_LENGTH = 26;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for PgmTs800Serialized
	**/
    public PgmTs800Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for PgmTs800Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public PgmTs800Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this PgmTs800Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1318); // serialize this field at offset 1318 by default 
    }
    
	/**
	* sets parent for this PgmTs800Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1318 by default
    }    
	/**
	* initializes the field in PgmTs800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PGM_TS_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
	   /*  end of offset */
	}




}
  
