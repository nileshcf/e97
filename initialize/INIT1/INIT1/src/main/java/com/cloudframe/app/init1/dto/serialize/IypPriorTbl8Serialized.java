package com.cloudframe.app.init1.dto.serialize;

/**
*  The class IypPriorTbl8Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:30. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class IypPriorTbl8Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(IypPriorTbl8Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IYP_PRIOR_TBL_8_LENGTH = 48;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginIypPrior8;
           protected static final int IYP_PRIOR_8_SIZE = 2;
	
	/**
	* Constructor for IypPriorTbl8Serialized
	**/
    public IypPriorTbl8Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for IypPriorTbl8Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IypPriorTbl8Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this IypPriorTbl8Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,24); // serialize this field at offset 24 by default 
    }
    
	/**
	* sets parent for this IypPriorTbl8Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 24 by default
    }    
	/**
	* initializes the field in IypPriorTbl8Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IYP_PRIOR_TBL_8_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginIypPrior8 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int iypPrior8Size() {
			return IYP_PRIOR_8_SIZE;
		}



}
  
