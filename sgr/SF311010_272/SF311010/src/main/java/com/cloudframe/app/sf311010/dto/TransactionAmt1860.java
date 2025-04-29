package com.cloudframe.app.sf311010.dto;

/**
*  The class TransactionAmt1860 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


public class TransactionAmt1860 extends TransactionAmt1860Serialized { 
   

								private BigDecimal transactionAmt860 = BigDecimal.ZERO;
	
	/**
	* Constructor for TransactionAmt1860
	**/
    public TransactionAmt1860() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for TransactionAmt1860. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TransactionAmt1860(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of transactionAmt860
	 *	@return transactionAmt860
	 */
	public BigDecimal getTransactionAmt860() throws CFException {
       if (isTransactionAmt860Modified()) { 
           transactionAmt860 = refreshTransactionAmt860();
        }
   		return transactionAmt860;
	}
	

	
	   
	/**
	 * 	Update TransactionAmt860 with the passed number
	 *  Corresponding COBOL Variable is 860-TRANSACTION-AMT
	 *	@param number
	 */
	public void setTransactionAmt860(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       transactionAmt860 = checkTransactionAmt860MaxLimit(number);
	    serializeTransactionAmt860(transactionAmt860);
   }
	/**
	 * 	Update TransactionAmt860 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTransactionAmt860(char[] value) throws CFException {
		 transactionAmt860 = serializeTransactionAmt860(value);
	}   

	
	
	

		public static int getTransactionAmt1860FieldLength() {
			return TRANSACTION_AMT_1860_LENGTH;
		}

}
  
