package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class Wse220bTGrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse220bTGrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse220bTGrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_220B_TGRP_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for Wse220bTGrpSerialized
	**/
    public Wse220bTGrpSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Wse220bTGrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_220B_TGRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
