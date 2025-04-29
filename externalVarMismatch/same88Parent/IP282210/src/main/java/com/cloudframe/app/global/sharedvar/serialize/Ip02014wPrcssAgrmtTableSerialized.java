package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip02014wPrcssAgrmtTableSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:27. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip02014wPrcssAgrmtTableSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip02014wPrcssAgrmtTableSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_02014W_PRCSS_AGRMT_TABLE_LENGTH = 932;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for Ip02014wPrcssAgrmtTableSerialized
	**/
    public Ip02014wPrcssAgrmtTableSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip02014wPrcssAgrmtTableSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip02014wPrcssAgrmtTableSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip02014wPrcssAgrmtTableSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip02014wPrcssAgrmtTableSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip02014wPrcssAgrmtTableSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_02014W_PRCSS_AGRMT_TABLE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
	   /*  end of offset */
	}




}
  
