package com.cloudframe.app.db2funci.dto.serialize;

/**
*  The class Bdms01CallParametersSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Bdms01CallParametersSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Bdms01CallParametersSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BDMS_01_CALL_PARAMETERS_LENGTH = 7000;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for Bdms01CallParametersSerialized
	**/
    public Bdms01CallParametersSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Bdms01CallParametersSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BDMS_01_CALL_PARAMETERS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
	   /*  end of offset */
	}




}
  
