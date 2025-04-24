package com.cloudframe.app.varlen.dto.serialize;

/**
*  The class RevoHeaderRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:42. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RevoHeaderRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RevoHeaderRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int REVO_HEADER_RECORD_LENGTH = 674;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for RevoHeaderRecordSerialized
	**/
    public RevoHeaderRecordSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for RevoHeaderRecordSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RevoHeaderRecordSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this RevoHeaderRecordSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2); // serialize this field at offset 2 by default 
    }
    
	/**
	* sets parent for this RevoHeaderRecordSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2 by default
    }    
	/**
	* initializes the field in RevoHeaderRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(REVO_HEADER_RECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
