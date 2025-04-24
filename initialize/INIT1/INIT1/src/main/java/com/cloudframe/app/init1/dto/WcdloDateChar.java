package com.cloudframe.app.init1.dto;

/**
*  The class WcdloDateChar is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:30. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WcdloDateChar extends WcdloDateCharSerialized { 
   

								private long wcdloDateNumeric;
	
	/**
	* Constructor for WcdloDateChar
	**/
    public WcdloDateChar() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WcdloDateChar. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcdloDateChar(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wcdloDateNumeric
	 *	@return wcdloDateNumeric
	 */
	public long getWcdloDateNumeric() throws CFException {
       if (isWcdloDateNumericModified()) { 
           wcdloDateNumeric = refreshWcdloDateNumeric();
        }
   		return wcdloDateNumeric;
	}
	

	
	   
	/**
	 * 	Update WcdloDateNumeric with the passed value
	 *  Corresponding COBOL Variable is WCDLO-DATE-NUMERIC
	 *	@param number
	 */
	public void setWcdloDateNumeric(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    wcdloDateNumeric = checkWcdloDateNumericMaxLimit(number); 
		serializeWcdloDateNumeric(wcdloDateNumeric);
	}
	

	/**
	 * 	Update WcdloDateNumeric with the passed value
	 *	@param value (String or char[])
	 */
	public void setWcdloDateNumeric(char[] value) throws CFException {
		 wcdloDateNumeric = serializeWcdloDateNumeric(value);
	}
	/**
	 * 	Update WcdloDateNumeric with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWcdloDateNumericString(char[] value) throws CFException {
		 setWcdloDateNumeric(value);
	}

	
	
	
	/**
	 * 	initializes WcdloDateChar
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setWcdloDateNumeric(0);
   }

		public static int getWcdloDateCharFieldLength() {
			return WCDLO_DATE_CHAR_LENGTH;
		}

}
  
