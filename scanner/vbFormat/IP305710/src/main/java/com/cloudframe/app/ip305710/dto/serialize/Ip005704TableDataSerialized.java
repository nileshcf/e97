package com.cloudframe.app.ip305710.dto.serialize;

/**
*  The class Ip005704TableDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:18. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip005704TableDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip005704TableDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_005704_TABLE_DATA_LENGTH = 21;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for Ip005704TableDataSerialized
	**/
    public Ip005704TableDataSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ip005704TableDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_005704_TABLE_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
