package com.cloudframe.app.ip829010.dto.serialize;

/**
*  The class Ip82921FnsDataFieldsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:39. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip82921FnsDataFieldsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip82921FnsDataFieldsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_82921_FNS_DATA_FIELDS_LENGTH = 154;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for Ip82921FnsDataFieldsSerialized
	**/
    public Ip82921FnsDataFieldsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip82921FnsDataFieldsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip82921FnsDataFieldsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip82921FnsDataFieldsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,68); // serialize this field at offset 68 by default 
    }
    
	/**
	* sets parent for this Ip82921FnsDataFieldsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 68 by default
    }    
	/**
	* initializes the field in Ip82921FnsDataFieldsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_82921_FNS_DATA_FIELDS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
	   /*  end of offset */
	}




}
  
