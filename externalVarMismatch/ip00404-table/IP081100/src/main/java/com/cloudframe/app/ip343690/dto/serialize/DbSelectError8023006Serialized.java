package com.cloudframe.app.ip343690.dto.serialize;

/**
*  The class DbSelectError8023006Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:05. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DbSelectError8023006Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DbSelectError8023006Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DB_SELECT_ERROR_8023006_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for DbSelectError8023006Serialized
	**/
    public DbSelectError8023006Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DbSelectError8023006Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DB_SELECT_ERROR_8023006_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
	   /*  end of offset */
	}




}
  
