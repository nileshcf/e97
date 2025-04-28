package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class HeadingLine1GroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class HeadingLine1GroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(HeadingLine1GroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HEADING_LINE_1_GROUP_LENGTH = 133;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for HeadingLine1GroupSerialized
	**/
    public HeadingLine1GroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in HeadingLine1GroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HEADING_LINE_1_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
	   /*  end of offset */
	}




}
  
