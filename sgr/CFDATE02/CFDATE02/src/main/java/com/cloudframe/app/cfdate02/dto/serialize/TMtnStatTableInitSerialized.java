package com.cloudframe.app.cfdate02.dto.serialize;

/**
*  The class TMtnStatTableInitSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:35. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TMtnStatTableInitSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TMtnStatTableInitSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int T_MTN_STAT_TABLE_INIT_LENGTH = 8909;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for TMtnStatTableInitSerialized
	**/
    public TMtnStatTableInitSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in TMtnStatTableInitSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(T_MTN_STAT_TABLE_INIT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
  
  
  
  
  
	   /*  end of offset */
	}




}
  
