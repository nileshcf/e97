package com.cloudframe.app.init1.dto.serialize;

/**
*  The class IypPriorTbl6Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:30. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class IypPriorTbl6Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(IypPriorTbl6Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IYP_PRIOR_TBL_6_LENGTH = 48;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginIypPrior6;
           protected static final int IYP_PRIOR_6_SIZE = 2;
	
	/**
	* Constructor for IypPriorTbl6Serialized
	**/
    public IypPriorTbl6Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for IypPriorTbl6Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IypPriorTbl6Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this IypPriorTbl6Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,24); // serialize this field at offset 24 by default 
    }
    
	/**
	* sets parent for this IypPriorTbl6Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 24 by default
    }    
	/**
	* initializes the field in IypPriorTbl6Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IYP_PRIOR_TBL_6_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginIypPrior6 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int iypPrior6Size() {
			return IYP_PRIOR_6_SIZE;
		}



}
  
