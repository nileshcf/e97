package com.cloudframe.app.ip670010.dto;

/**
*  The class FormatedJulDate800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:17. using version 5.0.0.257
**/


import com.cloudframe.app.ip670010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class FormatedJulDate800 extends FormatedJulDate800Serialized {
   

								private long julianDate800;

	
	/**
	* Constructor for FormatedJulDate800
	**/
    public FormatedJulDate800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setJulianDate800(0L);
       replaceValue( // serialize and save the value
             ("0").toCharArray()
             , getStartOffset() + 7
             ,1
             );
    }


 

	/**
	 *	Returns the value of julianDate800
	 *	@return julianDate800
	 */
	public long getJulianDate800() throws CFException {
       if (isJulianDate800Modified()) { 
           julianDate800 = refreshJulianDate800();
        }
   		return julianDate800;
	}
	

	
	   
	/**
	 * 	Update JulianDate800 with the passed value
	 *  Corresponding COBOL Variable is 800-JULIAN-DATE
	 *	@param number
	 */
	public void setJulianDate800(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    julianDate800 = checkJulianDate800MaxLimit(number); 
		serializeJulianDate800(julianDate800);
	}
	

	/**
	 * 	Update JulianDate800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setJulianDate800(char[] value) throws CFException {
		 julianDate800 = serializeJulianDate800(value);
	}
	/**
	 * 	Update JulianDate800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setJulianDate800String(char[] value) throws CFException {
		 setJulianDate800(value);
	}

	
	
	

		public static int getFormatedJulDate800FieldLength() {
			return FORMATED_JUL_DATE_800_LENGTH;
		}

}
  
