package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class BSGrp215Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:03. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BSGrp215Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BSGrp215Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_SGRP_215_LENGTH = 73;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for BSGrp215Serialized
	**/
    public BSGrp215Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in BSGrp215Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_SGRP_215_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
