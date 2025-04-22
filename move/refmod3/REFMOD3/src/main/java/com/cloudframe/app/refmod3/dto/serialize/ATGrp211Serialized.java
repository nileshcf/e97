package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class ATGrp211Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:10. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ATGrp211Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ATGrp211Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_TGRP_211_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for ATGrp211Serialized
	**/
    public ATGrp211Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ATGrp211Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_TGRP_211_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
