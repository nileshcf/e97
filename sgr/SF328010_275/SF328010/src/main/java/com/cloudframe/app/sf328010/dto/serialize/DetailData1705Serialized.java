package com.cloudframe.app.sf328010.dto.serialize;

/**
*  The class DetailData1705Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:02. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DetailData1705Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DetailData1705Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DETAIL_DATA_1705_LENGTH = 78;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for DetailData1705Serialized
	**/
    public DetailData1705Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DetailData1705Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DETAIL_DATA_1705_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
