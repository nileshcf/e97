package com.cloudframe.app.cfdate02.file.records.serialize;

/**
*  The class Rl001CycleInputDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:10. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Rl001CycleInputDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Rl001CycleInputDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RL_001_CYCLE_INPUT_DATA_LENGTH = 700;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for Rl001CycleInputDataSerialized
	**/
    public Rl001CycleInputDataSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Rl001CycleInputDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RL_001_CYCLE_INPUT_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
	   /*  end of offset */
	}




}
  
