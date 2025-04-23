package com.cloudframe.app.sf311010.dto;

/**
*  The class SetlAmt110860 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:05. using version 5.0.0.254
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


public class SetlAmt110860 extends SetlAmt110860Serialized { 
   

								private BigDecimal setlAmt110d860 = BigDecimal.ZERO;
	
	/**
	* Constructor for SetlAmt110860
	**/
    public SetlAmt110860() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for SetlAmt110860. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SetlAmt110860(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of setlAmt110d860
	 *	@return setlAmt110d860
	 */
	public BigDecimal getSetlAmt110d860() throws CFException {
       if (isSetlAmt110d860Modified()) { 
           setlAmt110d860 = refreshSetlAmt110d860();
        }
   		return setlAmt110d860;
	}
	

	
	   
	/**
	 * 	Update SetlAmt110d860 with the passed number
	 *  Corresponding COBOL Variable is 860-SETL-AMT-110D
	 *	@param number
	 */
	public void setSetlAmt110d860(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       setlAmt110d860 = checkSetlAmt110d860MaxLimit(number);
	    serializeSetlAmt110d860(setlAmt110d860);
   }
	/**
	 * 	Update SetlAmt110d860 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSetlAmt110d860(char[] value) throws CFException {
		 setlAmt110d860 = serializeSetlAmt110d860(value);
	}   

	
	
	

		public static int getSetlAmt110860FieldLength() {
			return SETL_AMT_110860_LENGTH;
		}

}
  
