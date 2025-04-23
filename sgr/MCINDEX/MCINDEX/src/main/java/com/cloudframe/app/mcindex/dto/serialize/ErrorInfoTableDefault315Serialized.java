package com.cloudframe.app.mcindex.dto.serialize;

/**
*  The class ErrorInfoTableDefault315Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:01. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ErrorInfoTableDefault315Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ErrorInfoTableDefault315Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ERROR_INFO_TABLE_DEFAULT_315_LENGTH = 1710;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginErrorInfoTableEntries315;
           protected static final int ERROR_INFO_TABLE_ENTRIES_315_SIZE = 10;
	
	/**
	* Constructor for ErrorInfoTableDefault315Serialized
	**/
    public ErrorInfoTableDefault315Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ErrorInfoTableDefault315Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ERROR_INFO_TABLE_DEFAULT_315_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginErrorInfoTableEntries315 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int errorInfoTableEntries315Size() {
			return ERROR_INFO_TABLE_ENTRIES_315_SIZE;
		}



}
  
