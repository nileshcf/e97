package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip16901RewardsParmSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:08. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip16901RewardsParmSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip16901RewardsParmSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_16901_REWARDS_PARM_LENGTH = 125;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for Ip16901RewardsParmSerialized
	**/
    public Ip16901RewardsParmSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip16901RewardsParmSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_16901_REWARDS_PARM_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
