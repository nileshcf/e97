package com.cloudframe.app.init1.dto.serialize;

/**
*  The class CmnErrMsg2Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:52. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CmnErrMsg2Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CmnErrMsg2Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CMN_ERR_MSG_2_LENGTH = 80;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for CmnErrMsg2Serialized
	**/
    public CmnErrMsg2Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CmnErrMsg2Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnErrMsg2Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CmnErrMsg2Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,80); // serialize this field at offset 80 by default 
    }
    
	/**
	* sets parent for this CmnErrMsg2Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 80 by default
    }    
	/**
	* initializes the field in CmnErrMsg2Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CMN_ERR_MSG_2_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
  
  
	   /*  end of offset */
	}




}
  
