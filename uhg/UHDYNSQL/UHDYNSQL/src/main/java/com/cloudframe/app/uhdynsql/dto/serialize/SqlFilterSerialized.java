package com.cloudframe.app.uhdynsql.dto.serialize;

/**
*  The class SqlFilterSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:55. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SqlFilterSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SqlFilterSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SQL_FILTER_LENGTH = 80;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for SqlFilterSerialized
	**/
    public SqlFilterSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in SqlFilterSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SQL_FILTER_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
	   /*  end of offset */
	}




}
  
