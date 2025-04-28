package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip57901TipaqprSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip57901TipaqprSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip57901TipaqprSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_57901_TIPAQPR_LENGTH = 20;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for Ip57901TipaqprSerialized
	**/
    public Ip57901TipaqprSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ip57901TipaqprSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_57901_TIPAQPR_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
