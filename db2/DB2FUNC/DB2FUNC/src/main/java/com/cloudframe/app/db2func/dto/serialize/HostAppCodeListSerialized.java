package com.cloudframe.app.db2func.dto.serialize;

/**
*  The class HostAppCodeListSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class HostAppCodeListSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(HostAppCodeListSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HOST_APP_CODE_LIST_LENGTH = 21;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for HostAppCodeListSerialized
	**/
    public HostAppCodeListSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for HostAppCodeListSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HostAppCodeListSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this HostAppCodeListSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this HostAppCodeListSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in HostAppCodeListSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HOST_APP_CODE_LIST_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
