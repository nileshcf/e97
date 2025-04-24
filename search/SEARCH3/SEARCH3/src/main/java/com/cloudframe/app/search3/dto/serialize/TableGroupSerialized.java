package com.cloudframe.app.search3.dto.serialize;

/**
*  The class TableGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:43. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TableGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TableGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TABLE_GROUP_LENGTH = 600;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for TableGroupSerialized
	**/
    public TableGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in TableGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TABLE_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
