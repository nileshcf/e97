package com.cloudframe.app.cfdate02.dto.serialize;

/**
*  The class WcdloCycStartDtSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:05. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WcdloCycStartDtSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WcdloCycStartDtSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WCDLO_CYC_START_DT_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for WcdloCycStartDtSerialized
	**/
    public WcdloCycStartDtSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WcdloCycStartDtSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcdloCycStartDtSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WcdloCycStartDtSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,10); // serialize this field at offset 10 by default 
    }
    
	/**
	* sets parent for this WcdloCycStartDtSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 10 by default
    }    
	/**
	* initializes the field in WcdloCycStartDtSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WCDLO_CYC_START_DT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
	   /*  end of offset */
	}




}
  
