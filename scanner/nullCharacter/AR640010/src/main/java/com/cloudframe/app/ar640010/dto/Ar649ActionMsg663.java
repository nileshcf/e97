package com.cloudframe.app.ar640010.dto;

/**
*  The class Ar649ActionMsg663 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:41. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Ar649ActionMsg663 extends Ar649ActionMsg663Serialized {
   


								private int ar649ActionCode663;
	
	/**
	* Constructor for Ar649ActionMsg663
	**/
    public Ar649ActionMsg663() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("6032-AR649010 FTSS CONFIG UTILITY, ACTION-CODE: ").toCharArray()
             , getStartOffset() + 0
             ,48
             );
								setAr649ActionCode663(0);
    }


 

	/**
	 *	Returns the value of ar649ActionCode663
	 *	@return ar649ActionCode663
	 */
	public int getAr649ActionCode663() throws CFException {
       if (isAr649ActionCode663Modified()) { 
           ar649ActionCode663 = refreshAr649ActionCode663();
        }
   		return ar649ActionCode663;
	}
	

	
	   
	/**
	 * 	Update Ar649ActionCode663 with the passed value
	 *  Corresponding COBOL Variable is 663-AR649-ACTION-CODE
	 *	@param number
	 */
	public void setAr649ActionCode663(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ar649ActionCode663 = checkAr649ActionCode663MaxLimit(number); 
		serializeAr649ActionCode663(ar649ActionCode663);
	}
	

	public void setAr649ActionCode663(long number) {
	    number = checkAr649ActionCode663MaxLimit(number); // Truncate if value is beyond +/- Max range
		setAr649ActionCode663((int)number);
	}
	
	/**
	 * 	Update Ar649ActionCode663 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAr649ActionCode663(char[] value) throws CFException {
		 ar649ActionCode663 = serializeAr649ActionCode663(value);
	}
	/**
	 * 	Update Ar649ActionCode663 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAr649ActionCode663String(char[] value) throws CFException {
		 setAr649ActionCode663(value);
	}

	
	
	

		public static int getAr649ActionMsg663FieldLength() {
			return AR_649_ACTION_MSG_663_LENGTH;
		}

}
  
