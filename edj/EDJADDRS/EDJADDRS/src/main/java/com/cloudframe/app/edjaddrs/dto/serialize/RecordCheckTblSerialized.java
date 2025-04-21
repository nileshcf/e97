package com.cloudframe.app.edjaddrs.dto.serialize;

/**
*  The class RecordCheckTblSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:04. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RecordCheckTblSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RecordCheckTblSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RECORD_CHECK_TBL_LENGTH = 9450;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginRctTblEntry;
           protected static final int RCT_TBL_ENTRY_SIZE = 30;
	
	/**
	* Constructor for RecordCheckTblSerialized
	**/
    public RecordCheckTblSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in RecordCheckTblSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RECORD_CHECK_TBL_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginRctTblEntry = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int rctTblEntrySize() {
			return RCT_TBL_ENTRY_SIZE;
		}



}
  
