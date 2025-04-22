package com.cloudframe.app.init1.dto;

/**
*  The class KeyInvCustAcct is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:05. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class KeyInvCustAcct extends KeyInvCustAcctSerialized { 
   

								private int invCustIdNo;

								private int invAcctNo;
	
	/**
	* Constructor for KeyInvCustAcct
	**/
    public KeyInvCustAcct() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for KeyInvCustAcct. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public KeyInvCustAcct(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setInvCustIdNo(0);
								setInvAcctNo(0);
    } 

	/**
	 *	Returns the value of invCustIdNo
	 *	@return invCustIdNo
	 */
	public int getInvCustIdNo() throws CFException {
        if (isInvCustIdNoModified()) { 
           invCustIdNo = refreshInvCustIdNo();
        }
   		return invCustIdNo;
	}
	
	/**
	 * 	Update InvCustIdNo with the passed value
	 *  Corresponding COBOL Variable is WS-INV-CUST-ID-NO
	 *	@param number
	 */
	public void setInvCustIdNo(int number) {
	     // Truncate if the number is beyond +/- Max range
	    invCustIdNo = checkInvCustIdNoMaxLimit(number); 
		serializeInvCustIdNo(invCustIdNo);
	}


	public void setInvCustIdNo(long number) {
	    number = checkInvCustIdNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setInvCustIdNo((int)number);
	}
	
	/**
	 *	Returns the value of invAcctNo
	 *	@return invAcctNo
	 */
	public int getInvAcctNo() throws CFException {
        if (isInvAcctNoModified()) { 
           invAcctNo = refreshInvAcctNo();
        }
   		return invAcctNo;
	}
	
	/**
	 * 	Update InvAcctNo with the passed value
	 *  Corresponding COBOL Variable is WS-INV-ACCT-NO
	 *	@param number
	 */
	public void setInvAcctNo(int number) {
	     // Truncate if the number is beyond +/- Max range
	    invAcctNo = checkInvAcctNoMaxLimit(number); 
		serializeInvAcctNo(invAcctNo);
	}


	public void setInvAcctNo(long number) {
	    number = checkInvAcctNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setInvAcctNo((int)number);
	}
	

	
	
	
	/**
	 * 	initializes KeyInvCustAcct
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setInvCustIdNo(0);
                     setInvAcctNo(0);
   }

		public static int getKeyInvCustAcctFieldLength() {
			return KEY_INV_CUST_ACCT_LENGTH;
		}

}
  
