package com.cloudframe.app.dbissues.dto.serialize;

/**
*  The class F01oIzdattabSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:12. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class F01oIzdattabSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(F01oIzdattabSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int F_01O_IZDATTAB_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for F01oIzdattabSerialized
	**/
    public F01oIzdattabSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for F01oIzdattabSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public F01oIzdattabSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this F01oIzdattabSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,85); // serialize this field at offset 85 by default 
    }
    
	/**
	* sets parent for this F01oIzdattabSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 85 by default
    }    
	/**
	* initializes the field in F01oIzdattabSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(F_01O_IZDATTAB_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
