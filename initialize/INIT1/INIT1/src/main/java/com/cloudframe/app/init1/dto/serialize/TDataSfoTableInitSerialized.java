package com.cloudframe.app.init1.dto.serialize;

/**
*  The class TDataSfoTableInitSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:53. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TDataSfoTableInitSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TDataSfoTableInitSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int T_DATA_SFO_TABLE_INIT_LENGTH = 13554;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for TDataSfoTableInitSerialized
	**/
    public TDataSfoTableInitSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in TDataSfoTableInitSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(T_DATA_SFO_TABLE_INIT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
  
  
  
  
  
  
  
	   /*  end of offset */
	}




}
  
