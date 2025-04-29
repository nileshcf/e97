package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class DaysInMoTableSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:35. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DaysInMoTableSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DaysInMoTableSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DAYS_IN_MO_TABLE_LENGTH = 31;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginDaysInMo;
           protected static final int DAYS_IN_MO_SIZE = 31;
	
	/**
	* Constructor for DaysInMoTableSerialized
	**/
    public DaysInMoTableSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DaysInMoTableSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DAYS_IN_MO_TABLE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginDaysInMo = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int daysInMoSize() {
			return DAYS_IN_MO_SIZE;
		}



}
  
