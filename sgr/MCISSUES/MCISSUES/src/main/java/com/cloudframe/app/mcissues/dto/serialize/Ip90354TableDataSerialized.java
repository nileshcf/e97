package com.cloudframe.app.mcissues.dto.serialize;

/**
*  The class Ip90354TableDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:29. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip90354TableDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip90354TableDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_90354_TABLE_DATA_LENGTH = 181;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for Ip90354TableDataSerialized
	**/
    public Ip90354TableDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip90354TableDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip90354TableDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip90354TableDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip90354TableDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip90354TableDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_90354_TABLE_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
