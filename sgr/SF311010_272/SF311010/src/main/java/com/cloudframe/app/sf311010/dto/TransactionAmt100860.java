package com.cloudframe.app.sf311010.dto;

/**
*  The class TransactionAmt100860 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:07. using version 5.0.0.256
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


public class TransactionAmt100860 extends TransactionAmt100860Serialized { 
   

								private BigDecimal tranAmt100d860 = BigDecimal.ZERO;
	
	/**
	* Constructor for TransactionAmt100860
	**/
    public TransactionAmt100860() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for TransactionAmt100860. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TransactionAmt100860(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of tranAmt100d860
	 *	@return tranAmt100d860
	 */
	public BigDecimal getTranAmt100d860() throws CFException {
       if (isTranAmt100d860Modified()) { 
           tranAmt100d860 = refreshTranAmt100d860();
        }
   		return tranAmt100d860;
	}
	

	
	   
	/**
	 * 	Update TranAmt100d860 with the passed number
	 *  Corresponding COBOL Variable is 860-TRAN-AMT-100D
	 *	@param number
	 */
	public void setTranAmt100d860(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       tranAmt100d860 = checkTranAmt100d860MaxLimit(number);
	    serializeTranAmt100d860(tranAmt100d860);
   }
	/**
	 * 	Update TranAmt100d860 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTranAmt100d860(char[] value) throws CFException {
		 tranAmt100d860 = serializeTranAmt100d860(value);
	}   

	
	
	

		public static int getTransactionAmt100860FieldLength() {
			return TRANSACTION_AMT_100860_LENGTH;
		}

}
  
