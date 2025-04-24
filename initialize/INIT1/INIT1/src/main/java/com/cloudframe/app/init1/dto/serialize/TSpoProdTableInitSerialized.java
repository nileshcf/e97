package com.cloudframe.app.init1.dto.serialize;

/**
*  The class TSpoProdTableInitSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:30. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TSpoProdTableInitSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TSpoProdTableInitSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int T_SPO_PROD_TABLE_INIT_LENGTH = 2652;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for TSpoProdTableInitSerialized
	**/
    public TSpoProdTableInitSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in TSpoProdTableInitSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(T_SPO_PROD_TABLE_INIT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
  
  
  
  
	   /*  end of offset */
	}




}
  
