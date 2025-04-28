package com.cloudframe.app.ip662010.dto;

/**
*  The class TooManyTags600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:55. using version 5.0.0.256
**/


import com.cloudframe.app.ip662010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class TooManyTags600 extends TooManyTags600Serialized {
   


								private int maxTagNo600;

	
	/**
	* Constructor for TooManyTags600
	**/
    public TooManyTags600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("MORE THAN ").toCharArray()
             , getStartOffset() + 0
             ,10
             );
       replaceValue( // serialize and save the value
             ("TAGS IN MAPPING TABLE").toCharArray()
             , getStartOffset() + 14
             ,21
             );
    }


 

	/**
	 *	Returns the value of maxTagNo600
	 *	@return maxTagNo600
	 */
	public int getMaxTagNo600() throws CFException {
       if (isMaxTagNo600Modified()) { 
           maxTagNo600 = refreshMaxTagNo600();
        }
   		return maxTagNo600;
	}
	

	
	   
	/**
	 * 	Update MaxTagNo600 with the passed value
	 *  Corresponding COBOL Variable is 600-MAX-TAG-NO
	 *	@param number
	 */
	public void setMaxTagNo600(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    maxTagNo600 = checkMaxTagNo600MaxLimit(number); 
		serializeMaxTagNo600(maxTagNo600);
	}
	

	public void setMaxTagNo600(long number) {
	    number = checkMaxTagNo600MaxLimit(number); // Truncate if value is beyond +/- Max range
		setMaxTagNo600((int)number);
	}
	
	/**
	 * 	Update MaxTagNo600 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMaxTagNo600(char[] value) throws CFException {
		 maxTagNo600 = serializeMaxTagNo600(value);
	}
	/**
	 * 	Update MaxTagNo600 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMaxTagNo600String(char[] value) throws CFException {
		 setMaxTagNo600(value);
	}

	
	
	

		public static int getTooManyTags600FieldLength() {
			return TOO_MANY_TAGS_600_LENGTH;
		}

}
  
