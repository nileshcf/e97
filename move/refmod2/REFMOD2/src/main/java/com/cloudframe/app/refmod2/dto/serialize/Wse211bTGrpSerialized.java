package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class Wse211bTGrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:05. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse211bTGrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse211bTGrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_211B_TGRP_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for Wse211bTGrpSerialized
	**/
    public Wse211bTGrpSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Wse211bTGrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_211B_TGRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
