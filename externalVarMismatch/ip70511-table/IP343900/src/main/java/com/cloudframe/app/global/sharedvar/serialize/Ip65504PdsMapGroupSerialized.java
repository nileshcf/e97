package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsMapGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:26. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsMapGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsMapGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_MAP_GROUP_LENGTH = 24000;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for Ip65504PdsMapGroupSerialized
	**/
    public Ip65504PdsMapGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip65504PdsMapGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_MAP_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
	   /*  end of offset */
	}




}
  
