package com.cloudframe.app.init1.dto.serialize;

/**
*  The class WcdloDateTableSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WcdloDateTableSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WcdloDateTableSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WCDLO_DATE_TABLE_LENGTH = 192;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginWcdloDateTbl;
           protected static final int WCDLO_DATE_TBL_SIZE = 4;
	
	/**
	* Constructor for WcdloDateTableSerialized
	**/
    public WcdloDateTableSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WcdloDateTableSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcdloDateTableSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WcdloDateTableSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,90); // serialize this field at offset 90 by default 
    }
    
	/**
	* sets parent for this WcdloDateTableSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 90 by default
    }    
	/**
	* initializes the field in WcdloDateTableSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WCDLO_DATE_TABLE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginWcdloDateTbl = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int wcdloDateTblSize() {
			return WCDLO_DATE_TBL_SIZE;
		}



}
  
