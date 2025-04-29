package com.cloudframe.app.vsammon7.file.records.serialize;

/**
*  The class MonitorRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:14. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MonitorRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MonitorRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MONITOR_RECORD_LENGTH = 281;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for MonitorRecordSerialized
	**/
    public MonitorRecordSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in MonitorRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MONITOR_RECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
