package com.cloudframe.app.sf327010.dto.serialize;

/**
*  The class CurrentRunMsg600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CurrentRunMsg600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CurrentRunMsg600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CURRENT_RUN_MSG_600_LENGTH = 63;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for CurrentRunMsg600Serialized
	**/
    public CurrentRunMsg600Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in CurrentRunMsg600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CURRENT_RUN_MSG_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
  
  
	   /*  end of offset */
	}




}
  
