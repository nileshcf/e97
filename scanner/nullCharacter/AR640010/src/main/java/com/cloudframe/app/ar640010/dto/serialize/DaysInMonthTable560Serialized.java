package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class DaysInMonthTable560Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:49. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DaysInMonthTable560Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DaysInMonthTable560Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DAYS_IN_MONTH_TABLE_560_LENGTH = 24;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginDaysInMonth560;
           protected static final int DAYS_IN_MONTH_560_SIZE = 12;
	
	/**
	* Constructor for DaysInMonthTable560Serialized
	**/
    public DaysInMonthTable560Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DaysInMonthTable560Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DAYS_IN_MONTH_TABLE_560_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginDaysInMonth560 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}
  protected  static final int DAYS_IN_MONTH_560_LEN = 2;
     /**
     *  Collect all the arraylist value and join as a single string to serialize it. 
	 *  @param index
	 *	@param value
	 */
	protected void serializeDaysInMonth560(int index, int value) {
	       replaceValue( pad(DAYS_IN_MONTH_560_LEN,String.valueOf(value).toCharArray(),'0',LEFT_PAD)
	              , (beginDaysInMonth560 + index*DAYS_IN_MONTH_560_LEN)
	              , DAYS_IN_MONTH_560_LEN
	              );
   }

		public int daysInMonth560Size() {
			return DAYS_IN_MONTH_560_SIZE;
		}



}
  
