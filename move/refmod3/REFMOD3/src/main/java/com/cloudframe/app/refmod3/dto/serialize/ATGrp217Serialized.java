package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class ATGrp217Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ATGrp217Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ATGrp217Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_TGRP_217_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for ATGrp217Serialized
	**/
    public ATGrp217Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ATGrp217Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_TGRP_217_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
