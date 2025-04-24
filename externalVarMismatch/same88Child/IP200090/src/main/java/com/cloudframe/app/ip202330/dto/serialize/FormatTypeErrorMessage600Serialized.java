package com.cloudframe.app.ip202330.dto.serialize;

/**
*  The class FormatTypeErrorMessage600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FormatTypeErrorMessage600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FormatTypeErrorMessage600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FORMAT_TYPE_ERROR_MESSAGE_600_LENGTH = 27;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for FormatTypeErrorMessage600Serialized
	**/
    public FormatTypeErrorMessage600Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in FormatTypeErrorMessage600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FORMAT_TYPE_ERROR_MESSAGE_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
