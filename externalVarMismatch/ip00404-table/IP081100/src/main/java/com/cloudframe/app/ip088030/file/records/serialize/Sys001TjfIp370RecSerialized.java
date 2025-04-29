package com.cloudframe.app.ip088030.file.records.serialize;

/**
*  The class Sys001TjfIp370RecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:27. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sys001TjfIp370RecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sys001TjfIp370RecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_001_TJF_IP_370_REC_LENGTH = 750;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for Sys001TjfIp370RecSerialized
	**/
    public Sys001TjfIp370RecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Sys001TjfIp370RecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_001_TJF_IP_370_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
	   /*  end of offset */
	}




}
  
