package com.cloudframe.app.move0.dto.serialize;

/**
*  The class Rl7abTableInitSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:30. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Rl7abTableInitSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Rl7abTableInitSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RL_7AB_TABLE_INIT_LENGTH = 768;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for Rl7abTableInitSerialized
	**/
    public Rl7abTableInitSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Rl7abTableInitSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RL_7AB_TABLE_INIT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
  
  
  
  
  
  
  
  
  
	   /*  end of offset */
	}




}
  
