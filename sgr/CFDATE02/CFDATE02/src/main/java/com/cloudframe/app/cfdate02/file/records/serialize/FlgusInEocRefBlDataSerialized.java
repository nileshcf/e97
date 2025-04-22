package com.cloudframe.app.cfdate02.file.records.serialize;

/**
*  The class FlgusInEocRefBlDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FlgusInEocRefBlDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FlgusInEocRefBlDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FLGUS_IN_EOC_REF_BL_DATA_LENGTH = 252;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for FlgusInEocRefBlDataSerialized
	**/
    public FlgusInEocRefBlDataSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in FlgusInEocRefBlDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FLGUS_IN_EOC_REF_BL_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
  
  
	   /*  end of offset */
	}




}
  
