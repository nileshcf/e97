package com.cloudframe.app.ip662010.dto.serialize;

/**
*  The class CarrierTooShortCodes600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:07. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CarrierTooShortCodes600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CarrierTooShortCodes600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CARRIER_TOO_SHORT_CODES_600_LENGTH = 20;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginCarrierShortRow600;
           protected static final int CARRIER_SHORT_ROW_600_SIZE = 5;
	
	/**
	* Constructor for CarrierTooShortCodes600Serialized
	**/
    public CarrierTooShortCodes600Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CarrierTooShortCodes600Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CarrierTooShortCodes600Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CarrierTooShortCodes600Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this CarrierTooShortCodes600Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in CarrierTooShortCodes600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CARRIER_TOO_SHORT_CODES_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginCarrierShortRow600 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int carrierShortRow600Size() {
			return CARRIER_SHORT_ROW_600_SIZE;
		}



}
  
