package com.cloudframe.app.cpsc4.dto.serialize;

/**
*  The class S0v3DtlRsrchDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:20. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class S0v3DtlRsrchDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(S0v3DtlRsrchDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int S_0V_3_DTL_RSRCH_DATA_LENGTH = 1800;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginRsrchData;
           protected static final int RSRCH_DATA_SIZE = 50;
	
	/**
	* Constructor for S0v3DtlRsrchDataSerialized
	**/
    public S0v3DtlRsrchDataSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in S0v3DtlRsrchDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(S_0V_3_DTL_RSRCH_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginRsrchData = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int rsrchDataSize() {
			return RSRCH_DATA_SIZE;
		}



}
  
