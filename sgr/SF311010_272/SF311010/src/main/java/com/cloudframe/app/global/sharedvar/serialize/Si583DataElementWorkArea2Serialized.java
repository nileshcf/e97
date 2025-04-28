package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Si583DataElementWorkArea2Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:05. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Si583DataElementWorkArea2Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Si583DataElementWorkArea2Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SI_583_DATA_ELEMENT_WORK_AREA_2_LENGTH = 640;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginSi583Filler2;
           protected static final int SI_583_FILLER_2_SIZE = 128;
	
	/**
	* Constructor for Si583DataElementWorkArea2Serialized
	**/
    public Si583DataElementWorkArea2Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Si583DataElementWorkArea2Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Si583DataElementWorkArea2Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Si583DataElementWorkArea2Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,33516); // serialize this field at offset 33516 by default 
    }
    
	/**
	* sets parent for this Si583DataElementWorkArea2Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 33516 by default
    }    
	/**
	* initializes the field in Si583DataElementWorkArea2Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SI_583_DATA_ELEMENT_WORK_AREA_2_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginSi583Filler2 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int si583Filler2Size() {
			return SI_583_FILLER_2_SIZE;
		}



}
  
