package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class FillerTblWsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FillerTblWsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FillerTblWsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FILLER_TBL_WS_LENGTH = 68500;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginTransTable1;
           protected static final int TRANS_TABLE_1_SIZE = 100;
	
	/**
	* Constructor for FillerTblWsSerialized
	**/
    public FillerTblWsSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in FillerTblWsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FILLER_TBL_WS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginTransTable1 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int transTable1Size() {
			return TRANS_TABLE_1_SIZE;
		}



}
  
