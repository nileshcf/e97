package com.cloudframe.app.ip989010.dto.serialize;

/**
*  The class TblEntry5001644695Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TblEntry5001644695Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TblEntry5001644695Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TBL_ENTRY_5001644695_LENGTH = 1015;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for TblEntry5001644695Serialized
	**/
    public TblEntry5001644695Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for TblEntry5001644695Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TblEntry5001644695Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this TblEntry5001644695Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this TblEntry5001644695Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in TblEntry5001644695Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TBL_ENTRY_5001644695_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
	   /*  end of offset */
	}




}
  
