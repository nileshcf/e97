package com.cloudframe.app.sf305120.dto.serialize;

/**
*  The class ServiceInfo820Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:05. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ServiceInfo820Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ServiceInfo820Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SERVICE_INFO_820_LENGTH = 8172;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for ServiceInfo820Serialized
	**/
    public ServiceInfo820Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ServiceInfo820Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SERVICE_INFO_820_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
	   /*  end of offset */
	}




}
  
