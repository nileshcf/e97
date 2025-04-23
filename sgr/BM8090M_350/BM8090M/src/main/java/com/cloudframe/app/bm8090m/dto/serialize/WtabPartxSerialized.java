package com.cloudframe.app.bm8090m.dto.serialize;

/**
*  The class WtabPartxSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:03. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WtabPartxSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WtabPartxSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WTAB_PARTX_LENGTH = 100;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginWeleTab;
           protected static final int WELE_TAB_SIZE = 100;
	
	/**
	* Constructor for WtabPartxSerialized
	**/
    public WtabPartxSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WtabPartxSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WtabPartxSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WtabPartxSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this WtabPartxSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in WtabPartxSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WTAB_PARTX_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginWeleTab = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int weleTabSize() {
			return WELE_TAB_SIZE;
		}



}
  
