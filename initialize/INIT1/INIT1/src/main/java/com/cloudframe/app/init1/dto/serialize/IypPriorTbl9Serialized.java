package com.cloudframe.app.init1.dto.serialize;

/**
*  The class IypPriorTbl9Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class IypPriorTbl9Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(IypPriorTbl9Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IYP_PRIOR_TBL_9_LENGTH = 48;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginIypPrior9;
           protected static final int IYP_PRIOR_9_SIZE = 2;
	
	/**
	* Constructor for IypPriorTbl9Serialized
	**/
    public IypPriorTbl9Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for IypPriorTbl9Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IypPriorTbl9Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this IypPriorTbl9Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,8); // serialize this field at offset 8 by default 
    }
    
	/**
	* sets parent for this IypPriorTbl9Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 8 by default
    }    
	/**
	* initializes the field in IypPriorTbl9Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IYP_PRIOR_TBL_9_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginIypPrior9 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int iypPrior9Size() {
			return IYP_PRIOR_9_SIZE;
		}



}
  
