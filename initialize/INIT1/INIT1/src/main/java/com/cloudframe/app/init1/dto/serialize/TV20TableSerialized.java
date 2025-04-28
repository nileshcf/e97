package com.cloudframe.app.init1.dto.serialize;

/**
*  The class TV20TableSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:55. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TV20TableSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TV20TableSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int T_V_20_TABLE_LENGTH = 900;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginTV20Tbl;
           protected static final int T_V_20_TBL_SIZE = 150;
	
	/**
	* Constructor for TV20TableSerialized
	**/
    public TV20TableSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in TV20TableSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(T_V_20_TABLE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginTV20Tbl = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int tV20TblSize() {
			return T_V_20_TBL_SIZE;
		}



}
  
