package com.cloudframe.app.comput5.dto.serialize;

/**
*  The class WtExposureTableSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:09. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WtExposureTableSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WtExposureTableSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WT_EXPOSURE_TABLE_LENGTH = 2400;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginWtExposureDetails;
           protected static final int WT_EXPOSURE_DETAILS_SIZE = 300;
	
	/**
	* Constructor for WtExposureTableSerialized
	**/
    public WtExposureTableSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WtExposureTableSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WT_EXPOSURE_TABLE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginWtExposureDetails = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int wtExposureDetailsSize() {
			return WT_EXPOSURE_DETAILS_SIZE;
		}



}
  
