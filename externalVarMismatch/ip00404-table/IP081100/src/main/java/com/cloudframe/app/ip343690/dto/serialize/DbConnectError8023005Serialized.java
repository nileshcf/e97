package com.cloudframe.app.ip343690.dto.serialize;

/**
*  The class DbConnectError8023005Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DbConnectError8023005Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DbConnectError8023005Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DB_CONNECT_ERROR_8023005_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for DbConnectError8023005Serialized
	**/
    public DbConnectError8023005Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DbConnectError8023005Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DB_CONNECT_ERROR_8023005_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
	   /*  end of offset */
	}




}
  
