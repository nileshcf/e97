package com.cloudframe.app.cfdate02.dto.serialize;

/**
*  The class TRevoTableInitSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TRevoTableInitSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TRevoTableInitSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int T_REVO_TABLE_INIT_LENGTH = 5757;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for TRevoTableInitSerialized
	**/
    public TRevoTableInitSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in TRevoTableInitSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(T_REVO_TABLE_INIT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
  
	   /*  end of offset */
	}




}
  
