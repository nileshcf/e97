package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class BTGrp214Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:34. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BTGrp214Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BTGrp214Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_TGRP_214_LENGTH = 95;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for BTGrp214Serialized
	**/
    public BTGrp214Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in BTGrp214Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_TGRP_214_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
