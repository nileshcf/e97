package com.cloudframe.app.cfif01.dto.serialize;

/**
*  The class ArraySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:21. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ArraySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ArraySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ARRAY_LENGTH = 39;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginTbl;
           protected static final int TBL_SIZE = 3;
	
	/**
	* Constructor for ArraySerialized
	**/
    public ArraySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ArraySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ArraySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ArraySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,14); // serialize this field at offset 14 by default 
    }
    
	/**
	* sets parent for this ArraySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 14 by default
    }    
	/**
	* initializes the field in ArraySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ARRAY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginTbl = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int tblSize() {
			return TBL_SIZE;
		}



}
  
