package com.cloudframe.app.bm8090m.dto.serialize;

/**
*  The class WTpePe8090mSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WTpePe8090mSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WTpePe8090mSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int W_TPE_PE_8090M_LENGTH = 1824;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginWElpPe8090m;
           protected static final int W_ELP_PE_8090M_SIZE = 8;
	
	/**
	* Constructor for WTpePe8090mSerialized
	**/
    public WTpePe8090mSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WTpePe8090mSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WTpePe8090mSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WTpePe8090mSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,528); // serialize this field at offset 528 by default 
    }
    
	/**
	* sets parent for this WTpePe8090mSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 528 by default
    }    
	/**
	* initializes the field in WTpePe8090mSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(W_TPE_PE_8090M_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginWElpPe8090m = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int wElpPe8090mSize() {
			return W_ELP_PE_8090M_SIZE;
		}



}
  
