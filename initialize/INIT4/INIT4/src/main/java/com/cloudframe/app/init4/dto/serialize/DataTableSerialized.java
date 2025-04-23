package com.cloudframe.app.init4.dto.serialize;

/**
*  The class DataTableSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:19. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DataTableSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DataTableSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DATA_TABLE_LENGTH = 70;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginDataTableArray1;
           protected static final int DATA_TABLE_ARRAY_1_SIZE = 5;
	
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
	        beginDataTableArray1 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int dataTableArray1Size() {
			return DATA_TABLE_ARRAY_1_SIZE;
		}



}
  
