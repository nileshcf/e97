package com.cloudframe.app.sf305120.dto.serialize;

/**
*  The class FuncWhenCompiled800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FuncWhenCompiled800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FuncWhenCompiled800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FUNC_WHEN_COMPILED_800_LENGTH = 21;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for FuncWhenCompiled800Serialized
	**/
    public FuncWhenCompiled800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in FuncWhenCompiled800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FUNC_WHEN_COMPILED_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
	   /*  end of offset */
	}




}
  
