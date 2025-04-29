package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class StsParm250Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class StsParm250Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(StsParm250Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int STS_PARM_250_LENGTH = 138;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for StsParm250Serialized
	**/
    public StsParm250Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in StsParm250Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(STS_PARM_250_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
	   /*  end of offset */
	}




}
  
