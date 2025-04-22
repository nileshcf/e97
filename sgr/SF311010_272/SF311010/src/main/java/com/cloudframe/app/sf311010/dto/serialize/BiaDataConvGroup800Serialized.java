package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class BiaDataConvGroup800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:14. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BiaDataConvGroup800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BiaDataConvGroup800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BIA_DATA_CONV_GROUP_800_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for BiaDataConvGroup800Serialized
	**/
    public BiaDataConvGroup800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in BiaDataConvGroup800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BIA_DATA_CONV_GROUP_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
	   /*  end of offset */
	}




}
  
