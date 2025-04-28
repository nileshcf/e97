package com.cloudframe.app.iovb32k.dto.serialize;

/**
*  The class DataValuesSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:02. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DataValuesSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DataValuesSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DATA_VALUES_LENGTH = 56;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for DataValuesSerialized
	**/
    public DataValuesSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DataValuesSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DATA_VALUES_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
  
  
	   /*  end of offset */
	}




}
  
