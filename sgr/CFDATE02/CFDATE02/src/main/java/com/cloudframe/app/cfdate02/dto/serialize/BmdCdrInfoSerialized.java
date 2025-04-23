package com.cloudframe.app.cfdate02.dto.serialize;

/**
*  The class BmdCdrInfoSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BmdCdrInfoSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BmdCdrInfoSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BMD_CDR_INFO_LENGTH = 44;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for BmdCdrInfoSerialized
	**/
    public BmdCdrInfoSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in BmdCdrInfoSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BMD_CDR_INFO_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
