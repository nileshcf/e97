package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class Sf503ImImageLogRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:37. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sf503ImImageLogRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sf503ImImageLogRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SF_503_IM_IMAGE_LOG_RECORD_LENGTH = 32737;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for Sf503ImImageLogRecordSerialized
	**/
    public Sf503ImImageLogRecordSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Sf503ImImageLogRecordSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf503ImImageLogRecordSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Sf503ImImageLogRecordSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,15); // serialize this field at offset 15 by default 
    }
    
	/**
	* sets parent for this Sf503ImImageLogRecordSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 15 by default
    }    
	/**
	* initializes the field in Sf503ImImageLogRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SF_503_IM_IMAGE_LOG_RECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
