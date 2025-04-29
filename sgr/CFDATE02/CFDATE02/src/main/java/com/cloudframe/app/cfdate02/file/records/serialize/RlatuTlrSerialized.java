package com.cloudframe.app.cfdate02.file.records.serialize;

/**
*  The class RlatuTlrSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:35. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RlatuTlrSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RlatuTlrSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RLATU_TLR_LENGTH = 150;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for RlatuTlrSerialized
	**/
    public RlatuTlrSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for RlatuTlrSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RlatuTlrSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this RlatuTlrSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this RlatuTlrSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in RlatuTlrSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RLATU_TLR_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
