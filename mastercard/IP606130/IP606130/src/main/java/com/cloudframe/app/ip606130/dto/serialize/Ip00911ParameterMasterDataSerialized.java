package com.cloudframe.app.ip606130.dto.serialize;

/**
*  The class Ip00911ParameterMasterDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:54. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip00911ParameterMasterDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip00911ParameterMasterDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_00911_PARAMETER_MASTER_DATA_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for Ip00911ParameterMasterDataSerialized
	**/
    public Ip00911ParameterMasterDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip00911ParameterMasterDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00911ParameterMasterDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip00911ParameterMasterDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,11); // serialize this field at offset 11 by default 
    }
    
	/**
	* sets parent for this Ip00911ParameterMasterDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 11 by default
    }    
	/**
	* initializes the field in Ip00911ParameterMasterDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_00911_PARAMETER_MASTER_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
