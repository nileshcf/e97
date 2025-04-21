package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class ATGrp27Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:00. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ATGrp27Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ATGrp27Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_TGRP_27_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for ATGrp27Serialized
	**/
    public ATGrp27Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ATGrp27Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_TGRP_27_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
