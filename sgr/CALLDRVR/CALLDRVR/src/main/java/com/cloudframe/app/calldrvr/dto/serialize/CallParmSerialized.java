package com.cloudframe.app.calldrvr.dto.serialize;

/**
*  The class CallParmSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:38. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CallParmSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CallParmSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CALL_PARM_LENGTH = 26;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for CallParmSerialized
	**/
    public CallParmSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in CallParmSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CALL_PARM_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
	   /*  end of offset */
	}




}
  
