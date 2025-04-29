package com.cloudframe.app.init1.dto.serialize;

/**
*  The class LCpduUbInitSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:13. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class LCpduUbInitSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(LCpduUbInitSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int L_CPDU_UB_INIT_LENGTH = 162;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for LCpduUbInitSerialized
	**/
    public LCpduUbInitSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for LCpduUbInitSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public LCpduUbInitSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this LCpduUbInitSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this LCpduUbInitSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in LCpduUbInitSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(L_CPDU_UB_INIT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
	   /*  end of offset */
	}




}
  
