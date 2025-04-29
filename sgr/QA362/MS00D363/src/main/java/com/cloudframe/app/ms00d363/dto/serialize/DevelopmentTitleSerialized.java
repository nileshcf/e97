package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class DevelopmentTitleSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DevelopmentTitleSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DevelopmentTitleSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DEVELOPMENT_TITLE_LENGTH = 27;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for DevelopmentTitleSerialized
	**/
    public DevelopmentTitleSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DevelopmentTitleSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DEVELOPMENT_TITLE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
	   /*  end of offset */
	}




}
  
