package com.cloudframe.app.mcissues.dto;

/**
*  The class InterimDate800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:33. using version 5.0.0.254
**/


import com.cloudframe.app.mcissues.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class InterimDate800 extends InterimDate800Serialized { 
   

								private long interimJulianDate800;
	
	/**
	* Constructor for InterimDate800
	**/
    public InterimDate800() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for InterimDate800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public InterimDate800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of interimJulianDate800
	 *	@return interimJulianDate800
	 */
	public long getInterimJulianDate800() throws CFException {
       if (isInterimJulianDate800Modified()) { 
           interimJulianDate800 = refreshInterimJulianDate800();
        }
   		return interimJulianDate800;
	}
	

	
	   
	/**
	 * 	Update InterimJulianDate800 with the passed value
	 *  Corresponding COBOL Variable is 800-INTERIM-JULIAN-DATE
	 *	@param number
	 */
	public void setInterimJulianDate800(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    interimJulianDate800 = checkInterimJulianDate800MaxLimit(number); 
		serializeInterimJulianDate800(interimJulianDate800);
	}
	

	/**
	 * 	Update InterimJulianDate800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setInterimJulianDate800(char[] value) throws CFException {
		 interimJulianDate800 = serializeInterimJulianDate800(value);
	}
	/**
	 * 	Update InterimJulianDate800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setInterimJulianDate800String(char[] value) throws CFException {
		 setInterimJulianDate800(value);
	}

	
	
	

		public static int getInterimDate800FieldLength() {
			return INTERIM_DATE_800_LENGTH;
		}

}
  
