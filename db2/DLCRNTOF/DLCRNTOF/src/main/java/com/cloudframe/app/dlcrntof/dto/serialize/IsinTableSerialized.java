package com.cloudframe.app.dlcrntof.dto.serialize;

/**
*  The class IsinTableSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:08. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class IsinTableSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(IsinTableSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ISIN_TABLE_LENGTH = 24000;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginIsinEntry;
           protected static final int ISIN_ENTRY_SIZE = 2000;
	
	/**
	* Constructor for IsinTableSerialized
	**/
    public IsinTableSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for IsinTableSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IsinTableSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this IsinTableSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this IsinTableSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in IsinTableSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ISIN_TABLE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginIsinEntry = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int isinEntrySize() {
			return ISIN_ENTRY_SIZE;
		}



     private int dependValue = 0;  
     
  	 public void setDependingValue(int dependValue) {
	   this.dependValue = dependValue;
  	 }

     public int getVariableLength() {
     	return 0 + (dependValue *  12);
     }
     
     public int getVariableLength(int idx) {
     	return 0 + (idx *  12);
     }
}
  
