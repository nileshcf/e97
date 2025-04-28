package com.cloudframe.app.d5427dt1.dto.serialize;

/**
*  The class StsContainerSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class StsContainerSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(StsContainerSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int STS_CONTAINER_LENGTH = 1335;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for StsContainerSerialized
	**/
    public StsContainerSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in StsContainerSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(STS_CONTAINER_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
