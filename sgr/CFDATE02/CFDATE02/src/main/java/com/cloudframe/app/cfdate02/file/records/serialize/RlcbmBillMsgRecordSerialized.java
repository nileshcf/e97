package com.cloudframe.app.cfdate02.file.records.serialize;

/**
*  The class RlcbmBillMsgRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RlcbmBillMsgRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RlcbmBillMsgRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RLCBM_BILL_MSG_RECORD_LENGTH = 162;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for RlcbmBillMsgRecordSerialized
	**/
    public RlcbmBillMsgRecordSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in RlcbmBillMsgRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RLCBM_BILL_MSG_RECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
	   /*  end of offset */
	}




}
  
