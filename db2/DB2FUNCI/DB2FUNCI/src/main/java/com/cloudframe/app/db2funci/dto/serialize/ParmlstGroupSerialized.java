package com.cloudframe.app.db2funci.dto.serialize;

/**
*  The class ParmlstGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:40. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ParmlstGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ParmlstGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PARMLST_GROUP_LENGTH = 256;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for ParmlstGroupSerialized
	**/
    public ParmlstGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ParmlstGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PARMLST_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
	   /*  end of offset */
	}




}
  
