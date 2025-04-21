package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class ASGrp25Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:00. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ASGrp25Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ASGrp25Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_SGRP_25_LENGTH = 73;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for ASGrp25Serialized
	**/
    public ASGrp25Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ASGrp25Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_SGRP_25_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
