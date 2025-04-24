package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class Sf31IsoBkntDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sf31IsoBkntDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sf31IsoBkntDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SF_31_ISO_BKNT_DATA_LENGTH = 9;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for Sf31IsoBkntDataSerialized
	**/
    public Sf31IsoBkntDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Sf31IsoBkntDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf31IsoBkntDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Sf31IsoBkntDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,300); // serialize this field at offset 300 by default 
    }
    
	/**
	* sets parent for this Sf31IsoBkntDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 300 by default
    }    
	/**
	* initializes the field in Sf31IsoBkntDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SF_31_ISO_BKNT_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
