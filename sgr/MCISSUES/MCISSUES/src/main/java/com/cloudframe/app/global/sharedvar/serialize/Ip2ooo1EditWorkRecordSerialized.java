package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip2ooo1EditWorkRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:20. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip2ooo1EditWorkRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip2ooo1EditWorkRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_2OOO_1_EDIT_WORK_RECORD_LENGTH = 1710;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for Ip2ooo1EditWorkRecordSerialized
	**/
    public Ip2ooo1EditWorkRecordSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip2ooo1EditWorkRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_2OOO_1_EDIT_WORK_RECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
