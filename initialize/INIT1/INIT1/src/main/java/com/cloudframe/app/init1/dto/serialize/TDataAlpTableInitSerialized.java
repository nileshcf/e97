package com.cloudframe.app.init1.dto.serialize;

/**
*  The class TDataAlpTableInitSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:56. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TDataAlpTableInitSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TDataAlpTableInitSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int T_DATA_ALP_TABLE_INIT_LENGTH = 13805;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for TDataAlpTableInitSerialized
	**/
    public TDataAlpTableInitSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in TDataAlpTableInitSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(T_DATA_ALP_TABLE_INIT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
  
  
  
  
  
  
  
  
	   /*  end of offset */
	}




}
  
