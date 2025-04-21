package com.cloudframe.app.mcissues.dto.serialize;

/**
*  The class ClearingDtTm9Grp900Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ClearingDtTm9Grp900Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ClearingDtTm9Grp900Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CLEARING_DT_TM_9_GRP_900_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginClearingDtTm9Ary900;
           protected static final int CLEARING_DT_TM_9_ARY_900_SIZE = 5;
	
	/**
	* Constructor for ClearingDtTm9Grp900Serialized
	**/
    public ClearingDtTm9Grp900Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ClearingDtTm9Grp900Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CLEARING_DT_TM_9_GRP_900_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginClearingDtTm9Ary900 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int clearingDtTm9Ary900Size() {
			return CLEARING_DT_TM_9_ARY_900_SIZE;
		}



}
  
