package com.cloudframe.app.sf320010.dto;

/**
*  The class Sf503PsTransAmountX is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:29. using version 5.0.0.257
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


public class Sf503PsTransAmountX extends Sf503PsTransAmountXSerialized { 
   

								private BigDecimal sf503PsTransAmount = BigDecimal.ZERO;
	
	/**
	* Constructor for Sf503PsTransAmountX
	**/
    public Sf503PsTransAmountX() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Sf503PsTransAmountX. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf503PsTransAmountX(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of sf503PsTransAmount
	 *	@return sf503PsTransAmount
	 */
	public BigDecimal getSf503PsTransAmount() throws CFException {
       if (isSf503PsTransAmountModified()) { 
           sf503PsTransAmount = refreshSf503PsTransAmount();
        }
   		return sf503PsTransAmount;
	}
	

	
	   
	/**
	 * 	Update Sf503PsTransAmount with the passed number
	 *  Corresponding COBOL Variable is SF503-PS-TRANS-AMOUNT
	 *	@param number
	 */
	public void setSf503PsTransAmount(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       sf503PsTransAmount = checkSf503PsTransAmountMaxLimit(number);
	    serializeSf503PsTransAmount(sf503PsTransAmount);
   }
	/**
	 * 	Update Sf503PsTransAmount with the passed value
	 *	@param value (String or char[])
	 */
	public void setSf503PsTransAmount(char[] value) throws CFException {
		 sf503PsTransAmount = serializeSf503PsTransAmount(value);
	}   

	
	
	

		public static int getSf503PsTransAmountXFieldLength() {
			return SF_503_PS_TRANS_AMOUNT_X_LENGTH;
		}

}
  
