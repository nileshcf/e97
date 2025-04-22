package com.cloudframe.app.ip606130.dto.serialize;

/**
*  The class Ip00002Table0EntrySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:08. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip00002Table0EntrySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip00002Table0EntrySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_00002_TABLE_0_ENTRY_LENGTH = 259;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for Ip00002Table0EntrySerialized
	**/
    public Ip00002Table0EntrySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip00002Table0EntrySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00002Table0EntrySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip00002Table0EntrySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip00002Table0EntrySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip00002Table0EntrySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_00002_TABLE_0_ENTRY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
