package com.cloudframe.app.cfdate02.dto.serialize;

/**
*  The class CmnDateCalcOutputAreaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CmnDateCalcOutputAreaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CmnDateCalcOutputAreaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CMN_DATE_CALC_OUTPUT_AREA_LENGTH = 22;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for CmnDateCalcOutputAreaSerialized
	**/
    public CmnDateCalcOutputAreaSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CmnDateCalcOutputAreaSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateCalcOutputAreaSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CmnDateCalcOutputAreaSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1056); // serialize this field at offset 1056 by default 
    }
    
	/**
	* sets parent for this CmnDateCalcOutputAreaSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1056 by default
    }    
	/**
	* initializes the field in CmnDateCalcOutputAreaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CMN_DATE_CALC_OUTPUT_AREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
