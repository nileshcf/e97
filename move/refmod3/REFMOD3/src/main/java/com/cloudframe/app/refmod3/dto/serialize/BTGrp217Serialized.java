package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class BTGrp217Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:20. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BTGrp217Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BTGrp217Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_TGRP_217_LENGTH = 95;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for BTGrp217Serialized
	**/
    public BTGrp217Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in BTGrp217Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_TGRP_217_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
