package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class Wse213aSGrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse213aSGrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse213aSGrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_213A_SGRP_LENGTH = 63;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for Wse213aSGrpSerialized
	**/
    public Wse213aSGrpSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Wse213aSGrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_213A_SGRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
