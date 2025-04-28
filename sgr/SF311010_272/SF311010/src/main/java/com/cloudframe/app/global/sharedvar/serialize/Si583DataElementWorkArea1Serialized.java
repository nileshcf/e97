package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Si583DataElementWorkArea1Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:05. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Si583DataElementWorkArea1Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Si583DataElementWorkArea1Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SI_583_DATA_ELEMENT_WORK_AREA_1_LENGTH = 640;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginSi583Filler1;
           protected static final int SI_583_FILLER_1_SIZE = 128;
	
	/**
	* Constructor for Si583DataElementWorkArea1Serialized
	**/
    public Si583DataElementWorkArea1Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Si583DataElementWorkArea1Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Si583DataElementWorkArea1Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Si583DataElementWorkArea1Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,32876); // serialize this field at offset 32876 by default 
    }
    
	/**
	* sets parent for this Si583DataElementWorkArea1Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 32876 by default
    }    
	/**
	* initializes the field in Si583DataElementWorkArea1Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SI_583_DATA_ELEMENT_WORK_AREA_1_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginSi583Filler1 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int si583Filler1Size() {
			return SI_583_FILLER_1_SIZE;
		}



}
  
