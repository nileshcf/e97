package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class Wse25aSGrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:58. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse25aSGrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse25aSGrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_25A_SGRP_LENGTH = 63;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for Wse25aSGrpSerialized
	**/
    public Wse25aSGrpSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Wse25aSGrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_25A_SGRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
