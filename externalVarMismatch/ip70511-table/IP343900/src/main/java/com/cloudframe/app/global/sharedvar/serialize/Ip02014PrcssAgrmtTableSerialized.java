package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip02014PrcssAgrmtTableSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip02014PrcssAgrmtTableSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip02014PrcssAgrmtTableSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_02014_PRCSS_AGRMT_TABLE_LENGTH = 929;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for Ip02014PrcssAgrmtTableSerialized
	**/
    public Ip02014PrcssAgrmtTableSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ip02014PrcssAgrmtTableSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_02014_PRCSS_AGRMT_TABLE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
	   /*  end of offset */
	}




}
  
