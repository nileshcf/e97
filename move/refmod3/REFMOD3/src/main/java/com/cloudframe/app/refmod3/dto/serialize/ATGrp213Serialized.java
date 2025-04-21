package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class ATGrp213Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ATGrp213Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ATGrp213Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_TGRP_213_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for ATGrp213Serialized
	**/
    public ATGrp213Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ATGrp213Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_TGRP_213_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
