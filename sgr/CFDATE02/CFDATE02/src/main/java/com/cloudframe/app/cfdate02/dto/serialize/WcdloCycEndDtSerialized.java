package com.cloudframe.app.cfdate02.dto.serialize;

/**
*  The class WcdloCycEndDtSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WcdloCycEndDtSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WcdloCycEndDtSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WCDLO_CYC_END_DT_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for WcdloCycEndDtSerialized
	**/
    public WcdloCycEndDtSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WcdloCycEndDtSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcdloCycEndDtSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WcdloCycEndDtSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,20); // serialize this field at offset 20 by default 
    }
    
	/**
	* sets parent for this WcdloCycEndDtSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 20 by default
    }    
	/**
	* initializes the field in WcdloCycEndDtSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WCDLO_CYC_END_DT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
	   /*  end of offset */
	}




}
  
