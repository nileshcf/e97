package com.cloudframe.app.init1.dto.serialize;

/**
*  The class TLnshrgrpTableInitSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:52. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TLnshrgrpTableInitSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TLnshrgrpTableInitSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int T_LNSHRGRP_TABLE_INIT_LENGTH = 90050;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for TLnshrgrpTableInitSerialized
	**/
    public TLnshrgrpTableInitSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in TLnshrgrpTableInitSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(T_LNSHRGRP_TABLE_INIT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
