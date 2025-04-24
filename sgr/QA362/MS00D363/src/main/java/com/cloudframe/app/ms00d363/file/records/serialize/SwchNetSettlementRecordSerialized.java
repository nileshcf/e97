package com.cloudframe.app.ms00d363.file.records.serialize;

/**
*  The class SwchNetSettlementRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SwchNetSettlementRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SwchNetSettlementRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SWCH_NET_SETTLEMENT_RECORD_LENGTH = 350;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for SwchNetSettlementRecordSerialized
	**/
    public SwchNetSettlementRecordSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in SwchNetSettlementRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SWCH_NET_SETTLEMENT_RECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
	   /*  end of offset */
	}




}
  
