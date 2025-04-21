package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class WorkFwdIca800RedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkFwdIca800RedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkFwdIca800RedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_FWD_ICA_800_REDEFINED_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for WorkFwdIca800RedefinedSerialized
	**/
    public WorkFwdIca800RedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WorkFwdIca800RedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WorkFwdIca800RedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WorkFwdIca800RedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this WorkFwdIca800RedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in WorkFwdIca800RedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WORK_FWD_ICA_800_REDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
