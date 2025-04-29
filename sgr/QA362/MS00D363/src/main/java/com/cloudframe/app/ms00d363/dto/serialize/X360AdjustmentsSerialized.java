package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class X360AdjustmentsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:35. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class X360AdjustmentsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(X360AdjustmentsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int X_360_ADJUSTMENTS_LENGTH = 417;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for X360AdjustmentsSerialized
	**/
    public X360AdjustmentsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for X360AdjustmentsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360AdjustmentsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this X360AdjustmentsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,583); // serialize this field at offset 583 by default 
    }
    
	/**
	* sets parent for this X360AdjustmentsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 583 by default
    }    
	/**
	* initializes the field in X360AdjustmentsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(X_360_ADJUSTMENTS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
  
	   /*  end of offset */
	}




}
  
