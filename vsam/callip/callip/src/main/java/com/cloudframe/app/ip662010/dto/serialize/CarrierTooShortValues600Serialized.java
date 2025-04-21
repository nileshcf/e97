package com.cloudframe.app.ip662010.dto.serialize;

/**
*  The class CarrierTooShortValues600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:55. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CarrierTooShortValues600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CarrierTooShortValues600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CARRIER_TOO_SHORT_VALUES_600_LENGTH = 20;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for CarrierTooShortValues600Serialized
	**/
    public CarrierTooShortValues600Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CarrierTooShortValues600Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CarrierTooShortValues600Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CarrierTooShortValues600Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this CarrierTooShortValues600Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in CarrierTooShortValues600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CARRIER_TOO_SHORT_VALUES_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
  
  
  
  
  
  
  
	   /*  end of offset */
	}




}
  
