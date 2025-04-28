package com.cloudframe.app.search0.dto.serialize;

/**
*  The class WtFieldsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:05. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WtFieldsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WtFieldsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WT_FIELDS_LENGTH = 36;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginWtCodeCtrl;
           protected static final int WT_CODE_CTRL_SIZE = 6;
	
	/**
	* Constructor for WtFieldsSerialized
	**/
    public WtFieldsSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WtFieldsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WT_FIELDS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginWtCodeCtrl = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int wtCodeCtrlSize() {
			return WT_CODE_CTRL_SIZE;
		}



}
  
