package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip02014wPrcsAgrmtTableSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:30. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip02014wPrcsAgrmtTableSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip02014wPrcsAgrmtTableSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_02014W_PRCS_AGRMT_TABLE_LENGTH = 932;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for Ip02014wPrcsAgrmtTableSerialized
	**/
    public Ip02014wPrcsAgrmtTableSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip02014wPrcsAgrmtTableSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip02014wPrcsAgrmtTableSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip02014wPrcsAgrmtTableSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip02014wPrcsAgrmtTableSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip02014wPrcsAgrmtTableSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_02014W_PRCS_AGRMT_TABLE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
