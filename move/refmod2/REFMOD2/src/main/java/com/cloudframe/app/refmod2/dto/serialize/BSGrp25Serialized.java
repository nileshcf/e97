package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class BSGrp25Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:02. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BSGrp25Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BSGrp25Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_SGRP_25_LENGTH = 73;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for BSGrp25Serialized
	**/
    public BSGrp25Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in BSGrp25Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_SGRP_25_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
