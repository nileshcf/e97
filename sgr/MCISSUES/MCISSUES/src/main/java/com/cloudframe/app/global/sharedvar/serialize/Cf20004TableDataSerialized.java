package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Cf20004TableDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:33. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Cf20004TableDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Cf20004TableDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CF_20004_TABLE_DATA_LENGTH = 460;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for Cf20004TableDataSerialized
	**/
    public Cf20004TableDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Cf20004TableDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CF_20004_TABLE_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
