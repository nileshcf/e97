package com.cloudframe.app.move0.dto.serialize;

/**
*  The class Rl7abTableInfoSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Rl7abTableInfoSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Rl7abTableInfoSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RL_7AB_TABLE_INFO_LENGTH = 640;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginRl7abTbl;
           protected static final int RL_7AB_TBL_SIZE = 5;
	
	/**
	* Constructor for Rl7abTableInfoSerialized
	**/
    public Rl7abTableInfoSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Rl7abTableInfoSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Rl7abTableInfoSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Rl7abTableInfoSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,128); // serialize this field at offset 128 by default 
    }
    
	/**
	* sets parent for this Rl7abTableInfoSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 128 by default
    }    
	/**
	* initializes the field in Rl7abTableInfoSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RL_7AB_TABLE_INFO_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginRl7abTbl = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int rl7abTblSize() {
			return RL_7AB_TBL_SIZE;
		}



}
  
