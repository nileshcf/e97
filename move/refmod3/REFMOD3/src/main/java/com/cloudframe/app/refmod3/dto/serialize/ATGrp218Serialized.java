package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class ATGrp218Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:34. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ATGrp218Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ATGrp218Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_TGRP_218_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for ATGrp218Serialized
	**/
    public ATGrp218Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ATGrp218Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_TGRP_218_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
