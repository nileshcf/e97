package com.cloudframe.app.ip989010.dto;

/**
*  The class EvenValue800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:31. using version 5.0.0.254
**/


import com.cloudframe.app.ip989010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class EvenValue800 extends EvenValue800Serialized { 
   

								private int evenMsb800;

								private int evenLsb800;
	
	/**
	* Constructor for EvenValue800
	**/
    public EvenValue800() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for EvenValue800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public EvenValue800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of evenMsb800
	 *	@return evenMsb800
	 */
	public int getEvenMsb800() throws CFException {
       if (isEvenMsb800Modified()) { 
           evenMsb800 = refreshEvenMsb800();
        }
   		return evenMsb800;
	}
	

	
	   
	/**
	 * 	Update EvenMsb800 with the passed value
	 *  Corresponding COBOL Variable is 800-EVEN-MSB
	 *	@param number
	 */
	public void setEvenMsb800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    evenMsb800 = checkEvenMsb800MaxLimit(number); 
		serializeEvenMsb800(evenMsb800);
	}
	

	public void setEvenMsb800(long number) {
	    number = checkEvenMsb800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setEvenMsb800((int)number);
	}
	
	/**
	 * 	Update EvenMsb800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setEvenMsb800(char[] value) throws CFException {
		 evenMsb800 = serializeEvenMsb800(value);
	}
	/**
	 * 	Update EvenMsb800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setEvenMsb800String(char[] value) throws CFException {
		 setEvenMsb800(value);
	}
	/**
	 *	Returns the value of evenLsb800
	 *	@return evenLsb800
	 */
	public int getEvenLsb800() throws CFException {
       if (isEvenLsb800Modified()) { 
           evenLsb800 = refreshEvenLsb800();
        }
   		return evenLsb800;
	}
	

	
	   
	/**
	 * 	Update EvenLsb800 with the passed value
	 *  Corresponding COBOL Variable is 800-EVEN-LSB
	 *	@param number
	 */
	public void setEvenLsb800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    evenLsb800 = checkEvenLsb800MaxLimit(number); 
		serializeEvenLsb800(evenLsb800);
	}
	

	public void setEvenLsb800(long number) {
	    number = checkEvenLsb800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setEvenLsb800((int)number);
	}
	
	/**
	 * 	Update EvenLsb800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setEvenLsb800(char[] value) throws CFException {
		 evenLsb800 = serializeEvenLsb800(value);
	}
	/**
	 * 	Update EvenLsb800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setEvenLsb800String(char[] value) throws CFException {
		 setEvenLsb800(value);
	}

	
	
	

		public static int getEvenValue800FieldLength() {
			return EVEN_VALUE_800_LENGTH;
		}

}
  
