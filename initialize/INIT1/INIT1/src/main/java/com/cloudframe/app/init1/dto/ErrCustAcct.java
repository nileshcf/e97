package com.cloudframe.app.init1.dto;

/**
*  The class ErrCustAcct is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:52. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ErrCustAcct extends ErrCustAcctSerialized { 
   

								private int errCustIdNo;

								private int errAcctNo;
	
	/**
	* Constructor for ErrCustAcct
	**/
    public ErrCustAcct() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ErrCustAcct. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ErrCustAcct(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setErrCustIdNo(0);
								setErrAcctNo(0);
    } 

	/**
	 *	Returns the value of errCustIdNo
	 *	@return errCustIdNo
	 */
	public int getErrCustIdNo() throws CFException {
        if (isErrCustIdNoModified()) { 
           errCustIdNo = refreshErrCustIdNo();
        }
   		return errCustIdNo;
	}
	
	/**
	 * 	Update ErrCustIdNo with the passed value
	 *  Corresponding COBOL Variable is WS-ERR-CUST-ID-NO
	 *	@param number
	 */
	public void setErrCustIdNo(int number) {
	     // Truncate if the number is beyond +/- Max range
	    errCustIdNo = checkErrCustIdNoMaxLimit(number); 
		serializeErrCustIdNo(errCustIdNo);
	}


	public void setErrCustIdNo(long number) {
	    number = checkErrCustIdNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setErrCustIdNo((int)number);
	}
	
	/**
	 *	Returns the value of errAcctNo
	 *	@return errAcctNo
	 */
	public int getErrAcctNo() throws CFException {
        if (isErrAcctNoModified()) { 
           errAcctNo = refreshErrAcctNo();
        }
   		return errAcctNo;
	}
	
	/**
	 * 	Update ErrAcctNo with the passed value
	 *  Corresponding COBOL Variable is WS-ERR-ACCT-NO
	 *	@param number
	 */
	public void setErrAcctNo(int number) {
	     // Truncate if the number is beyond +/- Max range
	    errAcctNo = checkErrAcctNoMaxLimit(number); 
		serializeErrAcctNo(errAcctNo);
	}


	public void setErrAcctNo(long number) {
	    number = checkErrAcctNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setErrAcctNo((int)number);
	}
	

	
	
	
	/**
	 * 	initializes ErrCustAcct
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setErrCustIdNo(0);
                     setErrAcctNo(0);
   }

		public static int getErrCustAcctFieldLength() {
			return ERR_CUST_ACCT_LENGTH;
		}

}
  
