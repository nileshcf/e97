package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class Messages600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Messages600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Messages600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MESSAGES_600_LENGTH = 405;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for Messages600Serialized
	**/
    public Messages600Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Messages600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MESSAGES_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
  
  
  
  
  
  
	   /*  end of offset */
	}




}
  
