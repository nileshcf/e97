package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip50211TipafacSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:09. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip50211TipafacSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip50211TipafacSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_50211_TIPAFAC_LENGTH = 154;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for Ip50211TipafacSerialized
	**/
    public Ip50211TipafacSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip50211TipafacSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_50211_TIPAFAC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
