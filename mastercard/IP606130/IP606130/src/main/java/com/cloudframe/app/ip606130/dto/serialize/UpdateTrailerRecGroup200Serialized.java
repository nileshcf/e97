package com.cloudframe.app.ip606130.dto.serialize;

/**
*  The class UpdateTrailerRecGroup200Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:08. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class UpdateTrailerRecGroup200Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(UpdateTrailerRecGroup200Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int UPDATE_TRAILER_REC_GROUP_200_LENGTH = 80;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for UpdateTrailerRecGroup200Serialized
	**/
    public UpdateTrailerRecGroup200Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in UpdateTrailerRecGroup200Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(UPDATE_TRAILER_REC_GROUP_200_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
	   /*  end of offset */
	}




}
  
