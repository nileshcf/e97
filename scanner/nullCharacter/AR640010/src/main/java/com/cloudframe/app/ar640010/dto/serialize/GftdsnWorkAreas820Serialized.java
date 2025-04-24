package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class GftdsnWorkAreas820Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:49. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class GftdsnWorkAreas820Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(GftdsnWorkAreas820Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int GFTDSN_WORK_AREAS_820_LENGTH = 45;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for GftdsnWorkAreas820Serialized
	**/
    public GftdsnWorkAreas820Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in GftdsnWorkAreas820Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(GFTDSN_WORK_AREAS_820_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
	   /*  end of offset */
	}




}
  
