package com.cloudframe.app.sf311010.dto;

/**
*  The class SetlAmnt100860 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


public class SetlAmnt100860 extends SetlAmnt100860Serialized { 
   

								private BigDecimal setlAmt100d860 = BigDecimal.ZERO;
	
	/**
	* Constructor for SetlAmnt100860
	**/
    public SetlAmnt100860() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for SetlAmnt100860. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SetlAmnt100860(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of setlAmt100d860
	 *	@return setlAmt100d860
	 */
	public BigDecimal getSetlAmt100d860() throws CFException {
       if (isSetlAmt100d860Modified()) { 
           setlAmt100d860 = refreshSetlAmt100d860();
        }
   		return setlAmt100d860;
	}
	

	
	   
	/**
	 * 	Update SetlAmt100d860 with the passed number
	 *  Corresponding COBOL Variable is 860-SETL-AMT-100D
	 *	@param number
	 */
	public void setSetlAmt100d860(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       setlAmt100d860 = checkSetlAmt100d860MaxLimit(number);
	    serializeSetlAmt100d860(setlAmt100d860);
   }
	/**
	 * 	Update SetlAmt100d860 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSetlAmt100d860(char[] value) throws CFException {
		 setlAmt100d860 = serializeSetlAmt100d860(value);
	}   

	
	
	

		public static int getSetlAmnt100860FieldLength() {
			return SETL_AMNT_100860_LENGTH;
		}

}
  
