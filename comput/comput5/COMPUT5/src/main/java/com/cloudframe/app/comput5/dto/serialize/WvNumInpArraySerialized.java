package com.cloudframe.app.comput5.dto.serialize;

/**
*  The class WvNumInpArraySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:09. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WvNumInpArraySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WvNumInpArraySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WV_NUM_INP_ARRAY_LENGTH = 18;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginWvNumInpItem;
           protected static final int WV_NUM_INP_ITEM_SIZE = 18;
	
	/**
	* Constructor for WvNumInpArraySerialized
	**/
    public WvNumInpArraySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WvNumInpArraySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WvNumInpArraySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WvNumInpArraySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this WvNumInpArraySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in WvNumInpArraySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WV_NUM_INP_ARRAY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginWvNumInpItem = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int wvNumInpItemSize() {
			return WV_NUM_INP_ITEM_SIZE;
		}



}
  
