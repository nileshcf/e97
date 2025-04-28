package com.cloudframe.app.ar640010.dto;

/**
*  The class Ar649ReturnMsg663 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:11. using version 5.0.0.256
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Ar649ReturnMsg663 extends Ar649ReturnMsg663Serialized {
   


								private int ar649ReturnCode663;
	
	/**
	* Constructor for Ar649ReturnMsg663
	**/
    public Ar649ReturnMsg663() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("6031-AR649010 FTSS CONFIG UTILITY, RETURN-CODE: ").toCharArray()
             , getStartOffset() + 0
             ,48
             );
								setAr649ReturnCode663(0);
    }


 

	/**
	 *	Returns the value of ar649ReturnCode663
	 *	@return ar649ReturnCode663
	 */
	public int getAr649ReturnCode663() throws CFException {
       if (isAr649ReturnCode663Modified()) { 
           ar649ReturnCode663 = refreshAr649ReturnCode663();
        }
   		return ar649ReturnCode663;
	}
	

	
	   
	/**
	 * 	Update Ar649ReturnCode663 with the passed value
	 *  Corresponding COBOL Variable is 663-AR649-RETURN-CODE
	 *	@param number
	 */
	public void setAr649ReturnCode663(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ar649ReturnCode663 = checkAr649ReturnCode663MaxLimit(number); 
		serializeAr649ReturnCode663(ar649ReturnCode663);
	}
	

	public void setAr649ReturnCode663(long number) {
	    number = checkAr649ReturnCode663MaxLimit(number); // Truncate if value is beyond +/- Max range
		setAr649ReturnCode663((int)number);
	}
	
	/**
	 * 	Update Ar649ReturnCode663 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAr649ReturnCode663(char[] value) throws CFException {
		 ar649ReturnCode663 = serializeAr649ReturnCode663(value);
	}
	/**
	 * 	Update Ar649ReturnCode663 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAr649ReturnCode663String(char[] value) throws CFException {
		 setAr649ReturnCode663(value);
	}

	
	
	

		public static int getAr649ReturnMsg663FieldLength() {
			return AR_649_RETURN_MSG_663_LENGTH;
		}

}
  
