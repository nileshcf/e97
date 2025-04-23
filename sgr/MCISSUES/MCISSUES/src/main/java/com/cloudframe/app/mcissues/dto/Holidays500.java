package com.cloudframe.app.mcissues.dto;

/**
*  The class Holidays500 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/


import com.cloudframe.app.mcissues.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.util.ArrayList;


public class Holidays500 extends Holidays500Serialized {
   
      private List<Integer> julianHolidays500; 

	
	/**
	* Constructor for Holidays500
	**/
    public Holidays500() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

    /**
	 *	Returns the value of julianHolidays500
	 *  Corresponding COBOL Variable is 500-JULIAN-HOLIDAYS
	 *	@return julianHolidays500
	 */
	public List<Integer> getJulianHolidays500() throws CFException {
        List<Integer>	list = new ArrayList<>();  
        for (int index =0;index < JULIAN_HOLIDAYS_500_SIZE;index++) {
        	list.add( getJulianHolidays500( index) );
        }   
   		return list;
	}
     /**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return julianHolidays500
	 */
	public int getJulianHolidays500(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getJulianHolidays500(), resetting it to 0",index);
		    index = 0;
        } else if (index >= JULIAN_HOLIDAYS_500_SIZE) {
             	index = JULIAN_HOLIDAYS_500_SIZE -1; // can't exceed max array size
             	logger.trace("julianHolidays500 - Array index exceeded max Size {}, resetting it to max allowed",JULIAN_HOLIDAYS_500_SIZE); 
	    }
			return 
			            getIntNumber( 
			                 beginJulianHolidays500+ index*JULIAN_HOLIDAYS_500_LEN 
			                ,JULIAN_HOLIDAYS_500_LEN
			                ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)
			            ;
   	}
   
  	
	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *  @param Integer 
	 *	@return true if numeric value stored in the serialized String
	 */
	public boolean julianHolidays500IsNumeric(int index) {
	    return isNumeric(0 + index*5 
	                    ,0 + (index+1)*5 
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);	    
	}

	/**
	 *  Returns String value of julianHolidays500
     *  @param index	 
	 *  @return julianHolidays500
	 */
	public char[] getJulianHolidays500String(int index) {
	    return toCharArray( (beginJulianHolidays500 + index*JULIAN_HOLIDAYS_500_LEN) , JULIAN_HOLIDAYS_500_LEN );
	}
	/**
	 *	Update JulianHolidays500 at index with the passed value
	 *  Corresponding COBOL Variable is 500-JULIAN-HOLIDAYS
	 *  @param index
	 *	@param number
	 */
	public void setJulianHolidays500(int index,int number) {
	    truncated = false; // reset left over truncated flag
	    number = (number <= -MAX_100K || number >= MAX_100K) ? truncate(number,MAX_100K) : number;
		setJulianHolidays500(index,number, true);
	}
	
	public void setJulianHolidays500(int index,long number) {
		    number = (number <= -MAX_100K || number >= MAX_100K) ? truncate(number,MAX_100K) : number;
			setJulianHolidays500(index,(int)number, true);
	}
	

	/**
	 *  Update JulianHolidays500 at index with the passed value
	 * 	This method accepts a number value as char[]
	 *  char[] can also be in a format that COBOL accepts as number (may not look like a number), 
   	 *  which means, not all string will consists of digits
   	 *  In case of non digit value, this method will mimic COBOL behavior and use only last 4 bits per char	 
	 *  @param index
	 *	@param value
	 */
	public void setJulianHolidays500(int index,char[] value) {
			setJulianHolidays500(index,value, true);
	}
	
	/**
	 *	Update JulianHolidays500 at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setJulianHolidays500(int index,int value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setJulianHolidays500(int,char[],boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= JULIAN_HOLIDAYS_500_SIZE) {
             	index = JULIAN_HOLIDAYS_500_SIZE -1; // can't exceed max array size
             	logger.trace("julianHolidays500 - Array index exceeded max Size {}, resetting it to max allowed",JULIAN_HOLIDAYS_500_SIZE); 
	    }
		if (setModified) {
			serializeJulianHolidays500(index,value);
		}
   }

	/**
	 *  Update JulianHolidays500 at index with the passed value and serialize the object if setModified is true
	 * 	This method can accept a number value as char[]
	 *  char[] can also be in a format that COBOL accepts as number (may not look like a number), 
   	 *  which means, not all string will consists of digits
   	 *  In case of non digit value, this method will mimic COBOL behavior and use only last 4 bits per char	 
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setJulianHolidays500(int index,char[] value, boolean setModified) {
		if (setModified) {
			// serialize the value
			replaceValue(
			        padNumber(5,value,true/*isSigned?*/)
			       ,(beginJulianHolidays500 + index*JULIAN_HOLIDAYS_500_LEN)
			       ,JULIAN_HOLIDAYS_500_LEN
			       );
		}
   }

	
	
	

		public static int getHolidays500FieldLength() {
			return HOLIDAYS_500_LENGTH;
		}

}
  
