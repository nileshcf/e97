package com.cloudframe.app.si994010.dto.serialize;

/**
*  The class Si520DeAndLengthsRedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:14. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Si520DeAndLengthsRedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Si520DeAndLengthsRedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SI_520_DE_AND_LENGTHS_REDEFINED_LENGTH = 384;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginSi520DeAndLengthsGroupArray1;
           protected static final int SI_520_DE_AND_LENGTHS_GROUP_ARRAY_1_SIZE = 128;
	
	/**
	* Constructor for Si520DeAndLengthsRedefinedSerialized
	**/
    public Si520DeAndLengthsRedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Si520DeAndLengthsRedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Si520DeAndLengthsRedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Si520DeAndLengthsRedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Si520DeAndLengthsRedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Si520DeAndLengthsRedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SI_520_DE_AND_LENGTHS_REDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginSi520DeAndLengthsGroupArray1 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int si520DeAndLengthsGroupArray1Size() {
			return SI_520_DE_AND_LENGTHS_GROUP_ARRAY_1_SIZE;
		}



}
  
