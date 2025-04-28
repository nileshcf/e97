package com.cloudframe.app.ar640010.dto;

/**
*  The class DaysInMonthTable560 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:11. using version 5.0.0.256
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.util.ArrayList;


public class DaysInMonthTable560 extends DaysInMonthTable560Serialized {
   
      private List<Integer> daysInMonth560; 

	
	/**
	* Constructor for DaysInMonthTable560
	**/
    public DaysInMonthTable560() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

    /**
	 *	Returns the value of daysInMonth560
	 *  Corresponding COBOL Variable is 560-DAYS-IN-MONTH
	 *	@return daysInMonth560
	 */
	public List<Integer> getDaysInMonth560() throws CFException {
        List<Integer>	list = new ArrayList<>();  
        for (int index =0;index < DAYS_IN_MONTH_560_SIZE;index++) {
        	list.add( getDaysInMonth560( index) );
        }   
   		return list;
	}
     /**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return daysInMonth560
	 */
	public int getDaysInMonth560(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getDaysInMonth560(), resetting it to 0",index);
		    index = 0;
        } else if (index >= DAYS_IN_MONTH_560_SIZE) {
             	index = DAYS_IN_MONTH_560_SIZE -1; // can't exceed max array size
             	logger.trace("daysInMonth560 - Array index exceeded max Size {}, resetting it to max allowed",DAYS_IN_MONTH_560_SIZE); 
	    }
			return 
			            getIntNumber( 
			                 beginDaysInMonth560+ index*DAYS_IN_MONTH_560_LEN 
			                ,DAYS_IN_MONTH_560_LEN
			                ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)
			            ;
   	}
   
  	
	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *  @param Integer 
	 *	@return true if numeric value stored in the serialized String
	 */
	public boolean daysInMonth560IsNumeric(int index) {
	    return isNumeric(0 + index*2 
	                    ,0 + (index+1)*2 
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);	    
	}

	/**
	 *  Returns String value of daysInMonth560
     *  @param index	 
	 *  @return daysInMonth560
	 */
	public char[] getDaysInMonth560String(int index) {
	    return toCharArray( (beginDaysInMonth560 + index*DAYS_IN_MONTH_560_LEN) , DAYS_IN_MONTH_560_LEN );
	}
	/**
	 *	Update DaysInMonth560 at index with the passed value
	 *  Corresponding COBOL Variable is 560-DAYS-IN-MONTH
	 *  @param index
	 *	@param number
	 */
	public void setDaysInMonth560(int index,int number) {
	    truncated = false; // reset left over truncated flag
	    number = (number <= -MAX_100 || number >= MAX_100) ? truncate(number,MAX_100) : number;
        number = (number < 0 ? -number : number); // Only positive number allowed     
		setDaysInMonth560(index,number, true);
	}
	
	public void setDaysInMonth560(int index,long number) {
		    number = (number <= -MAX_100 || number >= MAX_100) ? truncate(number,MAX_100) : number;
			setDaysInMonth560(index,(int)number, true);
	}
	

	/**
	 *  Update DaysInMonth560 at index with the passed value
	 * 	This method accepts a number value as char[]
	 *  char[] can also be in a format that COBOL accepts as number (may not look like a number), 
   	 *  which means, not all string will consists of digits
   	 *  In case of non digit value, this method will mimic COBOL behavior and use only last 4 bits per char	 
	 *  @param index
	 *	@param value
	 */
	public void setDaysInMonth560(int index,char[] value) {
			setDaysInMonth560(index,value, true);
	}
	
	/**
	 *	Update DaysInMonth560 at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setDaysInMonth560(int index,int value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setDaysInMonth560(int,char[],boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= DAYS_IN_MONTH_560_SIZE) {
             	index = DAYS_IN_MONTH_560_SIZE -1; // can't exceed max array size
             	logger.trace("daysInMonth560 - Array index exceeded max Size {}, resetting it to max allowed",DAYS_IN_MONTH_560_SIZE); 
	    }
		if (setModified) {
			serializeDaysInMonth560(index,value);
		}
   }

	/**
	 *  Update DaysInMonth560 at index with the passed value and serialize the object if setModified is true
	 * 	This method can accept a number value as char[]
	 *  char[] can also be in a format that COBOL accepts as number (may not look like a number), 
   	 *  which means, not all string will consists of digits
   	 *  In case of non digit value, this method will mimic COBOL behavior and use only last 4 bits per char	 
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setDaysInMonth560(int index,char[] value, boolean setModified) {
		if (setModified) {
			// serialize the value
			replaceValue(
			        padNumber(2,value,false/*isSigned?*/)
			       ,(beginDaysInMonth560 + index*DAYS_IN_MONTH_560_LEN)
			       ,DAYS_IN_MONTH_560_LEN
			       );
		}
   }

	
	
	

		public static int getDaysInMonthTable560FieldLength() {
			return DAYS_IN_MONTH_TABLE_560_LENGTH;
		}

}
  
