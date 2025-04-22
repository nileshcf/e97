package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class Wse212aTGrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:12. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse212aTGrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse212aTGrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_212A_TGRP_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for Wse212aTGrpSerialized
	**/
    public Wse212aTGrpSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Wse212aTGrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_212A_TGRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
