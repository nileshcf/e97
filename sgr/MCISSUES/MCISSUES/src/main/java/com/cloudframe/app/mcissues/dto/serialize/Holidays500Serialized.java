package com.cloudframe.app.mcissues.dto.serialize;

/**
*  The class Holidays500Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Holidays500Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Holidays500Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HOLIDAYS_500_LENGTH = 150;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginJulianHolidays500;
           protected static final int JULIAN_HOLIDAYS_500_SIZE = 30;
	
	/**
	* Constructor for Holidays500Serialized
	**/
    public Holidays500Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Holidays500Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HOLIDAYS_500_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginJulianHolidays500 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}
  protected  static final int JULIAN_HOLIDAYS_500_LEN = 5;
     /**
     *  Collect all the arraylist value and join as a single string to serialize it. 
	 *  @param index
	 *	@param value
	 */
	protected void serializeJulianHolidays500(int index, int value) {
	       replaceValue( pad(JULIAN_HOLIDAYS_500_LEN,String.valueOf(value).toCharArray(),'0',LEFT_PAD)
	              , (beginJulianHolidays500 + index*JULIAN_HOLIDAYS_500_LEN)
	              , JULIAN_HOLIDAYS_500_LEN
	              );
   }

		public int julianHolidays500Size() {
			return JULIAN_HOLIDAYS_500_SIZE;
		}



}
  
