package com.cloudframe.app.cfdate02.file.records.serialize;

/**
*  The class RldusInEocRefBlDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:05. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RldusInEocRefBlDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RldusInEocRefBlDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RLDUS_IN_EOC_REF_BL_DATA_LENGTH = 162;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for RldusInEocRefBlDataSerialized
	**/
    public RldusInEocRefBlDataSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in RldusInEocRefBlDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RLDUS_IN_EOC_REF_BL_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
  
  
	   /*  end of offset */
	}




}
  
