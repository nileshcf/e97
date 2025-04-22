package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class ProductTableSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ProductTableSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ProductTableSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PRODUCT_TABLE_LENGTH = 588;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginProductKeyEntry;
           protected static final int PRODUCT_KEY_ENTRY_SIZE = 21;
	
	/**
	* Constructor for ProductTableSerialized
	**/
    public ProductTableSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ProductTableSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ProductTableSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ProductTableSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this ProductTableSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in ProductTableSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PRODUCT_TABLE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginProductKeyEntry = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int productKeyEntrySize() {
			return PRODUCT_KEY_ENTRY_SIZE;
		}



}
  
