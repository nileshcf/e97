package com.cloudframe.app.ip343690.dto.serialize;

/**
*  The class DbUpdateError8023010Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:17. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DbUpdateError8023010Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DbUpdateError8023010Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DB_UPDATE_ERROR_8023010_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for DbUpdateError8023010Serialized
	**/
    public DbUpdateError8023010Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DbUpdateError8023010Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DB_UPDATE_ERROR_8023010_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
	   /*  end of offset */
	}




}
  
