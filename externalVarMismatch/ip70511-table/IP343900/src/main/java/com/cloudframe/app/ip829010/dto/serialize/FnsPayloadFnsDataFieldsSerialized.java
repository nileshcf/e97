package com.cloudframe.app.ip829010.dto.serialize;

/**
*  The class FnsPayloadFnsDataFieldsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:04. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FnsPayloadFnsDataFieldsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FnsPayloadFnsDataFieldsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FNS_PAYLOAD_FNS_DATA_FIELDS_LENGTH = 154;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for FnsPayloadFnsDataFieldsSerialized
	**/
    public FnsPayloadFnsDataFieldsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for FnsPayloadFnsDataFieldsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FnsPayloadFnsDataFieldsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this FnsPayloadFnsDataFieldsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,68); // serialize this field at offset 68 by default 
    }
    
	/**
	* sets parent for this FnsPayloadFnsDataFieldsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 68 by default
    }    
	/**
	* initializes the field in FnsPayloadFnsDataFieldsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FNS_PAYLOAD_FNS_DATA_FIELDS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
	   /*  end of offset */
	}




}
  
