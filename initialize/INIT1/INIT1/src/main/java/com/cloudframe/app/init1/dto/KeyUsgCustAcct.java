package com.cloudframe.app.init1.dto;

/**
*  The class KeyUsgCustAcct is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:22. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class KeyUsgCustAcct extends KeyUsgCustAcctSerialized { 
   

								private int usgCustIdNo;

								private int usgAcctNo;
	
	/**
	* Constructor for KeyUsgCustAcct
	**/
    public KeyUsgCustAcct() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for KeyUsgCustAcct. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public KeyUsgCustAcct(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setUsgCustIdNo(0);
								setUsgAcctNo(0);
    } 

	/**
	 *	Returns the value of usgCustIdNo
	 *	@return usgCustIdNo
	 */
	public int getUsgCustIdNo() throws CFException {
        if (isUsgCustIdNoModified()) { 
           usgCustIdNo = refreshUsgCustIdNo();
        }
   		return usgCustIdNo;
	}
	
	/**
	 * 	Update UsgCustIdNo with the passed value
	 *  Corresponding COBOL Variable is WS-USG-CUST-ID-NO
	 *	@param number
	 */
	public void setUsgCustIdNo(int number) {
	     // Truncate if the number is beyond +/- Max range
	    usgCustIdNo = checkUsgCustIdNoMaxLimit(number); 
		serializeUsgCustIdNo(usgCustIdNo);
	}


	public void setUsgCustIdNo(long number) {
	    number = checkUsgCustIdNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setUsgCustIdNo((int)number);
	}
	
	/**
	 *	Returns the value of usgAcctNo
	 *	@return usgAcctNo
	 */
	public int getUsgAcctNo() throws CFException {
        if (isUsgAcctNoModified()) { 
           usgAcctNo = refreshUsgAcctNo();
        }
   		return usgAcctNo;
	}
	
	/**
	 * 	Update UsgAcctNo with the passed value
	 *  Corresponding COBOL Variable is WS-USG-ACCT-NO
	 *	@param number
	 */
	public void setUsgAcctNo(int number) {
	     // Truncate if the number is beyond +/- Max range
	    usgAcctNo = checkUsgAcctNoMaxLimit(number); 
		serializeUsgAcctNo(usgAcctNo);
	}


	public void setUsgAcctNo(long number) {
	    number = checkUsgAcctNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setUsgAcctNo((int)number);
	}
	

	
	
	
	/**
	 * 	initializes KeyUsgCustAcct
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setUsgCustIdNo(0);
                     setUsgAcctNo(0);
   }

		public static int getKeyUsgCustAcctFieldLength() {
			return KEY_USG_CUST_ACCT_LENGTH;
		}

}
  
