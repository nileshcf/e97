package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class FnsPldRdFnsDataFieldsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FnsPldRdFnsDataFieldsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FnsPldRdFnsDataFieldsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FNS_PLD_RD_FNS_DATA_FIELDS_LENGTH = 154;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for FnsPldRdFnsDataFieldsSerialized
	**/
    public FnsPldRdFnsDataFieldsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for FnsPldRdFnsDataFieldsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FnsPldRdFnsDataFieldsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this FnsPldRdFnsDataFieldsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,68); // serialize this field at offset 68 by default 
    }
    
	/**
	* sets parent for this FnsPldRdFnsDataFieldsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 68 by default
    }    
	/**
	* initializes the field in FnsPldRdFnsDataFieldsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FNS_PLD_RD_FNS_DATA_FIELDS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
	   /*  end of offset */
	}




}
  
