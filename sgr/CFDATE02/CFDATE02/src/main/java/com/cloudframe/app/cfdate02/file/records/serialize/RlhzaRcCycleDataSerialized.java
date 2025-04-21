package com.cloudframe.app.cfdate02.file.records.serialize;

/**
*  The class RlhzaRcCycleDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RlhzaRcCycleDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RlhzaRcCycleDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RLHZA_RC_CYCLE_DATA_LENGTH = 1700;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for RlhzaRcCycleDataSerialized
	**/
    public RlhzaRcCycleDataSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in RlhzaRcCycleDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RLHZA_RC_CYCLE_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
  
	   /*  end of offset */
	}




}
  
