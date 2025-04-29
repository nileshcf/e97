package com.cloudframe.app.varlen.dto.serialize;

/**
*  The class Revo3DetailRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:26. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Revo3DetailRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Revo3DetailRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int REVO_3_DETAIL_RECORD_LENGTH = 32;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for Revo3DetailRecordSerialized
	**/
    public Revo3DetailRecordSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Revo3DetailRecordSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Revo3DetailRecordSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Revo3DetailRecordSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2); // serialize this field at offset 2 by default 
    }
    
	/**
	* sets parent for this Revo3DetailRecordSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2 by default
    }    
	/**
	* initializes the field in Revo3DetailRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(REVO_3_DETAIL_RECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
