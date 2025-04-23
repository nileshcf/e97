package com.cloudframe.app.cfif01.dto.serialize;

/**
*  The class DataTableSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:56. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DataTableSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DataTableSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DATA_TABLE_LENGTH = 15;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginDataTableArray;
           protected static final int DATA_TABLE_ARRAY_SIZE = 3;
	
	/**
	* Constructor for DataTableSerialized
	**/
    public DataTableSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DataTableSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DATA_TABLE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginDataTableArray = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int dataTableArraySize() {
			return DATA_TABLE_ARRAY_SIZE;
		}



}
  
