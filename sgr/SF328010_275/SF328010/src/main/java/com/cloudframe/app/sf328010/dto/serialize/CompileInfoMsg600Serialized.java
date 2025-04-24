package com.cloudframe.app.sf328010.dto.serialize;

/**
*  The class CompileInfoMsg600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:35. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CompileInfoMsg600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CompileInfoMsg600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int COMPILE_INFO_MSG_600_LENGTH = 64;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for CompileInfoMsg600Serialized
	**/
    public CompileInfoMsg600Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in CompileInfoMsg600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(COMPILE_INFO_MSG_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
  
  
	   /*  end of offset */
	}




}
  
