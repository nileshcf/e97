package com.cloudframe.app.comput5.dto.serialize;

/**
*  The class WlilhMergTableSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:17. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WlilhMergTableSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WlilhMergTableSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WLILH_MERG_TABLE_LENGTH = 44772;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginWlilhMrTbl;
           protected static final int WLILH_MR_TBL_SIZE = 1599;
	
	/**
	* Constructor for WlilhMergTableSerialized
	**/
    public WlilhMergTableSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WlilhMergTableSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WLILH_MERG_TABLE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginWlilhMrTbl = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int wlilhMrTblSize() {
			return WLILH_MR_TBL_SIZE;
		}



}
  
