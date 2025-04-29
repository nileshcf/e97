package com.cloudframe.app.cpsc4.dto.serialize;

/**
*  The class S0v3DtlCatAvGeDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:36. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class S0v3DtlCatAvGeDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(S0v3DtlCatAvGeDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int S_0V_3_DTL_CAT_AV_GE_DATA_LENGTH = 100;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginCatAvGeData;
           protected static final int CAT_AV_GE_DATA_SIZE = 5;
	
	/**
	* Constructor for S0v3DtlCatAvGeDataSerialized
	**/
    public S0v3DtlCatAvGeDataSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in S0v3DtlCatAvGeDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(S_0V_3_DTL_CAT_AV_GE_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginCatAvGeData = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int catAvGeDataSize() {
			return CAT_AV_GE_DATA_SIZE;
		}



}
  
