package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class Wse27aTGrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:22. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse27aTGrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse27aTGrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_27A_TGRP_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for Wse27aTGrpSerialized
	**/
    public Wse27aTGrpSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Wse27aTGrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_27A_TGRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
