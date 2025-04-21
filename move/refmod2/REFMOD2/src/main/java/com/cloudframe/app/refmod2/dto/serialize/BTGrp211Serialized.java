package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class BTGrp211Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:00. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BTGrp211Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BTGrp211Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_TGRP_211_LENGTH = 95;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for BTGrp211Serialized
	**/
    public BTGrp211Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in BTGrp211Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_TGRP_211_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
